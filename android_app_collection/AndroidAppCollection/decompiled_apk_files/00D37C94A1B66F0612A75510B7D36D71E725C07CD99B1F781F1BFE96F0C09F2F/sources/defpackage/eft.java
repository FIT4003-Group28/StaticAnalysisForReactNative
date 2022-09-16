package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eft  reason: default package */
/* loaded from: classes3.dex */
public final class eft implements efl {
    public final azqb a;
    public final Executor b;
    public final Executor c;
    public final efz d;
    public final azpo e = azpo.W();
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
    public final azqb p;
    public final azqb q;
    public final azqb r;
    public azpo s;
    public boolean t;
    private final ywk u;

    public eft(azqb azqbVar, Executor executor, Executor executor2, ywk ywkVar, efz efzVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6, azqb azqbVar7, azqb azqbVar8, azqb azqbVar9, azqb azqbVar10, azqb azqbVar11, azqb azqbVar12, azqb azqbVar13, azqb azqbVar14) {
        this.a = azqbVar;
        this.b = executor;
        this.c = executor2;
        this.d = efzVar;
        this.u = ywkVar;
        this.f = azqbVar2;
        this.g = azqbVar3;
        this.h = azqbVar4;
        this.i = azqbVar5;
        this.j = azqbVar6;
        this.k = azqbVar7;
        this.l = azqbVar8;
        this.m = azqbVar9;
        this.n = azqbVar10;
        this.o = azqbVar11;
        this.p = azqbVar12;
        this.q = azqbVar13;
        this.r = azqbVar14;
    }

    @Override // defpackage.efl
    public final void a() {
        long c = this.u.c(ywk.E);
        yxd yxdVar = this.d.g;
        ayor b = azpj.b(this.c);
        yxc b2 = yxd.b(6);
        b2.a("etc", new efs(this, 2));
        yxdVar.n(b, b2);
        if ((c & 128) != 0) {
            yxc b3 = yxd.b(1);
            b3.a(cfg.b, new efs(this, 3));
            b3.a("ida", new efs(this, 5));
            b3.a("ads", new efs(this, 7));
            b3.a("sww", new bhj(12));
            yxc b4 = yxd.b(0);
            b4.a("asc", new efs(this, 1));
            yxdVar.n(b, b3, b4);
        } else {
            this.t = (this.u.c(ywk.C) & 32) != 0;
            this.s = azpo.W();
            yxc b5 = yxd.b(6);
            b5.c("phn", new efs(this, 8), !this.t);
            yxc b6 = yxd.b(5);
            b6.a(cfg.b, new efs(this, 6));
            b6.c("phn", new efs(this, 8), this.t);
            yxc b7 = yxd.b(4);
            b7.c("ida", new efs(this), this.t);
            b7.a("ads", new efs(this, 7));
            b7.c("ida", new efs(this), true ^ this.t);
            yxc b8 = yxd.b(2);
            b8.a("gpp", new efs(this, 4));
            b8.a("dns", new efs(this, 9));
            yxdVar.n(b, b5, b6, b7, b8);
        }
        this.d.c(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        jvk jvkVar = (jvk) this.r.get();
        jvkVar.g(this.b);
        jvkVar.f(this.b);
    }
}
