package Frame6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f = new Frame("多级菜单");
        f.setBounds(400,200,400,300);
        f.setLayout(new FlowLayout());


        String name = f.getTitle();

        //创建菜单栏
        MenuBar mb = new MenuBar();
        //创建菜单
        Menu m = new Menu("文件");
        Menu m1 = new Menu("更改名称");
        //创建菜单项
        MenuItem mi1 = new MenuItem("好好学习");
        MenuItem mi2 = new MenuItem("天天向上");
        MenuItem mi3 = new MenuItem("恢复标题");
        MenuItem mi4 = new MenuItem("打开记事本");
        MenuItem mi5 = new MenuItem("退出系统");


        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);

        m.add(m1);
        m.add(mi4);
        m.add(mi5);

        mb.add(m);


        //设置菜单栏
        f.setMenuBar(mb);


        //设置窗体关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setTitle("好好学习");
            }
        });


        mi3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            f.setTitle(name);
            }
        });

        mi4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Runtime r = Runtime.getRuntime();
                try {
                    r.exec("/Users/Z/DeskTop/网络基础1.pdf");
                }catch (IOException e1){
                    e1.printStackTrace();
                }

            }
        });

        mi5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
    }
}

