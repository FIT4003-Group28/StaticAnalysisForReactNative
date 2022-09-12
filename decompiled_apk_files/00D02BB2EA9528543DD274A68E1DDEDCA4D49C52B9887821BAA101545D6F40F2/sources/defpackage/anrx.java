package defpackage;
/* compiled from: PG */
/* renamed from: anrx  reason: default package */
/* loaded from: classes2.dex */
public final class anrx implements aodq {
    public transient cjqy a;
    public transient angp b;
    public transient anpw c;
    private final bvrt<dvay> d;
    private final bvrt<dnsf> e;
    private final bvrt<dqfw> f;

    public anrx(dvay dvayVar, dnsf dnsfVar, bvrt<dqfw> bvrtVar) {
        this.d = bvrt.b(dvayVar);
        this.e = bvrt.b(dnsfVar);
        this.f = bvrtVar;
    }

    @Override // defpackage.aodq
    public final void a(aogy aogyVar, ges gesVar) {
        dvat dvatVar;
        ((anrt) btsq.c(anrt.class, gesVar.J())).wS(this);
        anpw anpwVar = this.c;
        cjqy cjqyVar = this.a;
        angp angpVar = this.b;
        dngq e = aogyVar.a().e();
        int b = aogyVar.b();
        cjqyVar.i(cjtd.a(dtyi.bG));
        dvay e2 = this.d.e((dssr) dvay.u.cu(7), dvay.u);
        dnsf e3 = this.e.e((dssr) dnsf.c.cu(7), dnsf.c);
        if (e2.equals(dvay.u)) {
            bvoo.h("Could not deserialize the segment.", new Object[0]);
            return;
        }
        angpVar.o(e2, e, b, e3);
        dsqp dsqpVar = (dsqp) e2.cu(5);
        dsqpVar.bC(e2);
        dval dvalVar = (dval) dsqpVar;
        boolean z = b == 2;
        if (dvalVar.c) {
            dvalVar.bF();
            dvalVar.c = false;
        }
        dvay dvayVar = (dvay) dvalVar.b;
        dvayVar.a |= 2048;
        dvayVar.r = z;
        dvay bK = dvalVar.bK();
        if (bK.b == 7) {
            dvatVar = (dvat) bK.c;
        } else {
            dvatVar = dvat.g;
        }
        dvyw dvywVar = dvatVar.b.get(0).b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        anry.W(anpwVar, dvywVar, bK, aogv.a(this.f));
    }
}
