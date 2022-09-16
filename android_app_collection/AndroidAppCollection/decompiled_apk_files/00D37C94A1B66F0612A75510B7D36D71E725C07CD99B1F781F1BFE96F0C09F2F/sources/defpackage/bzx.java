package defpackage;
/* compiled from: PG */
/* renamed from: bzx  reason: default package */
/* loaded from: classes2.dex */
public final class bzx {
    public Object a;
    public Object b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jj)) {
            return false;
        }
        jj jjVar = (jj) obj;
        return a(jjVar.a, this.a) && a(jjVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
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
