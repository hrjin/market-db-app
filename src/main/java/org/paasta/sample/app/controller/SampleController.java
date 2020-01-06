package org.paasta.sample.app.controller;

import com.google.gson.Gson;
import org.paasta.sample.app.common.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
	private final PropertyService propertyService;

//	@Resource
//	private Environment environment;

//	@Value("${spring.datasource.jdbc-url}")
//	private String jdbcUrl;

//	@Value("${cubrid.datasource.username}")
//	private String cubridJdbcUrl;

//	@Autowired
//	SampleRepository postRepo;
	
	@Autowired
	Gson gson;

	@Autowired
	public SampleController(PropertyService propertyService) {
		this.propertyService = propertyService;
	}

	@RequestMapping("/")
    public ModelAndView home() {
		String port;
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("dbType", propertyService.getDataType());
		
		if(propertyService.getDataType().toLowerCase().contains("cubrid")){
			port = "30000";
		} else {
			port = propertyService.getPort();
		}

		mv.addObject("host", propertyService.getHostname());
		mv.addObject("port", port);
		mv.addObject("dbName", propertyService.getDbName());
		mv.addObject("username", propertyService.getUsername());
		mv.addObject("password", propertyService.getPassword());

//		mv.addObject("jdbcUrl", environment.getProperty("datasource_jdbc-url"));
//		mv.addObject("host", environment.getProperty("datasource_hostname"));
//		mv.addObject("port", port);
//		mv.addObject("dbName", environment.getProperty("datasource_db-name"));
//		mv.addObject("username", environment.getProperty("datasource_username"));
//		mv.addObject("password", environment.getProperty("datasource_password"));
		mv.setViewName("index");

		return mv;
    }
	
//	@RequestMapping("/postgres")
//	@ResponseBody
//    public String postList() {
//		System.out.println("여기로 오는 것 체크! 포스트 ");
//		if(postRepo.count() != 0) {
//			return gson.toJson(postRepo.findAll());
//		}
//		
//		try {
//			List<Sample> postList = (List<Sample>) sampleSetter("postgresql", Sample.class);
//			postList.forEach(sample -> postRepo.save(sample));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//        return gson.toJson(postRepo.findAll());
//    }
	
	@RequestMapping("/dbInfo")
	@ResponseBody
    public void dbInfo() {
//		System.out.println("VALUE : " + cubridJdbcUrl);

		//System.out.println("여기로 오는 것 체크! " + environment.getProperty("cubrid.datasource.username"));
		System.out.println("여기로 오는 것 체크! " + propertyService.getDataType());

//		if(mysqlRepo.count() != 0) {
//			return gson.toJson(mysqlRepo.findAll());
//		}
//
//		try {
//			List<MysqlSample> mysqlList = (List<MysqlSample>) sampleSetter("mysql", MysqlSample.class);
//			mysqlList.forEach(mysqlSample -> mysqlRepo.save(mysqlSample)); //mysqlRepo.save(mysqlSample)
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//        return gson.toJson(mysqlRepo.findAll());
		//Map map = new HashMap();
		//map.put();

		//return cubridUserName;
    }
	
//	private List<?> sampleSetter(String DBName, Object type) throws Exception {
//		List<Object> resultList = new ArrayList<>();
//		Object resultObject = null;
//		Class<?> aClass = (Class<?>) type;
//
//		Method methodSetId = aClass.getMethod("setId", Long.TYPE);
//        Method methodSetName = aClass.getMethod("setName", String.class);
//        Method methodSetEmail = aClass.getMethod("setEmail", String.class);
//
//
//		for(int index=1; index<6; index++) {
//			resultObject = ((Class) type).newInstance();
//			methodSetId.invoke(resultObject, index);
//			methodSetName.invoke(resultObject, DBName + "-sample" + index);
//			methodSetEmail.invoke(resultObject, "sample" + index + "@sample.com");
//			resultList.add(resultObject);
//		}
//		return resultList;
//	}
	
}
