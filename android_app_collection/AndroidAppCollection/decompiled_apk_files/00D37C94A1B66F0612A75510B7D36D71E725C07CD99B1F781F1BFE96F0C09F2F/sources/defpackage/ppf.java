package defpackage;
/* compiled from: PG */
/* renamed from: ppf  reason: default package */
/* loaded from: classes4.dex */
final class ppf extends ppo {
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
    public ppf(defpackage.pkt r8, long r9, long r11) {
        /*
            r7 = this;
            r7.<init>(r8)
            int r0 = r8.p()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L7b
            pks r0 = new pks
            r0.<init>()
            pks r8 = r8.y(r2, r0)
            r3 = 0
            long r9 = java.lang.Math.max(r3, r9)
            boolean r0 = r8.l
            if (r0 != 0) goto L2d
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L2d
            boolean r0 = r8.h
            if (r0 == 0) goto L27
            goto L2d
        L27:
            ppg r8 = new ppg
            r8.<init>(r1)
            throw r8
        L2d:
            r5 = -9223372036854775808
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L36
            long r11 = r8.n
            goto L3a
        L36:
            long r11 = java.lang.Math.max(r3, r11)
        L3a:
            long r3 = r8.n
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
            ppg r8 = new ppg
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
            long r8 = r8.n
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
            ppg r8 = new ppg
            r8.<init>(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ppf.<init>(pkt, long, long):void");
    }

    @Override // defpackage.ppo, defpackage.pkt
    public final pkr e(int i, pkr pkrVar, boolean z) {
        this.a.e(0, pkrVar, z);
        long j = pkrVar.e - this.b;
        long j2 = this.e;
        pkrVar.i(pkrVar.a, pkrVar.b, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j);
        return pkrVar;
    }

    @Override // defpackage.ppo, defpackage.pkt
    public final pks g(int i, pks pksVar, long j) {
        this.a.g(0, pksVar, 0L);
        long j2 = pksVar.q;
        long j3 = this.b;
        pksVar.q = j2 + j3;
        pksVar.n = this.e;
        pksVar.i = this.f;
        long j4 = pksVar.m;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            pksVar.m = max;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            pksVar.m = max;
            pksVar.m = max - this.b;
        }
        long d = phk.d(this.b);
        long j6 = pksVar.e;
        if (j6 != -9223372036854775807L) {
            pksVar.e = j6 + d;
        }
        long j7 = pksVar.f;
        if (j7 != -9223372036854775807L) {
            pksVar.f = j7 + d;
        }
        return pksVar;
    }
}
