package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: eass  reason: default package */
/* loaded from: classes6.dex */
public abstract class eass extends eaon {
    public final eaop i;

    /* JADX INFO: Access modifiers changed from: protected */
    public eass(eaop eaopVar) {
        if (eaopVar != null) {
            this.i = eaopVar;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    @Override // defpackage.eaon
    public abstract int A();

    @Override // defpackage.eaon
    public int B(long j) {
        return A();
    }

    @Override // defpackage.eaon
    public int C(eapt eaptVar) {
        return A();
    }

    @Override // defpackage.eaon
    public int D(eapt eaptVar, int[] iArr) {
        return C(eaptVar);
    }

    @Override // defpackage.eaon
    public int E(Locale locale) {
        int A = A();
        if (A >= 0) {
            if (A < 10) {
                return 1;
            }
            if (A < 100) {
                return 2;
            }
            if (A < 1000) {
                return 3;
            }
        }
        return Integer.toString(A).length();
    }

    @Override // defpackage.eaon
    public abstract long F(long j);

    @Override // defpackage.eaon
    public long G(long j) {
        long F = F(j);
        return F != j ? k(F, 1) : j;
    }

    @Override // defpackage.eaon
    public long H(long j) {
        return j - F(j);
    }

    @Override // defpackage.eaon
    public final String I(eapt eaptVar, int i) {
        return j(i, null);
    }

    @Override // defpackage.eaon
    public final String J(eapt eaptVar, int i) {
        return g(i, null);
    }

    protected int Tj(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new eapb(this.i, str);
        }
    }

    @Override // defpackage.eaon
    public final eaop a() {
        return this.i;
    }

    @Override // defpackage.eaon
    public final String b() {
        return this.i.z;
    }

    @Override // defpackage.eaon
    public final boolean c() {
        return true;
    }

    @Override // defpackage.eaon
    public abstract int d(long j);

    @Override // defpackage.eaon
    public String e(long j, Locale locale) {
        return g(d(j), locale);
    }

    @Override // defpackage.eaon
    public final String f(eapt eaptVar, Locale locale) {
        return g(eaptVar.h(this.i), locale);
    }

    @Override // defpackage.eaon
    public String g(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // defpackage.eaon
    public String h(long j, Locale locale) {
        return j(d(j), locale);
    }

    @Override // defpackage.eaon
    public final String i(eapt eaptVar, Locale locale) {
        return j(eaptVar.h(this.i), locale);
    }

    @Override // defpackage.eaon
    public String j(int i, Locale locale) {
        return g(i, locale);
    }

    @Override // defpackage.eaon
    public long k(long j, int i) {
        return s().e(j, i);
    }

    @Override // defpackage.eaon
    public long l(long j, long j2) {
        return s().f(j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r13 >= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        r3 = z(r10, r12);
        r4 = r12[r11] + r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r4 < r3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        r12[r11] = (int) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r0 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        if (r11 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        r0 = r10.y(r11 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (t().a() != r0.s().a()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
        throw new java.lang.IllegalArgumentException("Fields invalid for add");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        throw new java.lang.IllegalArgumentException("Maximum value exceeded for add");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        r13 = r13 - ((r3 - 1) - r12[r11]);
        r12 = r0.m(r10, r11 - 1, r12, -1);
        r12[r11] = D(r10, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
        q(r10, r11, r12, r12[r11]);
     */
    @Override // defpackage.eaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int[] m(defpackage.eapt r10, int r11, int[] r12, int r13) {
        /*
            r9 = this;
            if (r13 == 0) goto Lac
            r0 = 0
        L3:
            java.lang.String r1 = "Fields invalid for add"
            java.lang.String r2 = "Maximum value exceeded for add"
            if (r13 <= 0) goto L57
            int r3 = r9.D(r10, r12)
            r4 = r12[r11]
            int r4 = r4 + r13
            long r4 = (long) r4
            long r6 = (long) r3
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L1a
            int r3 = (int) r4
            r12[r11] = r3
            goto L57
        L1a:
            if (r0 != 0) goto L43
            if (r11 == 0) goto L3d
            int r0 = r11 + (-1)
            eaon r0 = r10.y(r0)
            eaox r2 = r9.t()
            eaoz r2 = r2.a()
            eaox r4 = r0.s()
            eaoz r4 = r4.a()
            if (r2 != r4) goto L37
            goto L43
        L37:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r1)
            throw r10
        L3d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r2)
            throw r10
        L43:
            int r3 = r3 + 1
            r1 = r12[r11]
            int r3 = r3 - r1
            int r13 = r13 - r3
            int r1 = r11 + (-1)
            r2 = 1
            int[] r12 = r0.m(r10, r1, r12, r2)
            int r1 = r9.z(r10, r12)
            r12[r11] = r1
            goto L3
        L57:
            if (r13 >= 0) goto La7
            int r3 = r9.z(r10, r12)
            r4 = r12[r11]
            int r4 = r4 + r13
            long r4 = (long) r4
            long r6 = (long) r3
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L6a
            int r13 = (int) r4
            r12[r11] = r13
            goto La7
        L6a:
            if (r0 != 0) goto L93
            if (r11 == 0) goto L8d
            int r0 = r11 + (-1)
            eaon r0 = r10.y(r0)
            eaox r4 = r9.t()
            eaoz r4 = r4.a()
            eaox r5 = r0.s()
            eaoz r5 = r5.a()
            if (r4 != r5) goto L87
            goto L93
        L87:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r1)
            throw r10
        L8d:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r2)
            throw r10
        L93:
            int r3 = r3 + (-1)
            r4 = r12[r11]
            int r3 = r3 - r4
            int r13 = r13 - r3
            int r3 = r11 + (-1)
            r4 = -1
            int[] r12 = r0.m(r10, r3, r12, r4)
            int r3 = r9.D(r10, r12)
            r12[r11] = r3
            goto L57
        La7:
            r13 = r12[r11]
            r9.q(r10, r11, r12, r13)
        Lac:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eass.m(eapt, int, int[], int):int[]");
    }

    @Override // defpackage.eaon
    public int n(long j, long j2) {
        return s().h(j, j2);
    }

    @Override // defpackage.eaon
    public long o(long j, long j2) {
        return s().i(j, j2);
    }

    @Override // defpackage.eaon
    public abstract long p(long j, int i);

    @Override // defpackage.eaon
    public final int[] q(eapt eaptVar, int i, int[] iArr, int i2) {
        easy.e(this, i2, z(eaptVar, iArr), D(eaptVar, iArr));
        iArr[i] = i2;
        while (true) {
            i++;
            if (i < 2) {
                eaon y = eaptVar.y(i);
                if (iArr[i] > y.D(eaptVar, iArr)) {
                    iArr[i] = y.D(eaptVar, iArr);
                }
                if (iArr[i] < y.z(eaptVar, iArr)) {
                    iArr[i] = y.z(eaptVar, iArr);
                }
            } else {
                return iArr;
            }
        }
    }

    @Override // defpackage.eaon
    public long r(long j, String str, Locale locale) {
        return p(j, Tj(str, locale));
    }

    @Override // defpackage.eaon
    public abstract eaox s();

    @Override // defpackage.eaon
    public abstract eaox t();

    public final String toString() {
        String b = b();
        StringBuilder sb = new StringBuilder(b.length() + 15);
        sb.append("DateTimeField[");
        sb.append(b);
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.eaon
    public boolean u(long j) {
        return false;
    }

    @Override // defpackage.eaon
    public eaox v() {
        return null;
    }

    @Override // defpackage.eaon
    public abstract int w();

    @Override // defpackage.eaon
    public int x(long j) {
        return w();
    }

    @Override // defpackage.eaon
    public int y(eapt eaptVar) {
        return w();
    }

    @Override // defpackage.eaon
    public int z(eapt eaptVar, int[] iArr) {
        return y(eaptVar);
    }
}
