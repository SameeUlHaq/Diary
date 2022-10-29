package Model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/**
 * Hela denna klassen är som en navigator för programmet
 * Användarens input printas in, här hjälper vi programmet att hitta till rätt tjänst för Json-filen
 */
public class DiaryStore {
    private DiaryStore() {}
    /**
     * Här skapar vi en genväg till Json-filen
     */
    private static final Path path = Paths.get("src/main/resources/diary.json");

    private static final ObjectMapper mapper = new ObjectMapper();

    public static List<Diary> getPosts() throws IOException {
        return List.of(mapper.readValue(path.toFile(),
                Diary[].class)
        );
    }

    public static void addPost(Diary post) throws IOException {
        var currentPosts = new ArrayList<>(getPosts());
        currentPosts.add(post);
        mapper.writerWithDefaultPrettyPrinter().writeValue(path.toFile(), currentPosts);
    }
}
