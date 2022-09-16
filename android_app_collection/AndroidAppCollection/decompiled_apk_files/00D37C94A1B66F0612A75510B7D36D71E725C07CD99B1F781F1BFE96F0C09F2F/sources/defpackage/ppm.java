package defpackage;
/* compiled from: PG */
/* renamed from: ppm  reason: default package */
/* loaded from: classes4.dex */
public final class ppm implements prk {
    protected final prk[] a;

    public ppm(prk[] prkVarArr) {
        this.a = prkVarArr;
    }

    @Override // defpackage.prk
    public final long d() {
        long j = Long.MAX_VALUE;
        for (prk prkVar : this.a) {
            long d = prkVar.d();
            if (d != Long.MIN_VALUE) {
                j = Math.min(j, d);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.prk
    public final long e() {
        long j = Long.MAX_VALUE;
        for (prk prkVar : this.a) {
            long e = prkVar.e();
            if (e != Long.MIN_VALUE) {
                j = Math.min(j, e);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // defpackage.prk
    public final void m(long j) {
        for (prk prkVar : this.a) {
            prkVar.m(j);
        }
    }

    @Override // defpackage.prk
    public final boolean o(long j) {
        prk[] prkVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long e = e();
            if (e == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (prk prkVar : this.a) {
                long e2 = prkVar.e();
                boolean z3 = e2 != Long.MIN_VALUE && e2 <= j;
                if (e2 == e || z3) {
                    z |= prkVar.o(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // defpackage.prk
    public final boolean p() {
        for (prk prkVar : this.a) {
            if (prkVar.p()) {
                return true;
            }
        }
        return false;
    }
}
