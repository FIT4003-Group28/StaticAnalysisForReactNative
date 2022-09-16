package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aqsn  reason: default package */
/* loaded from: classes2.dex */
public class aqsn extends aqcg {
    @dzsi
    culw f;
    private final dxio<aqav> g;
    @dzsi
    private final apzg h;
    @dzsi
    private final cumb i;
    private final boolean j;

    public aqsn(gga ggaVar, bvrb bvrbVar, apyv apyvVar, dxio<aqav> dxioVar, dxio<aqbo> dxioVar2, @dzsi apzg apzgVar, @dzsi cumb cumbVar, ges gesVar) {
        super(ggaVar, gesVar, bvrbVar, dxioVar2);
        this.g = dxioVar;
        this.h = apzgVar;
        this.i = cumbVar;
        this.j = apyvVar.a();
    }

    private final void p(ctyy ctyyVar) {
        if (!this.b.aD || this.h == null || this.i == null) {
            return;
        }
        aqav a = this.g.a();
        if (this.f == null) {
            culw culwVar = new culw(this.a, this.i, ctyyVar, this.h.a(), this.h.b(), a.c(), a.h(), a.f());
            culwVar.e = new View.OnClickListener(this) { // from class: aqsm
                private final aqsn a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.b.e();
                }
            };
            this.f = culwVar;
        }
        this.f.z();
    }

    @Override // defpackage.aqcc
    public Boolean b() {
        return true;
    }

    @Override // defpackage.aqcc
    public cjtd c() {
        return cjtd.a(dtxv.dF);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqcg
    public final void i(ctyy ctyyVar) {
        p(ctyyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqcg
    public final void j(dcdc<ctyy> dcdcVar) {
        if (dcdcVar.size() != 1) {
            return;
        }
        if (aqda.d(dcdcVar.get(0)) == 2 && !this.j) {
            return;
        }
        p(dcdcVar.get(0));
    }

    public void m() {
        if (!this.j) {
            PD();
            return;
        }
        apzg apzgVar = this.h;
        if (apzgVar == null) {
            return;
        }
        PE(dcdc.f(Integer.valueOf(aqda.e(apzgVar.b().a()))));
    }

    public void n() {
        culw culwVar = this.f;
        if (culwVar != null) {
            culwVar.A();
        }
    }

    public void o() {
        culw culwVar = this.f;
        if (culwVar != null) {
            culwVar.B();
            this.f = null;
        }
    }
}
