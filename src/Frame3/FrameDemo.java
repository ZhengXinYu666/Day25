package Frame3;


import java.awt.*;
import java.awt.event.*;

public class FrameDemo {
    public static void main(String[] args) {
        Frame f = new Frame("更改背景色");
        f.setBounds(400,200,400,300);
        f.setLayout(new FlowLayout());//流式布局

        //创建四个按钮
        Button redButton  = new Button("红色");
        Button greenButton  = new Button("绿色");
        Button blueButton  = new Button("蓝色");
        Button blackButton  = new Button();


        //添加按钮
        f.add(redButton);
        f.add(greenButton);
        f.add(blueButton);


        //设置窗体关闭
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


        //对按钮添加动作事件
//        redButton.addActionListener(new ActionListener() {
////            @Override
////            public void actionPerformed(ActionEvent e) {
////                f.setBackground(Color.red);
////            }
////        });

        //对按钮添加鼠标点击事件
//        redButton.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                f.setBackground(Color.red);
//            }
//        });

        //对按钮添加鼠标的进入事件
        redButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                f.setBackground(Color.red);
            }
        });
        redButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                f.setBackground(Color.WHITE);
            }
        });

        greenButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                f.setBackground(Color.green);
            }
        });
        greenButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                f.setBackground(Color.WHITE);
            }
        });

        blueButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                f.setBackground(Color.blue);
            }
        });
        blueButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                f.setBackground(Color.WHITE);
            }
        });

        f.setVisible(true);
    }
}
