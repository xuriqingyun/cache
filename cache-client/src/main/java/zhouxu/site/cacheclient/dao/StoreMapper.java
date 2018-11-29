package zhouxu.site.cacheclient.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zhouxu.site.cacheclient.pojo.Store;
import zhouxu.site.cacheclient.pojo.StoreExample;

import java.util.List;
@Repository
public interface StoreMapper {
    int countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}