package defpackage;
/* compiled from: PG */
/* renamed from: bvpb  reason: default package */
/* loaded from: classes.dex */
public final class bvpb {
    public static String a(int i) {
        int i2 = i / 1000000;
        int abs = Math.abs(i - (i2 * 1000000));
        StringBuilder sb = new StringBuilder();
        if (i < 0 && i2 == 0) {
            sb.append("-");
            i2 = 0;
        }
        sb.append(i2);
        if (abs > 0) {
            sb.append(".");
            sb.append(String.valueOf(abs + 1000000).substring(1));
        }
        return sb.toString();
    }

    public static CharSequence b(@dzsi CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    public static boolean c(@dzsi CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
