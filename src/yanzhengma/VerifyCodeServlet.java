package yanzhengma;

import java.awt.image.BufferedImage;  
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.imageio.ImageIO;  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
@WebServlet("/VerifyCodeServlet")  
public class VerifyCodeServlet extends HttpServlet {  
  
    /**  
     * ��ɣ�������֤���Servlet  
     * @author weiqiang  
     */  
      
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
          
        VerifyCode vc = new VerifyCode();  
        response.setHeader("Cache-Control", "no-cache");  
        response.setContentType("image/jpeg");  
        BufferedImage bim = vc.getImage();  
        ImageIO.write(bim, "JPEG", response.getOutputStream());  
        String verifycode = vc.getText();  
        request.getSession().setAttribute("verifyCode", verifycode);  
    }  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
            doGet(request, response);  
    }  
    public void destroy(){  
        super.destroy();  
    }  
    public void init() throws ServletException{   
    }  
  
}  