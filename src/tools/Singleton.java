package tools;

public class Singleton {
	private static Singleton singleton;
	
	private Singleton(){
		//������Ӧ�������ڼ䣬ִֻ��һ�ε�ҵ��������
	}
	
	public static class SingletonHelper{
		private static final Singleton INSTANCE = new Singleton();
	}
	public static Singleton getInstance(){
		singleton = SingletonHelper.INSTANCE;
		return singleton;
	}
	public static Singleton test(){
		return singleton;
	}
}
