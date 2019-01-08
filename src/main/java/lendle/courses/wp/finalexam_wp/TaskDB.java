/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.wp.finalexam_wp;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author lendle
 */
public class TaskDB{
    private static Map<String, String> db=new HashMap<>();
    
    public static void save(String title, String content){
        db.put(title, content);
    }
    
    public static String get(String title){
        return db.get(title);
    }

    static void add(JInternalFrame jInternalFrame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setContentPane(JDesktopPane jDesktopPane) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
