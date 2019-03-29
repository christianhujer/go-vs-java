import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrueTest {
    @Test
    public void testTrue() throws IOException, InterruptedException {
        final Process process = new ProcessBuilder().command("java", "-jar", "True.jar").start();
        final int exitValue = process.waitFor();
        assertEquals(0, exitValue);
    }
}