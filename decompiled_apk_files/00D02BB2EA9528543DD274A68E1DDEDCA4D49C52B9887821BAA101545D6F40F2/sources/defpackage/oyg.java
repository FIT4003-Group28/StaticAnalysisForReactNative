package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: oyg  reason: default package */
/* loaded from: classes7.dex */
public class oyg extends bllj {
    private final cjzt a;
    private final dtkf b;
    private final cjtd c;
    private final jic d;

    public oyg(Context context, cjzt cjztVar, dtkf dtkfVar) {
        this.a = cjztVar;
        this.b = dtkfVar;
        jic jicVar = null;
        this.c = oyf.b(cjztVar.b, dtkfVar.k, dtxl.b, cjztVar.e, (dtkfVar.a & 128) != 0 ? decs.a(dtkfVar.m) : null);
        this.d = dtkfVar.g.size() != 0 ? oyf.a(dtkfVar.g.get(0)) : jicVar;
    }

    @Override // defpackage.bllj, defpackage.jax
    public CharSequence b() {
        return this.b.b.size() > 0 ? this.b.b.get(0) : "";
    }

    @Override // defpackage.bllj, defpackage.jax
    public CharSequence g() {
        return this.b.c.size() > 0 ? this.b.c.get(0) : "";
    }

    @Override // defpackage.bllj, defpackage.jax
    public jic k() {
        dtkq dtkqVar = this.b.f;
        if (dtkqVar == null) {
            dtkqVar = dtkq.f;
        }
        return oyf.a(dtkqVar);
    }

    @Override // defpackage.bllj, defpackage.jax
    public Boolean l() {
        return Boolean.valueOf((this.b.a & 2) != 0);
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqkl m(cjqm cjqmVar) {
        cjyi cjyiVar = this.a.c;
        dthb dthbVar = this.b.h;
        if (dthbVar == null) {
            dthbVar = dthb.F;
        }
        cjzt cjztVar = this.a;
        cjyiVar.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        return cqkl.a;
    }

    @Override // defpackage.bllj, defpackage.jax
    public Boolean n() {
        return Boolean.valueOf((this.b.a & 8) != 0);
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqkl o(cjqm cjqmVar) {
        cjyi cjyiVar = this.a.c;
        dthb dthbVar = this.b.j;
        if (dthbVar == null) {
            dthbVar = dthb.F;
        }
        cjzt cjztVar = this.a;
        cjyiVar.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        return cqkl.a;
    }

    @Override // defpackage.bllj, defpackage.jax
    public Boolean p() {
        return Boolean.valueOf((this.b.a & 4) != 0);
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqkl q(cjqm cjqmVar) {
        dtkf dtkfVar = this.b;
        if ((dtkfVar.a & 4) != 0) {
            cjyi cjyiVar = this.a.c;
            dthb dthbVar = dtkfVar.i;
            if (dthbVar == null) {
                dthbVar = dthb.F;
            }
            cjzt cjztVar = this.a;
            cjyiVar.j(dthbVar, nxc.a(cjztVar.a, cjztVar.b, cjqmVar));
        }
        return cqkl.a;
    }

    @Override // defpackage.bllj, defpackage.jax
    public cjtd s() {
        return this.c;
    }

    @Override // defpackage.bllj, defpackage.jax
    public cqss u() {
        return ire.n();
    }

    @Override // defpackage.bllj, defpackage.jax
    @dzsi
    public jic v() {
        return this.d;
    }

    @Override // defpackage.bllj, defpackage.jax
    public String w() {
        if (this.b.g.size() == 0) {
            return null;
        }
        return this.b.g.get(0).e;
    }
}
