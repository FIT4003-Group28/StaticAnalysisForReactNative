package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agia  reason: default package */
/* loaded from: classes.dex */
public final class agia implements agxf {
    final /* synthetic */ agib a;

    public agia(agib agibVar) {
        this.a = agibVar;
    }

    @Override // defpackage.agxf
    public final void a(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void b(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void c() {
    }

    @Override // defpackage.agxf
    public final void d(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        this.a.i.execute(new aghz(this, agqzVar, 1));
    }

    @Override // defpackage.agxf
    public final void e(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        this.a.i.execute(new aghz(this, agqzVar));
    }

    @Override // defpackage.agxf
    public final void f(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        String t = agxg.t(agqzVar.f);
        for (agwj agwjVar : ((agwi) this.a.r.get()).c(t)) {
            if (agwjVar.i(agqzVar)) {
                this.a.r(agwjVar.c());
            }
        }
        agqe agqeVar = (agqe) this.a.t.remove(t);
        if (agqeVar == null) {
            return;
        }
        ((aglj) this.a.j.get()).V(t, agqeVar);
        if (!this.a.t.isEmpty()) {
            return;
        }
        agib agibVar = this.a;
        String r = agxg.r(agqzVar.f);
        if (r == null) {
            return;
        }
        r.length();
        agibVar.h.v(new agnq(r));
    }

    @Override // defpackage.agxf
    public final void g() {
        this.a.i.execute(new Runnable() { // from class: aghy
            @Override // java.lang.Runnable
            public final void run() {
                agia agiaVar = agia.this;
                agib agibVar = agiaVar.a;
                if (!agibVar.c.equals(agibVar.e.a())) {
                    return;
                }
                agwl b = ((agwk) agiaVar.a.q.get()).b();
                agib agibVar2 = agiaVar.a;
                boolean z = false;
                for (agqz agqzVar : agibVar2.e.b(agibVar2.c).values()) {
                    if (agqzVar.c()) {
                        String t = agxg.t(agqzVar.f);
                        for (String str : ((aglj) agiaVar.a.j.get()).t(t)) {
                            agwj a = ((agwi) agiaVar.a.r.get()).a(str);
                            if (a == null) {
                                agqh n = ((aglj) agiaVar.a.j.get()).n(str);
                                if (n != null) {
                                    a = ((agwi) agiaVar.a.r.get()).b(n.a, null);
                                } else {
                                    zep.b("[Offline] pudl transfer playlist not in database");
                                }
                            }
                            a.e(t);
                            b.c(t);
                            z = true;
                        }
                    }
                }
                for (agwj agwjVar : ((agwi) agiaVar.a.r.get()).a.values()) {
                    agiaVar.a.r(agwjVar.c());
                }
                if (!z) {
                    return;
                }
                ((agjz) agiaVar.a.o.get()).v(b.b());
            }
        });
    }

    @Override // defpackage.agxf
    public final void h(agqz agqzVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        this.a.i.execute(new aghz(this, agqzVar, 2));
    }

    @Override // defpackage.agxf
    public final void i(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void j(agqz agqzVar) {
    }

    @Override // defpackage.agxf
    public final void k(agqz agqzVar, atsg atsgVar, agqe agqeVar) {
        if (!agxg.ai(agqzVar)) {
            return;
        }
        this.a.i.execute(new aghz(this, agqzVar, 3));
    }

    @Override // defpackage.agxf
    public final void l(agqz agqzVar) {
    }

    public final void m(agqz agqzVar) {
        for (agwj agwjVar : ((agwi) this.a.r.get()).c(agxg.t(agqzVar.f))) {
            if (agwjVar.j(agqzVar)) {
                this.a.r(agwjVar.c());
            }
        }
    }
}
