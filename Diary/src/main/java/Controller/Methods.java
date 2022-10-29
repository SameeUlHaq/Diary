package Controller;

import Model.DiaryStore;
import Model.Diary;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Här har vi alla metoder för att skapa ett inlägg för dagboken
 * Här sparas det ner användarens inlägg för att sedan kunna visas upp.
 * funktionen "getPost" skapas här och sedan använder sig utav "DiaryStore" som en genväg till Json
 */
public class Methods {

    public void createPost(Diary newPost) {
        try {
            DiaryStore.addPost(newPost);
        } catch (IOException e) {
            System.out.printf("Could not add post. Reason: %s",
                    e.getMessage());
        }
    }

    public List<Diary> getPosts() {
        List<Diary> entries = new ArrayList<>();
        try {
            entries = DiaryStore.getPosts();
        } catch (IOException e) {
            System.out.printf("Could not read post. Reason: %s",
                    e.getMessage());
        }
        return entries;
    }
}
