package defpackage;

import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: cvan  reason: default package */
/* loaded from: classes5.dex */
public final class cvan implements cvaj {
    public final cvak a;
    public cuvh b;
    public final cuss<cufp> c;
    public final cuss<dcdc<cufj>> d;
    private final cusw g;
    private final cusr<cusv> f = new cusr(this) { // from class: cval
        private final cvan a;

        {
            this.a = this;
        }

        @Override // defpackage.cusr
        public final void a(Object obj) {
            cvan cvanVar = this.a;
            cusv cusvVar = (cusv) obj;
            cufp cufpVar = (cufp) cusvVar.a(cvanVar.c);
            dcdc dcdcVar = (dcdc) cusvVar.a(cvanVar.d);
            cufj[] cufjVarArr = (cufj[]) dcdcVar.toArray(new cufj[0]);
            cuvh cuvhVar = cvanVar.b;
            if (cuvhVar == null) {
                cvanVar.b = new cuvh(cvanVar.a.b(), cufpVar, cufjVarArr);
                cvanVar.b.z();
            } else {
                cuvhVar.b = cufpVar;
                cuvhVar.c = cufjVarArr;
                cuvhVar.a.a(cufpVar, cufjVarArr);
            }
            cvanVar.a.a(cufpVar, dcdcVar);
        }
    };
    public cuza e = null;

    public cvan(ConversationId conversationId, dbsg<cuss<cufj>> dbsgVar, dbsg<cufj> dbsgVar2, ctyy ctyyVar, csuk csukVar, cvak cvakVar) {
        this.a = cvakVar;
        cvakVar.setPresenter(this);
        cuss<cufp> a = csukVar.a(ctyyVar, conversationId);
        this.c = a;
        if (dbsgVar.a()) {
            this.d = cusl.d(dbsgVar.b(), cvam.a);
            if (dbsgVar2.a() && dbsgVar2.b().b().a()) {
                cvakVar.setTitle(dbsgVar2.b().b().b());
                cvakVar.b().c(conversationId, dbsgVar2.b());
            }
        } else {
            this.d = csukVar.u(ctyyVar, conversationId);
        }
        this.g = cusw.d(a, this.d);
    }

    @Override // defpackage.cuvu
    public final void A() {
        this.g.g(this.f);
    }

    @Override // defpackage.cuvu
    public final void B() {
    }

    @Override // defpackage.cvaj
    public final boolean a() {
        return true;
    }

    @Override // defpackage.cvaj
    public final void b() {
        cuza cuzaVar = this.e;
        if (cuzaVar != null) {
            cuzo cuzoVar = cuzaVar.a;
            cuwg.c(cuzoVar.a);
            cuzoVar.aa.d(cuzoVar.b);
            cuzoVar.x.a();
        }
    }

    @Override // defpackage.cuvu
    public final void z() {
        this.g.q(this.f);
    }
}
