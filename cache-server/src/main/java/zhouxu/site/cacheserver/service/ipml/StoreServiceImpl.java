package zhouxu.site.cacheserver.service.ipml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zhouxu.site.cacheserver.dao.StoreMapper;
import zhouxu.site.cacheserver.pojo.Store;
import zhouxu.site.cacheserver.service.StoreService;


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


    @Override
    public Store getById(Integer id) {
        return storeMapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean update(Store store) {
        int row = storeMapper.updateByPrimaryKey(store);
        if (row == 1) {
            return true;
        }
        return false;
    }
}
