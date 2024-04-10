package model;

public record GroupData(String Name, String Header, String Footer) {
    public GroupData(){
        this("", "", "");
    }

    public GroupData withName(String name) {
            return new GroupData(name, this.Header, this.Footer);
    }

    public GroupData withHeader(String header) {
        return new GroupData(this.Name, header, this.Footer);
    }

    public GroupData withFooter(String footer) {
        return new GroupData(this.Name, this.Header, footer);
    }
}