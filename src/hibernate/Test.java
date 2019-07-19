package hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//School s = new School("延津二中","延津县北街");
		//Student stu = new Student("杨风","金庸一班");
		//stu.setSchool(s);
		//1.读取并解析配置文件
		//Configuration config = new Configuration().configure();
		//2.读取并解析映射文件，创建SessionFactory
		//SessionFactory factory = config.buildSessionFactory();
		//3.打开session
		//Session session = factory.openSession();
		Session session = HibernateUtil.getCurrentSession();
		//4.开启一个事务
		Transaction tran = session.beginTransaction();
		//5.持久化操作
		//session.save(stu);
		//Student stu = session.load(Student.class, 1);
		//session.delete(stu);
		Grade g = new Grade();
		g.setName("二年级");
		session.save(g);
		//6.提交事务
		tran.commit();
		//7、关闭session
		HibernateUtil.closeResource();
		
	}

}
