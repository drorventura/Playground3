package rest.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rest.api.model.User;

import java.util.List;

import static rest.api.controller.GenericRestURIConstants.*;

/**
 * User: Dror
 * Date: 21/11/2014
 * Time: 09:29
 */
@Controller
@RequestMapping("home")
public interface GenericController <M>
{
    @RequestMapping(value = "test", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public void test();

    @RequestMapping(value = CREATE_MODEL, method = RequestMethod.POST)
    public @ResponseBody User createModel(@RequestBody M model);

    @RequestMapping(value = GET_MODEL, method = RequestMethod.GET)
    public @ResponseBody User getModelById(@PathVariable("id") String id);

    @RequestMapping(value = GET_ALL_MODEL, method = RequestMethod.GET)
    public @ResponseBody List<M> getAllModels();

    @RequestMapping(value = DELETE_MODEL, method = RequestMethod.DELETE)
    public @ResponseBody User deleteModelById(@PathVariable("id") String id);

    @RequestMapping(value = UPDATE_MODEL, method = RequestMethod.PUT)
    public @ResponseBody User updateModel(@RequestBody M model);
}
