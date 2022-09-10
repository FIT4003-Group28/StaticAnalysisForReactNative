package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaqx  reason: default package */
/* loaded from: classes6.dex */
public class eaqx extends eata {
    private final eaqt a;
    private final int c;
    private final int d;

    public eaqx(eaqt eaqtVar) {
        super(eaop.i, eaqtVar.ay());
        this.a = eaqtVar;
        this.c = 12;
        this.d = 2;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return this.c;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long F(long j) {
        int ac = this.a.ac(j);
        return this.a.aa(ac, this.a.ad(j, ac));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long H(long j) {
        return j - F(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        eaqt eaqtVar = this.a;
        return eaqtVar.ad(j, eaqtVar.ac(j));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long k(long j, int i) {
        int i2;
        int i3;
        if (i == 0) {
            return j;
        }
        long ak = this.a.ak(j);
        int ac = this.a.ac(j);
        int ad = this.a.ad(j, ac);
        int i4 = (ad - 1) + i;
        if (i4 >= 0) {
            int i5 = this.c;
            i2 = (i4 / i5) + ac;
            i3 = (i4 % i5) + 1;
        } else {
            i2 = ((i4 / this.c) + ac) - 1;
            int abs = Math.abs(i4);
            int i6 = this.c;
            int i7 = abs % i6;
            if (i7 == 0) {
                i7 = i6;
            }
            i3 = (i6 - i7) + 1;
            if (i3 == 1) {
                i2++;
            }
        }
        int ae = this.a.ae(j, ac, ad);
        int aq = this.a.aq(i2, i3);
        if (ae > aq) {
            ae = aq;
        }
        return this.a.ab(i2, i3, ae) + ak;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long l(long j, long j2) {
        long j3;
        long j4;
        int i = (int) j2;
        if (i == j2) {
            return k(j, i);
        }
        long ak = this.a.ak(j);
        int ac = this.a.ac(j);
        int ad = this.a.ad(j, ac);
        long j5 = (ad - 1) + j2;
        if (j5 >= 0) {
            long j6 = this.c;
            j3 = ac + (j5 / j6);
            j4 = (j5 % j6) + 1;
        } else {
            j3 = (-1) + ac + (j5 / this.c);
            long abs = Math.abs(j5);
            int i2 = this.c;
            int i3 = (int) (abs % i2);
            if (i3 == 0) {
                i3 = i2;
            }
            j4 = (i2 - i3) + 1;
            if (j4 == 1) {
                j3++;
            }
        }
        if (j3 < this.a.au() || j3 > this.a.av()) {
            StringBuilder sb = new StringBuilder(58);
            sb.append("Magnitude of add amount is too large: ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = (int) j3;
        int i5 = (int) j4;
        int ae = this.a.ae(j, ac, ad);
        int aq = this.a.aq(i4, i5);
        if (ae > aq) {
            ae = aq;
        }
        return this.a.ab(i4, i5, ae) + ak;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int[] m(eapt eaptVar, int i, int[] iArr, int i2) {
        if (i2 != 0) {
            if (!eaptVar.x(0).equals(eaop.i) || i != 0) {
                if (eaor.g(eaptVar)) {
                    long j = 0;
                    for (int i3 = 0; i3 < 2; i3++) {
                        j = eaptVar.x(i3).c(this.a).p(j, iArr[i3]);
                    }
                    return this.a.g(eaptVar, k(j, i2));
                }
                return super.m(eaptVar, i, iArr, i2);
            }
            q(eaptVar, 0, iArr, ((((eaptVar.g(0) - 1) + (i2 % 12)) + 12) % 12) + 1);
            return iArr;
        }
        return iArr;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long o(long j, long j2) {
        if (j < j2) {
            return -n(j2, j);
        }
        int ac = this.a.ac(j);
        int ad = this.a.ad(j, ac);
        int ac2 = this.a.ac(j2);
        int ad2 = this.a.ad(j2, ac2);
        long j3 = (((ac - ac2) * this.c) + ad) - ad2;
        int ae = this.a.ae(j, ac, ad);
        if (ae == this.a.aq(ac, ad) && this.a.ae(j2, ac2, ad2) > ae) {
            j2 = this.a.t.p(j2, ae);
        }
        return j - this.a.aa(ac, ad) < j2 - this.a.aa(ac2, ad2) ? j3 - 1 : j3;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        easy.e(this, i, 1, this.c);
        int ac = this.a.ac(j);
        eaqt eaqtVar = this.a;
        int ae = eaqtVar.ae(j, ac, eaqtVar.ad(j, ac));
        int aq = this.a.aq(ac, i);
        if (ae > aq) {
            ae = aq;
        }
        return this.a.ab(ac, i, ae) + this.a.ak(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox t() {
        return this.a.g;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final boolean u(long j) {
        int ac = this.a.ac(j);
        return this.a.ap(ac) && this.a.ad(j, ac) == this.d;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox v() {
        return this.a.c;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int w() {
        return 1;
    }
}
