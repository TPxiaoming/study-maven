package com.xiaoming;
/**
 * 只需要在pom.xml中添加mavenTest1的依赖就可以引用它的类
 * <dependency>
 * 		<groupId>com.xiaoming</groupId>
 *		<artifactId>mavenTest1</artifactId>
 * 		<version>0.0.1-SNAPSHOT</version>
 * 	</dependency>
 * 
 * @author xiaoming
 *
 */
public class MavenTest2 {

	public static void main(String[] args) {
		MavenTest1 mavenTest1 = new MavenTest1();
		mavenTest1.test1();
	}
}
