package hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;


/**
 * 
 * @author 焦计划
 * @date 2019年6月28日  下午11:09:56
 */
public class HQLTest {
/** 
 * 实体查询：from entity [where conditions]
 * 属性查询:1.select parm1,param2 from entity[where conditions]
 * 			2.select new Entity(param1,param2..) from entity
 * 实体更新和删除:int n = query.executeUpdate();
 * 参数绑定:1.?点位符，设置参数下标从0开始
 * 			2.使用命名参数
 * 
 * 排序 ：order by
 * 统计：avg(),sum(),min(),max(),count()   long n = (Long)session.createQuery(hql).uniqueResult();
 * 
 * 分组： group by    having
 * 
 * 分页：setFirstResult(), setMaxResult()
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getCurrentSession();
		String hql = "from School s ";
		Query query = session.createQuery(hql);
		List<School> list = query.list();
		Iterator it = list.iterator();
		while(it.hasNext()) {
			School s = (School) it.next();
			System.out.println(s.getName());
		}
	}

}
