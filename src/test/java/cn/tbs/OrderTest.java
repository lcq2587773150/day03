package cn.tbs;

import cn.tbs.mapper.OrderMapper;
import cn.tbs.pojo.Order;
import cn.tbs.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class OrderTest {
    @Test
    public void Test1(){
        SqlSession sqlSession = MyBatisUtil.openSession();
        Order order = sqlSession.getMapper(OrderMapper.class).findByIdWithUser(1);
        System.out.println(order);
    }
}
