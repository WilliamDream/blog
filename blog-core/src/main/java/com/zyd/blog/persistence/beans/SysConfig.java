/**
 * MIT License
 * Copyright (c) 2018 yadong.zhang
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.zyd.blog.persistence.beans;

import com.zyd.blog.framework.object.AbstractDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysConfig extends AbstractDO {
    private String homeDesc;
    private String homeKeywords;
    private String domain;
    private String siteUrl;
    private String siteName;
    private String siteDesc;
    private String siteFavicon;

    private String staticWebSite;
    private String authorName;
    private String authorEmail;

    private String wxCode;
    private String qq;
    private String weibo;
    private String github;
    private Boolean maintenance;
    private Date maintenanceData;
    private Boolean comment;

    private String qiuniuBasePath;
    private String qiniuAccessKey;
    private String qiniuSecretKey;
    private String qiniuBucketName;


    private String baiduPushToken;
    /**
     * 赞赏码
     */
    private String wxPraiseCode;
    private String zfbPraiseCode;
    /**
     * 百度api授权AK(获取地址：http://lbsyun.baidu.com/apiconsole/key)
     * 调用百度的api时必须
     */
    private String baiduApiAk;
	public String getHomeDesc() {
		return homeDesc;
	}
	public void setHomeDesc(String homeDesc) {
		this.homeDesc = homeDesc;
	}
	public String getHomeKeywords() {
		return homeKeywords;
	}
	public void setHomeKeywords(String homeKeywords) {
		this.homeKeywords = homeKeywords;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getSiteUrl() {
		return siteUrl;
	}
	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getSiteDesc() {
		return siteDesc;
	}
	public void setSiteDesc(String siteDesc) {
		this.siteDesc = siteDesc;
	}
	public String getSiteFavicon() {
		return siteFavicon;
	}
	public void setSiteFavicon(String siteFavicon) {
		this.siteFavicon = siteFavicon;
	}
	public String getStaticWebSite() {
		return staticWebSite;
	}
	public void setStaticWebSite(String staticWebSite) {
		this.staticWebSite = staticWebSite;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public String getWxCode() {
		return wxCode;
	}
	public void setWxCode(String wxCode) {
		this.wxCode = wxCode;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWeibo() {
		return weibo;
	}
	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}
	public String getGithub() {
		return github;
	}
	public void setGithub(String github) {
		this.github = github;
	}
	public Boolean getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(Boolean maintenance) {
		this.maintenance = maintenance;
	}
	public Date getMaintenanceData() {
		return maintenanceData;
	}
	public void setMaintenanceData(Date maintenanceData) {
		this.maintenanceData = maintenanceData;
	}
	public Boolean getComment() {
		return comment;
	}
	public void setComment(Boolean comment) {
		this.comment = comment;
	}
	public String getQiuniuBasePath() {
		return qiuniuBasePath;
	}
	public void setQiuniuBasePath(String qiuniuBasePath) {
		this.qiuniuBasePath = qiuniuBasePath;
	}
	public String getQiniuAccessKey() {
		return qiniuAccessKey;
	}
	public void setQiniuAccessKey(String qiniuAccessKey) {
		this.qiniuAccessKey = qiniuAccessKey;
	}
	public String getQiniuSecretKey() {
		return qiniuSecretKey;
	}
	public void setQiniuSecretKey(String qiniuSecretKey) {
		this.qiniuSecretKey = qiniuSecretKey;
	}
	public String getQiniuBucketName() {
		return qiniuBucketName;
	}
	public void setQiniuBucketName(String qiniuBucketName) {
		this.qiniuBucketName = qiniuBucketName;
	}
	public String getBaiduPushToken() {
		return baiduPushToken;
	}
	public void setBaiduPushToken(String baiduPushToken) {
		this.baiduPushToken = baiduPushToken;
	}
	public String getWxPraiseCode() {
		return wxPraiseCode;
	}
	public void setWxPraiseCode(String wxPraiseCode) {
		this.wxPraiseCode = wxPraiseCode;
	}
	public String getZfbPraiseCode() {
		return zfbPraiseCode;
	}
	public void setZfbPraiseCode(String zfbPraiseCode) {
		this.zfbPraiseCode = zfbPraiseCode;
	}
	public String getBaiduApiAk() {
		return baiduApiAk;
	}
	public void setBaiduApiAk(String baiduApiAk) {
		this.baiduApiAk = baiduApiAk;
	}
    
    
}
