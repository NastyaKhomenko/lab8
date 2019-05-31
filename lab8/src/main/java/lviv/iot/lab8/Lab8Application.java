package lviv.iot.lab8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;

import ua.lviv.iot.CarCleaningGoods.models.Brusher;
import ua.lviv.iot.CarCleaningGoods.models.Convenience;
import ua.lviv.iot.CarCleaningGoods.models.Quality;


@SpringBootApplication
@EntityScan(basePackages = {"ua.lviv.iot.CarCleaningGoods.models"})
public class Lab8Application {

	public static void main(final String[] args) {
		SpringApplication.run(Lab8Application.class, args);
	}

	@Bean
    public CommandLineRunner demo(final BrusherRepository repository) {      
        return (args) -> {     
            repository.save(new Brusher("Detergent",
                    "Mr.Proper", "Poland", 20, 50, Quality.MEDIUM, "light",
                    Convenience.COMFORTABLE));
            
            repository.findAll().forEach(System.out::println);

        };  
	}
	}

