package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: auzz  reason: default package */
/* loaded from: classes2.dex */
final class auzz implements auzu {
    final /* synthetic */ avac a;

    public auzz(avac avacVar) {
        this.a = avacVar;
    }

    @Override // defpackage.auzu
    public final void aJ() {
        avac avacVar = this.a;
        avac.bn(avacVar.ad, avacVar.c, 2);
        ((ckco) avacVar.af.a(ckht.m)).a(avacVar.c.a);
        if (avacVar.d) {
            if (!avacVar.aD) {
                return;
            }
            bszv.ba(avacVar.aE, btgd.g(avacVar.c));
            return;
        }
        avacVar.g.e(avacVar.c.a, aufs.DISABLED);
        if (!avacVar.aD) {
            return;
        }
        avacVar.J().g().e();
        avab avabVar = new avab(avacVar);
        cztq a = cztt.a(avacVar.ag);
        a.e(R.string.NOTIFICATION_OPT_OUT_ACTIONABLE_TOAST_DESCRIPTION, new Object[0]);
        cztq a2 = a.a(R.string.NOTIFICATION_OPT_OUT_ACTIONABLE_TOAST_ACTION, avabVar);
        a2.d(cztr.LONG);
        a2.c();
    }

    @Override // defpackage.auzu
    public final void w() {
        avac avacVar = this.a;
        avac.bn(avacVar.ad, avacVar.c, 2);
        if (avacVar.aD) {
            avacVar.J().g().e();
        }
    }
}
