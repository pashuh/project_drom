package pojo;

public class UserPojo {
    private String name;
    private String job;
    private String token;
    private Integer total;
    private Object transmission;

    public void setTrans(String transmission) {
        this.transmission = transmission;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getToken() {
        return token;
    }
    public String getName() {
        return name;
    }

    public Integer getTotal() {
        return total;
    }
}