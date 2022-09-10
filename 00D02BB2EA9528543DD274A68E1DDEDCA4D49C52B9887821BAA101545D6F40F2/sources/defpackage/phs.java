package defpackage;
/* compiled from: PG */
/* renamed from: phs  reason: default package */
/* loaded from: classes7.dex */
public final class phs implements phu<dfoe> {
    public final cqat a;
    public final pfc b;
    @dzsi
    public pfe<dfoe> c;
    private final btrm d;

    public phs(cqat cqatVar, btrm btrmVar, pfc pfcVar) {
        this.a = cqatVar;
        this.d = btrmVar;
        this.b = pfcVar;
    }

    @Override // defpackage.phu
    public final void a(pfe<dfoe> pfeVar) {
        if (this.b.c()) {
            btrm btrmVar = this.d;
            dceq a = dcet.a();
            a.b(pfp.class, new pht(pfp.class, this));
            btrmVar.g(this, a.a());
            this.c = pfeVar;
        }
    }

    @Override // defpackage.phu
    public final void b() {
        if (this.b.c()) {
            this.d.a(this);
            this.c = null;
        }
    }
}
