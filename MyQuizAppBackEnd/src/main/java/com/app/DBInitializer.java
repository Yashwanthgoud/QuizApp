package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Quiz;
import com.app.service.QuizService;

@Component
public class DBInitializer implements CommandLineRunner{
	private QuizService service;
	public DBInitializer(QuizService service) {
		this.service=service;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Quiz quiz1 =new Quiz("“Parliamentary Government” is also known as....?","Cabinet Government\n" + "\n" +"","Responsible Government"," Westminster forms of government"," All of the above",4);
		Quiz quiz2 =new Quiz("What is the minimum age to be appointed as the Chief Minister of a state?"," 25 years","35 years","30 years","18 years",1);
		Quiz quiz3 = new Quiz("Who was the founder of the Theosophical Society in India and started the Home Rule League?","Annie Besant"," Acharya Narendra Dev"," Lal-Bal-Pal","  None of the above",1);
		Quiz quiz4=new Quiz( "The first Women External Affair Minister of India was?", " Sushma Swaraj", "Jayalalitha", "Pratibha Patil", " Indira Gandhi", 4);
		Quiz quiz5=new Quiz( "Who was the Viceroy of India during Swadeshi Movement?","Lord Curzon", " Lord Irwin", " Lord Willingdon", "Lord Lansdowne", 1);
		Quiz quiz6=new Quiz( "Which Ministry allowed 'on-demand' COVID-19 testing?", "Ministry of AYUSH", "Ministry of Health", "Ministry of Home Affairs","None of these", 2);
		Quiz quiz7=new Quiz("The International Rice Research Institute is located in ?", "Indonesia  ", "Malaysia   ", "Philippines  ", "Thailand", 3);
		Quiz quiz8=new Quiz("Light travels at the fastest speed in", "glass", "water", "hydrogen", "vacuum", 4);
		Quiz quiz9=new Quiz("Where is the National Institute of Virology situated?  ", "Pune  ", "Banglore", "Madras", "Bangalore", 1);
		Quiz quiz10=new Quiz("The longest dam of India is the  ?", "Nangal Dam  ", "Bhakra Dam  ", "Maithon Dam  ", "Hirakud Dam", 4);
		this.service.saveQuiz(quiz1);
		this.service.saveQuiz(quiz2);
		this.service.saveQuiz(quiz3);
		this.service.saveQuiz(quiz4);
		this.service.saveQuiz(quiz5);
		this.service.saveQuiz(quiz6);
		this.service.saveQuiz(quiz7);
		this.service.saveQuiz(quiz8);
		this.service.saveQuiz(quiz9);
		this.service.saveQuiz(quiz10);
		System.out.println("Database has been initialized");
		
	}

}
