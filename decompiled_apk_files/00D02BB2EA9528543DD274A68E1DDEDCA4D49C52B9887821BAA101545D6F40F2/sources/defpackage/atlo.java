package defpackage;
/* compiled from: PG */
/* renamed from: atlo  reason: default package */
/* loaded from: classes2.dex */
public final class atlo extends asta<atlq, atlo> {
    @dzsi
    public crqf l;
    public boolean m;
    @dzsi
    public amuo n;
    @dzsi
    public ilo p;
    @dzsi
    public amte q;
    @dzsi
    public atlp r;
    public boolean s;
    public int t;
    @dzsi
    public crmw x;
    public boolean o = true;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;

    @Override // defpackage.asta
    /* renamed from: c */
    public final atlq a() {
        crqf crqfVar = this.l;
        if (crqfVar == null || atlk.a(crqfVar)) {
            this.n = null;
            if (this.c.a == asld.INSPECT_STEP) {
                asle asleVar = new asle(this.c);
                asleVar.a = asld.FREE_MOVEMENT;
                b(asleVar.a());
            }
        } else {
            amuo amuoVar = crqfVar.g().b;
            amub amubVar = crqfVar.g().a;
            if (amuoVar == null) {
                bvoo.h("No current step, despite no message to show.", new Object[0]);
            } else if (this.o) {
                this.n = amuoVar;
            } else {
                amuo amuoVar2 = this.n;
                if (amuoVar2 == null || !amubVar.ak(amuoVar2) || this.n.i < amuoVar.i) {
                    this.n = amuoVar;
                    if (this.c.a == asld.INSPECT_STEP) {
                        asle asleVar2 = new asle(this.c);
                        asleVar2.a = asld.FOLLOWING;
                        b(asleVar2.a());
                    } else {
                        asle asleVar3 = new asle(this.c);
                        asleVar3.a = asld.FREE_MOVEMENT;
                        b(asleVar3.a());
                    }
                }
            }
        }
        crqf crqfVar2 = this.l;
        if (this.n == null && crqfVar2 != null && !atlk.a(crqfVar2)) {
            bvoo.h("headerStep can only return null when we aren't navigating, or when we aren't showing a message.", new Object[0]);
        }
        amuo amuoVar3 = this.n;
        if (amuoVar3 != null && crqfVar2 != null && !crqfVar2.g().a.ak(amuoVar3)) {
            bvoo.h("headerStep must return a step on the current route", new Object[0]);
        }
        if (crqfVar2 != null && this.n == null && this.c.a == asld.INSPECT_STEP) {
            bvoo.h("headerStep must be non-null when inspecting a step", new Object[0]);
        }
        if (this.s && this.t < 0) {
            bvoo.h("previewed route index is negative", new Object[0]);
        }
        if (this.s && crqfVar2 != null && this.t >= crqfVar2.f().m()) {
            bvoo.h("previewed route index is too high", new Object[0]);
        }
        return new atlq(this);
    }

    public final void d(@dzsi crqf crqfVar) {
        this.l = crqfVar;
        atlp atlpVar = this.r;
        if (crqfVar != null && atlpVar != null) {
            int i = atlpVar.c;
            amub amubVar = crqfVar.g().a;
            this.q = atlpVar.m;
            if (i >= 0 && i < amubVar.h()) {
                amuo o = amubVar.o(i);
                if (o.hashCode() == atlpVar.d) {
                    this.n = o;
                }
            }
            this.r = null;
        }
        if (!this.s || crqfVar == null) {
            return;
        }
        this.t = Math.min(crqfVar.f().m() - 1, this.t);
    }

    @Override // defpackage.asta
    /* renamed from: e */
    public final void b(aslf aslfVar) {
        if (aslfVar.a != asld.FREE_MOVEMENT) {
            this.o = aslfVar.a != asld.INSPECT_STEP;
        }
        this.c = aslfVar;
    }
}
