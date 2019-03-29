import java.io.IOException;
import java.net.URL;

public class WGet {
    public static void main(final String... args) throws IOException {
        new URL(args[0]).openStream().transferTo(System.out);
    }
}