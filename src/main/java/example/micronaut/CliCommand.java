package example.micronaut;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import javax.inject.Inject;

@Command(name = "cli", description = "...",
        mixinStandardHelpOptions = true)
public class CliCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;
    
    @Inject
    private GoogleClient googleClient; 

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(CliCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }

        System.out.println("googleClient.getPage() = " + googleClient.getPage());
    }
}
