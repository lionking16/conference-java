import com.pluralsight.repository.HibernateSpeakerRepoImpl;
import com.pluralsight.repository.SpeakerRepo;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean (name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();
        speakerService.setSpeakerRepo(getSpeakerRepository());

        return speakerService;
    }

    @Bean (name = "speakerRepository")
    public SpeakerRepo getSpeakerRepository(){
        return new HibernateSpeakerRepoImpl();
    }
}
