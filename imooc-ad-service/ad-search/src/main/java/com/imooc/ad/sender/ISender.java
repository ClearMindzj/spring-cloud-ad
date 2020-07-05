package com.imooc.ad.sender;

import com.imooc.ad.mysql.dto.MySqlRowData;

/**
 * Created by Qinyi.
 * 增量数据投递
 */
public interface ISender {

    void sender(MySqlRowData rowData);
}
