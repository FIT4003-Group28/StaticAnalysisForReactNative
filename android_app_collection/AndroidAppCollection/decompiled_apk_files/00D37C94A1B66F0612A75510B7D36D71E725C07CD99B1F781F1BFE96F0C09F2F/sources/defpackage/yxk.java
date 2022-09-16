package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
/* compiled from: PG */
/* renamed from: yxk  reason: default package */
/* loaded from: classes4.dex */
public final class yxk {
    static final int a = zhn.r(0, 3);
    static final int b = zhn.r(3, 3);
    static final int c = zhn.r(6, 4);
    static final int d = zhn.r(10, 4);
    static final int e = zhn.r(14, 5);
    public static final int f = zhn.r(19, 7);
    public static final int g = zhn.r(26, 7);
    static final int h = zhn.r(33, 3);
    static final int i = zhn.r(36, 2);
    static final int j = zhn.r(38, 1);
    static final int k = zhn.r(39, 1);
    static final int l = zhn.r(40, 3);
    static final int m = zhn.r(43, 5);
    static final int n = zhn.r(48, 9);
    static final int o = zhn.r(57, 4);
    static final int p = zhn.r(61, 3);
    public final int q;
    public final int r;
    public final int s;
    private final long t;

    public yxk(long j2) {
        long j3 = j2;
        long nextLong = ThreadLocalRandom.current().nextLong();
        if (j3 == 0) {
            int i2 = c;
            long y = zhn.y(j3, i2, zhn.v(i2) >> 1);
            int i3 = d;
            long y2 = zhn.y(y, i3, zhn.v(i3) >> 1);
            int i4 = i;
            j3 = zhn.x(zhn.x(zhn.x(zhn.y(y2, i4, zhn.v(i4) >> 1), e, 5000L, 250L, 250L), f, 500L, 50L, 50L), g, 1000L, 50L, 50L);
        }
        this.t = j3;
        int d2 = d(a);
        int d3 = d(b);
        int d4 = d(h);
        if (d2 != 0 && !e(c, nextLong)) {
            d2 = 7;
        }
        this.q = d2;
        if (d3 != 0 && !e(d, nextLong)) {
            d3 = 7;
        }
        this.r = d3;
        if (d4 != 0 && !e(i, nextLong)) {
            d4 = 7;
        }
        this.s = d4;
    }

    public static long c(avff avffVar) {
        aver averVar = avffVar.i;
        if (averVar == null) {
            averVar = aver.a;
        }
        avfc avfcVar = avffVar.l;
        if (avfcVar == null) {
            avfcVar = avfc.a;
        }
        avew avewVar = avffVar.j;
        if (avewVar == null) {
            avewVar = avew.a;
        }
        long j2 = 0;
        long y = zhn.y(zhn.y(zhn.y(zhn.y(zhn.y(zhn.y(zhn.y(zhn.y(zhn.y(zhn.y(0L, a, averVar.g), b, avfcVar.c), h, avewVar.b), c, averVar.h), d, avfcVar.d), i, avewVar.c), n, avffVar.n), l, averVar.i), m, averVar.j), j, true != avfcVar.e ? 0L : 1L);
        int i2 = k;
        if (true == avewVar.d) {
            j2 = 1;
        }
        return zhn.x(zhn.x(zhn.x(zhn.x(zhn.y(zhn.y(y, i2, j2), p, averVar.l), e, averVar.b, 250L, 250L), f, averVar.e, 50L, 50L), g, averVar.f, 50L, 50L), o, averVar.k, 0L, 200L);
    }

    private final int d(int i2) {
        return (int) zhn.w(this.t, i2);
    }

    private final boolean e(int i2, long j2) {
        long d2 = d(i2);
        return d2 > 0 && ((j2 >> zhn.s(i2)) & zhn.v(i2)) <= d2;
    }

    public final int a(int i2, int i3, int i4) {
        return (int) ((zhn.w(this.t, i2) * i4) + i3);
    }

    public final int b() {
        return a(e, 250, 250);
    }
}
