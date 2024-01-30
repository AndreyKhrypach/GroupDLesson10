public class User {
    private String name;
    Acount acount;

    public User(String name, String password) {
        this.name = name;
        this.acount = new Acount(password);
    }

    class Acount{
        private String password;

        public Acount(String password) {
            this.password = password;
        }


    }

}
