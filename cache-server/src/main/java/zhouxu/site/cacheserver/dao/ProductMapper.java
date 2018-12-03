package zhouxu.site.cacheserver.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import zhouxu.site.cacheserver.pojo.Product;
import zhouxu.site.cacheserver.pojo.ProductExample;

import java.util.List;
@Repository
public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}