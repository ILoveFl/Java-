package how2j.基础;

public class ZiPerson extends FuPerson {

	@Override//重写
	public void say() {
		super.say();//调用父类的方法
	}
	@Override
	public void run() {
		super.run();//调用父类的方法
	}
	public static void main(String[] args) {
		ZiPerson stu = new ZiPerson();
		//stu.a=1;//子类对象对父类的私有成员变量使用报错！
		//stu.show();//子类对象调用父类的私有方法，同样报错！
		stu.say();
		stu.run();
	}
}
