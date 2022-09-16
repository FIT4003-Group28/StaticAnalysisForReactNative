package defpackage;
/* compiled from: PG */
/* renamed from: bajd  reason: default package */
/* loaded from: classes2.dex */
final class bajd extends bajy {
    protected final baiw a;

    public bajd(baiw baiwVar) {
        super(bahp.g, 31556952000L);
        this.a = baiwVar;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        return this.a.Z(j);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int c() {
        return 292278993;
    }

    @Override // defpackage.bahn
    public final int d() {
        return -292275054;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long e(long j, int i) {
        if (i == 0) {
            return j;
        }
        int a = a(j);
        int i2 = a + i;
        if ((a ^ i2) >= 0 || (a ^ i) < 0) {
            return h(j, i2);
        }
        StringBuilder sb = new StringBuilder(61);
        sb.append("The calculation caused an overflow: ");
        sb.append(a);
        sb.append(" + ");
        sb.append(i);
        throw new ArithmeticException(sb.toString());
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long g(long j) {
        return this.a.ae(a(j));
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long h(long j, int i) {
        bajw.e(this, i, -292275054, 292278993);
        return this.a.ah(j, i);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final bahv q() {
        return this.a.c;
    }

    @Override // defpackage.bahn
    public final bahv r() {
        return null;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final boolean s(long j) {
        return this.a.ai(a(j));
    }

    @Override // defpackage.bajy
    public final long v(long j, long j2) {
        return e(j, bajw.a(j2));
    }

    @Override // defpackage.bajy
    public final long w(long j, long j2) {
        if (j < j2) {
            return -this.a.ad(j2, j);
        }
        return this.a.ad(j, j2);
    }
}
