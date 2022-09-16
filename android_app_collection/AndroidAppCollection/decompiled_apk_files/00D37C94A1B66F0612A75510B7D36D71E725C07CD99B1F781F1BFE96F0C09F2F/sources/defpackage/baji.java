package defpackage;
/* compiled from: PG */
/* renamed from: baji  reason: default package */
/* loaded from: classes2.dex */
final class baji extends bajt {
    private final baiw a;

    public baji(bahn bahnVar, baiw baiwVar) {
        super(bahnVar, bahp.d);
        this.a = baiwVar;
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        int a = this.b.a(j);
        return a <= 0 ? 1 - a : a;
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.bajt, defpackage.bahn
    public final int d() {
        return 1;
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
        bajw.e(this, i, 1, c());
        if (this.a.Z(j) <= 0) {
            i = 1 - i;
        }
        return super.h(j, i);
    }
}
