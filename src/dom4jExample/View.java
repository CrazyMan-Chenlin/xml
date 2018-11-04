import dom4jExample.Controller;
import dom4jExample.Model;
import org.dom4j.DocumentException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class View {
    private final static String ID="id";
     private final static String NAME="name";
    private final static String GNDER="gender";
    private final static String PHONE="phone";
    private final static String EMAIL="email";
    private final static String ADDRESS="address";
    static int  inputChoose() {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        try {
            int choose = Integer.parseInt(reader.readLine());
            if(choose!=1&&choose!=2&&choose!=3&&choose!=4&&choose!=5){
                throw new IOException();
            }
            return choose;
        } catch (Exception e) {
            System.out.println("������Ĳ���һ������");
            inputChoose();
        }
      return 0;
    }
    static int Anymore()  {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("�˳�����1������ʹ�ó���2");
        try {
            int more=Integer.parseInt(reader.readLine());
            if(more!=2&&more!=1){
                throw new Exception();
            }
            return more;
        } catch (Exception e) {
            System.out.println("���������ֵ���ޣ����������롣");
        }
        return 0;
    }

    public static void main(String[] args) throws IOException, DocumentException {
        System.out.println("��ӭʹ����ϵ�����ݿ⡣��������");
        while(true) {
            System.out.println("��ѡ����Ҫִ�еĲ�����");
            System.out.println("�����ϵ��ѡ��1");
            System.out.println("ɾ����ϵ��ѡ��2");
            System.out.println("�޸���ϵ��ѡ��3");
            System.out.println("��ѯ��ϵ��ѡ��4");
            System.out.println("�˳�����ѡ��5");
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
                 int choose=inputChoose();
                 String str;
                 int i;
                Controller controller = new Controller();
                switch (choose) {
                    case 1:
                        Model model = new Model();
                        System.out.println("��������ϵ��������");
                        str = reader.readLine();
                        str.trim();
                        model.setName(str);
                        System.out.println("��������ϵ��id");
                        str = reader.readLine();
                        str.trim();
                        model.setId(str);
                        System.out.println("��������ϵ���Ա�");
                        str = reader.readLine();
                        str.trim();
                        model.setGender(str);
                        System.out.println("��������ϵ�˵绰");
                        str = reader.readLine();
                        str.trim();
                        model.setPhone(str);
                        System.out.println("��������ϵ��emial");
                        str = reader.readLine();
                        str.trim();
                        model.setEmail(str);
                        System.out.println("��������ϵ�˵�ַ");
                        str = reader.readLine();
                        str.trim();
                        model.setAddress(str);
                        controller.addContact(model);
                        break;
                    case 2:
                        controller.selectContact();
                        System.out.println("����Ҫɾ���ڼ�����ϵ�˵����");
                        str = reader.readLine();
                        i = Integer.parseInt(str);
                        controller.delteContact(i);
                        break;
                    case 3:
                        controller.selectContact();
                        Model model1 = new Model();
                        System.out.println("����Ҫ�޸ĵڼ�����ϵ�˵����");
                        str = reader.readLine();
                        i = Integer.parseInt(str);
                        System.out.println("�������޸���ϵ�˵���Ϣ");
                        System.out.println("��������ϵ��������");
                        str = reader.readLine();
                        str.trim();
                        model1.setName(str);
                        System.out.println("��������ϵ��id");
                        str = reader.readLine();
                        str.trim();
                        model1.setId(str);
                        System.out.println("��������ϵ���Ա�");
                        str = reader.readLine();
                        str.trim();
                        model1.setGender(str);
                        System.out.println("��������ϵ�˵绰");
                        str = reader.readLine();
                        str.trim();
                        model1.setPhone(str);
                        System.out.println("��������ϵ��emial");
                        str = reader.readLine();
                        str.trim();
                        model1.setEmail(str);
                        System.out.println("��������ϵ�˵�ַ");
                        str = reader.readLine();
                        str.trim();
                        model1.setAddress(str);
                        controller.updateContact(i, model1);
                        break;
                    case 4:
                        controller.selectContact();
                        break;
                    case 5:
                        break;
                    default: {
                        System.out.println("�����������������");
                    }
                }
            int more=Anymore();
            if(more==1){
                System.out.println("�˳�����ɹ���");
                reader.close();
                break;
            }
        }
    }
}
