import org.junit.Test
import org.junit.Assert.*

val msg = "I was compiled by Scala 3. :)"

class Test1:
    @Test def t1(): Unit = assertEquals("I was compiled by Scala 3. :)", msg)
