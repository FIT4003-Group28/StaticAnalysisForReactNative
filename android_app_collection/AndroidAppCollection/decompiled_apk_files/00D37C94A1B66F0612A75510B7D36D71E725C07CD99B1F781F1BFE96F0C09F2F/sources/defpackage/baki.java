package defpackage;
/* compiled from: PG */
/* renamed from: baki  reason: default package */
/* loaded from: classes2.dex */
public final class baki extends bajt {
    public baki(bahn bahnVar, bahp bahpVar) {
        super(bahnVar, bahpVar);
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        int a = this.b.a(j);
        return a == 0 ? c() : a;
    }

    @Override // defpackage.bajt, defpackage.bajr, defpackage.bahn
    public final int c() {
        return this.b.c() + 1;
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
        int c = c();
        bajw.e(this, i, 1, c);
        if (i == c) {
            i = 0;
        }
        return this.b.h(j, i);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final bahv q() {
        return this.b.q();
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final boolean s(long j) {
        return this.b.s(j);
    }
}
