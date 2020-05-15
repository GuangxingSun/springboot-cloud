package com.guangxing.providerticker.controller;

import com.guangxing.providerticker.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program springboot-cloud
 * 票据提供
 * @description: 票据提供
 * @author: Guangxing
 * @create: 2020/05/15 09:08
 */
@RestController
public class TicketController {
    @Autowired
    TicketService ticketService;

    @GetMapping("/ticket")
    public String getTicket(){
        return ticketService.getTicket();
    }
}
