package hibernate;


/**
 * 
 * @author 焦计划
 * @date 2019年6月23日  下午4:31:46
 */
public class School {
	private int sid;
	private String name;
	private String addr;

	public School() {
		super();
	}

	public School(String name, String addr) {
		super();
		this.name = name;
		this.addr = addr;
	}
	

	public School(int sid, String name, String addr) {
		super();
		this.sid = sid;
		this.name = name;
		this.addr = addr;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

}
