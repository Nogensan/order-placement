package example.orderplacement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {

    @GetMapping("/add")
    public String addOrder(@RequestParam("orderId") String orderId) {
        return orderId;
    }

    @GetMapping("/delete/{id}")
    public String deleteOrder() {
        return "test";
    }

    @GetMapping("/edit/{id}")
    public String editOrder() {
        return "test";
    }

}
