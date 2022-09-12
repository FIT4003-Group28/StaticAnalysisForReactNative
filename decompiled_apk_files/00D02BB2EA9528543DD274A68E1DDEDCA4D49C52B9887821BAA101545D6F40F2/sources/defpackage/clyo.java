package defpackage;
/* compiled from: PG */
/* renamed from: clyo  reason: default package */
/* loaded from: classes5.dex */
public final class clyo implements clun {
    private final clyp a = new clyp();
    private final cmnk b = new cmnk(2786);
    private boolean c;

    static {
        int i = clyn.a;
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
        if ((r5 - r3) < 8192) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        r14.i();
        r5 = r5 + 1;
     */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.cluk r14) {
        /*
            r13 = this;
            cmnk r0 = new cmnk
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.a
            r14.f(r4, r2, r1)
            r0.f(r2)
            int r4 = r0.o()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L80
            r14.i()
            r14.h(r3)
            r5 = r3
        L22:
            r4 = 0
        L23:
            byte[] r7 = r0.a
            r8 = 6
            r14.f(r7, r2, r8)
            r0.f(r2)
            int r7 = r0.m()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r7 == r9) goto L44
            r14.i()
            int r5 = r5 + 1
            int r4 = r5 - r3
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r4 < r7) goto L40
            return r2
        L40:
            r14.h(r5)
            goto L22
        L44:
            r7 = 1
            int r4 = r4 + r7
            r9 = 4
            if (r4 >= r9) goto L7f
            byte[] r10 = r0.a
            int[] r11 = defpackage.clqz.a
            int r11 = r10.length
            r12 = -1
            if (r11 >= r8) goto L53
            r8 = -1
            goto L76
        L53:
            r11 = 5
            r11 = r10[r11]
            r11 = r11 & 248(0xf8, float:3.48E-43)
            int r11 = r11 >> r6
            if (r11 <= r1) goto L6a
            r8 = 2
            r8 = r10[r8]
            r8 = r8 & 7
            int r8 = r8 << 8
            r9 = r10[r6]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r8 = r8 | r9
            int r8 = r8 + r7
            int r8 = r8 + r8
            goto L76
        L6a:
            r7 = r10[r9]
            r9 = r7 & 192(0xc0, float:2.69E-43)
            int r8 = r9 >> 6
            r7 = r7 & 63
            int r8 = defpackage.clqz.a(r8, r7)
        L76:
            if (r8 != r12) goto L79
            return r2
        L79:
            int r8 = r8 + (-6)
            r14.h(r8)
            goto L23
        L7f:
            return r7
        L80:
            r0.h(r6)
            int r4 = r0.u()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r14.h(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clyo.f(cluk):boolean");
    }

    @Override // defpackage.clun
    public final int g(cluk clukVar, clvd clvdVar) {
        int a = clukVar.a(this.b.a, 0, 2786);
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
