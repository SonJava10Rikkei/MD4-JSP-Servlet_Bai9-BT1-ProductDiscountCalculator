package rikkei.academy;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "displayDiscount", value = "/display-discount")
public class ProductDiscountCalculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String productDescription = (req.getParameter("productDescription"));
        float listPrice = Float.parseFloat(req.getParameter("listPrice"));
        float discountPercent = Float.parseFloat(req.getParameter("discountPercent"));
        float discountAmount = (float) (listPrice * discountPercent * 0.01);
        float discountPrice = listPrice - discountAmount;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<meta charset=\"UTF-8\">");
        writer.println("<h2>Mô tả của sản phẩm: " + "</h2>\n" +
                "<h3>" + productDescription + "<h3>" +
                "<h2>Giá niêm yết của sản phẩm: " + "</h2>\n" +
                "<h3>" + listPrice + "<h3>" +
                "<h2>Tỷ lệ chiết khấu: " + "</h2>\n" +
                "<h3>" + discountPercent + "<h3>" +
                "<h2>Giá chiết khấu: " + "</h2>\n" +
                "<h3>" + discountAmount + "<h3>"
        );
        writer.println("<h2>Giá sau khi đã được chiết khấu: " + "</h2>");
        writer.println("<h2>" + discountPrice + "</h2>");
        writer.println("</html>");
    }
}