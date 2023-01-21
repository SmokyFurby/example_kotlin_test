import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class SampleClassTest {

    // like python unittest's setUpClass
    private val testClass: SampleClass = SampleClass()

    @Test
    fun testShouldSum() {
        // arrange
        val expected = 42

        // act
        val actual = testClass.sum(40, 2)

        // assert
        assertIs<Int>(actual)
        assertEquals(expected, actual)
    }
}