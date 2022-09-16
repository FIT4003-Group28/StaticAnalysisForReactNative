package defpackage;
/* compiled from: PG */
/* renamed from: yhf  reason: default package */
/* loaded from: classes4.dex */
final class yhf implements afzf {
    final /* synthetic */ yhg a;

    public yhf(yhg yhgVar) {
        this.a = yhgVar;
    }

    @Override // defpackage.cez
    public final void kV(cff cffVar) {
        this.a.aj.e(cffVar);
        this.a.dismiss();
    }

    @Override // defpackage.afzf
    public final /* synthetic */ void kW() {
    }

    @Override // defpackage.cfa
    public final /* bridge */ /* synthetic */ void lG(Object obj) {
        auyo auyoVar;
        ashr ashrVar = (ashr) obj;
        this.a.af.a();
        if (ashrVar == null || (ashrVar.b & 2) == 0) {
            return;
        }
        yhg yhgVar = this.a;
        ashh ashhVar = ashrVar.d;
        if (ashhVar == null) {
            ashhVar = ashh.a;
        }
        if (ashhVar.c == 204280949) {
            ashh ashhVar2 = ashrVar.d;
            if (ashhVar2 == null) {
                ashhVar2 = ashh.a;
            }
            if (ashhVar2.c == 204280949) {
                auyoVar = (auyo) ashhVar2.d;
            } else {
                auyoVar = auyo.a;
            }
        } else {
            auyoVar = null;
        }
        yhgVar.ae = auyoVar;
        yhg yhgVar2 = this.a;
        if (yhgVar2.ae == null) {
            return;
        }
        yhgVar2.ag.D(new acte(ashrVar.g));
        this.a.m.putByteArray("get_offers_response", ashrVar.toByteArray());
        this.a.aG();
    }
}
