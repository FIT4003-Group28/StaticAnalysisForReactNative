package defpackage;
/* compiled from: PG */
/* renamed from: anoz  reason: default package */
/* loaded from: classes2.dex */
public final class anoz implements aodq {
    public transient cjqy a;
    public transient angp b;
    private final bvrt<dvay> c;
    private final bvrt<dnsf> d;
    private final eaol e;
    private final eaol f;

    public anoz(dvay dvayVar, eaol eaolVar, eaol eaolVar2, dnsf dnsfVar) {
        this.e = eaolVar;
        this.f = eaolVar2;
        this.c = bvrt.b(dvayVar);
        this.d = bvrt.b(dnsfVar);
    }

    @Override // defpackage.aodq
    public final void a(aogy aogyVar, ges gesVar) {
        ((anoy) btsq.c(anoy.class, gesVar.J())).wR(this);
        this.a.i(cjtd.a(dtyi.bG));
        long j = aogyVar.a().a().a(this.e.v()).a;
        long j2 = aogyVar.a().b().a(this.f.v()).a;
        dpoo bZ = dpop.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpop dpopVar = (dpop) bZ.b;
        int i = dpopVar.a | 1;
        dpopVar.a = i;
        dpopVar.b = j;
        dpopVar.a = i | 2;
        dpopVar.c = j2;
        this.b.p(this.c.e((dssr) dvay.u.cu(7), dvay.u), bZ.bK(), aogyVar.b(), this.d.e((dssr) dnsf.c.cu(7), dnsf.c));
    }
}
