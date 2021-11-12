package com.stg.ombs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.ombs.entity.Maid;
import com.stg.ombs.repository.MaidRepository;

@Service
public class MaidService {
@Autowired

MaidRepository maidrepo;
	
	 public  Maid savemaid(Maid maid) {
	        return maidrepo.save(maid);
	    }
	 
	 public List<Maid> listmaid() {
			return maidrepo.findAll();
			
		}
	 public Maid getById(String maidid) {

	        return maidrepo.findById(maidid).get();
	    }
	 
	 public Maid find(String maidid) {

	        return maidrepo.findById(maidid).get();
	    }

		
		public void delete(String studentId) {
			maidrepo.deleteById(studentId);
	       
			
	    }


		public Maid update(Maid maid,String maidid) {
			Maid ma = maidrepo.findById(maidid).get();
			ma.setMaidname(maid.getMaidname());
			ma.setMaidaddress(maid.getMaidaddress());
			ma.setMaidtype(maid.getMaidtype());
			ma.setMaidage(maid.getMaidage());
			return maidrepo.save(ma);
		}
}
