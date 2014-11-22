package rest.api.controller;

import org.apache.log4j.Logger;
import rest.api.model.User;

import java.util.List;

/**
 * User: Dror
 * Date: 21/11/2014
 * Time: 09:53
 */
public class UserController implements GenericController
{
    private static final Logger log = Logger.getLogger(UserController.class);

    @Override
    public void test() { }

    @Override
    public User createModel(User User)
    {
        return null;
    }

    @Override
    public User getModelById(String id)
    {
        log.info("Requested User id: ".concat(id));
        return null;
    }

    @Override
    public List<User> getAllModels()
    {
        log.info("Requested All Users");
        return null;
    }

    @Override
    public User deleteModelById(String id)
    {
        log.info("Requested User id ".concat(id));
        return null;
    }

    @Override
    public User updateModel(User User)
    {
        return null;
    }
}
