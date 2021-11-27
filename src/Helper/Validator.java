/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.util.regex.Pattern;

/**
 *
 * @author Dev-StOrM
 */
public class Validator {

    // Not null String: return true if NOT null and not contains any spaces
    static final public boolean isNotNull(String str) {
        final String NOT_NULL_REGEX = "^\\w+$";
        final Pattern NOT_NULL_PATTERN = Pattern.compile(NOT_NULL_REGEX);

        return NOT_NULL_PATTERN.matcher(str).matches();
    }

    // Not null String: return true if null and not contains any spaces
    static final public boolean isNull(String str) {
        return !isNotNull(str);
    }

    // alphabet including Unicode UTF-8
    static final public boolean isValidName(String str) {
        final String NAME_REGEX
                = "^[A-Za-zẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ"
                + "ắằẳẵặăấầẩẫậâáàãảạđếềểễệêéèẻẽẹíìỉĩịốồổỗộôớờởỡợơóòõỏọứừửữựưúùủũụýỳỷỹỵ]+"
                + "(\\s[A-Za-zẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ"
                + "ắằẳẵặăấầẩẫậâáàãảạđếềểễệêéèẻẽẹíìỉĩịốồổỗộôớờởỡợơóòõỏọứừửữựưúùủũụýỳỷỹỵ]+)+$";
        final Pattern NAME_PATTERN = Pattern.compile(NAME_REGEX);

        return NAME_PATTERN.matcher(str).matches();
    }

    // Vietnam phone number, only contain 10 -> 12 numberic characters
    static final public boolean isValidPhoneNumber(String str) {
        final String PHONE_REGEX = "^\\d{10,12}$";
        final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

        return PHONE_PATTERN.matcher(str).matches();
    }

    // check valid for MaSV
    static final public boolean isValidMaSV(String str) {
        final String MASV_REGEX = "^SV\\d{3}$"; // exp: "SV001";
        final Pattern MASV_PATTERN = Pattern.compile(MASV_REGEX);

        return MASV_PATTERN.matcher(str).matches();
    }

    // local-part + @ + domain part
    static final public boolean isValidEmail(String str) {
        final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*"
                + "@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

        return EMAIL_PATTERN.matcher(str).matches();
    }
    
    // 6->18 characters, can contains alphanumeric characters not case sensitive
    // allows '.', '_'
    static final public boolean isValidUsername(String str) {
        final String USERNAME_REGEX = "^[a-zA-Z0-9]([._](?![._])|[a-zA-Z0-9]){6,18}[a-zA-Z0-9]$";
        final Pattern USERNAME_PATTERN = Pattern.compile(USERNAME_REGEX);
        
        return USERNAME_PATTERN.matcher(str).matches();
    }
}
