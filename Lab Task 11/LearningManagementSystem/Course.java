class Course {
    private String name;
    private String code;

    public Course(String name, String code) {
        this.name = name;
        this.code = code;
    }
     
    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    // Getters
    public String getName() {
        return name;
    }


    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Course{Name='" + name + "', Code='" + code + "'}";
    }
}