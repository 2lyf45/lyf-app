package test;

import org.junit.Test;

import dao.BaseDao;

public class UserDaoTest {
	@Test
	public void t1(){
		if(BaseDao.getConnection()!=null){
			System.out.println("���ӳɹ�");
		}else{
			System.out.println("ʧ��");
		}
	}
}
