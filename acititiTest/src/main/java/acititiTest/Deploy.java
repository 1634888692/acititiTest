/**
 * 
 */
package acititiTest;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;

/**
 * 部署
 * 
 * @author Mr. Zhou
 * @date 2019年8月13日
 */
public class Deploy {

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param args 设定文件 @return
	 *         void 返回类型 @throws
	 */
	public static void Deploy() {
		TestTable.createTable();
		ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
		Deployment deploy = defaultProcessEngine.getRepositoryService().createDeployment().name("请假流程")
				.addClasspathResource("MyProcess.bpmn").addClasspathResource("MyProcess.png").deploy();
		System.out.println(deploy.getId() + "     " + deploy.getName());
	}

}
