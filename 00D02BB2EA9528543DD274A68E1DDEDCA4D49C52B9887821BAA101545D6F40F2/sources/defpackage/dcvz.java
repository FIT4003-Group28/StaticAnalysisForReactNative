package defpackage;
/* compiled from: PG */
/* renamed from: dcvz  reason: default package */
/* loaded from: classes5.dex */
public final class dcvz {
    public final dcvf a;
    public final double b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    private final dcuv g;
    private dcuv h;

    public dcvz(dcvf dcvfVar, double d) {
        this.a = dcvfVar;
        this.b = d;
        if (dcvfVar.k()) {
            double d2 = 1.0d + d;
            double d3 = -d2;
            this.g = new dcuv(new dcuu(d3, d2), new dcuu(d3, d2));
            double d4 = -d;
            this.h = new dcuv(new dcuu(d4, d), new dcuu(d4, d));
            this.d = 0;
            this.c = 0;
            this.e = dcvfVar.g() & 1;
            this.f = 0;
            return;
        }
        long w = dcvfVar.w();
        int x = dcvf.x(w);
        int y = dcvf.y(w);
        this.e = dcvf.z(w);
        int h = dcvfVar.h();
        this.f = h;
        this.g = dcvf.C(x, y, h).b(d);
        int i = -dcvf.i(h);
        this.c = x & i;
        this.d = i & y;
    }

    public final dcuv a() {
        if (this.h == null) {
            int i = dcvf.i(this.f);
            dcwz dcwzVar = dcwz.f;
            long j = this.c;
            long j2 = i;
            double a = dcwzVar.a(dcwz.d(j + j + j2));
            dcwz dcwzVar2 = dcwz.f;
            long j3 = this.d;
            double a2 = dcwzVar2.a(dcwz.d(j3 + j3 + j2));
            double d = this.b;
            dcuu dcuuVar = new dcuu(a - d, a + d);
            double d2 = this.b;
            this.h = new dcuv(dcuuVar, new dcuu(a2 - d2, a2 + d2));
        }
        return this.h;
    }

    public dcvz(dcvz dcvzVar, int i, int i2, int i3) {
        this.b = dcvzVar.b;
        dcuv dcuvVar = new dcuv(dcvzVar.g);
        this.g = dcuvVar;
        int i4 = 1;
        int i5 = dcvzVar.f + 1;
        this.f = i5;
        dcvf dcvfVar = dcvzVar.a;
        this.a = new dcvf(dcvfVar.b + (((i + i) - 3) * (dcvfVar.A() >>> 2)));
        int i6 = dcvf.i(i5);
        this.c = dcvzVar.c + (i2 * i6);
        this.d = dcvzVar.d + (i6 * i3);
        this.e = dcvc.a(i) ^ dcvzVar.e;
        dcuv a = dcvzVar.a();
        int i7 = i2 == 0 ? 2 : 1;
        dcut.b(i7, dcuvVar.a, dcut.a(i7, a.a));
        i4 = 1 != i3 ? 2 : i4;
        dcut.b(i4, dcuvVar.b, dcut.a(i4, a.b));
    }
}
