package Service;

import Dao.BookDao;
import domain.Book;
import mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

//    //传统dao开发  不用
//    @Autowired
//    private BookDao bookDao;
//    @Override
//    public Book findbyid(int id) {
//        System.out.println("service被调用");
//        return bookDao.findbyid(id);
//
//    }
@Autowired
private BookMapper bookMapper;
    @Override
    public Book findbyid(int id) {
        System.out.println("service被调用");
        return bookMapper.findbyid(id);
    }
}
