package defpackage;
/* compiled from: PG */
/* renamed from: btld  reason: default package */
/* loaded from: classes4.dex */
public abstract class btld {
    public static btld c(int i, int i2) {
        if (i < 0 || i >= 24) {
            bvoo.h("hour should be in range [0, 23]: got %d", Integer.valueOf(i));
            i = deay.d(i, 24);
        }
        if (i2 < 0 || i2 >= 60) {
            bvoo.h("minute should be in range [0, 59]: got %d", Integer.valueOf(i2));
            i2 = deay.d(i2, 60);
        }
        return new btky(i, i2);
    }

    public static btld d(int i) {
        return c(i / 60, i % 60);
    }

    public abstract int a();

    public abstract int b();

    public final int e() {
        return (a() * 60) + b();
    }
}
