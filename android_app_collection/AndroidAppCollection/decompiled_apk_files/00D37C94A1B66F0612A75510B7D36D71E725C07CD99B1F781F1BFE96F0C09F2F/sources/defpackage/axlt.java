package defpackage;
/* compiled from: PG */
/* renamed from: axlt  reason: default package */
/* loaded from: classes2.dex */
abstract class axlt implements axmc {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axmc axmcVar = (axmc) obj;
        return a() == axmcVar.a() && b() == axmcVar.b();
    }

    public final String toString() {
        int a = a();
        long b = b();
        StringBuilder sb = new StringBuilder(35);
        sb.append("P(");
        sb.append(a);
        sb.append("|");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
