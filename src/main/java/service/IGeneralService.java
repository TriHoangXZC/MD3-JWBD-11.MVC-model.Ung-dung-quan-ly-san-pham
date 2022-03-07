package service;

import java.util.List;

public interface IGeneralService<T> {
    List<T> displayAllProduct();

    void create(T t);

    void updateById(int id, T t);

    void deleteById(int id);

    T findById(int id);

}
