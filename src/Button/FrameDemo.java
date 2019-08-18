package Button;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * 窗体布局：窗体中组建的排列方式
 * 流式布局：FlowLayout
 * 边界布局：BorderLayout
 * 网格布局：GridLayout
 * 网格包布局：GridBagLayout
 * 卡片布局：CardLayout
 *
 * 需求：把按钮添加到窗体，并对按钮添加一个点击事件
     * A：创建窗体对象
     * B：创建按钮对象
     * C：把按钮添加到窗体
     * D：窗体显示
 */
public class FrameDemo {
    public static void main(String[] args) {
        Frame f = new Frame("添加按钮");
        f.setBounds(400,200,400,300);
        //设置布局方案
        f.setLayout(new FlowLayout());

        //创建按钮对象
        Button bu = new Button("我是按钮");
        bu.setSize(20,10);

        //把按钮添加到窗体上
        f.add(bu);


        //设置窗体可以关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //给按钮添加事件
        bu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("你再点试试");
            }
        });


        //窗体显示
        f.setVisible(true);
    }
}
