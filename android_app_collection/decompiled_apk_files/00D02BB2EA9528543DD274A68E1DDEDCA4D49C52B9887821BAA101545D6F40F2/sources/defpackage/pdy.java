package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gmm.transit.commute.TransitCommuteNotificationBroadcastReceiver;
/* compiled from: PG */
/* renamed from: pdy  reason: default package */
/* loaded from: classes7.dex */
public final class pdy implements pcx<dlkv> {
    public static final int a = auiy.TRANSIT_TO_PLACE.a().intValue();
    private final byye b;
    private final ckcw c;

    public pdy(byye byyeVar, ckcw ckcwVar) {
        this.b = byyeVar;
        this.c = ckcwVar;
    }

    @Override // defpackage.pcx
    public final boolean a(int i) {
        return a == i;
    }

    @Override // defpackage.pcx
    public final dssr<dlkv> b() {
        return (dssr) dlkv.s.cu(7);
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ int c(dlkv dlkvVar) {
        return dpyv.TRANSIT_TO_PLACE.dm;
    }

    @Override // defpackage.pcx
    public final /* bridge */ /* synthetic */ void d(pau pauVar, pas pasVar, dlkv dlkvVar) {
        ckcw ckcwVar;
        ckgz ckgzVar;
        dlkv dlkvVar2 = dlkvVar;
        dlks dlksVar = dlkvVar2.d;
        if (dlksVar == null) {
            dlksVar = dlks.e;
        }
        dcbg t = dcbg.b(dlksVar.d).t(pdw.a);
        int i = 2;
        if (!t.y()) {
            dbsl dbslVar = pdx.a;
            if (t.q(dbslVar)) {
                i = 3;
            } else if (!t.p(dbslVar)) {
                i = 1;
            }
            ckcwVar = this.c;
            ckgzVar = ckeo.D;
        } else {
            int i2 = dlkvVar2.a;
            if ((i2 & 4096) == 0 || (i2 & 8192) == 0) {
                i = 1;
            }
            ckcwVar = this.c;
            ckgzVar = ckeo.E;
        }
        ((ckco) ckcwVar.a(ckgzVar)).a(i - 1);
        byye byyeVar = this.b;
        String str = pauVar.b;
        byyf byyfVar = (byyf) byyeVar;
        int a2 = dwoh.a(byyfVar.b.getTripAssistanceNotificationsParameters().a);
        if (a2 != 0 && a2 == 3) {
            byyfVar.c.o(dpyv.AREA_TRAFFIC.dm);
        }
        dlkv dlkvVar3 = new bywb(dlkvVar2).a;
        Application application = byyfVar.a;
        Intent action = new Intent(application, TransitCommuteNotificationBroadcastReceiver.class).setAction(byxy.j);
        String str2 = byxy.k;
        Bundle bundle = new Bundle();
        bvrs.k(bundle, str2, dlkvVar3);
        action.putExtras(bundle);
        action.putExtra(byxy.l, str);
        application.sendBroadcast(action);
    }
}
