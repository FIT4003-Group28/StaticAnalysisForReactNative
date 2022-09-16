package defpackage;
/* compiled from: PG */
/* renamed from: dztx  reason: default package */
/* loaded from: classes6.dex */
public final class dztx<T> {
    public final int a;
    public final T b;

    public dztx(int i, T t) {
        this.a = i;
        this.b = t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof dztx)) {
                return false;
            }
            dztx dztxVar = (dztx) obj;
            return this.a == dztxVar.a && dzvx.d(this.b, dztxVar.b);
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a * 31;
        T t = this.b;
        return i + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}
