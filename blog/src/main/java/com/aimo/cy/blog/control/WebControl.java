package com.aimo.cy.blog.control;

import com.aimo.cy.blog.pojo.ThreadInfoTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Controller
@Slf4j
public class WebControl {
    @Autowired
    DataSource dataSource;

    @CrossOrigin(origins = "*")

    @GetMapping("/getThreadInfo")
    @ResponseBody
    public String sayHello(Model model) throws SQLException {

        ThreadInfoTO info = new ThreadInfoTO();
        info.setName(Thread.currentThread().getName());
        Connection connection = dataSource.getConnection();

        log.info(connection.toString());
        System.out.println(connection.toString());

        model.addAttribute("info", info);
        return info.getName();
    }

}
