package com.ebiz.platform.cache.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.ebiz.platform.cache.BaseCache;

/**
 * 缓存servlet
 * 
 * @author fengyb
 * @date
 */
public class CacheServlet extends HttpServlet {

    private static Logger logger = Logger.getLogger(CacheServlet.class.getName());

    private static final long serialVersionUID = 1L;

    /**
     * 刷新缓存
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        logger.info("刷新缓存开始");
        try {
            BaseCache.refresh();
        }
        catch (Exception e) {
            logger.warn("刷新缓存失败！\n", e);
            e.printStackTrace();
        }
        logger.info("刷新缓存结束");
    }

    /**
     * 刷新缓存
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        this.doGet(request, response);
    }
}
