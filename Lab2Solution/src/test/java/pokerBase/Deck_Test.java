package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerExceptions.DeckException;

public class Deck_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=DeckException.class)
	public void DeckOverdraw() throws DeckException{
	Deck d1 = new Deck();
	

	for (int i=0;i<54;i++){
			Card c=d1.Draw();
		
	}

	}
}
