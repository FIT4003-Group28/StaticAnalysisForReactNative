package defpackage;
/* compiled from: PG */
/* renamed from: dclc  reason: default package */
/* loaded from: classes5.dex */
abstract class dclc<E> implements dcla<E> {
    public final boolean equals(Object obj) {
        if (obj instanceof dcla) {
            dcla dclaVar = (dcla) obj;
            if (b() == dclaVar.b() && dbsd.a(a(), dclaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        E a = a();
        return (a == null ? 0 : a.hashCode()) ^ b();
    }

    public final String toString() {
        String valueOf = String.valueOf(a());
        int b = b();
        if (b == 1) {
            return valueOf;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append(valueOf);
        sb.append(" x ");
        sb.append(b);
        return sb.toString();
    }
}
