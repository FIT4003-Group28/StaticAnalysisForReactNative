package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: earx  reason: default package */
/* loaded from: classes6.dex */
public final class earx extends east {
    private static final long serialVersionUID = -485345310999208286L;
    final eaox a;
    final boolean b;
    final eaou c;

    public earx(eaox eaoxVar, eaou eaouVar) {
        super(eaoxVar.a());
        if (eaoxVar.b()) {
            this.a = eaoxVar;
            this.b = eary.X(eaoxVar);
            this.c = eaouVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    private final int j(long j) {
        int b = this.c.b(j);
        long j2 = b;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return b;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    private final int k(long j) {
        int p = this.c.p(j);
        long j2 = p;
        if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
            return p;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    @Override // defpackage.eaox
    public final boolean c() {
        if (this.b) {
            return this.a.c();
        }
        return this.a.c() && this.c.d();
    }

    @Override // defpackage.eaox
    public final long d() {
        return this.a.d();
    }

    @Override // defpackage.eaox
    public final long e(long j, int i) {
        int j2 = j(j);
        long e = this.a.e(j + j2, i);
        if (!this.b) {
            j2 = k(e);
        }
        return e - j2;
    }

    @Override // defpackage.eaox
    public final long f(long j, long j2) {
        int j3 = j(j);
        long f = this.a.f(j + j3, j2);
        if (!this.b) {
            j3 = k(f);
        }
        return f - j3;
    }

    @Override // defpackage.east, defpackage.eaox
    public final int h(long j, long j2) {
        int j3 = j(j2);
        return this.a.h(j + (this.b ? j3 : j(j)), j2 + j3);
    }

    @Override // defpackage.eaox
    public final long i(long j, long j2) {
        int j3 = j(j2);
        return this.a.i(j + (this.b ? j3 : j(j)), j2 + j3);
    }
}
