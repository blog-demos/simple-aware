package pers.matt.bean;

/**
 * TODO
 * <p>
 * Create Time: 2019-09-02 18:22
 * Last Modify: 2019-09-02
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Student1 {

    private String id;
    private String name;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Student1: {id: %s, name: %s, address: %s}", getId(), getName(), getAddress());
    }
}
