import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WGet2 {
    public static void main(final String... args) throws URISyntaxException, IOException, InterruptedException {
        final HttpClient httpClient = HttpClient.newBuilder().followRedirects(HttpClient.Redirect.NORMAL).build();
        final HttpRequest request = HttpRequest.newBuilder(new URI(args[0])).GET().build();
        final HttpResponse<InputStream> response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());
        response.body().transferTo(System.out);
    }
}
