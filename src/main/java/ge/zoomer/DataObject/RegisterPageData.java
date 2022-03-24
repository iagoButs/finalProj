package ge.zoomer.DataObject;

import com.github.javafaker.Faker;

public interface RegisterPageData {
    Faker faker=new Faker();
    String
        email=faker.internet().emailAddress(),
        password=faker.internet().password(6,10,true,false,true);

}
