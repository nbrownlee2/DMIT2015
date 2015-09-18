package util;

import static org.junit.Assert.*;
import org.junit.Test;

public class GmailTest {
	@Test
	public void testSendmail() {
		Gmail mailer = new Gmail("nbrownlee.dmit2015@gmail.com", "GutenTag123");
		try {
			mailer.sendmail("nbrownlee.dmit2015@gmail.com", "swu@nait.ca", "DMIT2015 Assignment 3 from Nicholas Brownlee",
					"JavaMail API is simple!");
		} catch (Exception e) {
			fail("Error sending email");
		}
	}
}
