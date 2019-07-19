package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static final SessionFactory factory;
	//ThreadLocal 可以隔离多个线程的数据共享，因此不需要对线程进程同步
	public static ThreadLocal<Session> session = new ThreadLocal<Session>();
	static {
		//1.读取并解析配置文件
				Configuration config = new Configuration().configure();
				
				//以configuration实例来创建sessionFactory实例
				 
				//2.读取并解析映射文件，创建SessionFactory
				factory = config.buildSessionFactory();
	}
	
	
	public static Session getCurrentSession() {
		Session s = session.get();
		//如果该线程还没有session,则创建一个新的session
		if(s == null) {
			s = factory.openSession();
			//将获取的session变量存储在ThreadLocal变量session里
			session.set(s);
		}
		return s;
	}
	
	public static void closeResource() {
		Session s = session.get();
		if(s != null) {
			s.close();
		}
		session.set(null);
	}

}
