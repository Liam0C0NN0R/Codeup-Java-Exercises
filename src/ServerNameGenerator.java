import java.util.Random;

public class ServerNameGenerator {
    // Arrays of adjectives and nouns
    private static final String[] adjectives = {"quick", "bright", "smart", "busy", "loud", "silent", "fast", "slow", "happy", "sad"};
    private static final String[] nouns = {"fox", "river", "tree", "moon", "star", "wind", "rain", "mountain", "sea", "sun"};

    // Method to return a random string from an array
    private static String getRandomElement(String[] array) {
        int randomIndex = new Random().nextInt(array.length);
        return array[randomIndex];
    }

    public static void main(String[] args) {
        String adjective = getRandomElement(adjectives);
        String noun = getRandomElement(nouns);

        // Displaying the server name
        System.out.println("Here is your server name:");
        System.out.println(adjective + "-" + noun);
    }
}
