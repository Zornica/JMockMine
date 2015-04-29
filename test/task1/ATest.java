package task1;

import org.jmock.Expectations;
import org.jmock.auto.Mock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

/**
 * Created by Silvia Petrova(silviqpetrova1992@gmail.com)on 4/29/15.
 */
public class ATest {

  @Rule
  public JUnitRuleMockery context = new JUnitRuleMockery();

  @Mock
  B b;

  @Test
  public void negativeNumbers() {
    A a = new A(b);

    context.checking(new Expectations() {{
      oneOf(b).negativeValue(-9, -14);
    }});

    a.doSomething(-9, -14);
  }

  @Test
  public void positiveNumbers() {
    A a = new A(b);

    context.checking(new Expectations() {{
      oneOf(b).positiveValue(10, 12);
    }});

    a.doSomething(10, 12);
  }

//
//  @Test
//  public void anotherTest2() {
//    A a = new A(new BImpl(new CImpl()));
//    a.doSomething(-10, 20);
//  }
//
//  @Test
//  public void anotherTest3() {
//    A a = new A(new BImpl(new CImpl()));
//    a.doSomething(20, 10);
//  }
//
//
//  @Test
//  public void anotherTest4() {
//    A a = new A(new BImpl(new CImpl()));
//    a.doSomething(20, 50);
//  }


}
