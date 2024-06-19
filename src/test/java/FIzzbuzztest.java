import org.example.FizzBuzz;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.List;

public class FIzzbuzztest {

    @Test
    public void makingSurePrintWorks() {
        FizzBuzz game = new FizzBuzz();
        List<String> numberList = game.getNumbers();
        Assert.assertEquals("1", numberList.get(0));
        Assert.assertEquals("8", numberList.get(7));
        Assert.assertEquals("98", numberList.get(97));
    }


@Test
public void returnFizz_when3x3() {
    FizzBuzz game = new FizzBuzz();
    List<String> numberList = game.getNumbers();
    Assert.assertEquals("Fizz", numberList.get(2));
    Assert.assertEquals("Fizz", numberList.get(5));
    Assert.assertEquals("Fizz", numberList.get(8));
    Assert.assertEquals("Fizz", numberList.get(11));

    }

@Test
public void returnFuzz_when5x5() {
    FizzBuzz game = new FizzBuzz();
    List<String> numberList = game.getNumbers();
    Assert.assertEquals("Buzz", numberList.get(4));
    Assert.assertEquals("Buzz", numberList.get(9));
    Assert.assertEquals("Buzz", numberList.get(19));
    Assert.assertEquals("Buzz", numberList.get(24));
    }



    @Test
    public void returnFizzBuzz_when5x3() {
        FizzBuzz game = new FizzBuzz();
        List<String> numberList = game.getNumbers();
        Assert.assertEquals("FizzBuzz", numberList.get(14));
        Assert.assertEquals("FizzBuzz", numberList.get(29));
        Assert.assertEquals("FizzBuzz", numberList.get(59));
        Assert.assertEquals("FizzBuzz", numberList.get(89));
    }
}


