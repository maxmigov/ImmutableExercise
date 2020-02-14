import java.util.Date;

final class Currency {
        private String baseCode;
        private String code;
        private Float value;
        private String date;

    public Currency(String baseCode, String code, Float value, String date) {
        this.baseCode = baseCode;
        this.code = code;
        this.value = value;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Currency { " +
                "baseCode = '" + baseCode + '\'' +
                ", code = '" + code + '\'' +
                ", value = " + value +
                ", date = '" + date + '\'' +
                '}';
    }

    public String getBaseCode() {
        return baseCode;
    }

    public String getCode() {
        return code;
    }

    public Float getValue() {
        return value;
    }

    public String getDate() {
        return date;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Currency setDate(String date) {
        this.date = date;
    }
}
