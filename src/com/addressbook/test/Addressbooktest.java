package com.addressbook.test;
import com.addressbook.model.Person;

import java.util.*;
import java.lang.*;

public class Addressbooktest
{
	Scanner scan=new Scanner(System.in);
	ArrayList<Person> personList=new ArrayList<Person>();

	public static void main(String[] args){
		Addressbooktest addressbook=new Addressbooktest();


		boolean abc=true;
		while(abc){
			switch(addressbook.filemenu()){
				case 1: addressbook.addPerson();
				break;
				case 2: addressbook.editPerson();
				break;
				case 3: addressbook.deletePerson();
				break;
				case 4: addressbook.sortByFirstName();
				break;
				case 5: addressbook.sortByLastName();
				break;
				case 6: addressbook.sortByZipCode();
				break;
				case 7: addressbook.printAddressBookList();
				break;
				case 8: abc=false;
			}
		}
	}

		public ArrayList<Person> getPersonList()
                {
			return this.personList;
		}

		public int filemenu(){
		System.out.println("***********AddressBook Application Menu**************");
		System.out.println("1.Add Person");
                System.out.println("2.Edit Person");
                System.out.println("3.Delete Person");
                System.out.println("4.SortByFirstName");
                System.out.println("5.SortByLastName");
                System.out.println("6.SortByZipCode");
                System.out.println("7.Print all Entries");
                System.out.println("8.Exit");
                System.out.println("\n");

		System.out.println("Enter your Choice: ");
		int choice=scan.nextInt();
		return choice;
		}

		public void addPerson(){
				Person newPerson=new Person();
			        System.out.println("First Name : ");
				newPerson.setFirstName(scan.next());
				System.out.println("Last Name : ");
				newPerson.setLastName(scan.next());
				System.out.println("EmailID : " );
				newPerson.setEmailId(scan.next());
				System.out.println("State : " );
				newPerson.setState(scan.next());
				System.out.println("City : " );
				newPerson.setCity(scan.next());
				System.out.println("ZipCode : ");
				newPerson.setZipCode(scan.nextInt());
				System.out.println("Mobile Number : ");
				newPerson.setMobileNumber(scan.nextLong());
			        this.personList.add(newPerson);
		}


		public void editPerson(){
			System.out.println("Enter First Name of person to edit: ");
			String fname=scan.next();
			Person editPer=this.getPersonFromList(fname);
                                System.out.println("First Name : " );
				editPer.setFirstName(scan.next());
                                System.out.println("Last Name : " );
				editPer.setLastName(scan.next());
                                System.out.println("EmailID : " );
				editPer.setEmailId(scan.next());
                                System.out.println("State : " );
				editPer.setState(scan.next());
                                System.out.println("City : " );
				editPer.setCity(scan.next());
                                System.out.println("ZipCode : " );
				editPer.setZipCode(scan.nextInt());
                                System.out.println("Mobile Number : ");
				editPer.setMobileNumber(scan.nextLong());
		}

		public void deletePerson(){
			System.out.println("Enter first name of person to delete");
			String fname=scan.next();
			Person deletPerson=this.getPersonFromList(fname);
			if(deletPerson!=null){
				this.personList.remove(deletPerson);
			}
		}

		public void sortByFirstName(){
                	Comparator<Person> cm2=Comparator.comparing(Person::getFirstName);  
			Collections.sort(personList,cm2); 
		}

		public void sortByLastName(){
                	Comparator<Person> cm2=Comparator.comparing(Person::getLastName);  
			Collections.sort(personList,cm2); 
		}


		public void sortByZipCode(){
                	Collections.sort(this.personList);
		}


		public Person getPersonFromList(String name){
			for(Person per:this.personList){
				if(name.equalsIgnoreCase(per.getFirstName())){
					return per;
				}
			}
			return null;
		}

		public void printAddressBookList(){
			for(Person per:this.personList){
				System.out.println(per.toString());
			}
		}
}
