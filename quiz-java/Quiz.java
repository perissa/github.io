
public class Quiz {
	

	public static void main(String[] args) {
		Question question1 = new
				MultipleChoiceQuestion("Where is Thessaloniki?",
				"in Italy",
				"in USA",
				"in Greece",
				"in Switzerland",
				"in Japan",
				"c");
				question1.check();
				question1.showResults();
		Question question2 = new
				MultipleChoiceQuestion("which coffee is from Thessaloniki?",
			    "Frappe",
				"Latte",
				"Mocha",
				"Cappucino",
				"Espresso",
				"a");
				question2.check();
				question2.showResults();
	
		Question question3 = new
				MultipleChoiceQuestion("What is the meaning of Thessaloniki?",
				"A river's name",
				"A coffee's name",
				"A cat's name",
				"A castle's name",
				"Great Alex's sister's name",
				"e");
				question3.check();
				question3.showResults();
		Question question4 = new
				MultipleChoiceQuestion("How many soccer teams are in Thessaloniki?",
			    "1",
				"2",
				"3",
				"4",
				"5",
				"b");
				question4.check();
				question4.showResults();
		Question question5 = new
				MultipleChoiceQuestion("which one is a historical landmark in Thessaloniki?",
				"tea",
				"coffee",
				"game",
				"white tower",
				"bar",
				"d");
				question5.check();
				question5.showResults();
		Question question6 = new TrueFalseQuestion("Maria is a boy's name.",
		"FALSE");
		question6.check();
		question6.showResults();
		
		Question question7 = new TrueFalseQuestion("Dimitris is a boy's name.",
				"TRUE");
				question7.check();
				question7.showResults();
				
		Question question8 = new TrueFalseQuestion("Eleni is a boy's name.",
				"FALSE");
				question8.check();
				question8.showResults();
		Question question9 = new TrueFalseQuestion("Santorini is in Greece.",
				"TRUE");
				question9.check();
				question9.showResults();
		Question question10 = new TrueFalseQuestion("Thessaloniki is in the South of Greece.",
				"FALSE");
				question10.check();
				question10.showResults();
		
	}
}
		
		
		
		
		
		
		
		
	
	
	