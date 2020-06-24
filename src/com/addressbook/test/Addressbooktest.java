package  com.addressbook.test;
import com.addressbook.model.Person;
public class Addressbooktest{

	public static void main(String[] arg){
	Person newPerson=new Person();
	newPerson.setname("Dipak");
	newPerson.setemailId("dipakwaghamode@gmail.com");
	//newPerson.setmobileNo(965);
	System.out.println("Person name"+ newPerson.getname());
	System.out.println("Person emailid"+ newPerson.getemailid());

	}
}
