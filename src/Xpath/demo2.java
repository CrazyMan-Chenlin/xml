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
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//�ֽ���ת�ַ���
        Document doc=new SAXReader().read("C:\\Users\\chenlin\\IdeaProjects\\JavaWebStudy\\XML\\user.xml");
        System.out.println("�������û���");
        String username=br.readLine().trim();
        System.out.println("����������");
        String password=br.readLine().trim();
        Element usernameEle=(Element)doc.selectSingleNode("//user/username[text()='"+username+"']");//�����û�����֤
        if(usernameEle!=null){
            Element userEle=usernameEle.getParent();
            String dppwd=userEle.element("password").getText();
            if (dppwd.equals(password))
                System.out.println("��¼�ɹ���");
            else
                System.out.println("�������");

        }else
            System.out.println("�û������ڣ�");

    }
}
