package com.google.android.apps.gmm.traffic.notification.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AreaTrafficNotificationGeofenceReceiver extends BroadcastReceiver {
    public bypq a;
    public auhi b;
    public ckcw c;
    public btvo d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dxiq.c(this, context);
        cokn a = cokn.a(intent);
        if (a.b()) {
            cokh.a(a.a);
        } else if (!this.b.s(dpyv.AREA_TRAFFIC.dm)) {
        } else {
            Location location = a.d;
            if (iry.a(this.d, dkiq.AREA_TRAFFIC_NOTIFICATION)) {
                String e = new dgsx().e(location);
                bbo bboVar = new bbo();
                bboVar.e("geofence_exit_triggger_location", e);
                this.a.c(bypp.EXITED_SUBSCRIPTION_GEOFENCE, bboVar);
            }
            this.c.f(ckhc.AREA_TRAFFIC_NOTIFICATION_GEOFENCE_RECEIVER);
            ((ckcn) this.c.a(ckht.X)).a();
            this.c.g(ckhc.AREA_TRAFFIC_NOTIFICATION_GEOFENCE_RECEIVER);
        }
    }
}
