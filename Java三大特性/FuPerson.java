package how2j.基础;
/*
继承：从已有的类派生新的类，新类具有已有类的属性和行为，并扩展新的功能。已有的类叫做父类或超类，
派生的类叫做子类，子类继承父类。关键字extends.
3点注意：1、子类拥有父类对象所有的属性和方法（包括私有属性和私有方法），但是父类私有属性和私有方法只能无法访问只能拥有；
        2、子类扩展自己的属性和方法；
        3、子类可以用自己的方式实现父类的方法（重写）
继承的好处：可以实现代码的复用和扩展。
*/
public class FuPerson {
    private int a = 1;
    private int id;
  	private String name;
  	private Person person;
  	private int age;
  	public FuPerson() {
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
  	
  	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	//普通方法
	public void say() {
		System.out.println("person say..");
	}
	public void run() {
		System.out.println("person run....");
	}
	
	//父类的私有方法
	private void show() {
		System.out.println("person show...");
	}
}
