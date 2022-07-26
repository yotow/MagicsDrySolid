public class ClientBuilder {
    private String phoneNumber;
    private String name;
    private String address;

    public ClientBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ClientBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ClientBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Client build(){
        return new Client(name, phoneNumber, address);
    }
}
