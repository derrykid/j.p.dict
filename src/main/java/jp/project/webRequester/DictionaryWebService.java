package jp.project.webRequester;

import jp.project.word.Word;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DictionaryWebService {

    private static final String WEB_REQUEST_ADDRESS =
            "https://dict-mobile.iciba.com/interface/index.php?c=word&m=getsuggest&nums=10&is_need_mean=1&word=";
    private static final HttpClient httpClient = HttpClient.newHttpClient();

    public static Word getWord(String requestWord) {
        var response = searchWord(requestWord);
        return parseWord(response);
    }

    private static HttpResponse<String> searchWord(String requestWord) {
        var client = httpClient;

        // create a request
        var requestURI = WEB_REQUEST_ADDRESS + requestWord;
        var request = HttpRequest.newBuilder(URI.create(requestURI))
                .GET()
                .build();

        // use the client to send the request
        return getResponse(client, request);
    }

    private static HttpResponse<String> getResponse(HttpClient client, HttpRequest request) {
        try {
            return client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (InterruptedException | IOException e) {
            System.out.println("Web request has been interrupted.");
            throw new RuntimeException(e);
        }
    }

    private static Word parseWord(HttpResponse<String> response) {
        // TODO parse json
        return null;
    }

}
