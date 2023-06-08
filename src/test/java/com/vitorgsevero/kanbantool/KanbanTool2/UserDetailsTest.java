//package com.vitorgsevero.kanbantool.KanbanTool2;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//import com.projectkanban.kanbantool.KanbanTool2.repositories.UserRepository;
//import com.projectkanban.kanbantool.KanbanTool2.services.UserService;
//
//public class UserDetailsTest {
//	
//	
//	@Mock
//	private UserRepository userRepo;
//	
//	private UserService userService;
//	@BeforeEach
//	public void setup() {
//		UserService userService = new UserService();
//		userService.setUserRepository(userRepo);
//	}
//	@Test
//	public void testUserById_NullId() { //Passed
//		Long id = null;
////		User user = new User(id,"john_doe");
////		when(userRepo.getById(id)).thenReturn(user);
////		User result = userService.loadUserById(id);
//		
//		Assertions.assertThrows(NullPointerException.class, ()->{
//			userService.loadUserById(id);
//		});
//		
//	}
//
//}
