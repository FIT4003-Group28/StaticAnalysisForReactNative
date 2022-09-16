package defpackage;
/* compiled from: PG */
/* renamed from: whq  reason: default package */
/* loaded from: classes4.dex */
final class whq implements afzf {
    final /* synthetic */ whr a;

    public whq(whr whrVar) {
        this.a = whrVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        zep.f("PhoneVerificationResolver", "Getting phone verification form failed.", cffVar);
        this.a.i();
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
                return;
            }
            wiy a = wig.a(atwqVar, false);
            ex l = this.a.a.l();
            l.q(this.a.b, a, "verification_fragment_tag");
            l.i = 4099;
            l.a();
            this.a.a.ab();
            return;
        }
        this.a.u();
    }
}
