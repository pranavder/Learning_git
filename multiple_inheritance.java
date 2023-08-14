interface Demo1{
	void fun();
}
interface Demo2{
	void fun();
}
class Demochild implements Demo1,Demo2{
	public void fun(){
		System.out.println("In fun child");
	}
}
class client{
	public static void main(String[] args){
		Demochild obj1=new Demochild();
		obj1.fun();
	}
}
