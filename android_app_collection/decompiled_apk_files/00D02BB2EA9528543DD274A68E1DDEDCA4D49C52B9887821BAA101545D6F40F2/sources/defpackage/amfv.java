package defpackage;
/* compiled from: PG */
/* renamed from: amfv  reason: default package */
/* loaded from: classes.dex */
public final class amfv {
    public static String a(String str) {
        if (str.startsWith("//")) {
            String valueOf = String.valueOf(str);
            return valueOf.length() != 0 ? "https:".concat(valueOf) : new String("https:");
        }
        return str;
    }
}
