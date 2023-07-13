/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 10 00:10:21 GMT 2023
 */

package calcolatrice;

import org.junit.Test;
import static org.junit.Assert.*;
import calcolatrice.calcolatrice;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class calcolatrice_ESTest extends calcolatrice_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      calcolatrice calcolatrice0 = new calcolatrice();
      int int0 = calcolatrice0.somma(0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      calcolatrice calcolatrice0 = new calcolatrice();
      int int0 = calcolatrice0.somma(1, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      calcolatrice calcolatrice0 = new calcolatrice();
      int int0 = calcolatrice0.somma(0, (-4434));
      assertEquals((-4434), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      calcolatrice calcolatrice0 = new calcolatrice();
      double double0 = calcolatrice0.divisione(0, (-4244));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      calcolatrice calcolatrice0 = new calcolatrice();
      double double0 = calcolatrice0.divisione(1, 0);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      calcolatrice calcolatrice0 = new calcolatrice();
      double double0 = calcolatrice0.divisione(1, (-919));
      assertEquals((-0.001088139281828074), double0, 0.01);
  }
}
