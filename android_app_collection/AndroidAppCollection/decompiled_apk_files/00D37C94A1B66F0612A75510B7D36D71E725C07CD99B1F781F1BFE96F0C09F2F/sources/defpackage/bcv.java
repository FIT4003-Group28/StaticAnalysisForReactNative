package defpackage;
/* compiled from: PG */
/* renamed from: bcv  reason: default package */
/* loaded from: classes2.dex */
public final class bcv implements aze {
    private final bcw a = new bcw();
    private final pwu b = new pwu(2786);
    private boolean c;

    @Override // defpackage.aze
    public final int d(azf azfVar, azv azvVar) {
        int g = azfVar.g(this.b.a, 0, 2786);
        if (g == -1) {
            return -1;
        }
        this.b.G(0);
        this.b.F(g);
        if (!this.c) {
            this.a.a = 0L;
            this.c = true;
        }
        this.a.a(this.b);
        return 0;
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.a.b(azhVar, new bef(0, 1));
        azhVar.b();
        azhVar.ry(new azx(-9223372036854775807L));
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        this.c = false;
        this.a.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
        if ((r5 - r3) < 8192) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        r14.l();
        r5 = r5 + 1;
     */
    @Override // defpackage.aze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.azf r14) {
        /*
            r13 = this;
            pwu r0 = new pwu
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.a
            r14.j(r4, r2, r1)
            r0.G(r2)
            int r4 = r0.k()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r4 == r5) goto L80
            r14.l()
            r14.f(r3)
            r5 = r3
        L22:
            r4 = 0
        L23:
            byte[] r7 = r0.a
            r8 = 6
            r14.j(r7, r2, r8)
            r0.G(r2)
            int r7 = r0.m()
            r9 = 2935(0xb77, float:4.113E-42)
            if (r7 == r9) goto L44
            r14.l()
            int r5 = r5 + 1
            int r4 = r5 - r3
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r4 < r7) goto L40
            return r2
        L40:
            r14.f(r5)
            goto L22
        L44:
            r7 = 1
            int r4 = r4 + r7
            r9 = 4
            if (r4 >= r9) goto L7f
            byte[] r10 = r0.a
            int[] r11 = defpackage.ayn.a
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
            int r8 = defpackage.ayn.a(r8, r7)
        L76:
            if (r8 != r12) goto L79
            return r2
        L79:
            int r8 = r8 + (-6)
            r14.f(r8)
            goto L23
        L7f:
            return r7
        L80:
            r0.H(r6)
            int r4 = r0.h()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r14.f(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcv.h(azf):boolean");
    }
}
