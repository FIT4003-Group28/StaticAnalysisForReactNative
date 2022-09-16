package defpackage;
/* compiled from: PG */
/* renamed from: aahd  reason: default package */
/* loaded from: classes.dex */
public final class aahd extends Exception {
    public final int a;
    public volatile boolean b;
    public final int c;
    public final int d;

    private aahd(Throwable th, int i, int i2, int i3) {
        super(th);
        this.b = false;
        this.a = i;
        this.c = i2;
        this.d = i3;
    }

    public static aahd a(Throwable th, int i) {
        return b(th, -1, i, 5);
    }

    public static aahd b(Throwable th, int i, int i2, int i3) {
        if (th instanceof aahd) {
            return (aahd) th;
        }
        return new aahd(th, i, i2, i3);
    }

    public static aahd c(Throwable th, int i) {
        return b(th, i, 4, 5);
    }
}
