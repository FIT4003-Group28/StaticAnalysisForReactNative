package defpackage;
/* compiled from: PG */
/* renamed from: kgr  reason: default package */
/* loaded from: classes7.dex */
final class kgr implements klr {
    final /* synthetic */ kgw a;

    public kgr(kgw kgwVar) {
        this.a = kgwVar;
    }

    @Override // defpackage.klr
    public final void a(ldm ldmVar) {
        kty.a(this.a.l, ckee.N);
        ckcq ckcqVar = this.a.u;
        dbsk.s(ckcqVar);
        ckcqVar.b();
        kgw kgwVar = this.a;
        kgwVar.d.k(kgwVar.f.c(ldmVar, null, null, kdk.NAVIGATE_IF_NOT_EV_CHARGING_STATION, mnz.SHORTCUT_RECENT_PLACES, false, true, dcdc.e(), new cjsz(dtxm.cJ), kgwVar.b, kgwVar.d));
        eapd eapdVar = ldmVar.g;
        if (eapdVar != null) {
            ((ckcp) this.a.l.a(ckee.ay)).a(new eaow(eapdVar, eapd.a()).g());
        }
    }

    @Override // defpackage.klr
    public final void b() {
        this.a.s = kle.LIST;
    }
}
