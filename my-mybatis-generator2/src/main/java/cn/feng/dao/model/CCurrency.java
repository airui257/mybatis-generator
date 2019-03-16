package cn.feng.dao.model;

public class CCurrency {
    private Integer id;

    private String currencyCode;

    private String urrencySymbol;

    private Double exchangeRate;

    private Long judge;

    private String name;

    private String display;

    private String inshop;

    public CCurrency(Integer id, String currencyCode, String urrencySymbol, Double exchangeRate, Long judge, String name, String display, String inshop) {
        this.id = id;
        this.currencyCode = currencyCode;
        this.urrencySymbol = urrencySymbol;
        this.exchangeRate = exchangeRate;
        this.judge = judge;
        this.name = name;
        this.display = display;
        this.inshop = inshop;
    }

    public CCurrency() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode == null ? null : currencyCode.trim();
    }

    public String getUrrencySymbol() {
        return urrencySymbol;
    }

    public void setUrrencySymbol(String urrencySymbol) {
        this.urrencySymbol = urrencySymbol == null ? null : urrencySymbol.trim();
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Long getJudge() {
        return judge;
    }

    public void setJudge(Long judge) {
        this.judge = judge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display == null ? null : display.trim();
    }

    public String getInshop() {
        return inshop;
    }

    public void setInshop(String inshop) {
        this.inshop = inshop == null ? null : inshop.trim();
    }
}