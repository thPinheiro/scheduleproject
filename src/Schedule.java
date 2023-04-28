public class Schedule {

    private String name;
    private String surName;
    private int contactPhone;

    public Schedule (){}

    public Schedule(String name, String surName, int contactPhone){
    this.name = name;
    this.surName = surName;
    this.contactPhone = contactPhone;
    }

   
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

  
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surname) {
        this.surName = surname;
    }

  
    public int getContactPhone() {
        return contactPhone;
    }
    public void setContactPhone(int contactPhone) {
       
        this.contactPhone = contactPhone;
    }
}
