package c.a.a.v;
/* loaded from: classes.dex */
public class i<T> {

    /* renamed from: a  reason: collision with root package name */
    T f2450a;

    /* renamed from: b  reason: collision with root package name */
    T f2451b;

    private static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void a(T t, T t2) {
        this.f2450a = t;
        this.f2451b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof androidx.core.util.d)) {
            return false;
        }
        androidx.core.util.d dVar = (androidx.core.util.d) obj;
        return b(dVar.f1593a, this.f2450a) && b(dVar.f1594b, this.f2451b);
    }

    public int hashCode() {
        T t = this.f2450a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f2451b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f2450a) + " " + String.valueOf(this.f2451b) + "}";
    }
}
