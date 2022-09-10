package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: earf  reason: default package */
/* loaded from: classes6.dex */
public final class earf extends eare {
    final /* synthetic */ earh h;

    public earf(earh earhVar, eaon eaonVar, eaon eaonVar2, long j) {
        this(earhVar, eaonVar, eaonVar2, null, j, false);
    }

    @Override // defpackage.eare, defpackage.eass, defpackage.eaon
    public final int B(long j) {
        if (j >= this.c) {
            return this.b.B(j);
        }
        return this.a.B(j);
    }

    @Override // defpackage.eare, defpackage.eass, defpackage.eaon
    public final long k(long j, int i) {
        if (j >= this.c) {
            long k = this.b.k(j, i);
            long j2 = this.c;
            if (k >= j2) {
                return k;
            }
            earh earhVar = this.h;
            if (earhVar.H + k >= j2) {
                return k;
            }
            if (this.d) {
                if (earhVar.G.w.d(k) <= 0) {
                    k = this.h.G.w.k(k, -1);
                }
            } else if (earhVar.G.z.d(k) <= 0) {
                k = this.h.G.z.k(k, -1);
            }
            return L(k);
        }
        long k2 = this.a.k(j, i);
        long j3 = this.c;
        return (k2 < j3 || k2 - this.h.H < j3) ? k2 : K(k2);
    }

    @Override // defpackage.eare, defpackage.eass, defpackage.eaon
    public final long l(long j, long j2) {
        if (j >= this.c) {
            long l = this.b.l(j, j2);
            long j3 = this.c;
            if (l >= j3) {
                return l;
            }
            earh earhVar = this.h;
            if (earhVar.H + l >= j3) {
                return l;
            }
            if (this.d) {
                if (earhVar.G.w.d(l) <= 0) {
                    l = this.h.G.w.k(l, -1);
                }
            } else if (earhVar.G.z.d(l) <= 0) {
                l = this.h.G.z.k(l, -1);
            }
            return L(l);
        }
        long l2 = this.a.l(j, j2);
        long j4 = this.c;
        return (l2 < j4 || l2 - this.h.H < j4) ? l2 : K(l2);
    }

    @Override // defpackage.eare, defpackage.eass, defpackage.eaon
    public final int n(long j, long j2) {
        long j3 = this.c;
        if (j >= j3) {
            if (j2 >= j3) {
                return this.b.n(j, j2);
            }
            return this.a.n(L(j), j2);
        } else if (j2 < j3) {
            return this.a.n(j, j2);
        } else {
            return this.b.n(K(j), j2);
        }
    }

    @Override // defpackage.eare, defpackage.eass, defpackage.eaon
    public final long o(long j, long j2) {
        long j3 = this.c;
        if (j >= j3) {
            if (j2 >= j3) {
                return this.b.o(j, j2);
            }
            return this.a.o(L(j), j2);
        } else if (j2 < j3) {
            return this.a.o(j, j2);
        } else {
            return this.b.o(K(j), j2);
        }
    }

    @Override // defpackage.eare, defpackage.eass, defpackage.eaon
    public final int x(long j) {
        if (j >= this.c) {
            return this.b.x(j);
        }
        return this.a.x(j);
    }

    public earf(earh earhVar, eaon eaonVar, eaon eaonVar2, eaox eaoxVar, long j) {
        this(earhVar, eaonVar, eaonVar2, eaoxVar, j, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public earf(earh earhVar, eaon eaonVar, eaon eaonVar2, eaox eaoxVar, long j, boolean z) {
        super(earhVar, eaonVar, eaonVar2, j, z);
        this.h = earhVar;
        this.e = eaoxVar == null ? new earg(this.e, this) : eaoxVar;
    }
}
