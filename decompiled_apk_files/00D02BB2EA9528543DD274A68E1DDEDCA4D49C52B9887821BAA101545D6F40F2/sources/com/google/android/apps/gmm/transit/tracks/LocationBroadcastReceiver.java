package com.google.android.apps.gmm.transit.tracks;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.LocationResult;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LocationBroadcastReceiver extends BroadcastReceiver {
    public ckcw a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        LocationResult c;
        dxiq.c(this, context);
        if (intent == null || (c = LocationResult.c(intent)) == null) {
            return;
        }
        ((ckcn) this.a.a(ckkm.g)).a();
        ((ckcn) this.a.a(ckkm.h)).b(c.b.size());
    }
}
