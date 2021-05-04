package example.micronaut;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class GoogleClientTest {

    @Inject
    private GoogleClient client;

    @Test
    void testGetPage() {
        final String page = client.getPage();

        assertFalse(page.isBlank());
    }
}
