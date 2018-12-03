package zhouxu.site.cacheclient.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import zhouxu.site.cacheclient.constants.RestConst;
import zhouxu.site.cacheclient.dao.RedisDao;
import zhouxu.site.cacheclient.dao.StoreMapper;
import zhouxu.site.cacheclient.exception.BizException;
import zhouxu.site.cacheclient.pojo.Store;
import zhouxu.site.cacheclient.service.StoreService;
import zhouxu.site.cacheclient.utils.JsonUtils;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-11-29 13:39
 */
@Service
public class StoreServiceImpl implements StoreService {

    @Value("${mail-exhange}")
    private String exhange;
    @Value("${mail-routingKey}")
    private String routingKey;

    @Autowired
    private StoreMapper storeMapper;

    @Autowired
    private RedisDao redisDao;

    @Override
    public Store getById(Integer id) {
        if(id==null){
            throw new BizException(RestConst.CommonEnum.NOTNULL);
        }
        String key="product:"+id.toString();
        if(redisDao.hasKey(key)){
            return JsonUtils.parse(redisDao.get(key).toString(),Store.class) ;
        }else{
            Store store = storeMapper.selectByPrimaryKey(id);
            redisDao.set(key,JsonUtils.toJson(store));
            return store;
        }
    }
}
