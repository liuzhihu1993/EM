package com.em.utils;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.digest.DigestUtils;

import com.opensymphony.oscache.util.StringUtil;

/**
 * MD5加密的工具类
 * 
 * @author liuzhihu
 *
 */
public final class MD5Signature {

	private MD5Signature() {

	}

	/**
	 * MD5加密
	 *
	 * @param content
	 * @param key
	 * @return
	 * @throws Exception
	 *             String
	 */
	public static String sign(String content, String key) {
		String tosign = (content == null ? "" : content) + key;

		try {
			return DigestUtils.md5Hex(getContentBytes(tosign, "utf-8"));
		} catch (UnsupportedEncodingException e) {
			return null;
		}
	}

	/**
	 * @param content
	 * @param charset
	 * @return
	 * @throws SignatureException
	 * @throws UnsupportedEncodingException
	 */
	protected static byte[] getContentBytes(String content, String charset) throws UnsupportedEncodingException {
		if (StringUtil.isEmpty(charset)) {
			return content.getBytes();
		}

		return content.getBytes(charset);
	}

	public static void main(String[] args) {
		System.out.println(sign(EMConstant.JIAMI, "123"));
	}

}
