package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eara  reason: default package */
/* loaded from: classes6.dex */
public final class eara extends eata {
    private final eaqt a;

    public eara(eaqt eaqtVar) {
        super(eaop.l, eaqtVar.aw());
        this.a = eaqtVar;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return this.a.av();
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long F(long j) {
        long F = this.a.v.F(j);
        int ah = this.a.ah(F);
        return ah > 1 ? F - ((ah - 1) * 604800000) : F;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long H(long j) {
        return j - F(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        return this.a.ag(j);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long k(long j, int i) {
        return i == 0 ? j : p(j, d(j) + i);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long l(long j, long j2) {
        return k(j, easy.d(j2));
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long o(long j, long j2) {
        if (j < j2) {
            return -n(j2, j);
        }
        int d = d(j);
        int d2 = d(j2);
        long H = H(j);
        long H2 = H(j2);
        if (H2 >= 31449600000L && this.a.X(d) <= 52) {
            H2 -= 604800000;
        }
        int i = d - d2;
        if (H < H2) {
            i--;
        }
        return i;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        easy.e(this, Math.abs(i), this.a.au(), this.a.av());
        int d = d(j);
        if (d == i) {
            return j;
        }
        int aj = this.a.aj(j);
        int X = this.a.X(d);
        int X2 = this.a.X(i);
        if (X2 < X) {
            X = X2;
        }
        int ah = this.a.ah(j);
        if (ah <= X) {
            X = ah;
        }
        long aA = this.a.aA(j, i);
        int d2 = d(aA);
        if (d2 < i) {
            aA += 604800000;
        } else if (d2 > i) {
            aA -= 604800000;
        }
        return this.a.s.p(aA + ((X - this.a.ah(aA)) * 604800000), aj);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox t() {
        return null;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final boolean u(long j) {
        eaqt eaqtVar = this.a;
        return eaqtVar.X(eaqtVar.ag(j)) > 52;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox v() {
        return this.a.d;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int w() {
        return this.a.au();
    }
}
