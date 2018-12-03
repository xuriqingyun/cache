package zhouxu.site.cacheserver.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zhouxu.site.cacheserver.pojo.Orders;
import zhouxu.site.cacheserver.pojo.OrdersExample;

import java.util.List;
@Repository
public interface OrdersMapper {
    int countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    Orders selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
}