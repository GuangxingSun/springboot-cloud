package com.guangxing.providerticker.service;

import org.springframework.stereotype.Service;

/**
 * @program springboot-cloud
 * @description:
 * @author: Guangxing
 * @create: 2020/05/15 09:12
 */
@Service
public class TicketService {
    public String getTicket(){
        System.out.println("8001");
        return "《厉害了，我的锅》";
    }
}
