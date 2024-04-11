package ru.aleverika.model;

public record ContactData(
        String FirstName,
        String SecondName,
        String LastName,
        String Nickname,
        String Title,
        String Company,
        String Address,
        String MobilePhone,
        String WorkPhone,
        String HomePhone,
        String Fax,
        String Email_1,
        String Email_2,
        String Email_3,
        String Homepage,
        String B_day,
        String B_month,
        String B_year,
        String Anniversary,
        String Group

        ) {
    public ContactData(){this(
            "", "", "", "",
            "", "", "", "", "",
            "", "", "", "", "", "", "",
            "", "", "","");}

    public ContactData setFirstName(String name){
        return new ContactData(name,this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day, this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setSecondName(String name) {
        return new ContactData(this.FirstName, name, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day, this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setLastName(String name) {
        return new ContactData(this.FirstName, this.SecondName, name, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day,this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setNickname(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, name, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day,this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setTitle(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, name, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day,this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setCompany(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, name, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day, this.B_month, this.B_year,this.Anniversary, this.Group);
    }
    public ContactData setAdress(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, name, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day,this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setMobilePhone(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, name, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day, this.B_month, this.B_year,this.Anniversary, this.Group);
    }
    public ContactData setWorkPhone(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, name, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day, this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setHomePhone(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, name, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day,this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setFax(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, name, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day, this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setEmail_1(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, name, this.Email_2, this.Email_3, this.Homepage, this.B_day, this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setEmail_2(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, name, this.Email_3, this.Homepage, this.B_day,this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setEmail_3(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, name, this.Homepage, this.B_day,this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setHomepage(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, name, this.B_day, this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setB_day(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, name, this.B_month, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setAnniversary(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day,this.B_month, this.B_year,  name, this.Group);
    }
    public ContactData setGroup(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day,this.B_month, this.B_year, this.Anniversary, name);
    }
    public ContactData setB_month(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day, name, this.B_year, this.Anniversary, this.Group);
    }
    public ContactData setB_year(String name) {
        return new ContactData(this.FirstName, this.SecondName, this.LastName, this.Nickname, this.Title, this.Company, this.Address, this.MobilePhone, this.WorkPhone, this.HomePhone, this.Fax, this.Email_1, this.Email_2, this.Email_3, this.Homepage, this.B_day,this.B_month, name, this.Anniversary, this.Group);
    }
}
