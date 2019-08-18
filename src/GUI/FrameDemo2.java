package GUI;

import java.awt.*;

public class FrameDemo2 {
    public static void main(String[] args) {
        Frame f = new Frame("方法调用的前后关系");

//        f.setSize(400,300);
//
//
//        f.setLocation(400,200);
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //一个方法搞定
        f.setBounds(400,200,400,300);

        f.setVisible(true);
    }
}
