package Frame2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f = new Frame("数据迁移");
        f.setBounds(400,200,400,300);
        f.setLayout(new FlowLayout());//流式布局

        //创建一个文本框
        final TextField tf = new TextField(20);

        //创建按钮
        Button bu = new Button("数据转移");

        //创建文本域
        final TextArea ta = new TextArea(10,40);

        //把组件添加到窗体
        f.add(tf);
        f.add(bu);
        f.add(ta);

        //设置窗体关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //对按钮添加时间
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取文本框的值
                String tf_str = tf.getText().trim();
                //清空数据
                tf.setText("");

                //设置给文本域
                //ta.setText(tf_str);
                ta.append(tf_str+"\r\n");

                //获取光标
                tf.requestFocus();
            }
        });


        //设置窗体显示
        f.setVisible(true);
    }
}
