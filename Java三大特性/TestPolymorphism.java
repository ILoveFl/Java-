package how2j.基础;
/**
 测试多态
 */
 
public class TestPolymorphism {
	public static void main(String[] args) {
		//接口引用指向实例对象
		Animal dog = new Dog();
		dog.shout();
		Animal cat = new Cat();
		cat.shout();
		
	}

}
