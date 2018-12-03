package zhouxu.site.cacheserver.service.ipml;

import org.springframework.stereotype.Service;
import zhouxu.site.cacheserver.service.MailService;


/**
 * Created with IntelliJ IDEA.
 * Description:邮件服务实现
 * User: zhouxu
 * Date: 2018-11-14 13:43
 */
@Service
public class MailServiceImpl implements MailService {

//    @Value("${mail-exhange}")
//    private String exhange;
//    @Value("${mail-routingKey}")
//    private String routingKey;
//
//    @Autowired
//    private RabbitTemplate rabbitTemplate;
//
//    @Override
//    public boolean sendSimpleTextMail(Mail mail) {
//        try{
//            rabbitTemplate.convertAndSend(exhange,routingKey,JsonUtils.toJson(mail));
//        }catch (Exception e){
//            throw  new BizException(RestConst.CommonEnum.SENDMAILFAIL);
//        }
//        return true;
//    }
//
//    @Override
//    public boolean sendMimeMail(Mail mail)  {
//        return false;
//    }
//
//    @Override
//    public boolean sendEmail(Mail mail)  {
//        switch (mail.getMailType()){
//            case SIMPLETEXT:return this.sendSimpleTextMail(mail);
//            case MIME:return this.sendMimeMail(mail);
//        }
//        return false;
//    }
}
