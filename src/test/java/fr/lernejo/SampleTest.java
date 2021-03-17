package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;

import fr.lernejo.Sample;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleTest {

        private Sample sample;
        @BeforeEach
        public void setUp() throws Exception{
            sample = new Sample();
        }
        @Test
        void operation_add_should_succeed() {
            int a = 8;
            int b = 2;
            int result;

            result = sample.op(Sample.Operation.ADD, a,b);
            Assertions.assertThat(result).as("le résultat de l'addition est de 10")
                .isEqualTo(10);
        }
}

