
class Article{
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Article(String url, String name) {
        this.url = url;
        this.name = name;
    }

    private String name;
}
