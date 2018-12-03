package zhouxu.site.cacheclient.service.ipml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import zhouxu.site.cacheclient.pojo.Mail;
import zhouxu.site.cacheclient.service.MailService;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: zhouxu
 * Date: 2018-11-30 17:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceImplTest {

    @Autowired
    private MailService mailService;

    @Test
    public void sendSimpleTextMail() {
        Mail mail = new Mail();
        mail.setFrom("devoperation@163.com");
        mail.setTo("1136112121@qq.com");
        mail.setContent("下单成功");
        mail.setTitle("订单提醒");
        mail.setType("simpletext");
        mailService.sendEmail(mail);
    }

}