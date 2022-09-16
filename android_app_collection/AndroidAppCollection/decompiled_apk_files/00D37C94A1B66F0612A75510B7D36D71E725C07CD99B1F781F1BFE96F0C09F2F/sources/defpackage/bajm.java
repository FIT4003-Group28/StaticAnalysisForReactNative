package defpackage;
/* compiled from: PG */
/* renamed from: bajm  reason: default package */
/* loaded from: classes2.dex */
final class bajm extends bajt {
    static final bahn a = new bajm();

    private bajm() {
        super(bajj.G.m, bahp.d);
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        int a2 = this.b.a(j);
        return a2 < 0 ? -a2 : a2;
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.bajt, defpackage.bahn
    public final int d() {
        return 0;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long e(long j, int i) {
        return this.b.e(j, i);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final long h(long j, int i) {
        bajw.e(this, i, 0, c());
        if (this.b.a(j) < 0) {
            i = -i;
        }
        return super.h(j, i);
    }
}
