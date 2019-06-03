import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class ProductArrayApplicationTest {
    public ProductArrayApplicationTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void whenBasicInput_thenBasicOutput() {
        System.out.println("TEST #1 - whenBasicInput_thenBasicOutput");

        // given
        long[] input = new long[]{1, 2, 3, 4, 5};
        long[] expectedResult = new long[]{120, 60, 40, 30, 24};

        // when
        long[] actualResult = ProductArrayApplication.calculateProductArrayBasic(input);

        // then
        assertArrayEquals("TEST #1 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenEmptyInput_thenEmptyOutput() {
        System.out.println("TEST #2 - whenEmptyInput_thenEmptyOutput");

        // given
        long[] input = new long[]{};
        long[] expectedResult = new long[]{};

        // when
        long[] actualResult = ProductArrayApplication.calculateProductArrayBasic(input);

        // then
        assertArrayEquals("TEST #2 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenSingleZeroInput_thenSingleOneOutput() {
        System.out.println("TEST #3 - whenSingleZeroInput_thenSingleOneOutput");

        // given
        long[] input = new long[]{0};
        long[] expectedResult = new long[]{1};

        // when
        long[] actualResult = ProductArrayApplication.calculateProductArrayBasic(input);

        // then
        assertArrayEquals("TEST #3 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenSingleOneInput_thenSingleOneOutput() {
        System.out.println("TEST #4 - whenSingleOneInput_thenSingleOneOutput");

        // given
        long[] input = new long[]{1};
        long[] expectedResult = new long[]{1};

        // when
        long[] actualResult = ProductArrayApplication.calculateProductArrayBasic(input);

        // then
        assertArrayEquals("TEST #4 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenDuoInput_thenDuoOutput() {
        System.out.println("TEST #5 - whenDuoInput_thenDuoOutput");

        // given
        long[] input = new long[]{1, 2};
        long[] expectedResult = new long[]{2, 1};

        // when
        long[] actualResult = ProductArrayApplication.calculateProductArrayBasic(input);

        // then
        assertArrayEquals("TEST #5 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenNullInput_thenNullOutput() {
        System.out.println("TEST #6 - whenNullInput_thenNullOutput");

        // given
        long[] input = null;
        long[] expectedResult = null;

        // when
        long[] actualResult = ProductArrayApplication.calculateProductArrayBasic(input);

        // then
        assertTrue("TEST #6 FAILED!!!", actualResult == expectedResult);
    }

    @Test
    public void whenZeroLengthInput_thenZeroLengthOutput() {
        System.out.println("TEST #7 - whenZeroLengthInput_thenZeroLengthOutput");

        // given
        long[] input = new long[0];
        long[] expectedResult = new long[0];

        // when
        long[] actualResult = ProductArrayApplication.calculateProductArrayBasic(input);

        // then
        assertArrayEquals("TEST #7 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenMultipleZerosPresentInput_thenAllZerosOutput() {
        System.out.println("TEST #8 - whenMultipleZerosPresentInput_thenAllZerosOutput");

        // given
        long[] input = new long[]{1, 0, 3, 0, 5};
        long[] expectedResult = new long[]{0, 0, 0, 0, 0};

        // when
        long[] actualResult = ProductArrayApplication.calculateProductArrayBasic(input);

        // then
        assertArrayEquals("TEST #8 FAILED!!!", expectedResult, actualResult);
    }

    @Test
    public void whenSingleZeroPresentInput_thenSingleValuePresentOutput() {
        System.out.println("TEST #9 - whenSingleZeroPresentInput_thenSingleValuePresentOutput");

        // given
        long[] input = new long[]{1, 2, 3, 0, 5};
        long[] expectedResult = new long[]{0, 0, 0, 30, 0};

        // when
        long[] actualResult = ProductArrayApplication.calculateProductArrayBasic(input);

        // then
        assertArrayEquals("TEST #9 FAILED!!!", expectedResult, actualResult);
    }
}
