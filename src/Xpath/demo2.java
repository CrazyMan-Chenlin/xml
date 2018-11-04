package Xpath;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class demo2 {
    public static void main(String[] args) throws DocumentException, IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//字节流转字符流
        Document doc=new SAXReader().read("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\user.xml");
        System.out.println("请输入用户名");
        String username=br.readLine().trim();
        System.out.println("请输入密码");
        String password=br.readLine().trim();
        Element usernameEle=(Element)doc.selectSingleNode("//user/username[text()='"+username+"']");//先拿用户名验证
        if(usernameEle!=null){
            Element userEle=usernameEle.getParent();
            String dppwd=userEle.element("password").getText();
            if (dppwd.equals(password))
                System.out.println("登录成功！");
            else
                System.out.println("密码错误！");

        }else
            System.out.println("用户不存在！");

    }
}
