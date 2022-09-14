package androidx.core.util;
/* loaded from: classes.dex */
public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f1593a;

    /* renamed from: b  reason: collision with root package name */
    public final S f1594b;

    public d(F f2, S s) {
        this.f1593a = f2;
        this.f1594b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f1593a, this.f1593a) && c.a(dVar.f1594b, this.f1594b);
    }

    public int hashCode() {
        F f2 = this.f1593a;
        int i = 0;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f1594b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.f1593a + " " + this.f1594b + "}";
    }
}
