package defpackage;
/* compiled from: PG */
/* renamed from: aiey  reason: default package */
/* loaded from: classes2.dex */
public final class aiey implements aify {
    @dzsi
    public final Runnable a;
    private final akvo<aktd> b = new aiet(this);
    private final akty c;
    private final amrg d;
    private final amrb e;
    private final aiev f;
    private final aiez g;
    @dzsi
    private aiex h;
    @dzsi
    private aktc i;

    public aiey(akty aktyVar, amrg amrgVar, amrb amrbVar, aiev aievVar, aiez aiezVar, @dzsi Runnable runnable) {
        this.c = aktyVar;
        this.d = amrgVar;
        this.g = aiezVar;
        this.f = aievVar;
        amrbVar.c(aievVar);
        this.e = amrbVar;
        this.a = runnable;
    }

    private final void f() {
        aktc aktcVar = this.i;
        if (aktcVar != null) {
            this.d.a(aktcVar);
        }
    }

    private final void g() {
        f();
        aktc aktcVar = this.i;
        if (aktcVar != null) {
            this.c.e(aktcVar);
        }
    }

    @Override // defpackage.aify
    public final void a() {
    }

    @Override // defpackage.aify
    public final void b(aifq aifqVar) {
        aiex aiexVar;
        akra a = aifqVar.a().a();
        this.f.a = a;
        aiez aiezVar = this.g;
        synchronized (aiezVar.a) {
            aiezVar.b.put(this, a);
        }
        aiex aiexVar2 = (aiex) aifqVar.g(aiex.class);
        if (aiexVar2.a()) {
            if (this.i == null || (aiexVar = this.h) == null || !aiexVar.b(aiexVar2)) {
                g();
                this.h = aiexVar2;
                aktc d = this.c.d(aiexVar2.c(), dmti.WORLD_ENCODING_LAT_LNG_E7);
                this.i = d;
                d.Pt(this.b);
            }
            aktc aktcVar = this.i;
            if (aktcVar == null) {
                return;
            }
            this.e.b(aktcVar);
            this.d.c(this.e.g());
            return;
        }
        f();
    }

    @Override // defpackage.aify
    public final void c() {
        g();
        aiez aiezVar = this.g;
        synchronized (aiezVar.a) {
            aiezVar.b.remove(this);
        }
    }

    @Override // defpackage.aify
    public final void d(aifq aifqVar) {
    }

    @Override // defpackage.aify
    public final dcdc<aifn> e(int i) {
        return dcdc.f(new aieu(irf.a));
    }
}
