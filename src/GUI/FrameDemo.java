package GUI;

import java.awt.*;

public class FrameDemo {
    public static void main(String[] args) {
        //创建窗体对象
        Frame f = new Frame("一给我里Giao");
        //设置窗体标题
//        f.setTitle("HelloWorld");
        //设置窗体大小
        f.setSize(400,300);//单位：像素

        //调用一个方法设置让窗体可见
        f.setVisible(true);

        //设置窗体的位置
        f.setLocation(400,200);
    }
}
