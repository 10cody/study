package com.cody.study;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cody
 */
@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
//		DocsConfig config = new DocsConfig();
//		config.setProjectPath("/Users/cody/workspace/02_learning/study/"); // root project path
//		config.setProjectName("ProjectName"); // project name
//		config.setApiVersion("V1.0");       // api version
//		config.setDocsPath("/Users/cody/workspace/02_learning/study/doc/japidocs"); // api docs target path
//		config.setAutoGenerate(Boolean.TRUE);  // auto generate
//		Docs.buildHtmlDocs(config);
		SpringApplication.run(StudyApplication.class, args);
	}

}
