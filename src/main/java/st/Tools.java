package st;

import java.util.List;

public class Tools {

    /**
     * @author J.H
     * @param str
     * @return boolean
     * @see Vialdate this string is not null and length gt 0
     */
    public boolean validateString(String str){
        if(str!=null&&str.length()>0){
            return true;
        }
        return false;
    }
    /**
     * @author J.H
     * @param List<?>
     * @return boolean
     * @see Vialdate this List is not null and size gt 0
     */
    public boolean validateList(List<?>li){
        if(li!=null&&li.size()>0){
            return true;
        }
        return false;
    }
    /**
     * @author J.H
     * @param String
     * @return boolean
     * @see Vialdate this string eq is equal string partern
     */
    public boolean validateEqueal(String eq,String partern){
        if(this.validateString(partern)){
            if (eq.equals(eq)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
