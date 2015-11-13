package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.PersonDomainModel;
import java.time.LocalDate;
import java.util.Date; 

public class Person_Test {

	public static PersonDomainModel FP1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		FP1 = new PersonDomainModel();
		FP1.setFirstName("Jeffery");
		FP1.setLastName("Nelson");
		FP1.setStreet("123 Street");
		FP1.setPostalCode(18463);
		FP1.setCity("Florance");
		FP1.setBirthday(LocalDate.of(1994, 05, 27));
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

	@Test
	public void testAddPerson() {
		PersonDAL.addPerson(FP1);
	}

	@Test
	public void testDeletePerson(){
		PersonDAL.deletePerson(FP1.getPersonID());
	}
	
	@Test
	public void testUpdatePerson(){
		final String NEWLASTNAME = "Gurrido";
		FP1.setLastName(NEWLASTNAME);
		PersonDAL.updatePerson(FP1);
	}
	
}
