import creational.singleton_kt.SingletonKotlin
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SingletonTests {

    @Test
    fun testNotNullSingleton() {
        val singleton = SingletonKotlin
        Assertions.assertNotNull(singleton)
    }

    @Test
    fun testOnlyOneInstanceExists() {
        val singletonFirst = SingletonKotlin
        val singletonSecond = SingletonKotlin

        assertEquals(singletonFirst, singletonSecond)
    }
}