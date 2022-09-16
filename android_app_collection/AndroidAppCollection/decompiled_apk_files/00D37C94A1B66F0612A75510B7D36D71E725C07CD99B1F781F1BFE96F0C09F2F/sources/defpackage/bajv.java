package defpackage;
/* compiled from: PG */
/* renamed from: bajv  reason: default package */
/* loaded from: classes2.dex */
public final class bajv extends bajt {
    final int a;
    final bahv c;
    private final int d;
    private final int e;

    public bajv(bahn bahnVar, bahp bahpVar) {
        super(bahnVar, bahpVar);
        bahv p = bahnVar.p();
        if (p == null) {
            this.c = null;
        } else {
            this.c = new bakf(p, ((baho) bahpVar).a);
        }
        this.a = 100;
        int d = bahnVar.d();
        int i = d >= 0 ? d / 100 : ((d + 1) / 100) - 1;
        int c = bahnVar.c();
        int i2 = c >= 0 ? c / 100 : ((c + 1) / 100) - 1;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        int a = this.b.a(j);
        return a >= 0 ? a / 100 : ((a + 1) / 100) - 1;
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int c() {
        return this.e;
    }

    @Override // defpackage.bajt, defpackage.bahn
    public final int d() {
        return this.d;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long e(long j, int i) {
        return this.b.e(j, i * 100);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long f(long j) {
        return h(j, a(this.b.f(j)));
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final long g(long j) {
        bahn bahnVar = this.b;
        return bahnVar.g(bahnVar.h(j, a(j) * 100));
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final long h(long j, int i) {
        bajw.e(this, i, this.d, this.e);
        int a = this.b.a(j);
        return this.b.h(j, (i * 100) + (a >= 0 ? a % 100 : ((a + 1) % 100) + 99));
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final bahv p() {
        return this.c;
    }
}
