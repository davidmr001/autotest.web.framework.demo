package org.suren.autotest.test;

import org.suren.autotest.web.framework.code.DefaultXmlCodeGenerator;
import org.suren.autotest.web.framework.code.Generator;

/**
 * 该示例用来演示如何通过框架来生成Java代码</br>
 * 生成的路径是（项目的根目录）org/suren/autotest/test/page/BaiduHomePage.java</>
 * 该例子执行完成后，刷新工程即可看到生成的文件
 * @author suren
 * @date 2016年12月9日 上午8:41:32
 */
public class Test {

	public static void main(String[] args) {
		Generator generator = new DefaultXmlCodeGenerator();
		generator.generate("baidu.xml"); //这里从类路径下读取
	}

}
