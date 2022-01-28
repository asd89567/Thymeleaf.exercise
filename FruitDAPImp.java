package com.thymeleaf.Imp;



import com.thymeleaf.DAO.BaseDAO;
import com.thymeleaf.DAO.FruitDAO;
import com.thymeleaf.JDBCUtils;
import com.thymeleaf.fruit;

import java.sql.Connection;
import java.util.List;

public class FruitDAPImp extends BaseDAO<fruit> implements FruitDAO {

    @Override
    public List<fruit> getfruitlist() {
        Connection connection = null;
        try {
            connection = JDBCUtils.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<fruit> forList = getForList(connection, "select * from fruit");
        return forList;
    }
}
