/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__long_console_readLine_multiply_67a.java
Label Definition File: CWE191_Integer_Underflow.label.xml
Template File: sources-sinks-67a.tmpl.java
*/
/*
 * @description
 * CWE: 191 Integer Underflow
 * BadSource: console_readLine Read data from the console using readLine
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: multiply
 *    GoodSink: Ensure there will not be an underflow before multiplying data by 2
 *    BadSink : If data is negative, multiply by 2, which can cause an underflow
 * Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
 *
 * */

package testcases.CWE191_Integer_Underflow.s03;
import testcasesupport.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.logging.Level;

public class CWE191_Integer_Underflow__long_console_readLine_multiply_67a extends AbstractTestCase
{
    static class Container
    {
        public long containerOne;
    }

    public void bad() throws Throwable
    {
        long data;

        /* init data */
        data = -1;

        /* POTENTIAL FLAW: Read data from console with readLine*/
        BufferedReader readerBuffered = null;
        InputStreamReader readerInputStream = null;

        try
        {
            readerInputStream = new InputStreamReader(System.in, "UTF-8");
            readerBuffered = new BufferedReader(readerInputStream);

            String stringNumber = readerBuffered.readLine();
            if (stringNumber != null)
            {
                data = Long.parseLong(stringNumber.trim());
            }
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        catch (NumberFormatException exceptNumberFormat)
        {
            IO.logger.log(Level.WARNING, "Error with number parsing", exceptNumberFormat);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (readerBuffered != null)
                {
                    readerBuffered.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
            }
            finally
            {
                try
                {
                    if (readerInputStream != null)
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }
            }
        }

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new CWE191_Integer_Underflow__long_console_readLine_multiply_67b()).badSink(dataContainer  );
    }

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
        long data;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new CWE191_Integer_Underflow__long_console_readLine_multiply_67b()).goodG2BSink(dataContainer  );
    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable
    {
        long data;

        /* init data */
        data = -1;

        /* POTENTIAL FLAW: Read data from console with readLine*/
        BufferedReader readerBuffered = null;
        InputStreamReader readerInputStream = null;

        try
        {
            readerInputStream = new InputStreamReader(System.in, "UTF-8");
            readerBuffered = new BufferedReader(readerInputStream);

            String stringNumber = readerBuffered.readLine();
            if (stringNumber != null)
            {
                data = Long.parseLong(stringNumber.trim());
            }
        }
        catch (IOException exceptIO)
        {
            IO.logger.log(Level.WARNING, "Error with stream reading", exceptIO);
        }
        catch (NumberFormatException exceptNumberFormat)
        {
            IO.logger.log(Level.WARNING, "Error with number parsing", exceptNumberFormat);
        }
        finally
        {
            /* clean up stream reading objects */
            try
            {
                if (readerBuffered != null)
                {
                    readerBuffered.close();
                }
            }
            catch (IOException exceptIO)
            {
                IO.logger.log(Level.WARNING, "Error closing BufferedReader", exceptIO);
            }
            finally
            {
                try
                {
                    if (readerInputStream != null)
                    {
                        readerInputStream.close();
                    }
                }
                catch (IOException exceptIO)
                {
                    IO.logger.log(Level.WARNING, "Error closing InputStreamReader", exceptIO);
                }
            }
        }

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new CWE191_Integer_Underflow__long_console_readLine_multiply_67b()).goodB2GSink(dataContainer  );
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }

}
