/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dictionary;

/**
 *
 * @author THANH TUNG HOANG
 */
public class Dictionary {
    int id;
    String word;
    String translate;
    String example;
    String exampleTranslate;

    public Dictionary(int id, String word, String translate, String example, String exampleTranslate) {
        this.id = id;
        this.word = word;
        this.translate = translate;
        this.example = example;
        this.exampleTranslate = exampleTranslate;
    }

    public Dictionary(String word, String translate, String example, String exampleTranslate) {
        this.word = word;
        this.translate = translate;
        this.example = example;
        this.exampleTranslate = exampleTranslate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getExampleTranslate() {
        return exampleTranslate;
    }

    public void setExampleTranslate(String exampleTranslate) {
        this.exampleTranslate = exampleTranslate;
    }
}
