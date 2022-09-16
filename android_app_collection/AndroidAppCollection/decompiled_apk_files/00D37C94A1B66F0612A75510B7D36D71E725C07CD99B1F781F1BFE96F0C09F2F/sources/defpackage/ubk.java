package defpackage;
/* compiled from: PG */
/* renamed from: ubk  reason: default package */
/* loaded from: classes4.dex */
public final class ubk {
    public final int a;
    public final String b;
    public final Throwable c;
    public final int d;

    public ubk(int i, int i2, String str, Throwable th) {
        this.d = i;
        this.a = i2;
        this.b = str;
        this.c = th;
    }

    public static ubk a(int i, Throwable th) {
        return new ubk(i, -1, th.getMessage(), th);
    }

    public static ubk b() {
        return new ubk(2, -1, null, null);
    }

    public static ubk c(String str) {
        return new ubk(3, -1, str, null);
    }
}
