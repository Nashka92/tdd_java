package fibTest;

import org.example.fib.Fib;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FibTest {
    private Fib fib;

    @Test
    public void whenGetFibSeries_Range_1_result_notnull() {
        // Arrange
        fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse("La liste ne doit pas être vide", result.isEmpty());
    }

    @Test
    public void whenGetFibSeries_Range_1_result_list_contain_0() {
        // Arrange
        fib = new Fib(1);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertTrue("La liste contient un 0", result.contains(0));
    }

    @Test
    public void whenGetFibSeries_Range_6_result_contain_3() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertTrue("La liste doit contenir le chiffre 3", result.contains(3));
    }

    @Test
    public void whenGetFibSeries_Range_6_result_contain_6_elements() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertEquals("La liste doit contenir exactement 6 éléments", 6, result.size());
    }

    @Test
    public void whenGetFibSeries_Range_6_result_doesnot_have_4() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertFalse("La liste ne doit pas contenir le chiffre 4",  result.contains(4));
    }

    @Test
    public void whenGetFibSeries_Range_6_result_is_correct() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        Assert.assertEquals("La liste doit correspondre à {0, 1, 1, 2, 3, 5}",result, List.of(0, 1, 1, 2, 3, 5) );
    }

    @Test
    public void whenGetFibSeries_Range_6_is_sorted() {
        // Arrange
        fib = new Fib(6);

        // Act
        List<Integer> result = fib.getFibSeries();

        // Assert
        List<Integer> sortedList = List.copyOf(result);
        Assert.assertEquals("La liste doit être triée de façon ascendante",result,sortedList);
    }
}