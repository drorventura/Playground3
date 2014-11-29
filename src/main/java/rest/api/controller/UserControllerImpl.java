package rest.api.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import rest.api.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
* User: Dror
* Date: 21/11/2014
* Time: 09:29
*/
@RequestMapping("user")
public class UserControllerImpl implements GenericController<User>
{
    private static final Logger log = Logger.getLogger(UserControllerImpl.class);

    @Override
    public void test() {}

    @Override
    public User createModel(@RequestBody User model)
    {
        UUID id = UUID.randomUUID();
        String idAsString = id.toString();
        User user = new User();
        user.setId(idAsString);
        user.setFirstName(model.getFirstName());
        user.setLastName(model.getLastName());
        user.setDateCreated(new Date());
        return user;
    }

    @Override
    public User getModelById(@PathVariable("id") String id)
    {
        log.info("Requested User id: ".concat(id));
        User user = new User();
        user.setId(id);
        return user;
    }

    @Override
    public List<User> getAllModels()
    {
        log.info("Requested All Users");
        ArrayList<User> users= new ArrayList<>();
        User user = new User();
        users.add(user);
        return users;
    }

    @Override
    public User deleteModelById(@PathVariable("id") String id)
    {
        log.info("Requested User id ".concat(id));
        User user = new User();
        user.setId(id);
        return user;
    }

    @Override
    public User updateModel(@RequestBody User model)
    {
        model.setFirstName("Batz");
        return model;
    }
}
