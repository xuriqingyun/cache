package zhouxu.site.cacheclient.service.ipml;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import zhouxu.site.cacheclient.constants.RestConst;
import zhouxu.site.cacheclient.exception.BizException;
import zhouxu.site.cacheclient.pojo.Mail;
import zhouxu.site.cacheclient.service.MailService;
import zhouxu.site.cacheclient.utils.JsonUtils;


/**
 * Created with IntelliJ IDEA.
 * Description:邮件服务实现
 * User: zhouxu
 * Date: 2018-11-14 13:43
 */
@Service
public class MailServiceImpl implements MailService {

    @Value("${mail-exhange}")
    private String exhange;
    @Value("${mail-routingKey}")
    private String routingKey;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public boolean sendSimpleTextMail(Mail mail) {
        try{
            rabbitTemplate.convertAndSend(exhange,routingKey,JsonUtils.toJson(mail));
        }catch (Exception e){
            throw  new BizException(RestConst.CommonEnum.SENDMAILFAIL);
        }
        return true;
    }

    @Override
    public boolean sendMimeMail(Mail mail)  {
        return false;
    }

    @Override
    public boolean sendEmail(Mail mail)  {
        switch (mail.getMailType()){
            case SIMPLETEXT:return this.sendSimpleTextMail(mail);
            case MIME:return this.sendMimeMail(mail);
        }
        return false;
    }
}
