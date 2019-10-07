package hack19.hero.regionalization.model;

import java.util.Map;
import java.util.Objects;

public class MapWrapper {
    private Map<String, HeroContent> map;

    public Map<String, HeroContent> getMap() {
        return map;
    }

    public void setMap(Map<String, HeroContent> map) {
        this.map = map;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MapWrapper that = (MapWrapper) o;
        return Objects.equals(map, that.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}
