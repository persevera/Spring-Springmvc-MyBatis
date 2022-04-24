package Mapper;

import Myclass.People;

import java.util.List;

public interface PeopleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(People record);

    int insertSelective(People record);

    People selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(People record);

    int updateByPrimaryKey(People record);

    List<People>  selectall();
}