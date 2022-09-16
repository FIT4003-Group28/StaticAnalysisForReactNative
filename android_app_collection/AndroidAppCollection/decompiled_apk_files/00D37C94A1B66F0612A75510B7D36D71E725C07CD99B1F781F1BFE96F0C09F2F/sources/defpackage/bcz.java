package defpackage;
/* compiled from: PG */
/* renamed from: bcz  reason: default package */
/* loaded from: classes2.dex */
public final class bcz implements aze {
    private final bda a;
    private final pwu b;
    private final pwu c;
    private final pwt d;
    private azh e;
    private long f;
    private long g;
    private boolean h;
    private boolean i;

    public bcz() {
        this(null);
    }

    @Override // defpackage.aze
    public final int d(azf azfVar, azv azvVar) {
        ptx.b(this.e);
        int g = azfVar.g(this.b.a, 0, 2048);
        if (!this.i) {
            this.e.ry(new azx(-9223372036854775807L));
            this.i = true;
        }
        if (g == -1) {
            return -1;
        }
        this.b.G(0);
        this.b.F(g);
        if (!this.h) {
            this.a.b = this.f;
            this.h = true;
        }
        this.a.a(this.b);
        return 0;
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.e = azhVar;
        this.a.b(azhVar, new bef(0, 1));
        azhVar.b();
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        this.h = false;
        this.a.f();
        this.f = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        r9.l();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        if ((r3 - r1) < 8192) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        return false;
     */
    @Override // defpackage.aze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.azf r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            pwu r2 = r8.c
            byte[] r2 = r2.a
            r3 = 10
            r9.j(r2, r0, r3)
            pwu r2 = r8.c
            r2.G(r0)
            pwu r2 = r8.c
            int r2 = r2.k()
            r3 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r3) goto L84
            r9.l()
            r9.f(r1)
            long r2 = r8.g
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2c
            long r2 = (long) r1
            r8.g = r2
        L2c:
            r3 = r1
        L2d:
            r2 = 0
            r4 = 0
        L2f:
            pwu r5 = r8.c
            byte[] r5 = r5.a
            r6 = 2
            r9.j(r5, r0, r6)
            pwu r5 = r8.c
            r5.G(r0)
            pwu r5 = r8.c
            int r5 = r5.m()
            boolean r5 = defpackage.bda.g(r5)
            if (r5 != 0) goto L58
            r9.l()
            int r3 = r3 + 1
            int r2 = r3 - r1
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L54
            return r0
        L54:
            r9.f(r3)
            goto L2d
        L58:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L63
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 > r7) goto L62
            goto L63
        L62:
            return r5
        L63:
            pwu r5 = r8.c
            byte[] r5 = r5.a
            r9.j(r5, r0, r6)
            pwt r5 = r8.d
            r6 = 14
            r5.j(r6)
            pwt r5 = r8.d
            r6 = 13
            int r5 = r5.d(r6)
            r6 = 6
            if (r5 > r6) goto L7d
            return r0
        L7d:
            int r6 = r5 + (-6)
            r9.f(r6)
            int r4 = r4 + r5
            goto L2f
        L84:
            pwu r2 = r8.c
            r3 = 3
            r2.H(r3)
            pwu r2 = r8.c
            int r2 = r2.h()
            int r3 = r2 + 10
            int r1 = r1 + r3
            r9.f(r2)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcz.h(azf):boolean");
    }

    public bcz(byte[] bArr) {
        this.a = new bda(true, null);
        this.b = new pwu(2048);
        this.g = -1L;
        pwu pwuVar = new pwu(10);
        this.c = pwuVar;
        this.d = new pwt(pwuVar.a);
    }
}
