package com.yuanchuangyun.rgqancy;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.Bucket;

public class Manager {
	public void test() {
		String OSS_ENDPOINT = "http://oss-cn-beijing.aliyuncs.com/";
		String OSS_ACCESS_ID = "";
		String OSS_ACCESS_KEY = "";
		OSSClient client = new OSSClient(OSS_ENDPOINT, OSS_ACCESS_ID,
				OSS_ACCESS_KEY);
		for (Bucket bucket : client.listBuckets()) {
			System.out.println(bucket);
		}
		System.out.println("OK3");
	}
}
