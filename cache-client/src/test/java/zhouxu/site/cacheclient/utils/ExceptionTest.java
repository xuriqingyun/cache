package zhouxu.site.cacheclient.utils;

import org.junit.Test;
import zhouxu.site.cacheclient.constants.RestConst;
import zhouxu.site.cacheclient.exception.BizException;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-12-01 11:36
 */
public class ExceptionTest {

    @Test
    public void test() {
        boolean b = testFlag();
        System.out.println(b);
    }

    boolean testFlag() {
        try {
            int t = 1;
            int t1 = 0;
            int c = t / t1;
        } catch (Exception e) {
            throw new BizException(RestConst.CommonEnum.SENDMAILFAIL);
        }
        return true;
    }
}
