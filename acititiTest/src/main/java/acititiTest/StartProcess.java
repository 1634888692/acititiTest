/**
 * 
 */
package acititiTest;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.runtime.ProcessInstance;

/**
 * 启动流程
 * 
 * @author Mr. Zhou
 * @date 2019年8月13日
 */
public class StartProcess {

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param args 设定文件 @return
	 * void 返回类型 @throws
	 */
	public static void main(String[] args) {
		Deploy.Deploy();
		ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put("Staff", "李四员工");
		ProcessInstance startProcessInstanceByKey = defaultProcessEngine.getRuntimeService()
				.startProcessInstanceByKey("myProcess",variables);
		System.out.println(startProcessInstanceByKey.getId() + "     " + startProcessInstanceByKey.getActivityId());
	}

}
