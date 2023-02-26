package io.github.yg0585.libs;

import static org.assertj.core.api.AssertionsForClassTypes.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLibraryTest {

	@Test
	void test() {
		boolean flag = true;

		String s = TestLibrary.helloworld(flag);

		assertThat(s).isEqualTo("hello world!");
	}
}