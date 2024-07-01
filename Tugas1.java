public class Tugas1 {
    public static void main(String[] args) {
        String str1 = "Hello, Dita!";
        String str2 = "hello, dita!";

        // 1. Mengecek Kesamaan (equals)
        System.out.println("Apakah str1 sama dengan str2 (tanpa case sensitive): " + str1.equalsIgnoreCase(str2));

        // 2. Mengubah Huruf (toUpperCase/toLowerCase)
        System.out.println("str1 setelah diubah menjadi huruf besar: " + str1.toUpperCase());
        System.out.println("str2 setelah diubah menjadi huruf kecil: " + str2.toLowerCase());

        // 3. Mencari Posisi Karakter (indexOf/lastIndexOf)
        int firstDitaIndex = str1.indexOf("Dita");
        int lastDitaIndex = str1.lastIndexOf("Dita");
        System.out.println("Posisi pertama 'Dita' dalam str1: " + firstDitaIndex);
        System.out.println("Posisi terakhir 'Dita' dalam str1: " + lastDitaIndex);

        // 4. Menggabungkan String (concat)
        String combinedString = str1.concat(" - Bagaimana Kabarmu?");
        System.out.println("String gabungan: " + combinedString);

        // 5. Membagi String (split)
        String[] words = str1.split(", ");
        for (String word : words) {
            System.out.println("Kata: " + word);
        }

        // 6. Mengubah String menjadi Array of Character
        char[] charArray = str1.toCharArray();
        for (char character : charArray) {
            System.out.print(character + " ");
        }
    }
}