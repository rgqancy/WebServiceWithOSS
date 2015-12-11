package com.yuanchuangyun.rgqancy;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.Bucket;

public class testWebService {

	public static void test() {
		String OSS_ENDPOINT = "http://oss-cn-beijing.aliyuncs.com/";
		String OSS_ACCESS_ID = "";
		String OSS_ACCESS_KEY = "";
		OSSClient client = new OSSClient(OSS_ENDPOINT, OSS_ACCESS_ID,
				OSS_ACCESS_KEY);
		for (Bucket bucket : client.listBuckets()) {
			System.out.println(bucket);
		}
		System.out.println("OK");
	}
	
	public  void test2() {
		String OSS_ENDPOINT = "http://oss-cn-beijing.aliyuncs.com/";
		String OSS_ACCESS_ID = "";
		String OSS_ACCESS_KEY = "";
		OSSClient client = new OSSClient(OSS_ENDPOINT, OSS_ACCESS_ID,
				OSS_ACCESS_KEY);
		for (Bucket bucket : client.listBuckets()) {
			System.out.println(bucket);
		}
		System.out.println("OK");
	}

	public String helloWorld() {
		test();
		test2();

		Manager m = new Manager();
		m.test();

		return "good";
	}
}
