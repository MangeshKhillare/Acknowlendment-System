package com.acknowledgement.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.acknowledgement.entity.OrderHeader;
import com.acknowledgement.service.OrderServiceI;

@RestController
public class OrderController {

	@Autowired
	private OrderServiceI orderServiceI;

	@PostMapping("/saveOrder")
	public OrderHeader saveorder(@RequestBody OrderHeader OrderHeader) {

		OrderHeader addOrder1 = orderServiceI.addOrder(OrderHeader);
		
		return addOrder1;

	}
}
