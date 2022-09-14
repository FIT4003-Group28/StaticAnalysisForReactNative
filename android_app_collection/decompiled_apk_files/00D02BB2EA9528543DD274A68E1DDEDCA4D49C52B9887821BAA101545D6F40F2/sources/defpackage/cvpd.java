package defpackage;
/* compiled from: PG */
/* renamed from: cvpd  reason: default package */
/* loaded from: classes5.dex */
public final class cvpd {
    public static String a(String str, String str2) {
        if (str == null) {
            str = "Anonymous";
        }
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("::");
        sb.append(str2);
        return sb.toString();
    }

    public static String b(String str, String str2) {
        if (str == null) {
            str = "Anonymous";
        }
        StringBuilder sb = new StringBuilder(str.length() + 11 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("::");
        sb.append("SUMMARY");
        sb.append("::");
        sb.append(str2);
        return sb.toString();
    }

    public static int c(String str, @dzsi String str2, int i) {
        if (str2 == null) {
            str2 = "NO_ACTION";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + str2.length());
        sb.append(str);
        sb.append(":e:");
        sb.append(i);
        sb.append(":a:");
        sb.append(str2);
        return sb.toString().hashCode();
    }
}
