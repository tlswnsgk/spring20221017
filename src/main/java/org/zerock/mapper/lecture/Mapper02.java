package org.zerock.mapper.lecture;

import java.util.Date;
import java.util.List;

public interface Mapper02 {

	List<String> getCustomerNames();
	
	List<Integer> getCustomerIds();
	
	List<Double> getProductPrices();

	List<Date> getBirthDate();
}
