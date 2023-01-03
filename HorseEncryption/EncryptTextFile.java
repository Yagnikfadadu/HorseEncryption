package HorseEncryption;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class EncryptTextFile {
    private static String filepath, newFilePath;
    public EncryptTextFile(String filepath){
        EncryptTextFile.filepath = filepath;
    }
    public EncryptTextFile(String filepath, String newFilePath){
        EncryptTextFile.filepath = filepath;
        EncryptTextFile.newFilePath = newFilePath;
    }
    public void encryptFile(){
        try{
            HorseEncryption horseEncryption = new HorseEncryption();
            String content = new String(Files.readAllBytes(Paths.get(filepath)));
            String encrypted_text = horseEncryption.encrypt(content);
            BufferedWriter writer = new BufferedWriter(new FileWriter(Objects.requireNonNullElseGet(newFilePath, () -> filepath = filepath.replace(".txt", "") + "_Encrypted.txt")));
            writer.write(encrypted_text);
            writer.close();
        }catch (Exception fileException){
            System.out.println(fileException.getMessage());
        }
    }
}
