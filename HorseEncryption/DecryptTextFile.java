package HorseEncryption;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class DecryptTextFile {
    private static String filepath, newFilePath;
    public DecryptTextFile(String filepath){
        DecryptTextFile.filepath = filepath;
    }
    public DecryptTextFile(String filepath, String newFilePath){
        DecryptTextFile.filepath = filepath;
        DecryptTextFile.newFilePath = newFilePath;
    }
    public void decryptFile(){
        try{
            HorseEncryption horseEncryption = new HorseEncryption();
            String content = new String(Files.readAllBytes(Paths.get(filepath)));
            String decrypted_text = horseEncryption.decrypt(content);
            BufferedWriter writer = new BufferedWriter(new FileWriter(Objects.requireNonNullElseGet(newFilePath, () -> filepath = filepath.replace("_Encrypted.txt", "") + "_Decrypted.txt")));
            writer.write(decrypted_text);
            writer.close();
        }catch (Exception fileException){
            System.out.println(fileException.getMessage());
        }
    }
}
