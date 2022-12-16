package com.entity;

public class Member {
//    
   // private Integer MemberID;
    //
  //  private Integer JobCode;
    //private Integer TeamJobCode;
    
    private String FirstName;
    
    private String SecondName;
    private String Name;

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "FirstName='" + FirstName + '\'' +
                ", SecondName='" + SecondName + '\'' +
                ", State='" + State + '\'' +
                ", City='" + City + '\'' +
                ", Street='" + Street + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", ZipCode='" + ZipCode + '\'' +
                ", Salary=" + Salary +
                ", WorkSchedule='" + WorkSchedule + '\'' +
                '}';
    }

    public void setName(String name) {
        Name = name;
    }


    private String State;

    private String City;
  
    private String Street;

    private String PhoneNumber;

    private String ZipCode;

    private Double Salary;

    private String WorkSchedule;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    private Integer Id;



    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public String getWorkSchedule() {
        return WorkSchedule;
    }

    public void setWorkSchedule(String workSchedule) {
        WorkSchedule = workSchedule;
    }



}
