package SpringStudy.LiftCycle;

public class UserServiceImpl implements UserService {
    public void say() {
        System.out.println("Spring 注入学习");
    }

    public void init() {
        System.out.println("我被初始化啦！！");
    }

    public void destory() {
        System.out.println("我被销毁啦啦！！");
    }
}
