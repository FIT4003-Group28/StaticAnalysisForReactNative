package defpackage;

import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ilc  reason: default package */
/* loaded from: classes3.dex */
public final class ilc implements afzf {
    final /* synthetic */ ilh a;

    public ilc(ilh ilhVar) {
        this.a = ilhVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.d("Cannot retrieve PhoneVerificationIntroRenderer.", cffVar);
        this.a.s(8);
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        aunb aunbVar;
        atwq atwqVar;
        aunb aunbVar2;
        aryw arywVar = (aryw) obj;
        if (!arywVar.e) {
            if (arywVar.b == 3) {
                aunbVar = (aunb) arywVar.c;
            } else {
                aunbVar = aunb.a;
            }
            if (aunbVar.qn(atws.a)) {
                if (arywVar.b == 3) {
                    aunbVar2 = (aunb) arywVar.c;
                } else {
                    aunbVar2 = aunb.a;
                }
                atwqVar = (atwq) aunbVar2.qm(atws.a);
            } else {
                atwqVar = null;
            }
            if (atwqVar == null) {
                this.a.s(8);
                return;
            }
            ilh ilhVar = this.a;
            ikf ikfVar = ilhVar.a.N;
            while (ikfVar.e()) {
                ikfVar.b();
            }
            ilhVar.m = wig.a(atwqVar, false);
            eo supportFragmentManager = ilhVar.a.getSupportFragmentManager();
            ilhVar.v.b(R.id.verification_fragment_upload_container);
            ex l = supportFragmentManager.l();
            l.q(R.id.verification_fragment_upload_container, ilhVar.m, "verificationFragmentTag");
            l.i = 4099;
            l.a();
            supportFragmentManager.ab();
            return;
        }
        this.a.s(8);
    }
}
