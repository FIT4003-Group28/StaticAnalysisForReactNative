package defpackage;

import android.app.Application;
import android.content.Intent;
import com.google.android.apps.gmm.transit.commute.TransitCommuteNotificationBroadcastReceiver;
/* compiled from: PG */
/* renamed from: byyf  reason: default package */
/* loaded from: classes4.dex */
public final class byyf implements byye {
    public final Application a;
    public final btvo b;
    public final auhi c;

    public byyf(Application application, btvo btvoVar, auhi auhiVar) {
        this.a = application;
        this.b = btvoVar;
        this.c = auhiVar;
    }

    @Override // defpackage.byye
    public final void a(String str) {
        Application application = this.a;
        application.sendBroadcast(byxy.a(application, str));
    }

    @Override // defpackage.byye
    public final void b(String str, int i) {
        Application application = this.a;
        application.sendBroadcast(new Intent(application, TransitCommuteNotificationBroadcastReceiver.class).setAction(byxy.c).putExtra(byxy.d, str).putExtra(byxy.e, i));
    }
}
