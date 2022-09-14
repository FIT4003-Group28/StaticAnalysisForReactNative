package defpackage;
/* compiled from: PG */
/* renamed from: crfk  reason: default package */
/* loaded from: classes5.dex */
public abstract class crfk {
    public abstract String a();

    @dzsi
    public abstract dspd b();

    public final String toString() {
        dspd b = b();
        if (b == null || dspd.b.equals(b)) {
            return a();
        }
        String a = a();
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 10);
        sb.append("NLG_Data[");
        sb.append(a);
        sb.append("]");
        return sb.toString();
    }
}
