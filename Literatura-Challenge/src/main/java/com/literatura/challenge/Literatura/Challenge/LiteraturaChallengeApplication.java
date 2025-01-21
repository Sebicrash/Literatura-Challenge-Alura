package com.literatura.challenge.Literatura.Challenge;

import com.literatura.challenge.Literatura.Challenge.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraturaChallengeApplication implements CommandLineRunner {
	@Autowired
	private final Principal principal;


    public LiteraturaChallengeApplication(Principal principal) {
        this.principal = principal;
    }


    public static void main(String[] args) {
		SpringApplication.run(LiteraturaChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		principal.mostrarMenu();
	}
}