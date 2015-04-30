package demotask;

/**
* Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
*/
public class Dispatcher {
  private final SmsGateway gateway;
  private final MessageValidator validator;

  public Dispatcher(SmsGateway gateway, MessageValidator validator) {
    this.gateway = gateway;
    this.validator = validator;
  }


  public void send(SimpleMessage message) {

    if (!validator.validate(message)) {
      return;
    }

    // sends ...
    gateway.send(message);
  }

}
