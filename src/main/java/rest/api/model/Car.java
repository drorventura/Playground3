package rest.api.model;

/**
 * User: Dror
 * Date: 28/11/2014
 * Time: 17:32
 */
public class Car
{
    private String id;
    private String brandName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
