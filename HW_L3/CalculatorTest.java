
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void computeLengthCircle() {
        // 1. Пишем тестовые данные для Calculator
        Calculator calculator = new Calculator();
        // 2. Создаем новый метод
        //calculator.computeLengthCircle();
        // 3. Создаем метод в классе Calculator
        // 4. Дописываем тест
        assertTrue(Math.abs(12 - calculator.computeLengthCircle(2)) < 1);
    }

}
