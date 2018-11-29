package zhouxu.site.cacheclient.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zhouxu.site.cacheclient.pojo.Order;
import zhouxu.site.cacheclient.pojo.OrderExample;

import java.util.List;
@Repository
public interface OrderMapper {
    int countByExample(OrderExample example);

    int deleteByExample(OrderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Order record);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}