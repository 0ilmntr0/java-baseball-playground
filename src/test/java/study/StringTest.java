package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {

    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split 메서드로 문자열을 ','로 분리")
    void splitTest() {
        String[] result = "1,2".split(",");
        assertThat(result).containsExactly("1", "2");

        result = "1".split(",");
        assertThat(result).containsExactly("1");
    }

    @Test
    @DisplayName("substring 메서드로 괄호 제거")
    void substringTest() {
        String result = "(1,2)".substring(1, 4);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 메서드로 특정 문자 가져오기")
    void charAtTest() {
        char result = "abc".charAt(0);
        assertThat(result).isEqualTo('a');
    }

    @Test
    @DisplayName("charAt 메서드 예외 처리 테스트")
    void charAtExceptionTest() {
        assertThatThrownBy(() -> {
            "abc".charAt(5);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range");
    }
}
