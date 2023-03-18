package com.acknowledgement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.acknowledgement.entity.OrderHeader;

import com.acknowledgement.repository.OrderHeaderRepository;

@Service
public class OrderServiceImpl implements OrderServiceI {

	@Autowired
	private OrderHeaderRepository orderHeaderRepository;

	

	@Override
	public OrderHeader addOrder(OrderHeader orderHeader) {

		 OrderHeader save = orderHeaderRepository.save(orderHeader);
		
		 return save;
		
		

		
	}

}