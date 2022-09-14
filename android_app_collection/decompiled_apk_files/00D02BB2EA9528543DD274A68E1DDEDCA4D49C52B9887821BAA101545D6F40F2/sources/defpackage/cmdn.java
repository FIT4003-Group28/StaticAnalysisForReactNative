package defpackage;
/* compiled from: PG */
/* renamed from: cmdn  reason: default package */
/* loaded from: classes5.dex */
final class cmdn extends cmdw {
    private final long b;
    private final long d;
    private final long e;
    private final boolean f;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
        if (r11 == r8) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cmdn(defpackage.clpb r8, long r9, long r11) {
        /*
            r7 = this;
            r7.<init>(r8)
            int r0 = r8.s()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L7b
            clpa r0 = new clpa
            r0.<init>()
            clpa r8 = r8.u(r2, r0)
            r3 = 0
            long r9 = java.lang.Math.max(r3, r9)
            boolean r0 = r8.k
            if (r0 != 0) goto L2d
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L2d
            boolean r0 = r8.h
            if (r0 == 0) goto L27
            goto L2d
        L27:
            cmdo r8 = new cmdo
            r8.<init>(r1)
            throw r8
        L2d:
            r5 = -9223372036854775808
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L36
            long r11 = r8.o
            goto L3a
        L36:
            long r11 = java.lang.Math.max(r3, r11)
        L3a:
            long r3 = r8.o
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L56
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L4a
            r11 = r3
        L4a:
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L4f
            goto L56
        L4f:
            cmdo r8 = new cmdo
            r9 = 2
            r8.<init>(r9)
            throw r8
        L56:
            r7.b = r9
            r7.d = r11
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L60
            r9 = r5
            goto L62
        L60:
            long r9 = r11 - r9
        L62:
            r7.e = r9
            boolean r9 = r8.i
            if (r9 == 0) goto L77
            int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r9 == 0) goto L78
            long r8 = r8.o
            int r10 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r10 == 0) goto L77
            int r10 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r10 != 0) goto L77
            goto L78
        L77:
            r1 = 0
        L78:
            r7.f = r1
            return
        L7b:
            cmdo r8 = new cmdo
            r8.<init>(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmdn.<init>(clpb, long, long):void");
    }

    @Override // defpackage.cmdw, defpackage.clpb
    public final clpa f(int i, clpa clpaVar, long j) {
        this.a.f(0, clpaVar, 0L);
        long j2 = clpaVar.p;
        long j3 = this.b;
        clpaVar.p = j2 + j3;
        clpaVar.o = this.e;
        clpaVar.i = this.f;
        long j4 = clpaVar.n;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            clpaVar.n = max;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            clpaVar.n = max;
            clpaVar.n = max - this.b;
        }
        long a = cllt.a(this.b);
        long j6 = clpaVar.e;
        if (j6 != -9223372036854775807L) {
            clpaVar.e = j6 + a;
        }
        long j7 = clpaVar.f;
        if (j7 != -9223372036854775807L) {
            clpaVar.f = j7 + a;
        }
        return clpaVar;
    }

    @Override // defpackage.cmdw, defpackage.clpb
    public final cloz h(int i, cloz clozVar, boolean z) {
        this.a.h(0, clozVar, z);
        long j = clozVar.e - this.b;
        long j2 = this.e;
        clozVar.i(clozVar.a, clozVar.b, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j);
        return clozVar;
    }
}
