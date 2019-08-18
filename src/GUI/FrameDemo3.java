package GUI;
/**
 * 事件监听机制
 *
 *  A：事件源   事件发生的地方
 *  B：事件     要发生的事情
 *  C：事件处理  针对发生的事情做出的处理方案
 *  D：事件监听  把事件源和事件关联起来
 *
 *  举例：
 *      人受伤事件
 *
 *      事件源：人（具体对象）
 *          Person p1 = new Person("张三");
 *          Person p2 = new Person("李四");
 *      事件：受伤（抽象）
 *          interface 受伤接口{
 *              一拳();
 *              一脚();
 *              一板砖();
 *          }
 *      事件处理：
 *          受伤处理类 implements 受伤接口{
 *             一拳();{System.out.println("鼻子流血了,送到卫生间休息");}
 *             一脚();{System.out.println("晕倒了，送到通风处");}
 *             一板砖();{System.out.println("头破血流，送到太平间");}
 *          }
 *      事件监听：
 *          p1.注册监听(受伤接口)
 *
 *
 *
 */

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameDemo3 {
    public static void main(String[] args) {
        Frame f = new Frame("窗体关闭案例");
        f.setBounds(400,200,400,300);

        //让窗体关闭
        //事件源
        //事件：对窗体的处理事件
        //事件处理:关闭窗口（System.exit(0)）
        //事件监听：
        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });


        f.setVisible(true);
    }
}
