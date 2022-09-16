package defpackage;
/* compiled from: PG */
/* renamed from: clyr  reason: default package */
/* loaded from: classes5.dex */
public final class clyr implements clun {
    private final clys a = new clys(null);
    private final cmnk b = new cmnk(16384);
    private boolean c;

    static {
        int i = clyq.a;
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.a.b(clupVar, new cmaj(0, 1));
        clupVar.RS();
        clupVar.b(new clvf(-9223372036854775807L));
    }

    @Override // defpackage.clun
    public final void e(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        r15.i();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
        if ((r4 - r3) < 8192) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        return false;
     */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.cluk r15) {
        /*
            r14 = this;
            cmnk r0 = new cmnk
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.a
            r15.f(r4, r2, r1)
            r0.f(r2)
            int r4 = r0.o()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L90
            r15.i()
            r15.h(r3)
            r4 = r3
        L22:
            r1 = 0
        L23:
            byte[] r5 = r0.a
            r7 = 7
            r15.f(r5, r2, r7)
            r0.f(r2)
            int r5 = r0.m()
            r8 = 44096(0xac40, float:6.1792E-41)
            r9 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r8) goto L4a
            if (r5 == r9) goto L4a
            r15.i()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r5) goto L46
            return r2
        L46:
            r15.h(r4)
            goto L22
        L4a:
            r8 = 1
            int r1 = r1 + r8
            r10 = 4
            if (r1 >= r10) goto L8f
            byte[] r8 = r0.a
            int r11 = defpackage.clrb.a
            int r11 = r8.length
            r12 = -1
            if (r11 >= r7) goto L59
            r11 = -1
            goto L86
        L59:
            r11 = 2
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r13 = r8[r6]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r11 = r11 | r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 != r13) goto L80
            r10 = r8[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r11 = 5
            r11 = r8[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r10 = r10 | r11
            r11 = 6
            r8 = r8[r11]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r11 = r10 | r8
            goto L81
        L80:
            r7 = 4
        L81:
            if (r5 != r9) goto L85
            int r7 = r7 + 2
        L85:
            int r11 = r11 + r7
        L86:
            if (r11 != r12) goto L89
            return r2
        L89:
            int r11 = r11 + (-7)
            r15.h(r11)
            goto L23
        L8f:
            return r8
        L90:
            r0.h(r6)
            int r4 = r0.u()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r15.h(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clyr.f(cluk):boolean");
    }

    @Override // defpackage.clun
    public final int g(cluk clukVar, clvd clvdVar) {
        int a = clukVar.a(this.b.a, 0, 16384);
        if (a == -1) {
            return -1;
        }
        this.b.f(0);
        this.b.e(a);
        if (!this.c) {
            this.a.a = 0L;
            this.c = true;
        }
        this.a.d(this.b);
        return 0;
    }
}
