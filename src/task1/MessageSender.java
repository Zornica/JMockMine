package task1;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/28/15.
 */
public class MessageSender {
  private Validator validator;
  private SMSGateway gateway;

  public MessageSender(Validator validator, SMSGateway gateway) {
    this.validator = validator;
    this.gateway = gateway;
  }

  boolean send(Message message){
    if(validator.validate(message)){
      gateway.send(message);
      return true;
    };
    return false;
  };
}
