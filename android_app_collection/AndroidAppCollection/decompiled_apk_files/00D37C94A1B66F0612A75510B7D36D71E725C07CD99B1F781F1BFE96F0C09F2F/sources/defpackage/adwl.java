package defpackage;
/* compiled from: PG */
/* renamed from: adwl  reason: default package */
/* loaded from: classes.dex */
final class adwl extends adog {
    final /* synthetic */ adwt a;

    public adwl(adwt adwtVar) {
        this.a = adwtVar;
    }

    @Override // defpackage.adog, defpackage.adnx
    public final void g(int i) {
        adwg a = this.a.i.k.a();
        if (i != 2) {
            yiy yiyVar = this.a.d;
            if (yiyVar != null) {
                yiyVar.d();
                this.a.d = null;
            }
            a.a = null;
        }
        adwt adwtVar = this.a;
        adwi b = adwtVar.i.b();
        a.b(i);
        b.e = a.a();
        adwtVar.m(b);
        this.a.b(7);
    }

    @Override // defpackage.adog, defpackage.adnx
    public final void i() {
        this.a.f(4);
    }

    @Override // defpackage.adog, defpackage.adnx
    public final void rm() {
        this.a.f(0);
    }

    @Override // defpackage.adog, defpackage.adnx
    public final void rn(String str) {
        if (amps.e(str)) {
            adwt adwtVar = this.a;
            adwi b = adwtVar.i.b();
            adwg a = this.a.i.k.a();
            a.a = null;
            b.e = a.a();
            adwtVar.m(b);
            this.a.b(7);
            return;
        }
        adwt adwtVar2 = this.a;
        yiy yiyVar = adwtVar2.d;
        if (yiyVar != null) {
            yiyVar.d();
        }
        adwtVar2.d = yiy.c(new adwk(adwtVar2));
        adwtVar2.h.h(str, aadi.b, "", -1, adwtVar2.d);
    }
}
