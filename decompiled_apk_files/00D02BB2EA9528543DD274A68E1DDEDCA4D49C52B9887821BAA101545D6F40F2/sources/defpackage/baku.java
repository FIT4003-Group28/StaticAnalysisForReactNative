package defpackage;
/* compiled from: PG */
/* renamed from: baku  reason: default package */
/* loaded from: classes3.dex */
public class baku {
    public final int a;
    private final int b;

    public baku(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    public static baku a() {
        return new baku(1, 0);
    }

    public static baku b() {
        return new baku(2, 100);
    }

    public final boolean c() {
        return this.b == 2;
    }

    public final boolean d() {
        return this.b == 6;
    }
}
