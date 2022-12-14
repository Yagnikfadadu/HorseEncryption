# HorseEncryption
This package was developed to solve to major problem of data theft from servers. It encrypts the data to _unintelligible_ form which cannot be read without _decrypting_.

The package is still in development phase and for now it supports alphanumeric characters and basic symbols.
For Future Enhancements we are planning to add support for encrypting a text file and vice versa.

# How to use this package?
1. Clone the repository or download the ZIP file and extract in a folder.
2. Create a driver class file to use the _HorseEncryption_ class from _HorseEncryption_ package and use encrypt() and decrypt() method or you can use below code snippet to use the class.
```java
import HorseEncryption.HorseEncryption;

public class HorseEncryptionDemo {
    public static void main(String[] args) {
        HorseEncryption horseEncryption = new HorseEncryption();
        String encrypted_text = horseEncryption.encrypt("Hello World");
        String decrypted_text = horseEncryption.decrypt(encrypted_text);
        System.out.println("Encrypted Text: "+encrypted_text);
        System.out.println("Decrypted Text: "+decrypted_text);
    }
}
```
