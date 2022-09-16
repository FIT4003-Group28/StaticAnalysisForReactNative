package defpackage;
/* compiled from: PG */
/* renamed from: bmc  reason: default package */
/* loaded from: classes3.dex */
public final class bmc<T> {
    public T a;
    public T b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mx)) {
            return false;
        }
        mx mxVar = (mx) obj;
        return a(mxVar.a, this.a) && a(mxVar.b, this.b);
    }

    public final int hashCode() {
        T t = this.a;
        int i = 0;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 7 + String.valueOf(valueOf2).length());
        sb.append("Pair{");
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
