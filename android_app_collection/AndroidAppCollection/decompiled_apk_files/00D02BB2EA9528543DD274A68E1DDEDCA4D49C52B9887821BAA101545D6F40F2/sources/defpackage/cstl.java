package defpackage;
/* compiled from: PG */
/* renamed from: cstl  reason: default package */
/* loaded from: classes5.dex */
public final class cstl {
    public static void a(String str) {
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "LT_".concat(valueOf) : new String("LT_");
        if (concat.length() > 23) {
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 33);
            sb.append("Log tag ");
            sb.append(concat);
            sb.append(" is longer than 23 chars.");
            sb.toString();
        }
    }
}
