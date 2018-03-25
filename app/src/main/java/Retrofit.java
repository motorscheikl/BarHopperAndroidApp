/**
 * Created by Sophia on 3/25/2018.
 *
 * Implemets our interface that defines HTTP operations
 * (not changed to fit our API yet besides the base URL)
 */

public class Retrofit {
    Retrofit retrofit = new Retrofit.Builder()

            .baseUrl(“https://barhopperapi.herokuapp.com/api")

            .build();

    GitHubService service = retrofit.create(GitHubService.class);

    Call<List<Repo>> repos = service.listRepos(“Gino Osahon”);
}
