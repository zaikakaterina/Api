package app.config;

import app.dto.usersDto.User;
import io.restassured.response.Response;
public class UserRequest extends BaseRequest{

    private static final String userUrl = "api/users";
    private static final String registerUrl = "api/register";
    private static final String loginUrl = "api/login";

    public Response getUsers(String string){
        return getRequestSpecification().when().get(userUrl + "/" + "page=2");
    }

    public Response getSingleUser(String id){
        return getRequestSpecification().when().get(userUrl + "/" + id);
    }

    public Response createUser(User person){
        return getRequestSpecification().when().body(person).post(userUrl);
    }

    public Response updateUser(User person){
        return getRequestSpecification().when().body(person).put(userUrl);
    }

    public Response patchUser(User person){
        return getRequestSpecification().when().body(person).patch(userUrl);
    }

    public Response deleteUser(String id){
        return getRequestSpecification().when().delete(userUrl + "/" + id);
    }

    public Response userNotFound(String id){
        return getRequestSpecification().when().get(userUrl + "/" + id);
    }

    public Response successRegister(Authorizing details){
        return getRequestSpecification().when().body(details).post(registerUrl);
    }

    public Response unsuccessRegister(Authorizing email){
        return getRequestSpecification().when().body(email).post(registerUrl);
    }

    public Response successLogin(Login details){
        return getRequestSpecification().when().body(details).post(loginUrl);
    }

    public Response unsuccessLogin(Login email){
        return getRequestSpecification().when().body(email).post(loginUrl);
    }
}
