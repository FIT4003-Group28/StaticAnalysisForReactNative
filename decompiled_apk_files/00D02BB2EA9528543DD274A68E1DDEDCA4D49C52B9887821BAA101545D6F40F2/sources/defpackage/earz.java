package defpackage;
/* compiled from: PG */
/* renamed from: earz  reason: default package */
/* loaded from: classes6.dex */
public abstract class earz implements easb {
    public long a(Object obj, eaok eaokVar) {
        return eaor.a();
    }

    public eaok b(Object obj, eaou eaouVar) {
        return earp.X(eaouVar);
    }

    public int[] c(eapt eaptVar, Object obj, eaok eaokVar) {
        return eaokVar.g(eaptVar, a(obj, eaokVar));
    }

    public int[] d(eapt eaptVar, Object obj, eaok eaokVar, eatp eatpVar) {
        return c(eaptVar, obj, eaokVar);
    }

    public eaok e(Object obj) {
        return eaor.d(null);
    }

    public final String toString() {
        String name = f() == null ? "null" : f().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 11);
        sb.append("Converter[");
        sb.append(name);
        sb.append("]");
        return sb.toString();
    }
}
