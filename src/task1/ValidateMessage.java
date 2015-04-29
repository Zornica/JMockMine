package task1;

public class ValidateMessage implements  Validator{

  @Override
  public boolean validate(Message message) {
    if(message.body==null){
      return false;
    }
    return true;
  }
}
