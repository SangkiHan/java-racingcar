package step1;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class SetTest {

        private Set<Integer> numbers;

        @BeforeEach
        void setUp() {
                numbers = new HashSet<>();
                numbers.add(1);
                numbers.add(1);
                numbers.add(2);
                numbers.add(3);
        }

        @Test
        public void Set_크기_확인() {

                assertThat(numbers).hasSize(3);
        }

        @ParameterizedTest
        @DisplayName("Set_내_존재하는_숫자")
        @ValueSource(strings = {"1", "2", "3"})
        void Set_내_특정_숫자_존재_여부_확인(int numStr) {

                assertThat(numbers).contains(numStr);
        }

        @ParameterizedTest
        @DisplayName("Set_내_특정_숫자_존재_여부_확인")
        @CsvSource(value = {"1:TRUE", "2:TRUE", "3:TRUE", "4:FALSE", "5:FALSE"}, delimiter = ':')
        void Set_내_특정_숫자_존재_여부_확인_Parametrized(int input, boolean expected) {

                assertThat(numbers.contains(input)).isEqualTo(expected);
        }
}

