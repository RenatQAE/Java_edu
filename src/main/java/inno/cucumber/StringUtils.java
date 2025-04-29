package inno.cucumber;

public class StringUtils {
    // "" - true
    // " " - true
    // " / " - false
    public boolean isBlank(String str){
        String trimmed = str.trim();
        return  trimmed.equals("");
    }

    // "test@" - false
    // "test@Test" - false
    // "test@test.ru " - true
    public boolean isValidEmail(String str){
        return  true;
    }


}
