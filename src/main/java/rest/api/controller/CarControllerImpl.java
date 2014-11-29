package rest.api.controller;


import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import rest.api.model.Car;

import java.util.List;

/**
 * User: Dror
 * Date: 28/11/2014
 * Time: 17:30
 */
@RequestMapping("car")
public class CarControllerImpl implements GenericController<Car>
{
    private static Logger log = Logger.getLogger(CarControllerImpl.class);

    @Override
    public void test() { }

    @Override
    public Car createModel(@RequestBody Car model) {
        return null;
    }

    @Override
    public Car getModelById(@PathVariable("id") String id)
    {
        Car car = new Car();
        car.setId(id);
        car.setBrandName("Chevrolet");
        return car;
    }

    @Override
    public List<Car> getAllModels() {
        return null;
    }

    @Override
    public Car deleteModelById(@PathVariable("id") String id) {
        return null;
    }

    @Override
    public Car updateModel(@RequestBody Car model) {
        return null;
    }
}
