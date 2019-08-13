/**
 * 
 */
package acititiTest;

import java.util.Iterator;
import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.task.Task;

/**
 * 查询任务
 * 
 * @author Mr. Zhou
 * @date 2019年8月13日
 */
public class QueryTask {

	/**
	 * @Title: main @Description: TODO(这里用一句话描述这个方法的作用) @param args 设定文件 @return
	 * void 返回类型 @throws
	 */
	public static void main(String[] args) {
		TestTable.createTable();
		ProcessEngine defaultProcessEngine = ProcessEngines.getDefaultProcessEngine();
		List<Task> list = defaultProcessEngine.getTaskService().createTaskQuery().taskAssignee("王五经理").list();
		Iterator<Task> iterator = list.iterator();
		while (iterator.hasNext()) {
			Task task = iterator.next();
			System.out.println(task.getId() + "   " + task.getName());
		}
	}

}
