package poly.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import poly.persistance.redis.IMyRedisMapper;
import poly.service.IMyRedisService;

@Service("MyRedisService")
public class MyRedisService implements IMyRedisService {

	@Resource(name="MyRedisMapper")
	private IMyRedisMapper myRedisMapper;
	
	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public void doSaveData() throws Exception {

		log.info(this.getClass().getName() + ".doSaveData start");
		
		myRedisMapper.doSaveData();
		
		log.info(this.getClass().getName() + ".doSaveData end");
	}

	@Override
	public void doSaveDataforList() throws Exception {
		
		log.info(this.getClass().getName() + ".doSaveDataforList start");
		
		myRedisMapper.doSaveDataforList();
		
		log.info(this.getClass().getName() + ".doSaveDataforList end");
	}
	
	
}
