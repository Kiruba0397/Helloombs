package com.stg.ombs.controller;


import java.util.List;



import com.stg.ombs.repository.MaidRepository;
import com.stg.ombs.repository.RoleRepository;
import com.stg.ombs.repository.UserRepository;

import com.stg.ombs.response.MessageResponse;
import com.stg.ombs.security.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import com.stg.ombs.entity.Maid;
import com.stg.ombs.service.MaidService;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)

@RequestMapping("/api/maid")
public class MaidController {
	@Autowired
	MaidRepository maidrepo;
	@Autowired
	MaidService maidservice;
	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder encoder;

	@Autowired
	JwtUtils jwtUtils;
	

	  @GetMapping("/listmaid")
	    public List<Maid> getAllEmployees() {
	    	List<Maid> savedStudent = maidservice.listmaid();
	    	return savedStudent;
	        
	    }
	  @GetMapping("/listdata")
	    public List<Maid> getAlldata() {
	    	List<Maid> savedStudent = maidservice.listmaid();
	    	return savedStudent;
	        
	    }
	  @GetMapping("/get/{maidid}")
	    public Maid getById(@PathVariable String maidid){
	        Maid getmaid = maidservice.getById(maidid);
	        return getmaid;
	    }
	  @DeleteMapping("/delete/{maidid}")
	    public void deletestudent(@PathVariable String maidid) {
		  maidservice.delete(maidid);
	    }
	    @PutMapping("/update/{maidid}")
	    public Maid updatestudent(@RequestBody Maid maid,@PathVariable String maidid){
	    	Maid updateStudent =maidservice.update(maid,maidid);
	    	return updateStudent;
	    
	}
	@PostMapping("/savemaid")
	public ResponseEntity<?> registerUser(@Valid @RequestBody  Maid maid) {

		Maid  maids= new Maid(maid.getMaidname(),
				maid.getMaidtype(),
				maid.getMaidaddress(),maid.getMaidage(),
				encoder.encode(maid.getPassword()));

		maidrepo.save(maids);

		return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	}

}
