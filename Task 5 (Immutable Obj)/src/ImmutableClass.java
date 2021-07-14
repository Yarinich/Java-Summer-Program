public class ImmutableClass {
    private final String firstName;

    public ImmutableClass(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }
    public ImmutableClass setDate(String firstName){
        return new ImmutableClass(firstName);
    }
}
