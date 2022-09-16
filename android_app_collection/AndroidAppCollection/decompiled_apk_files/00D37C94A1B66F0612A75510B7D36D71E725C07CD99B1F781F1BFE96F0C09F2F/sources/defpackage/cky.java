package defpackage;
/* compiled from: PG */
/* renamed from: cky  reason: default package */
/* loaded from: classes2.dex */
final class cky implements cik {
    final /* synthetic */ cnp a;
    final /* synthetic */ ckz b;

    public cky(ckz ckzVar, cnp cnpVar) {
        this.b = ckzVar;
        this.a = cnpVar;
    }

    @Override // defpackage.cik
    public final void f(Object obj) {
        if (this.b.f(this.a)) {
            ckz ckzVar = this.b;
            cnp cnpVar = this.a;
            ckb ckbVar = ckzVar.a.o;
            if (obj == null || !ckbVar.c(cnpVar.c.e())) {
                cjq cjqVar = ckzVar.b;
                chy chyVar = cnpVar.a;
                cil cilVar = cnpVar.c;
                cjqVar.e(chyVar, obj, cilVar, cilVar.e(), ckzVar.d);
                return;
            }
            ckzVar.c = obj;
            ckzVar.b.c();
        }
    }

    @Override // defpackage.cik
    public final void g(Exception exc) {
        if (this.b.f(this.a)) {
            ckz ckzVar = this.b;
            cnp cnpVar = this.a;
            cjq cjqVar = ckzVar.b;
            cjo cjoVar = ckzVar.d;
            cil cilVar = cnpVar.c;
            cjqVar.d(cjoVar, exc, cilVar, cilVar.e());
        }
    }
}
