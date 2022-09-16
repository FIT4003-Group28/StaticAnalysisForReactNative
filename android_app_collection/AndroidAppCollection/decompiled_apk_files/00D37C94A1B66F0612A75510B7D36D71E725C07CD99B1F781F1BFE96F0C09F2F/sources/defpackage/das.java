package defpackage;
/* compiled from: PG */
/* renamed from: das  reason: default package */
/* loaded from: classes3.dex */
public final class das {
    public final String a;

    private das(String str) {
        this.a = str;
    }

    public das(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        this.a = sb.toString();
    }

    public static das a(pwu pwuVar) {
        String str;
        pwuVar.H(2);
        int i = pwuVar.i();
        int i2 = i >> 1;
        int i3 = (pwuVar.i() >> 3) | ((i & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else if (i2 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = i3 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        return new das(sb.toString());
    }
}
