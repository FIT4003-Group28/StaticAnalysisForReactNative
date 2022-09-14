package android.support.v4.i;
/* compiled from: Pair.java */
/* loaded from: classes.dex */
public class i<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f469a;

    /* renamed from: b  reason: collision with root package name */
    public final S f470b;

    public i(F f, S s) {
        this.f469a = f;
        this.f470b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return b(iVar.f469a, this.f469a) && b(iVar.f470b, this.f470b);
    }

    private static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f469a == null ? 0 : this.f469a.hashCode();
        if (this.f470b != null) {
            i = this.f470b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f469a) + " " + String.valueOf(this.f470b) + "}";
    }

    public static <A, B> i<A, B> a(A a2, B b2) {
        return new i<>(a2, b2);
    }
}
