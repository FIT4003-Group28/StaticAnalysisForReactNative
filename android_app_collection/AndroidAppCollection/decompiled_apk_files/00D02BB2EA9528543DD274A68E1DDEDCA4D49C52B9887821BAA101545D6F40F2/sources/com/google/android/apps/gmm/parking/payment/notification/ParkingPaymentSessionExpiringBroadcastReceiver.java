package com.google.android.apps.gmm.parking.payment.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ParkingPaymentSessionExpiringBroadcastReceiver extends BroadcastReceiver {
    public awpp a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dfvu dfvuVar;
        dxiq.c(this, context);
        awpp awppVar = this.a;
        Bundle bundleExtra = intent.getBundleExtra("parking_session_details");
        if (bundleExtra == null || (dfvuVar = (dfvu) bvrs.e(bundleExtra, dfvu.class, (dssr) dfvu.c.cu(7))) == null) {
            return;
        }
        auhi a = awppVar.b.a();
        augc a2 = awppVar.c.a().a(null, cjrx.a(ddcu.ab.a), dpyv.PARKING_PAYMENT_SESSION_EXPIRATION.dm, awppVar.b.a().h(dpyv.PARKING_PAYMENT_SESSION_EXPIRATION.dm));
        Resources resources = awppVar.a.getResources();
        String string = resources.getString(R.string.PARKING_SESSION_EXPIRING_NOTIFICATION_TITLE, awpq.a(new eapd(dfvuVar.a), dfvuVar.b));
        eapd eapdVar = new eapd(eaor.a());
        eapd eapdVar2 = new eapd(dfvuVar.a);
        if (eapdVar.a >= eapdVar2.a) {
            throw new IllegalArgumentException("begin time must be less than end time");
        }
        eapn eapnVar = new eapn(eapdVar, eapdVar2);
        int l = eapnVar.a.l(eapnVar, eapo.b);
        String quantityString = resources.getQuantityString(R.plurals.DA_MINUTES_ABBREVIATED, l, Integer.valueOf(l));
        if (eapnVar.a() != 0) {
            int a3 = eapnVar.a();
            quantityString = String.format("%s %s", resources.getQuantityString(R.plurals.DA_HOURS_ABBREVIATED, a3, Integer.valueOf(a3)), quantityString);
        }
        String string2 = resources.getString(R.string.PARKING_SESSION_EXPIRING_NOTIFICATION_TEXT, quantityString);
        a2.f = string;
        a2.g = string2;
        a2.v = 1;
        a2.H(-1);
        a2.U = 2;
        a2.s(false);
        a2.D(ibl.G().b(awppVar.a));
        a2.C(false);
        a.j(a2.a());
    }
}
