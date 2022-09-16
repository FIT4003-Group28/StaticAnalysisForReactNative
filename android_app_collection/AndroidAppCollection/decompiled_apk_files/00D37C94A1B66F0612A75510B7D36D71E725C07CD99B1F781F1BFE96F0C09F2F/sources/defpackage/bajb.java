package defpackage;
/* compiled from: PG */
/* renamed from: bajb  reason: default package */
/* loaded from: classes2.dex */
final class bajb extends bakc {
    private final baiw b;

    public bajb(baiw baiwVar, bahv bahvVar) {
        super(bahp.m, bahvVar);
        this.b = baiwVar;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        return this.b.V(j);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int c() {
        return 53;
    }

    @Override // defpackage.bakc, defpackage.bahn
    public final int d() {
        return 1;
    }

    @Override // defpackage.bakc, defpackage.bajr, defpackage.bahn
    public final long f(long j) {
        return super.f(j + 259200000);
    }

    @Override // defpackage.bakc, defpackage.bajr, defpackage.bahn
    public final long g(long j) {
        return super.g(j + 259200000) - 259200000;
    }

    @Override // defpackage.bahn
    public final bahv r() {
        return this.b.e;
    }

    @Override // defpackage.bajr
    public final int u(long j) {
        return this.b.X(this.b.Y(j));
    }

    @Override // defpackage.bakc
    protected final int v(long j, int i) {
        if (i > 52) {
            return u(j);
        }
        return 52;
    }
}
