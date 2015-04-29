package demotask;

/**
* Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
*/
public interface SmsGateway {
  boolean send(SimpleMessage message);
}
