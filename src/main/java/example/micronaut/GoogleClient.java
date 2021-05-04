package example.micronaut;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("https://www.google.com")
public interface GoogleClient {

    @Get
    String getPage();
}
