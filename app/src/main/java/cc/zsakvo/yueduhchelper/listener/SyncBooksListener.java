package cc.zsakvo.yueduhchelper.listener;

import java.util.LinkedHashMap;

import cc.zsakvo.yueduhchelper.Dao.CacheBook;

public interface SyncBooksListener {
    void showBooks(LinkedHashMap<String, CacheBook> books);
}
