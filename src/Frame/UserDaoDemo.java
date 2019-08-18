package Frame;

/**
 * 问题：
 *      接口（方法较多）---实现类（仅仅使用一个，其他的实现也给提供了，哪怕是实现）
 *      太麻烦了
 * 解决方案：
 *      接口（方法较多）---适配器类（实现接口，仅仅空实现）---实现类（用哪个，重写哪个）
 *
 */
public class UserDaoDemo {
    public static void main(String[] args) {
        UserDao ud = new UserDaoImpl();
        ud.add();
       //只需要一个增加功能，但是四个功能全实现了

        UserDao ud2 = new UserDaoImpl2();
        ud2.add();
    }
}
