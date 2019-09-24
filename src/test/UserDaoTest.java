package test;

import org.junit.Test;

import dao.BaseDao;

public class UserDaoTest {
	@Test
	public void t1(){
		if(BaseDao.getConnection()!=null){
			System.out.println("连接成功");
		}else{
			System.out.println("失败");
		}
	}
}
