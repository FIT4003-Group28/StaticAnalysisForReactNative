package com.google.android.apps.gmm.parkinglocation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ParkingLocationDismissReceiver extends BroadcastReceiver {
    public gdo a;
    public awth b;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c;
        dxiq.c(this, context);
        this.a.b();
        if (!"com.google.android.apps.gmm.parkinglocation.DISMISS_PARKING_LOCATION_NOTIFICATION".equals(intent.getAction())) {
            intent.getAction();
            this.a.e();
        } else if (!intent.hasExtra("parking_location_timestamp_millis_key")) {
            this.a.e();
        } else {
            long longExtra = intent.getLongExtra("parking_location_timestamp_millis_key", -1L);
            if (!intent.hasExtra("parking_location_notification_type_key")) {
                this.a.e();
                return;
            }
            String stringExtra = intent.getStringExtra("parking_location_notification_type_key");
            int hashCode = stringExtra.hashCode();
            int i = 2;
            if (hashCode == -352373073) {
                if (stringExtra.equals("EXPIRATION")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 860618295) {
                if (hashCode == 1083308524 && stringExtra.equals("EXPIRATION_WARNING")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (stringExtra.equals("INFORMATIONAL")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                i = 1;
            } else if (c != 1) {
                if (c != 2) {
                    throw new IllegalArgumentException();
                }
                i = 3;
            }
            if (i - 1 != 0) {
                this.b.b(null);
            } else {
                this.b.a.Z(bvjk.cU, longExtra);
            }
            this.a.e();
        }
    }
}
