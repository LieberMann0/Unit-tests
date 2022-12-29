package HW1;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class Calculator_Test {

    public static void main(String[] args) {

        //Проверка с целыми числами
        assertThat(Calculator.calculation(4, 4, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(4, 4, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(4, 4, '*')).isEqualTo(16);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

    
        assertThatThrownBy(()Calculator
            .calculatingDiscount(-1000, 50))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Сумма покупки не может быть отрицательной");

        assertThatThrownBy(()Calculator
            .calculatingDiscount(1000, -10))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");
        
        assertThatThrownBy(()Calculator
            .calculatingDiscount(1000, 101))
            .isInstanceOf(ArithmeticException.class)
            .hasMessage("Скидка должна быть в диапазоне от 0 до 100%");

        //Метод должен возвращать правильный результат 1000 - 25%*1000 = 750

        assertThat(Calculator.calculatingDiscount(1000, 25)).isEqualTo(750);
        assertThat(Calculator.calculatingDiscount(1000, 100)).isEqualTo(0);
        assertThat(Calculator.calculatingDiscount(1000, 0)).isEqualTo(1000);
    }    
}
