package lab3.ch6;



public class Person {
    private String name;
    private String job;
    private String university;
    private Boolean drivingLicense;
    private Boolean isMarried;

    private Person()
    {

    }

    public static class Builder{

        private String name;
        private String job;
        private String university;
        private Boolean drivingLicense;
        private Boolean isMarried;


        public Builder(String name) {this.name=name;}

        public Person build()
        {
            Person instance=new Person();
            instance.name=this.name;
            instance.job=this.job;
            instance.university=this.university;
            instance.drivingLicense=this.drivingLicense;
            instance.isMarried=this.isMarried;


            return instance;
        }

        public Builder setJob(String job) {
            this.job = job;
            return this;
        }

        public Builder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Builder setDrivingLicense(Boolean drivingLicense) {
            this.drivingLicense = drivingLicense;
            return this;
        }

        public Builder setMarried(Boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }


    }

    @Override
    public String toString() {
        return "Builder{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", university='" + university + '\'' +
                ", drivingLicense=" + drivingLicense +
                ", isMarried=" + isMarried +
                '}';
    }
}
