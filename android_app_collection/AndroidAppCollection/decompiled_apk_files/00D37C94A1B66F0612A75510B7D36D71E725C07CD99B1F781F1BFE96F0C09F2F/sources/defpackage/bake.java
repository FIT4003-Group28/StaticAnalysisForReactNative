package defpackage;
/* compiled from: PG */
/* renamed from: bake  reason: default package */
/* loaded from: classes2.dex */
public final class bake extends bajt {
    final bahv a;

    public bake(bahn bahnVar, bahp bahpVar) {
        super(bahnVar, bahpVar);
        bahv p = bahnVar.p();
        if (p == null) {
            this.a = null;
        } else {
            this.a = new bakf(p, ((baho) bahpVar).b);
        }
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        int a = this.b.a(j);
        return a >= 0 ? a % 100 : ((a + 1) % 100) + 99;
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int c() {
        return 99;
    }

    @Override // defpackage.bajt, defpackage.bahn
    public final int d() {
        return 0;
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
        bajw.e(this, i, 0, 99);
        int a = this.b.a(j);
        return this.b.h(j, ((a >= 0 ? a / 100 : ((a + 1) / 100) - 1) * 100) + i);
    }

    @Override // defpackage.bajt, defpackage.bahn
    public final bahv r() {
        return this.a;
    }

    public bake(bajv bajvVar, bahp bahpVar) {
        super(bajvVar.b, bahpVar);
        int i = bajvVar.a;
        this.a = bajvVar.c;
    }
}
