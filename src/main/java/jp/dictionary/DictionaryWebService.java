package jp.dictionary;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DictionaryWebService {

    private static final String webRequestURI =
            "https://dict-mobile.iciba.com/interface/index.php?c=word&m=getsuggest&nums=10&is_need_mean=1&word=";

    public static Word getWord(String requestWord) {
        var response = searchWord(requestWord);
        Word word = createWord(response);
        return word;
    }

    private static HttpResponse<String> searchWord(String requestWord) {
        // create a client
        var client = HttpClient.newHttpClient();

        // create a request
        var requestURI = webRequestURI + requestWord;
        var request = HttpRequest.newBuilder(URI.create(requestURI))
                .GET()
                .build();

        // use the client to send the request
        return getResponse(client, request);
    }

    private static HttpResponse<String> getResponse(HttpClient client, HttpRequest request) {
        try {
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static Word createWord(HttpResponse<String> response) {
        // TODO parse json
        return null;
    }

}
