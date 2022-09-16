package defpackage;
/* compiled from: PG */
/* renamed from: ryp  reason: default package */
/* loaded from: classes4.dex */
public final class ryp {
    public static final amvn a = amvn.u(13, 207, 103, 407);
    public static final amvn b = amvn.u(14, 203, 110, 403);
    public final String c;
    public final int d;
    public final int e;
    public final int f;

    private ryp(int i, int i2, String str, int i3) {
        this.e = i;
        this.f = i2;
        this.c = str;
        this.d = i3;
    }

    public static ryp a(int i, String str) {
        str.getClass();
        return new ryp(1, i, str, 0);
    }

    public static ryp b(int i) {
        return new ryp(2, 2, null, i);
    }

    public static ryp c(int i, int i2) {
        return new ryp(3, i, null, i2);
    }
}
