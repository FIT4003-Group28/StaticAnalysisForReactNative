package defpackage;
/* compiled from: PG */
/* renamed from: anbb  reason: default package */
/* loaded from: classes.dex */
public final class anbb implements anay {
    public final anat a;
    public final dxio<akox> b;
    public final akxz c;
    public boolean d;
    private final btrm e;
    @dzsi
    private cryz<akoq> f;
    private final anba g = new anba(this);

    public anbb(anat anatVar, dxio<akox> dxioVar, btrm btrmVar, akxz akxzVar) {
        dbsk.s(anatVar);
        this.a = anatVar;
        dbsk.s(dxioVar);
        this.b = dxioVar;
        dbsk.s(btrmVar);
        this.e = btrmVar;
        this.c = akxzVar;
    }

    @Override // defpackage.anay
    public final void a() {
        synchronized (this.a) {
            this.f = bvqj.d(this.b.a().k, new bvqg(this) { // from class: anaz
                private final anbb a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    anbb anbbVar = this.a;
                    akoq akoqVar = (akoq) obj;
                    synchronized (anbbVar.a) {
                        bnsn j = anbbVar.b.a().j();
                        j.d.add(anbbVar.c);
                        alov at = anbbVar.b.a().aj().at();
                        at.a(anbbVar.c);
                        at.a.s(anbbVar.c);
                        at.a(anbbVar.a);
                        anbbVar.d = true;
                    }
                }
            }, dege.a);
        }
        btrm btrmVar = this.e;
        anba anbaVar = this.g;
        dceq a = dcet.a();
        a.b(alhf.class, new anbc(0, alhf.class, anbaVar, bvrj.UI_THREAD));
        a.b(alhd.class, new anbc(1, alhd.class, anbaVar, bvrj.UI_THREAD));
        btrmVar.g(anbaVar, a.a());
        this.c.c();
    }

    @Override // defpackage.anay
    public final void b() {
        this.c.d();
        this.e.a(this.g);
        synchronized (this.a) {
            cryz<akoq> cryzVar = this.f;
            if (cryzVar != null) {
                cryzVar.c();
                this.f = null;
            }
            if (this.d) {
                bnsn j = this.b.a().j();
                j.d.remove(this.c);
                alov at = this.b.a().aj().at();
                at.b(this.c);
                at.a.t(this.c);
                at.b(this.a);
                this.d = false;
            }
        }
    }
}
