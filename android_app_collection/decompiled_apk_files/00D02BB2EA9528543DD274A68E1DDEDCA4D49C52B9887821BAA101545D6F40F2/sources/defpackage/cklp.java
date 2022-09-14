package defpackage;
/* compiled from: PG */
/* renamed from: cklp  reason: default package */
/* loaded from: classes4.dex */
public final class cklp implements Runnable {
    private final ckmm a;
    private final cklo b;
    private final cklt c;
    private final dcdc<cklr> d;
    @dzsi
    private final ckls e;
    @dzsi
    private final cxdh f;
    @dzsi
    private final cxdh g;

    public cklp(ckmm ckmmVar, cklo ckloVar, cklt ckltVar, dcdc<cklr> dcdcVar, @dzsi ckls cklsVar, @dzsi cxdh cxdhVar, @dzsi cxdh cxdhVar2) {
        this.a = ckmmVar;
        this.b = ckloVar;
        this.c = ckltVar;
        this.d = dcdcVar;
        this.e = cklsVar;
        this.f = cxdhVar;
        this.g = cxdhVar2;
    }

    private final void a(cwsy cwsyVar, cxdh cxdhVar, cwsv cwsvVar) {
        dcdc<cklr> dcdcVar = this.d;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            cwsyVar.i(cxdhVar.c(), cwsv.c(cwsvVar, dcdcVar.get(i).p));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ckls cklsVar;
        cwsy a = this.a.a();
        if (this.g != null) {
            cwsv c = cwsv.c((this.b.equals(cklo.END_TO_END) ? cklo.COMPONENT_RENDER : cklo.COMPONENT_RENDER_FIRST_CONTENT).e, this.c.t);
            a(a, this.g, c);
            a.i(this.g, c);
        }
        if (this.f == null || (cklsVar = this.e) == null) {
            return;
        }
        cwsv c2 = cwsv.c(this.b.e, cwsv.c(cklsVar.w, this.c.t));
        a(a, this.f, c2);
        a.i(this.f, c2);
    }
}
