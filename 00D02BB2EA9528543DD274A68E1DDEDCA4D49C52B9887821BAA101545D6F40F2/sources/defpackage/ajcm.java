package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajcm  reason: default package */
/* loaded from: classes2.dex */
public final class ajcm {
    final /* synthetic */ ajcr a;

    public ajcm(ajcr ajcrVar) {
        this.a = ajcrVar;
    }

    public final void a(amqo amqoVar) {
        ajcr ajcrVar = this.a;
        GmmLocation a = amqoVar.a();
        akqq akqqVar = null;
        if (a == null) {
            if (ajcrVar.ag == null) {
                return;
            }
            ajcrVar.ag = null;
            ajwq ajwqVar = ajcrVar.ae;
            if (ajwqVar == null) {
                return;
            }
            ajwqVar.e(null);
            return;
        }
        GmmLocation gmmLocation = ajcrVar.ag;
        if (gmmLocation != null) {
            akqqVar = new akqq(gmmLocation.getLatitude(), ajcrVar.ag.getLongitude());
        }
        if (akqq.v(new akqq(a.getLatitude(), a.getLongitude()), akqqVar, 5.0d)) {
            return;
        }
        ajcrVar.ag = a;
        ajcrVar.aX();
    }
}
