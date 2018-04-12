package com.autobook;

import com.autobook.bean.AutoBookRequest;
import com.autobook.core.*;

import java.io.IOException;
import java.util.List;

/**
 * Created by jiabaowang on 2018/4/10.
 */
public class AutoBookBugFixerMain {
    /**
     * @param args
     * @throws IOException SELECT top 10  requestxml ,DataChange_LastTime,OrderId  FROM FMPDB..EXC_AutoBookRequest(NOLOCK)
     *                     WHERE Channel = 'CS-WS'
     *                     and OrderId in  (select  top 5 orderid from FMPDB..AirLineAutoBookLog(NOLOCK) where
     *                     channel = 'CS-WS'
     *                     and retvalue = 1
     *                     -- and detail = '自动订位失败：调用预定订单BookOrder接口失败(ERR803-009)'
     *                     AND DataChange_LastTime > '2018-04-11 00:00:00'
     *                     order by logid desc)
     *                     AND DataChange_LastTime > '2018-04-11 00:00:00'
     *                     ORDER BY AutobookId DESC
     */

    public static void main(String[] args) throws IOException {
        PatternRegex regex = new PatternRegex();
        AutoBookBuilder bookBuilder = new AutoBookBuilder(regex);
        List<AutoBookRequest> requests = bookBuilder.buildFromUri("");
        AbstractPrinter<AutoBookRequest,Object> printer = new AutoBookRequestPrinter();
        printer.print(requests);
    }
}
