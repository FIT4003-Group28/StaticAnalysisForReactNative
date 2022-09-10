package defpackage;
/* compiled from: PG */
/* renamed from: svn  reason: default package */
/* loaded from: classes7.dex */
final class svn implements jkh {
    final /* synthetic */ svo a;

    public svn(svo svoVar) {
        this.a = svoVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        cjmu cjmuVar;
        if (!this.a.S()) {
            return;
        }
        boolean z = jjnVar2 == jjn.FULLY_EXPANDED;
        svp svpVar = this.a.al;
        dbsk.s(svpVar);
        if (!svpVar.a()) {
            cjmt cjmtVar = this.a.ah;
            if (z) {
                cjmuVar = cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE;
            } else {
                cjmuVar = cjmu.TRANSPARENT_BG_SATELLITE_ADAPTIVE_ICONS_DM_AWARE;
            }
            cjmtVar.k(cjmuVar);
        }
        if (!z) {
            this.a.ad.f();
        }
        tft tftVar = this.a.aj;
        if (tftVar != null) {
            tftVar.g(z);
        }
        tfv tfvVar = this.a.ai;
        if (tfvVar == null) {
            return;
        }
        tfvVar.f(jjnVar2);
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
    }
}
