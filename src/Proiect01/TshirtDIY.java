package Proiect01;

public class TshirtDIY {
    private String orderNo;
    private String color;
    private TshirtTypes type;
    private String size;
    private PrintList print;
    private AccList accessory;
    private String text;

    private TshirtDIY(){

    }

    public static class Builder
    {
        private String orderNo;
        private String color;
        private TshirtTypes type;
        private String size;
        private PrintList print;
        private AccList accessory;
        private String text;

        public Builder(String orderNo) {
            this.orderNo = orderNo;
        }


        public TshirtDIY build()
        {
            TshirtDIY tee=new TshirtDIY();
            tee.orderNo=this.orderNo;
            tee.color=this.color;
            tee.type=this.type;
            tee.size=this.size;
            tee.print=this.print;
            tee.accessory=this.accessory;
            tee.text=this.text;
            return tee;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setType(TshirtTypes type) {
            this.type = type;
            return this;
        }

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setPrint(PrintList print) {
            this.print = print;
            return this;
        }

        public Builder setAccessory(AccList accessory) {
            this.accessory = accessory;
            return this;
        }

        public Builder setText(String text) {
            this.text = text;
            return this;
        }
    }

    @Override
    public String toString() {
        return "TshirtDIY{" +
                "orderNo='" + orderNo + '\'' +
                ", color='" + color + '\'' +
                ", type=" + type +
                ", size='" + size + '\'' +
                ", print=" + print +
                ", accessory=" + accessory +
                ", text='" + text + '\'' +
                '}';
    }
}
