package task1;

import org.hamcrest.Factory;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/28/15.
 */
public class SendMessagesTest {

  @Rule
  public JUnitRuleMockery context = new JUnitRuleMockery();

  @Test
  public void happyPath() {
    Person person1 = new Person("sisa");
    final Person person2 = new Person("Ivan");
    final Message message = new Message(person2, "Hello", "Q sega");
    final Validator validator=context.mock(Validator.class);
    final SMSGateway gateway=context.mock(SMSGateway.class);
final MessageSender messageSender=new MessageSender(validator,gateway);
    context.checking(new Expectations() {
      {
        oneOf(validator).validate(message); will(returnValue(true));
        oneOf(gateway).send(with(any(Message.class)));
        will(returnValue(true));
      }
    });

    assertThat(person1.sendMessage(message, messageSender), is(true));
  }




//  @Factory
//  public static org.hamcrest.Matcher<Message> validateMessage(Message message){
//    return new NotEmptyMessage(message);
//  }
}
