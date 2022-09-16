package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eava  reason: default package */
/* loaded from: classes6.dex */
public final class eava extends eaou {
    private static final long serialVersionUID = 6941492635554961361L;
    final int a;
    final eavd e;
    final eavd f;

    public eava(String str, int i, eavd eavdVar, eavd eavdVar2) {
        super(str);
        this.a = i;
        this.e = eavdVar;
        this.f = eavdVar2;
    }

    private final eavd g(long j) {
        long j2;
        int i = this.a;
        eavd eavdVar = this.e;
        eavd eavdVar2 = this.f;
        try {
            j2 = eavdVar.b(j, i, eavdVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            j2 = j;
        }
        try {
            j = eavdVar2.b(j, i, eavdVar.c);
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return j2 > j ? eavdVar : eavdVar2;
    }

    @Override // defpackage.eaou
    public final String a(long j) {
        return g(j).b;
    }

    @Override // defpackage.eaou
    public final int b(long j) {
        return this.a + g(j).c;
    }

    @Override // defpackage.eaou
    public final int c(long j) {
        return this.a;
    }

    @Override // defpackage.eaou
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r5 < 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e A[RETURN] */
    @Override // defpackage.eaou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(long r9) {
        /*
            r8 = this;
            int r0 = r8.a
            eavd r1 = r8.e
            eavd r2 = r8.f
            r3 = 0
            int r5 = r2.c     // Catch: java.lang.Throwable -> L16
            long r5 = r1.b(r9, r0, r5)     // Catch: java.lang.Throwable -> L16
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 <= 0) goto L17
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L17
        L16:
            r5 = r9
        L17:
            int r1 = r1.c     // Catch: java.lang.Throwable -> L28
            long r0 = r2.b(r9, r0, r1)     // Catch: java.lang.Throwable -> L28
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L26
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L26
            goto L29
        L26:
            r9 = r0
            goto L29
        L28:
        L29:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L2e
            return r9
        L2e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eava.e(long):long");
    }

    @Override // defpackage.eaou
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof eava) {
            eava eavaVar = (eava) obj;
            if (this.d.equals(eavaVar.d) && this.a == eavaVar.a && this.e.equals(eavaVar.e) && this.f.equals(eavaVar.f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 > 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    @Override // defpackage.eaou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f(long r9) {
        /*
            r8 = this;
            r0 = 1
            long r9 = r9 + r0
            int r0 = r8.a
            eavd r1 = r8.e
            eavd r2 = r8.f
            r3 = 0
            int r5 = r2.c     // Catch: java.lang.Throwable -> L19
            long r5 = r1.c(r9, r0, r5)     // Catch: java.lang.Throwable -> L19
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 >= 0) goto L1a
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L1a
        L19:
            r5 = r9
        L1a:
            int r1 = r1.c     // Catch: java.lang.Throwable -> L2b
            long r0 = r2.c(r9, r0, r1)     // Catch: java.lang.Throwable -> L2b
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 >= 0) goto L29
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L29
            goto L2c
        L29:
            r9 = r0
            goto L2c
        L2b:
        L2c:
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L31
            goto L32
        L31:
            r5 = r9
        L32:
            r9 = -1
            long r5 = r5 + r9
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eava.f(long):long");
    }
}
