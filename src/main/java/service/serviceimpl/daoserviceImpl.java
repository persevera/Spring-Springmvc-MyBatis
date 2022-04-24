package service.serviceimpl;

import Mapper.PeopleMapper;
import Myclass.People;
import service.daoservice;

import java.util.List;

public class daoserviceImpl implements daoservice {
    //引入Dao接口对象
    private PeopleMapper peopleMapper;
    //需要set方法，一定要有set方法，为了Spring容器中set注入赋值
     public void setPeopleMapper(PeopleMapper peopleMapper) {
        this.peopleMapper = peopleMapper;
    }
    //在Service中调用Dao接口对象方法
    @Override
    public List<People> selectallpeople() {
        List<People> selectall = peopleMapper.selectall();
        return selectall;
    }
}
