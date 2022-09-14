package defpackage;
/* compiled from: PG */
/* renamed from: fzq  reason: default package */
/* loaded from: classes6.dex */
final class fzq implements awwn {
    final /* synthetic */ fzr a;

    public fzq(fzr fzrVar) {
        this.a = fzrVar;
    }

    @Override // defpackage.awwn
    public final awwt a() {
        awws u = awwt.u();
        u.t(dcdc.f("covid_immersive_screen"));
        u.d(dcep.B(awvv.N));
        return u.a();
    }

    @Override // defpackage.awwn
    public final void b(awwb awwbVar, awwp awwpVar) {
        gbi gbiVar = this.a.ae;
        if (gbiVar == null) {
            bvoo.h("Covid19InfoSheetViewModel should not be null when creating the PassiveAssistModelUpdateListener.", new Object[0]);
        } else {
            gbiVar.s(awwbVar);
        }
    }
}
