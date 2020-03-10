package hs.lhrotk.com;

public class MyShort {
    private long i;
    public MyShort(Short i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Number) {
            return this.i == ((Number) obj).longValue();
        } else if (obj instanceof MyShort) {
            return this.i == ((MyShort)obj).i;
        } else {
            return false;
        }
    }

    // why you need to override hash code??
    @Override
    public int hashCode() {
        Long i = (Long)this.i;
        return i.hashCode();
    }
}
