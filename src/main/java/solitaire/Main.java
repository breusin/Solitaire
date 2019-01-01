package solitaire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * This is the main entry point.
 * 
 * @author brentreusing
 *
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

		   ctx.register(SpringConfig.class);
		   ctx.refresh();
		   
		   Deck deck = ctx.getBean(Deck.class);
		   
		   //deck.shuffle();
		   
		   System.out.println("------------");
		   deck.getCards().forEach(System.out::println);
		   deck.shuffle();
		   System.out.println("------------");
		   
		   deck.getCards().forEach(System.out::println);
			   
		   ctx.close();
	}

}
