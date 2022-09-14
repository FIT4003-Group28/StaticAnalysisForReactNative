package a.g.m;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Object f319a;

    private c(Object obj) {
        this.f319a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new c(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return androidx.core.util.c.a(this.f319a, ((c) obj).f319a);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f319a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f319a + "}";
    }
}
