package defpackage;
/* compiled from: PG */
/* renamed from: avsx  reason: default package */
/* loaded from: classes3.dex */
final class avsx extends avsz {
    public bvrt<dvfg> a;
    public Long b;
    public String c;
    public Long d;
    public Long e;
    public Integer f;
    public Long g;
    public Integer h;
    public Integer i;
    public Long j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public Boolean o;
    public Boolean p;
    public Long q;
    public dspd r;
    public int s;
    public int t;

    @Override // defpackage.avsz
    public final bvrt<dvfg> a() {
        bvrt<dvfg> bvrtVar = this.a;
        if (bvrtVar != null) {
            return bvrtVar;
        }
        throw new IllegalStateException("Property \"descriptorInternal\" has not been set");
    }

    @Override // defpackage.avsz
    public final void b(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.avsz
    public final void c(bvrt<dvfg> bvrtVar) {
        this.a = bvrtVar;
    }

    @Override // defpackage.avsz
    public final void d(long j) {
        this.d = Long.valueOf(j);
    }

    @Override // defpackage.avsz
    public final void e(long j) {
        this.b = Long.valueOf(j);
    }

    @Override // defpackage.avsz
    public final void f(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    @Override // defpackage.avsz
    public final void g(boolean z) {
        this.p = Boolean.valueOf(z);
    }

    @Override // defpackage.avsz
    public final void h(long j) {
        this.e = Long.valueOf(j);
    }

    @Override // defpackage.avsz
    public final void i(long j) {
        this.g = Long.valueOf(j);
    }

    @Override // defpackage.avsz
    public final void j(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.avsz
    public final void k(int i) {
        this.h = Integer.valueOf(i);
    }

    @Override // defpackage.avsz
    public final void l(long j) {
        this.j = Long.valueOf(j);
    }

    @Override // defpackage.avsz
    public final void m(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.avsz
    public final void n(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    @Override // defpackage.avsz
    public final void o(int i) {
        this.i = Integer.valueOf(i);
    }

    @Override // defpackage.avsz
    public final void p(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.avsz
    public final int q() {
        int i = this.t;
        if (i != 0) {
            return i;
        }
        throw new IllegalStateException("Property \"status\" has not been set");
    }

    @Override // defpackage.avsz
    public final void r(int i) {
        this.t = i;
    }
}
