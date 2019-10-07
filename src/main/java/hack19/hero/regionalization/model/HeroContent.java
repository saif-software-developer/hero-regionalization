package hack19.hero.regionalization.model;

import java.util.Objects;

public class HeroContent{
    private String imageUrl;
    private String text;
    private String url;

    public HeroContent() {
    }

    public HeroContent(String imageUrl, String text, String url) {
        this.imageUrl = imageUrl;
        this.text = text;
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public HeroContent withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public HeroContent withText(String text) {
        this.text = text;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HeroContent withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeroContent that = (HeroContent) o;
        return Objects.equals(imageUrl, that.imageUrl) &&
                Objects.equals(text, that.text) &&
                Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageUrl, text, url);
    }

    @Override
    public String toString() {
        return "HeroContent{" +
                "imageUrl='" + imageUrl + '\'' +
                ", text='" + text + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
