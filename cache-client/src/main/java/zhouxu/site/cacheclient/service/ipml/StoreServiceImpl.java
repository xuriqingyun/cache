package zhouxu.site.cacheclient.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private StoreMapper storeMapper;

    @Autowired
    private RedisDao redisDao;

    @Override
    public Store getById(Integer id) {
        if(id==null){
            throw new BizException(RestConst.CommonEnum.NOTNULL);
        }
        if(redisDao.hasKey(id.toString())){
            return JsonUtils.parse(redisDao.get(id.toString()).toString(),Store.class) ;
        }else{
            Store store = storeMapper.selectByPrimaryKey(id);
            redisDao.set(id.toString(),JsonUtils.toJson(store));
            return store;
        }
    }
}
