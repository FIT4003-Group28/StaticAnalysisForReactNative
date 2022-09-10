package defpackage;
/* compiled from: PG */
/* renamed from: cyez  reason: default package */
/* loaded from: classes5.dex */
public final class cyez {
    public static final dbrb a = dbrb.n('.');

    public static String a(String str) {
        String lowerCase = str.trim().toLowerCase();
        if (lowerCase.endsWith("@gmail.com") || lowerCase.endsWith("@googlemail.com")) {
            StringBuilder sb = new StringBuilder(lowerCase.length());
            sb.append(a.h(lowerCase.substring(0, lowerCase.lastIndexOf(64))));
            sb.append("@gmail.com");
            return sb.toString();
        }
        return lowerCase;
    }
}
