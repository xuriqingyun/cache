package zhouxu.site.cacheclient.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zhouxu.site.cacheclient.pojo.Custom;
import zhouxu.site.cacheclient.pojo.CustomExample;

import java.util.List;

@Repository
public interface CustomMapper {
    int countByExample(CustomExample example);

    int deleteByExample(CustomExample example);

    int deleteByPrimaryKey(Integer customId);

    int insert(Custom record);

    int insertSelective(Custom record);

    List<Custom> selectByExample(CustomExample example);

    Custom selectByPrimaryKey(Integer customId);

    int updateByExampleSelective(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByExample(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);
}