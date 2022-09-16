package defpackage;
/* compiled from: PG */
/* renamed from: anah  reason: default package */
/* loaded from: classes2.dex */
public final class anah {
    @dzsi
    public static String a(String str, int i) {
        if (str == null || str.length() <= i) {
            return str;
        }
        String d = dbtw.d(str, i - 3);
        StringBuilder sb = new StringBuilder(d.length() + 3);
        sb.append(d);
        sb.append("...");
        return sb.toString();
    }
}
