package c.e.a.a;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f3670a;

    private b(String str) {
        if (str != null) {
            this.f3670a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public static b a(String str) {
        return new b(str);
    }

    public String a() {
        return this.f3670a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return this.f3670a.equals(((b) obj).f3670a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3670a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f3670a + "\"}";
    }
}
