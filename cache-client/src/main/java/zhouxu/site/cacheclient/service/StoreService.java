package zhouxu.site.cacheclient.service;

import zhouxu.site.cacheclient.pojo.Store;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-11-29 13:38
 */
public interface StoreService {

    /**
     * @Author zhouxu
     * @Description //通过主建获取Store
     * @Date 2018/11/29 13:40
     * @Param [id]
     * @return zhouxu.site.cacheclient.pojo.Store
     * @throws
     **/
    Store getById(Integer id);
}
