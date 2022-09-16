package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: efq  reason: default package */
/* loaded from: classes3.dex */
public final class efq implements efl {
    public final Executor a;
    public final Executor b;
    public final azpo c = azpo.W();
    public final efz d;
    public final azqb e;
    public final azqb f;
    public final azqb g;
    public final azqb h;
    public final azqb i;
    public final azqb j;
    public final azqb k;
    public final azqb l;
    public final azqb m;
    public final azqb n;
    public final azqb o;
    private final Executor p;
    private final ykv q;
    private final ywk r;
    private final azqb s;
    private final azqb t;

    public efq(Executor executor, Executor executor2, Executor executor3, ykv ykvVar, ywk ywkVar, efz efzVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13) {
        this.p = executor;
        this.a = executor2;
        this.b = executor3;
        this.q = ykvVar;
        this.r = ywkVar;
        this.d = efzVar;
        this.s = azqbVar;
        this.e = azqbVar2;
        this.f = azqbVar3;
        this.g = azqbVar4;
        this.h = azqbVar5;
        this.i = azqbVar6;
        this.j = azqbVar7;
        this.k = azqbVar8;
        this.l = azqbVar9;
        this.m = azqbVar10;
        this.n = azqbVar11;
        this.o = azqbVar12;
        this.t = azqbVar13;
    }

    private final Runnable d() {
        return new efo(this, 3, (char[]) null);
    }

    private final Runnable e(Executor executor) {
        return new efp(this, executor);
    }

    @Override // defpackage.efl
    public final void a() {
        ((aksv) this.s.get()).e();
        boolean z = (this.r.c(ywk.C) & 32) != 0;
        long c = this.r.c(ywk.U) & 2;
        if (!z) {
            b();
        }
        this.a.execute(new efn(this, z));
        if (z) {
            Executor executor = this.p;
            executor.execute(e(executor));
        }
        this.b.execute(new efo(this));
        this.p.execute(new efo(this, 2, (byte[]) null));
        if (!z) {
            Executor executor2 = this.p;
            executor2.execute(e(executor2));
        }
        if (c != 0) {
            this.a.execute(d());
        } else {
            this.b.execute(d());
        }
        if (z) {
            azpo.w(new efo(this, 1)).E(azpj.b(this.a)).U(this.c);
        }
    }

    public final void b() {
        ((jvk) this.t.get()).b();
        this.q.a();
    }

    public final void c() {
        jvk jvkVar = (jvk) this.t.get();
        jvkVar.g(this.a);
        jvkVar.f(this.a);
    }
}
