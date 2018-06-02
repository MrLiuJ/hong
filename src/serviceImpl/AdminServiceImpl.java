package serviceImpl;

import java.util.List;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;

import org.springframework.stereotype.Service;

import dao.AdminDao;
import pojo.Admin;
import service.AdminService;

@Service("AdminService")
public class AdminServiceImpl implements AdminService{

	@Resource
	private AdminDao adminDao;
	@Override
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return adminDao.selectAdmin();
	}

}
