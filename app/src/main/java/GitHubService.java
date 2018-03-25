import java.util.List;

/**
 * Created by Sophia on 3/25/2018.
 *
 * Interface to define HTTP operations for API
 */
public interface GitHubService {

    @POST("signup")

    Call<List<String>> createUser(String email, String name, String password, String admin);

    @POST("authenticate")

    Call<List<String>> groupList(String email, String password);
}
