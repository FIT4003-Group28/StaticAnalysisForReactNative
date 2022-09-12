package defpackage;
/* compiled from: PG */
/* renamed from: cmoc  reason: default package */
/* loaded from: classes5.dex */
public final class cmoc {
    public final String a;

    private cmoc(String str) {
        this.a = str;
    }

    public static cmoc a(cmnk cmnkVar) {
        String str;
        cmnkVar.h(2);
        int l = cmnkVar.l();
        int i = l >> 1;
        int l2 = (cmnkVar.l() >> 3) | ((l & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder(str.length() + 26);
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(".0");
        sb.append(l2);
        return new cmoc(sb.toString());
    }
}
