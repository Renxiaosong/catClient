package com.wiseweb.client;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.wiseweb.NewsComment.NewsCommentHttpClient;
import com.wiseweb.cat.util.MD5;
import com.wiseweb.cat.util.Util;
import com.wiseweb.client.util.HttpClien;
import com.wiseweb.client.util.Httpclient;
import com.wiseweb.json.JSONArray;
import com.wiseweb.json.JSONObject;
import com.wiseweb.weibo.WeiboWebHttpClient;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

import static org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler.LOG;

/**
 * Created by wiseweb on 2016/4/29.
 */
public class test {
    public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
        test test = new test();
//        test.wangyiCommentWeb();
//        test.sinaCommentWeb();
//        test.souhuCommentWeb();
//        test.ifengComment();
//        test.comment19();
//        test.addScore19();
//        test.login19();
//        test.sohuLogin();
//        test.sinaVote();
//        test.sinaLogin();
//        test.WangyiSupport();
//        test.videoTest();
//        test.test333();
//        test.jiafen();
//        test.newCommentWeb();
        test.weibopost();
    }

    public void newComment() {
        Map headers = new HashMap();
        Map params = new HashMap();
        String url = "http://comment.news.163.com/api/v1/products/a2869674571f77b5a0867c3d71db5856/threads/PHOTJ75F000300AJ/comments?ibc=newswap";
        headers.put("Cookie", "usertrack=ZUcIhljcvqaGOh97AyDgAg==; vjuids=-11163078e.15b1e48c0fa.0.4d8bd187fd1cb; _ntes_nnid=0fa27528ddf51649bf519ca14e5c54d6,1490861736192; _ntes_nuid=0fa27528ddf51649bf519ca14e5c54d6; UM_distinctid=15b1e490850d5-0977b13cf2b1e4-7d163a4a-100200-15b1e49085113a; Province=010; City=010; _ga=GA1.2.1826427700.1493196765; __gads=ID=bc78788c57e5e4ca:T=1493196840:S=ALNI_MaxJEvYsGa-FXQ4rnh-N5y-yE2VDA; __oc_uuid=539653f0-2a5f-11e7-a396-218955bbd353; __utma=187553192.1826427700.1493196765.1493197296.1493197296.1; __utmz=187553192.1493197296.1.1.utmcsr=reg.163.com|utmccn=(referral)|utmcmd=referral|utmcct=/Main.jsp; n_ht_s=1; NTES_CMT_USER_INFO=113147878%7C%E6%9C%89%E6%80%81%E5%BA%A6%E7%BD%91%E5%8F%8B06LD-C%7C%7Cfalse%7CYWduMHEzeWJzQDE2My5jb20%3D; NTES_REPLY_NICKNAME=agn0q3ybs%40163.com%7Cagn0q3ybs%7C%7C%7C%7C%7C1%7C-1; cmt_vin=e754154fe4a567dd44864ffe1658fa3740bae60c6db372fb8cdcd1d9054e1300; ne_analysis_trace_id=1493343261233; pgr_n_f_l_n3=cf34380de219ec5314933462735452414; vjlast=1490861736.1493343261.11; vinfo_n_f_l_n3=cf34380de219ec53.1.9.1490861736205.1493343425989.1493346644103; NTES_SESS=qBunXnmaP.RNXjTK8kZ7XQp5xN3ev3NPVV6hn6mveyVfDIhtCDuhBvr96_J7ArnbJst7nUudoALSjQShchNZ6uYr6Y9acdpr8vBJ35nvQTVIncW.bdkJIqH25sgiz_EhFJ6vwha7SqeJvfhysC5MAa62uYaX0md4P; S_INFO=1493362045|0|3&40##|agn0q3ybs; P_INFO=agn0q3ybs@163.com|1493362045|0|3g_163|00&99|bej&1493279236&tie#bej&null#10#0#0|&0|163&tie&urs&3g_163&newsclient|agn0q3ybs@163.com");
        headers.put("Host", "comment.news.163.com");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3043.0 Safari/537.36");
        headers.put("Origin", "http://3g.163.com");
        headers.put("Referer:", "http://3g.163.com/touch/comment.html?docid=PHOTJ75F000300AJ&channel=idol&starId=71&from=photoset_topbar");
        params.put("productKey", "a2869674571f77b5a0867c3d71db5856");
        params.put("docId", "PHOTJ75F000300AJ");
        params.put("parentId", "");
        params.put("content", "劈他的闪电已经上路了");
        HttpClientUtil client = new HttpClientUtil();
        try {
            String result = client.httpPostRequest(url, headers, params);
            System.out.println(result);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    public void newCommentWeb() {
        HttpClientUtil client = new HttpClientUtil();
        Map params = new HashMap();
        Map headers = new HashMap();
        String url = "";
        url = "http://comment.news.163.com/api/v1/products/a2869674571f77b5a0867c3d71db5856/threads/CJLDJ15B0001875P/comments?ibc=newswap";
        headers.put("Cookie", "usertrack=ZUcIhljcvqaGOh97AyDgAg==; vjuids=-11163078e.15b1e48c0fa.0.4d8bd187fd1cb; _ntes_nnid=0fa27528ddf51649bf519ca14e5c54d6,1490861736192; _ntes_nuid=0fa27528ddf51649bf519ca14e5c54d6; UM_distinctid=15b1e490850d5-0977b13cf2b1e4-7d163a4a-100200-15b1e49085113a; Province=010; City=010; _ga=GA1.2.1826427700.1493196765; __gads=ID=bc78788c57e5e4ca:T=1493196840:S=ALNI_MaxJEvYsGa-FXQ4rnh-N5y-yE2VDA; __oc_uuid=539653f0-2a5f-11e7-a396-218955bbd353; __utma=187553192.1826427700.1493196765.1493197296.1493197296.1; __utmz=187553192.1493197296.1.1.utmcsr=reg.163.com|utmccn=(referral)|utmcmd=referral|utmcct=/Main.jsp; NTES_CMT_USER_INFO=113147878%7C%E6%9C%89%E6%80%81%E5%BA%A6%E7%BD%91%E5%8F%8B06LD-C%7C%7Cfalse%7CYWduMHEzeWJzQDE2My5jb20%3D; NTES_REPLY_NICKNAME=agn0q3ybs%40163.com%7Cagn0q3ybs%7C%7C%7C%7C%7C1%7C-1; cmt_vin=e754154fe4a567dd44864ffe1658fa37832049200cd0c46e6965607b0852e015; ne_analysis_trace_id=1493947573477; pgr_n_f_l_n3=cf34380de219ec5314939478004196050; vjlast=1490861736.1493947573.11; vinfo_n_f_l_n3=cf34380de219ec53.1.11.1490861736205.1493363507283.1493949814674; NTES_OSESS=qins1HJZQXSGAWVqZH2enupkoByIHAEWSKHoIVO5QIlgll.6hGo1bMZmMXuKmTCe7wbI5WhX_10JhyCYqTYAgx7SoPe6dqX01XWHutwzgjFSgNsphMhD2Y.avlD7zz7hH2KHC24kDYaO9aTyy8NAowzgXGH81LDD.n3AIsI2M4UZo; S_OINFO=1493951162|0|##|5977242162@sina.163.com; P_OINFO=5977242162@sina.163.com|1493951162|0|3g_163|00&99|null#0|null|3g_163|5977242162@sina.163.com");
//        headers.put("Host","comment.news.163.com");
//        headers.put("Origin","http://3g.163.com");
//        headers.put("Referer:","http://3g.163.com/touch/comment.html?docid=CJ3H6TRD000187VE");
        params.put("docId", "CJLDJ15B0001875P");
        params.put("parentId", "");
        params.put("productKey", "a2869674571f77b5a0867c3d71db5856");
        params.put("content", "生活不容易啊");
//        String tokenUrl = "http://comment.news.163.com/api/v1/products/a2869674571f77b5a0867c3d71db5856/threads/CJ3H6TRD000187VE/comments/gentoken?ibc=newspc";
//        url = "http://comment.news.163.com/api/v1/products/a2869674571f77b5a0867c3d71db5856/threads/CJ3H6TRD000187VE/comments/74739809/action/upvote?ibc=newswap";
//        headers.put("Host","comment.news.163.com");
//        headers.put("Origin","htpp://3g.163.com");
//        headers.put("Referer","http://3g.163.com/touch/comment.html?docid=CJ3H6TRD000187VE");
//        url = "http://comment.news.163.com/api/v1/products/a2869674571f77b5a0867c3d71db5856/threads/CJ3H6TRD000187VE/comments?ibc=newspc";
        try {
//            String result = client.httpPostRequest(tokenUrl);
//            System.out.println(result);
//            JSONObject json = new JSONObject(result);
//            String token = json.getString("gentoken");
//            System.out.println(token);
//            params.put("content","呵呵");
//            params.put("parentId","");
//            params.put("board","news_bbs");
//            params.put("ntoken",token);
//            headers.put("Cookie","usertrack=ZUcIhljcvqaGOh97AyDgAg==; NTES_SESS=qBunXnmaP.RNXjTK8kZ7XQp5xN3ev3NPVV6hn6mveyVfDIhtCDuhBvr96_J7ArnbJst7nUudoALSjQShchNZ6uYr6Y9acdpr8vBJ35nvQTVIncW.bdkJIqH25sgiz_EhFJ6vwha7SqeJvfhysC5MAa62uYaX0md4P;");
//            headers.put("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/59.0.3043.0 Safari/537.36");
//            headers.put("Host","comment.news.163.com");
//            headers.put("Origin","http://comment.news.163.com");
//            headers.put("Referer","http://comment.news.163.com/news2_bbs/CJ3H6TRD000187VE.html");
//            String res = client.httpPostRequest(url,headers,params);
//            System.out.println(res);
            Httpclient cli = new Httpclient();
            HttpResponse res = cli.getHttpResponse(params, headers, url);
            String restult = Util.getContent(res);
            System.out.println(restult);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public void wangyiCommentWeb() {
        NewsCommentHttpClient ht = new NewsCommentHttpClient();
        String url = "http://comment.news.163.com/news2_bbs/CIUSDG4K0001899N.html";
        String[] strs = url.split("/");
        String board = strs[strs.length - 2];
        String threadid = strs[strs.length - 1].substring(0, strs[strs.length - 1].indexOf("."));
        JSONObject task_tag_data = new JSONObject();
        JSONObject task_tag_data_header = new JSONObject();
        JSONObject form = new JSONObject();
        task_tag_data.put("exeurl", "http://comment.news.163.com/api/v1/products/a2869674571f77b5a0867c3d71db5856/threads/BLO24MST0001124J/comments?ibc=newspc");
        form.put("parentId", "");
        form.put("board", board);
        form.put("threadid", threadid);
        task_tag_data_header.put("Referer", url);
        task_tag_data.put("task_tag_data_form", form);
        task_tag_data.put("task_tag_data_header", task_tag_data_header);
        long task_id = 0;
        JSONObject r = new JSONObject();
        ht.NewsCommentAction(null, task_tag_data, task_id, "303", r, null);
    }

    public void sinaCommentWeb() {
        NewsCommentHttpClient ht = new NewsCommentHttpClient();
        String url = "http://comment5.news.sina.com.cn/comment/skin/default.html?channel=sh&newsid=comos-fxrtvtp1611163";
        String[] strs = url.split("&");
        String channel = strs[0].split("=")[1];
        String newsId = strs[1].split("=")[1];
        JSONObject task_tag_data = new JSONObject();
        JSONObject task_tag_data_header = new JSONObject();
        JSONObject form = new JSONObject();
        task_tag_data.put("exeurl", "http://comment5.news.sina.com.cn/cmnt/submit");
        form.put("parent", "B");
        form.put("channel", channel);
        form.put("newsid", newsId);
        form.put("format", "json");
        form.put("ie", "utf-8");
        form.put("oe", "utf-8");
        form.put("ispost", 0);
        form.put("share_url", url);
        form.put("video_url", "");
        form.put("img_url", "");
        form.put("iframe", "1");
        form.put("callback", "iJax1426140507000");
        task_tag_data_header.put("Referer", url);
        task_tag_data_header.put("Host", "comment5.news.sina.com.cn");
        task_tag_data_header.put("Cookie", "SUB=_2A251FRz6DeTxGeRI7lEU9y_PzzuIHXVWYwkyrDV_PUJbm9AKLUfdkW-DePpFJb-zTwX0rmEKv_5UgQMDRQ..; SUBP=0033WrSXqPxfM725Ws9jqgMF55529P9D9WhN9u0RVbigdNn2QEAONIQr5NHD95QESo-0SKMpe0BNWs4Dqcjci--fi-8siKnEi--fi-8siKL8i--NiKLWiKnXi--4i-20iKy8i--fiKy8iKLsi--fiKnRiKLF;");
        task_tag_data.put("task_tag_data_form", form);
        task_tag_data.put("task_tag_data_header", task_tag_data_header);
        long task_id = 1477470607540L;
        JSONObject r = new JSONObject();
        ht.NewsCommentAction(null, task_tag_data, task_id, "206", r, null);
    }

    public void souhuCommentWeb() {
        NewsCommentHttpClient ht = new NewsCommentHttpClient();
        String url = "http://quan.sohu.com/pinglun/cyqemw6s1/446752109";
        String[] strs = url.split("/");
        String client_id = url.split("/")[4].trim();
        String topicsid = url.split("/")[5].trim();
        JSONObject task_tag_data = new JSONObject();
        JSONObject task_tag_data_header = new JSONObject();
        JSONObject form = new JSONObject();
        task_tag_data.put("exeurl", "http://changyan.sohu.com/api/2/comment/submit");
        form.put("client_id", client_id);
        form.put("topic_id", topicsid);
        task_tag_data_header.put("Referer", url);
        task_tag_data.put("task_tag_data_form", form);
        task_tag_data.put("task_tag_data_header", task_tag_data_header);
        long task_id = 0;
        JSONObject r = new JSONObject();
        ht.NewsCommentAction(null, task_tag_data, task_id, "403", r, null);
    }

    public void ifengComment() {
        NewsCommentHttpClient ht = new NewsCommentHttpClient();
        String url = "http://gentie.ifeng.com/view.html?docUrl=http%3A%2F%2Fnews.ifeng.com%2Fa%2F20160504%2F48670318_0.shtml&docName=%E6%B5%B7%E5%8F%A3%EF%BC%9A%E7%BD%91%E7%BA%A6%E8%BD%A6%E5%8F%B8%E6%9C%BA%E8%A2%AB%E6%9B%9D%E5%9C%A84%E5%90%8D%E5%A5%B3%E9%AB%98%E4%B8%AD%E7%94%9F%E5%89%8D%E8%87%AA%E6%85%B0(%E5%9B%BE)&skey=f1bc42&speUrl=";
        String[] strs = url.split("&");
        String docUrl = strs[0].split("=")[1];
        String docName = strs[1].split("=")[1];
        String commentUrl = strs[0].substring(0, strs[0].indexOf("?")) + "?docUrl=" + docUrl + "&docName=" + docName;
        String exeurl = "http://comment.ifeng.com/post.php?callback=postCmt&docUrl=" + docUrl + "&docName=" + docName + "&speUrl=&format=js&content=弄死&callback=postCmt";
        JSONObject task_tag = new JSONObject();
        JSONObject form = new JSONObject();
        form.put("docUrl", docUrl);
        form.put("docName", docName);
        form.put("speUrl", "");
        form.put("Referer", commentUrl);
        long task_id = 0;
        JSONObject r = new JSONObject();
        ht.NewsCommentAction(exeurl, form, task_id, "501", r, null);
    }

    /**
     * 19楼评论
     */
    public void comment19(Map hmap) {
        String url = "http://www.19lou.com/forum-19-thread-10311477210022603-4-1.html#4361477376722217";
        String fid = url.split("/")[3].split(".html")[0].split("-")[1];
        String tid = url.split("/")[3].split(".html")[0].split("-")[3];
        String exeurl = "http://www.19lou.com/post/reply";
//        Map hmap = new HashMap();
        Map form = new HashMap();
//        hmap.put("Cookie","sys=67174666.20480.0000; _DM_S_=8e53988eb61a8dc66f1b68020febc6ee; reg_source=baidu.com; reg_first=http%253A//www.19lou.com/; f8big=ip78; _Z3nY0d4C_=37XgPK9h-%3D1920-1920-1920-974; JSESSIONID=C262BC033CBB466DF85550772DDE622C; M_SMILEY_TIP_HIDE=1; reg_referer=\"http://www.19lou.com/forum-289-thread-5841477329282450-1-1.html\"; sbs_auth_uid=44777253; sbs_auth_id=c31baf43842c46aa8d945ba076f8b29d_22df864dffa398bdee98fde76fcf020f; sbs_auth_remember=1; _sbs_auth_uid=44777253; _sbs_auth_id=c31baf43842c46aa8d945ba076f8b29d_22df864dffa398bdee98fde76fcf020f; dm_ui=44777253_20161025; reg_kw=; _dm_userinfo=%7B%22ext%22%3A%22%22%2C%22uid%22%3A%2244777253%22%2C%22stage%22%3A%22%22%2C%22city%22%3A%22%E5%8C%97%E4%BA%AC%3A%E5%8C%97%E4%BA%AC%22%2C%22ip%22%3A%22118.186.228.42%22%2C%22sex%22%3A%222%22%2C%22frontdomain%22%3A%22www.19lou.com%22%2C%22category%22%3A%22%E6%83%85%E6%84%9F%22%7D; fr_adv_last=bbs_top_20161025_10311477210022603; fr_adv=bbs_top_20161025_10311477210022603; _DM_SID_=ee2bbe9dbd2f0decd671de2ed12d5cab; reg_step=17; screen=1903; _dm_tagnames=%5B%7B%22k%22%3A%22%E6%83%85%E6%84%9F%E8%AF%9D%E9%A2%98%22%2C%22c%22%3A1%7D%2C%7B%22k%22%3A%22%E5%89%8D%E7%94%B7%E5%8F%8B%22%2C%22c%22%3A2%7D%2C%7B%22k%22%3A%22%E5%A9%9A%E5%A7%BB%E6%97%A5%E8%AE%B0%22%2C%22c%22%3A2%7D%2C%7B%22k%22%3A%2219%E6%A5%BC%E6%97%A9%E7%9F%A5%E9%81%93%22%2C%22c%22%3A3%7D%5D; pm_count=%7B%22pc_allCity_threadView_streamer_adv_800*90%22%3A6%2C%22pc_allCity_threadView_button_adv_190x205_1%22%3A4%2C%22pc_hangzhou_forumthread_button_adv_180x180_1%22%3A6%2C%22pc_hangzhou_forumthread_button_adv_180x180_2%22%3A6%2C%22pc_hangzhou_forumthread_button_adv_180x180_3%22%3A6%2C%22pc_hangzhou_forumthread_button_adv_180x180_4%22%3A6%7D; dayCount=%5B%7B%22id%22%3A88241%2C%22count%22%3A6%7D%2C%7B%22id%22%3A78558%2C%22count%22%3A4%7D%2C%7B%22id%22%3A78391%2C%22count%22%3A2%7D%2C%7B%22id%22%3A71365%2C%22count%22%3A4%7D%2C%7B%22id%22%3A70889%2C%22count%22%3A6%7D%2C%7B%22id%22%3A72914%2C%22count%22%3A6%7D%5D; Hm_lvt_5185a335802fb72073721d2bb161cd94=1477361963,1477375901,1477375916; Hm_lpvt_5185a335802fb72073721d2bb161cd94=1477376582");
        String content = "不错哦";
        form.put("content", content);
        form.put("fid", fid);
        form.put("tid", tid);
        HttpResponse response = new Httpclient().getHttpResponse(form, hmap, exeurl);
        String text = Util.getContent(response);
        System.out.print(text);
//        String text = "{\"success\":true,\"code\":0,\"data\":\"http://www.19lou.com/redirect/post?fid=19&tid=10311477210022603&pid=4231477378503557\"}"
    }

    public void addScore19() {
        String url = "http://www.19lou.com/forum-19-thread-10311477210022603-4-1.html";
        String fid = url.split("/")[3].split(".html")[0].split("-")[1];
        String tid = url.split("/")[3].split(".html")[0].split("-")[3];
        JSONArray arr = new JSONArray();
        JSONObject json = new JSONObject();
        JSONObject data = new JSONObject();
        data.put("id", 1);
        json.put("incentiveType", data);
        json.put("value", 1);
        String exeurl = "http://www.19lou.com/rate/submit";
        Map hmap = new HashMap();
        Map form = new HashMap();
        hmap.put("Cookie", "sys=67174666.20480.0000; _DM_S_=8e53988eb61a8dc66f1b68020febc6ee; reg_first=http%253A//www.19lou.com/; f8big=ip78; _Z3nY0d4C_=37XgPK9h-%3D1920-1920-1920-974; JSESSIONID=C262BC033CBB466DF85550772DDE622C; M_SMILEY_TIP_HIDE=1; reg_referer=\"http://www.19lou.com/forum-289-thread-5841477329282450-1-1.html\"; sbs_auth_uid=44777253; sbs_auth_id=c31baf43842c46aa8d945ba076f8b29d_22df864dffa398bdee98fde76fcf020f; sbs_auth_remember=1; _sbs_auth_uid=44777253; _sbs_auth_id=c31baf43842c46aa8d945ba076f8b29d_22df864dffa398bdee98fde76fcf020f; dm_ui=44777253_20161025; reg_kw=; _dm_userinfo=%7B%22ext%22%3A%22%22%2C%22uid%22%3A%2244777253%22%2C%22stage%22%3A%22%22%2C%22city%22%3A%22%E5%8C%97%E4%BA%AC%3A%E5%8C%97%E4%BA%AC%22%2C%22ip%22%3A%22118.186.228.42%22%2C%22sex%22%3A%222%22%2C%22frontdomain%22%3A%22www.19lou.com%22%2C%22category%22%3A%22%E6%83%85%E6%84%9F%22%7D; fr_adv_last=bbs_top_20161025_10311477210022603; fr_adv=bbs_top_20161025_10311477210022603; _DM_SID_=ee2bbe9dbd2f0decd671de2ed12d5cab; reg_step=17; screen=1903; _dm_tagnames=%5B%7B%22k%22%3A%22%E6%83%85%E6%84%9F%E8%AF%9D%E9%A2%98%22%2C%22c%22%3A1%7D%2C%7B%22k%22%3A%22%E5%89%8D%E7%94%B7%E5%8F%8B%22%2C%22c%22%3A2%7D%2C%7B%22k%22%3A%22%E5%A9%9A%E5%A7%BB%E6%97%A5%E8%AE%B0%22%2C%22c%22%3A2%7D%2C%7B%22k%22%3A%2219%E6%A5%BC%E6%97%A9%E7%9F%A5%E9%81%93%22%2C%22c%22%3A3%7D%5D; pm_count=%7B%22pc_allCity_threadView_streamer_adv_800*90%22%3A6%2C%22pc_allCity_threadView_button_adv_190x205_1%22%3A4%2C%22pc_hangzhou_forumthread_button_adv_180x180_1%22%3A6%2C%22pc_hangzhou_forumthread_button_adv_180x180_2%22%3A6%2C%22pc_hangzhou_forumthread_button_adv_180x180_3%22%3A6%2C%22pc_hangzhou_forumthread_button_adv_180x180_4%22%3A6%7D; dayCount=%5B%7B%22id%22%3A88241%2C%22count%22%3A6%7D%2C%7B%22id%22%3A78558%2C%22count%22%3A4%7D%2C%7B%22id%22%3A78391%2C%22count%22%3A2%7D%2C%7B%22id%22%3A71365%2C%22count%22%3A4%7D%2C%7B%22id%22%3A70889%2C%22count%22%3A6%7D%2C%7B%22id%22%3A72914%2C%22count%22%3A6%7D%5D; Hm_lvt_5185a335802fb72073721d2bb161cd94=1477361963,1477375901,1477375916; Hm_lpvt_5185a335802fb72073721d2bb161cd94=1477376582");
        String content = "我就看看~~";
        form.put("reason", content);
        form.put("fid", fid);
        form.put("tid", tid);
        form.put("pid", "6221477374448746");
        form.put("sendPm", 1);
        form.put("incentiveScores", "[{\"incentiveType\":{\"id\":1},\"value\":1}]");
        HttpResponse response = new Httpclient().getHttpResponse(form, hmap, exeurl);
        String text = Util.getContent(response);
        System.out.print(text);
    }

    public void login19() {
        String exeurl = "https://www.19lou.com/login";
        JSONObject hmap = new JSONObject();
        JSONObject form = new JSONObject();
//        hmap.put("Cookie","sys=67174666.20480.0000; _DM_S_=8e53988eb61a8dc66f1b68020febc6ee; reg_source=baidu.com; reg_first=http%253A//www.19lou.com/; f8big=ip78; _Z3nY0d4C_=37XgPK9h-%3D1920-1920-1920-974; JSESSIONID=C262BC033CBB466DF85550772DDE622C; M_SMILEY_TIP_HIDE=1; reg_referer=\"http://www.19lou.com/forum-289-thread-5841477329282450-1-1.html\"; sbs_auth_uid=44777253; sbs_auth_id=c31baf43842c46aa8d945ba076f8b29d_22df864dffa398bdee98fde76fcf020f; sbs_auth_remember=1; _sbs_auth_uid=44777253; _sbs_auth_id=c31baf43842c46aa8d945ba076f8b29d_22df864dffa398bdee98fde76fcf020f; dm_ui=44777253_20161025; reg_kw=; _dm_userinfo=%7B%22ext%22%3A%22%22%2C%22uid%22%3A%2244777253%22%2C%22stage%22%3A%22%22%2C%22city%22%3A%22%E5%8C%97%E4%BA%AC%3A%E5%8C%97%E4%BA%AC%22%2C%22ip%22%3A%22118.186.228.42%22%2C%22sex%22%3A%222%22%2C%22frontdomain%22%3A%22www.19lou.com%22%2C%22category%22%3A%22%E6%83%85%E6%84%9F%22%7D; fr_adv_last=bbs_top_20161025_10311477210022603; fr_adv=bbs_top_20161025_10311477210022603; _DM_SID_=ee2bbe9dbd2f0decd671de2ed12d5cab; reg_step=17; screen=1903; _dm_tagnames=%5B%7B%22k%22%3A%22%E6%83%85%E6%84%9F%E8%AF%9D%E9%A2%98%22%2C%22c%22%3A1%7D%2C%7B%22k%22%3A%22%E5%89%8D%E7%94%B7%E5%8F%8B%22%2C%22c%22%3A2%7D%2C%7B%22k%22%3A%22%E5%A9%9A%E5%A7%BB%E6%97%A5%E8%AE%B0%22%2C%22c%22%3A2%7D%2C%7B%22k%22%3A%2219%E6%A5%BC%E6%97%A9%E7%9F%A5%E9%81%93%22%2C%22c%22%3A3%7D%5D; pm_count=%7B%22pc_allCity_threadView_streamer_adv_800*90%22%3A6%2C%22pc_allCity_threadView_button_adv_190x205_1%22%3A4%2C%22pc_hangzhou_forumthread_button_adv_180x180_1%22%3A6%2C%22pc_hangzhou_forumthread_button_adv_180x180_2%22%3A6%2C%22pc_hangzhou_forumthread_button_adv_180x180_3%22%3A6%2C%22pc_hangzhou_forumthread_button_adv_180x180_4%22%3A6%7D; dayCount=%5B%7B%22id%22%3A88241%2C%22count%22%3A6%7D%2C%7B%22id%22%3A78558%2C%22count%22%3A4%7D%2C%7B%22id%22%3A78391%2C%22count%22%3A2%7D%2C%7B%22id%22%3A71365%2C%22count%22%3A4%7D%2C%7B%22id%22%3A70889%2C%22count%22%3A6%7D%2C%7B%22id%22%3A72914%2C%22count%22%3A6%7D%5D; Hm_lvt_5185a335802fb72073721d2bb161cd94=1477361963,1477375901,1477375916; Hm_lpvt_5185a335802fb72073721d2bb161cd94=1477376582");
        form.put("refererUrl", "aHR0cDovL3d3dy4xOWxvdS5jb20v");
        form.put("checked", "0");
        form.put("userName", "18515822224");
        form.put("userPass", "123456");
        form.put("ssl", "true");
        HttpResponse response = new HttpClien().Request(form, hmap, exeurl);
        System.out.println(response);
        Header[] header = response.getHeaders("Set-Cookie");
        Map headers = new HashMap();
        if (header != null && header.length > 0) {
            JSONObject Cookie = new JSONObject();
            String str = "";
            for (int i = 0; i < header.length; i++) {
                String[] sp = header[i].getValue().split(";")[0].split("=");
                if (sp.length > 2) {
                    Cookie.put(sp[0], header[i].getValue().split(";")[0].split(sp[0] + "=")[1]);
                    str += sp[0] + "=" + header[i].getValue().split(";")[0].split(sp[0] + "=")[1] + ";";
                } else {
                    Cookie.put(sp[0], sp.length > 1 ? sp[1] : "");
                    str += sp[0] + "=" + (sp.length > 1 ? sp[1] : "") + ";";
                }
            }
            headers.put("Cookie", str);
        }
//        System.out.println(headers);
        comment19(headers);
    }

    public void sohuLogin() {
        String userName = "15558165436";
        String password = "9szanqi6";
        JSONObject header1 = new JSONObject();
//        header.put("Host","passport.sohu.com");
        header1.put("Referer", "http://news.sohu.com/");
        header1.put("Cookie", "vjuids=-14c51eb67.157f573871f.0.12d830f186d71; IPLOC=CN1100; SUV=1610101531448352; shenhui12=w:1; networkmp_del=check:1; scrnSize=1920*1080; sci12=w:1; vjlast=1477291772.1477386777.13; shh11=w:1; POPAD2=visit:1; sohutag=8HsmeSc5NCwmcyc5NCwmYjc5NCwmYSc5NCwmZjc5NCwmZyc5NCwmbjc5NjwmaSc5NSwmdyc5NCwmaCc5NCwmYyc5NCwmZSc5NCwmbSc5NCwmdCc5NH0; COOKIEMAPPING1=suv:1610101531448352; lastdomain=1478599768|MTMwODI0MzI3MjR8||1; pp_login_time=https||1019|7|0|1100");
        try {
            HttpResponse res = new HttpClien().Request(null, header1, "https://passport.sohu.com/sso/login.jsp?userid=" + userName + "&password=" + MD5.Encrypt(password) + "&pwdtype=1&appid=1019&&persistentcookie=0&s=1477387296451&b=7&w=1920&v=26");
//            HttpResponse res = new HttpClien().Request(form,header,"https://passport.sohu.com/sso/login.jsp");
            if (res != null) {
                Header[] header = res.getHeaders("Set-Cookie");
                JSONObject headers = new JSONObject();
                if (header != null && header.length > 0) {
                    JSONObject Cookie = new JSONObject();
                    for (int i = 0; i < header.length; i++) {
                        String[] sp = header[i].getValue().split(";")[0].split("=");
                        if (sp.length > 2) {
                            Cookie.put(sp[0], header[i].getValue().split(";")[0].split(sp[0] + "=")[1]);
                        } else {
                            Cookie.put(sp[0], sp.length > 1 ? sp[1] : "");
                        }
                    }
                    Cookie.put("time", new Date().getTime() + 4 * 30 * 24 * 60 * 60 * 1000);
                    headers.put("NewsSohuLoginCookie", Cookie);
                }
                System.out.println(headers);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void sinaVote() {
        JSONObject cookie = new JSONObject();
        cookie.put("SUB", "_2A251_e2_DeThGeNI61QT-SvPyjWIHXVWi1h3rDV8PUNbmtBeLRDDkW8y_Kqu6CeO-2VOr8qfjsmaIkywpQ..");
        cookie.put("SSOLoginState", "1492753903");
        WeiboWebHttpClient client = new WeiboWebHttpClient();
        JSONObject response = client.weiboVote(cookie, "137930292", "1,2");
        System.out.println(response);
    }

    /**
     * 加粉
     */
    public void jiafen() {
        JSONObject cookie = new JSONObject();
        cookie.put("SUB", "_2A251_e2_DeThGeNI61QT-SvPyjWIHXVWi1h3rDV8PUNbmtBeLRDDkW8y_Kqu6CeO-2VOr8qfjsmaIkywpQ..");
        cookie.put("SSOLoginState", "1492753903");
        String id = "6172822710";
        WeiboWebHttpClient client = new WeiboWebHttpClient();
        JSONObject json = client.weiboFollow(cookie, id);
        System.out.println(json);
    }


    /**
     * 新浪微博采集（手机版，最新，每页20条）
     */
    public void sinaSearch() {
        try {
            String s = java.net.URLEncoder.encode("q=何洁", "utf-8");
//            System.out.println(s);
            String url = "http://api.weibo.cn/2/guest/cardlist?c=android&page=2&count=20&containerid=100303type=2%26" + s + "&since_id=4055850110700630";
            //获取最后一条微博Id 重新请求，同时page+1
            String str = new HttpClientUtil().httpGetRequest(url);
            System.out.print(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void wangyizan(String newsId, String commentId) throws UnsupportedEncodingException {
        //https://c.m.163.com/news/a/CAQR710D04388CSB.html?spss=newsapp&spsw=1
        String url = "http://comment.api.163.com/api/v1/products/a2869674571f77b5a0867c3d71db5856/threads/" + newsId + "/app/comments/" + newsId + "_" + commentId + "/action/upvote";
        Map map = new HashMap();
        Map hmap = new HashMap();
        map.put("fingerprintType", "android");
        map.put("fingerprint", "/QQQ/onNArvEMLFqOLyh9Q==");
        hmap.put("Host", "comment.api.163.com");
        String coneten = new HttpClientUtil().httpPostRequest(url, map, hmap);
        if (coneten == null || coneten.length() == 0) {
            System.out.println("点赞成功");
        } else {
            System.out.println(coneten);
        }
    }


    /**
     * 视频播放量测试
     */
    public void videoTest() {
        Process proc = null;
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("start!---------");
                proc = Runtime.getRuntime().exec("python  D:\\PythonDemo\\demo2.py");
                proc.waitFor();
                System.out.println("end!----------");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public void sinaWeiboCommentZan() {
        JSONObject cookie = new JSONObject();
        cookie.put("SUB", "_2A2513xjUDeThGeNI61QQ-CjPyTiIHXVWrQ0crDV8PUNbmtBeLUbnkW-DsXC7BY-kyfjradhH1nMafANktw..");
        cookie.put("SSOLoginState", "1490774148");
        cookie.put("SUBP", "0033WrSXqPxfM725Ws9jqgMF55529P9D9WWd-GTClfhkr0jRKc5wJNNn5JpX5K2hUgL.Fo-cehqp1hq0eoB2dJLoI0qLxK-L1KqL1-eLxKqLB-eLBKzLxK-LBKBLB-2LxK.L1KnLBoeLxK-LB.-L1KMLxKqLB.BLBoBt");
        String id = "4089851604683631";
        JSONObject res = new WeiboWebHttpClient().commentSupport(cookie, id);
        System.out.println(res);
    }


    /**
     * 两个数组去重
     */
    public void test333() {
        String[] A = {"1", "2", "3", "7", "4", "5", "6"};
        String[] B = {"1", "3"};
        String[] c = ArrayUtils.removeElements(A, B);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }

    public void commmentTest() {
        //http://comment.news.163.com/api/v1/products/a2869674571f77b5a0867c3d71db5856/threads/CJ3H6TRD000187VE/comments?ibc=newswap
        String url = "http://comment.news.163.com/api/v1/products/a2869674571f77b5a0867c3d71db5856/threads/CJ3H6TRD000187VE/comments?ibc=newspc";
    }


    public void weibopost() {
        JSONObject Cookie = new JSONObject();
        Cookie.put("SUB", "_2A250EXi_DeThGeNJ4lMU8C_PyDmIHXVXZ-13rDV8PUJbmtAKLWjGkW84lZaYA_JD7yrC89VMjgNEmoM7xQ..");
        Cookie.put("SSOLoginState", "1494550770");
        Cookie.put("SUBP", "0033WrSXqPxfM725Ws9jqgMF55529P9D9WW0_8Wei0jwIDclR9vBQXgj5JpX5K2hUgL.Fo-N1K2feh20e0-2dJLoIERLxKML1-qLB-BLxK-LBo5LB.-LxK-LBoMLBox2i--fiKnEi-iFi--NiK.EiK.7");
        new WeiboWebHttpClient().weiboAdd(Cookie, "hehe", null);
    }

    public static AccessToken refreshToken() {
        Properties props = new Properties();
        try {
            props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("sina_account.properties"));
            String url = props.getProperty("url");/*模拟登录的地址，https://api.weibo.com/oauth2/authorize*/
            PostMethod postMethod = new PostMethod(url);
            postMethod.addParameter("client_id", props.getProperty("client_id"));//your client id
            postMethod.addParameter("redirect_uri", props.getProperty("redirect_uri"));//your url
            postMethod.addParameter("userId", props.getProperty("userId"));//需要获取微薄的use id
            postMethod.addParameter("passwd", props.getProperty("passwd"));
            postMethod.addParameter("isLoginSina", "0");
            postMethod.addParameter("action", "submit");
            postMethod.addParameter("response_type", props.getProperty("response_type"));//code
            HttpMethodParams param = postMethod.getParams();
            param.setContentCharset("UTF-8");
            List<Header> headers = new ArrayList<Header>();
            headers.add(new Header("Referer", "https://api.weibo.com/oauth2/authorize?client_id=your_client_id&redirect_uri=your_redirect_url&from=sina&response_type=code"));//伪造referer
            headers.add(new Header("Host", "api.weibo.com"));
            headers.add(new Header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; rv:11.0) Gecko/20100101 Firefox/11.0"));
            HttpClient client = new HttpClient();
            client.getHostConfiguration().getParams().setParameter("http.default-headers", headers);
            client.executeMethod(postMethod);
            int status = postMethod.getStatusCode();
            if (status != 302) {
                LOG.error("refresh token failed");
                return null;
            }
            Header location = postMethod.getResponseHeader("Location");
            if (location != null) {
                String retUrl = location.getValue();
                int begin = retUrl.indexOf("code=");
                if (begin != -1) {
                    int end = retUrl.indexOf("&", begin);
                    if (end == -1)
                        end = retUrl.length();
                    String code = retUrl.substring(begin + 5, end);
                    if (code != null) {
                        AccessToken token = oauth.getAccessTokenByCode(code);
                        Oauth oauth = new Oauth();
                        return token;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            LOG.error("error" + e);
        } catch (IOException e) {
            LOG.error("error" + e);
        }
        LOG.error("refresh token failed");
        return null;
    }
}
