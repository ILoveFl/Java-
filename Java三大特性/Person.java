package how2j.基础;
/*
 1、 封装：隐藏对象的属性和实现细节，提供公共方法对其进行访问。常用之一：成员变量私有化（private），对外提供对应的set/get
  方法进行访问（构造方法）
  private：权限修饰符，修饰成员变量，将其私有化，仅本类中可以使用。
  //构造方法：用于给对象初始化，形式：
	    /*
	     修饰符 类名（）{//无参构造
	     	函数体；
	     }
	     或者
	     修饰符 类名（形式参数）{//有参构造
	     	函数体；
	     	}
	     构造方法与普通方法区别：
	     1）	返回值类型：构造函数没有返回值类型（连void都不能写），普通方法有返回值类型，
	     2）函数名：构造函数与类名相同，普通方法符合命名规则即可
	     3）调用方式：构造函数是在创建对象时由JVM调用，普通方法由对象调用，对象可以多次调用普通函数
	     4）作用：构造函数用于初始化一个对象，普通函数用于描述一类事物的公共行为
//构造代码块形式：
 {
    构造代码块;
 }
   构造代码块与构造函数作用区别：
   	     1）构造代码块：给所有对象进行统一初始化，对象一建立就运行并且优先于构造函数
   	     2）构造函数：给对应的对象（new）进行初始化
 */
 
public class Person {
	private int id;
	private String name;
	private Person person;
	public Person() {
		//默认无参构造方法，也可以设置有参构造方法
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName(String name) {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
