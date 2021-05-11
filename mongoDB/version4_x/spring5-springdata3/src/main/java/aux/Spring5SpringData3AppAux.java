package aux;


import com.github.cloudyrock.mongock.examples.Spring5SpringData3App;
import com.github.cloudyrock.mongock.examples.client.ClientRepository;
import com.github.cloudyrock.mongock.examples.spring.DateToZonedDateTimeConverter;
import com.github.cloudyrock.mongock.examples.spring.ZonedDateTimeToDateConverter;
import com.github.cloudyrock.springboot.v2_2.EnableMongock;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class Spring5SpringData3AppAux implements CommandLineRunner {


    public static void main(String[] args) {
        System.out.println("\n\n\nCALLING THE AUX MAIN\n\n\n\n");
        getSpringAppBuilder().run(args);
    }


    public static SpringApplicationBuilder getSpringAppBuilder() {
        return new SpringApplicationBuilder()
                .web(WebApplicationType.NONE)
                .sources(Spring5SpringData3AppAux.class, Spring5SpringData3App.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n\n\nMONGOCK CLI\n\n\n\n");
        int read = System.in.read();
        System.out.println("INPUT: " + read);
    }
}
