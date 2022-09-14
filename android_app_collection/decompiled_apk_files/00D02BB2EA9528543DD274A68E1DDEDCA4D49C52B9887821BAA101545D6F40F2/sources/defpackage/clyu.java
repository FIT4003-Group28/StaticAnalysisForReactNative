package defpackage;
/* compiled from: PG */
/* renamed from: clyu  reason: default package */
/* loaded from: classes5.dex */
public final class clyu implements clun {
    private final clyv a;
    private final cmnk b;
    private final cmnk c;
    private final cmnj d;
    private clup e;
    private long f;
    private long g;
    private boolean h;
    private boolean i;

    static {
        int i = clyt.a;
    }

    public clyu() {
        this(null);
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.e = clupVar;
        this.a.b(clupVar, new cmaj(0, 1));
        clupVar.RS();
    }

    @Override // defpackage.clun
    public final void e(long j, long j2) {
        this.h = false;
        this.a.g();
        this.f = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
        r9.i();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
        if ((r3 - r1) < 8192) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
        return false;
     */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.cluk r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
        L2:
            cmnk r2 = r8.c
            byte[] r2 = r2.a
            r3 = 10
            r9.f(r2, r0, r3)
            cmnk r2 = r8.c
            r2.f(r0)
            cmnk r2 = r8.c
            int r2 = r2.o()
            r3 = 4801587(0x494433, float:6.728456E-39)
            if (r2 == r3) goto L84
            r9.i()
            r9.h(r1)
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
            cmnk r5 = r8.c
            byte[] r5 = r5.a
            r6 = 2
            r9.f(r5, r0, r6)
            cmnk r5 = r8.c
            r5.f(r0)
            cmnk r5 = r8.c
            int r5 = r5.m()
            boolean r5 = defpackage.clyv.f(r5)
            if (r5 != 0) goto L58
            r9.i()
            int r3 = r3 + 1
            int r2 = r3 - r1
            r4 = 8192(0x2000, float:1.14794E-41)
            if (r2 < r4) goto L54
            return r0
        L54:
            r9.h(r3)
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
            cmnk r5 = r8.c
            byte[] r5 = r5.a
            r9.f(r5, r0, r6)
            cmnj r5 = r8.d
            r6 = 14
            r5.f(r6)
            cmnj r5 = r8.d
            r6 = 13
            int r5 = r5.j(r6)
            r6 = 6
            if (r5 > r6) goto L7d
            return r0
        L7d:
            int r6 = r5 + (-6)
            r9.h(r6)
            int r4 = r4 + r5
            goto L2f
        L84:
            cmnk r2 = r8.c
            r3 = 3
            r2.h(r3)
            cmnk r2 = r8.c
            int r2 = r2.u()
            int r3 = r2 + 10
            int r1 = r1 + r3
            r9.h(r2)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clyu.f(cluk):boolean");
    }

    @Override // defpackage.clun
    public final int g(cluk clukVar, clvd clvdVar) {
        cmmn.e(this.e);
        int a = clukVar.a(this.b.a, 0, 2048);
        if (!this.i) {
            this.e.b(new clvf(-9223372036854775807L));
            this.i = true;
        }
        if (a == -1) {
            return -1;
        }
        this.b.f(0);
        this.b.e(a);
        if (!this.h) {
            this.a.b = this.f;
            this.h = true;
        }
        this.a.d(this.b);
        return 0;
    }

    public clyu(byte[] bArr) {
        this.a = new clyv(true, null);
        this.b = new cmnk(2048);
        this.g = -1L;
        cmnk cmnkVar = new cmnk(10);
        this.c = cmnkVar;
        this.d = new cmnj(cmnkVar.a);
    }
}
