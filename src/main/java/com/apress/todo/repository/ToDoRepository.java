package com.apress.todo.repository;

import java.sql.ResultSet;
import java.util.Collection;

import com.apress.todo.domain.ToDo;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ToDoRepository implements CommonRepository<ToDo> {
    private static final String SQL_INSERT =
        "insert into todo (id, description, created, modified, completed) values (:id, :description, :created, :modified, :completed)";
    private static final String SQL_QUERY_FIND_ALL = "select id, description, created, modified, completed from todo";
    private static final String SQL_QUERY_FIND_BY_ID = SQL_QUERY_FIND_ALL + " where id = :id";
    private static final String SQL_UPDATE =
        "update todo set description = :description, modified = :modified, completed = :completed where id = :id";
    private final NamedParameterJdbcTemplate jdbcTemplate;

    public ToDoRepository(NamedParameterJdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private RowMapper<ToDo> toDoRowMapper = (ResultSet rs, int rowNum) -> {
        ToDo toDo = new ToDo();
        toDo.setId(rs.getString("id"));

        return toDo;
    };

    @Override
    public ToDo save(ToDo domain) {
        return null;
    }

    @Override
    public Iterable<ToDo> save(Collection<ToDo> domains) {
        return null;
    }

    @Override
    public void delete(ToDo domain) {

    }

    @Override
    public ToDo findById(String id) {
        return null;
    }

    @Override
    public Iterable<ToDo> findAll() {
        return null;
    }
}
