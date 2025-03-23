package example;

public class CreateUserApi {

        private String name;
        private String email;
        private String password;

        public CreateUserApi(String email, String password, String name){
            this.email = email;
            this.password = password;
            this.name = name;
        }
    public CreateUserApi(String email, String password){
        this.email = email;
        this.password = password;
    }


    public CreateUserApi(){
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

