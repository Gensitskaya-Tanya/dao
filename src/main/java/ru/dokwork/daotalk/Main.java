package ru.dokwork.daotalk;

import ru.dokwork.daotalk.dao.DaoFactory;
import ru.dokwork.daotalk.dao.GenericDao;
import ru.dokwork.daotalk.dao.PersistException;
import ru.dokwork.daotalk.domain.Group;
import ru.dokwork.daotalk.mysql.MySqlDaoFactory;

import java.sql.Connection;

/**
 * Created by Tanya on 16.12.2016.
 */
public class Main {
	public static void main(String[] args) throws PersistException {
		DaoFactory factory = new MySqlDaoFactory();
		Connection connection = (Connection) factory.getContext();
		GenericDao dao = factory.getDao(connection, Group.class);
		dao.create();
	}
}
