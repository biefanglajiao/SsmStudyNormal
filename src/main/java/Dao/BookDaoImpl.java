package Dao;

import domain.Book;
import org.mybatis.spring.support.SqlSessionDaoSupport;
//继承以获取配置

public class BookDaoImpl extends SqlSessionDaoSupport implements BookDao{
    @Override
    public Book findbyid(int id) {
        Book book=this.getSqlSession().selectOne("Dao.BookDao.findbyid",id);

        //如何在dao中操作数据库
        //1。
        return  book;
    }
}
