import java.util.List;

class User
{
private String username;
private Integer age;

public User(String username, Integer age)
{
this.username=username;
this.age=age;
}

public Integer getAge()
{
return age;
}

public String getUserName()
{
return username;
}

@Override
public String toString()
{
return ("Customer { name: "+ username+" Age: "+age+" }");
}

}


public class Main
{

public static  List<User> getUsers()
{
return List.of(
new User("A",18),
new User("B",21),
new User("C",23),
new User("D",25),
new User("E",10)
);
}


public static void main(String args[])
{
	List<User> users = getUsers();
	users.stream().filter(u->u.getAge()>18).forEach(System.out::println);
}
}
