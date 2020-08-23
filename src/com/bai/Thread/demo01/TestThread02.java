package com.bai.Thread.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThread02 extends Thread {
    private String url;
    private String name;

    public TestThread02(String url,String name){
        this.name=name;
        this.url=url;
    }

    @Override
    public void run() {
        WebDownLooader webDownLooader = new WebDownLooader();
        webDownLooader.downLoader(url,name);
        System.out.println("下载了文件名为："+name);
    }


    public static void main(String[] args) {
        TestThread02 test1 = new TestThread02("https://dh1.cmcmcdn.com/9/d/9/8/9d987443177ea94987747385c79264ee.jpg", "2.jpg");
        test1.start();
    }
}
//下载器
class WebDownLooader{
    public void downLoader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常那个，downloader失败");
        }
    }

}