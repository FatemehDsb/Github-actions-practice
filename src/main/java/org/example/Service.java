package org.example;

public class Service {

    private final Repository repo;

    public Service(Repository repo){
        this.repo = repo;
    }
    public User findUserById( int id){
        User user = repo.findUserById(id);
        if(user == null ){
            throw new NotFoundException("user with id " + id + "not found! ");
        }
        return user;
    }
}
