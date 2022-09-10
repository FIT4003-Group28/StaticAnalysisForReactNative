package com.google.android.apps.gmm.locationsharing.reporting;

import android.app.Application;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import com.google.android.apps.gmm.locationsharing.reporting.LocationCollectedBroadcastReceiver;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LocationCollectedBroadcastReceiver extends BroadcastReceiver {
    static final eaow a = eaow.d(15);
    public static final /* synthetic */ int k = 0;
    @dzsi
    public ahwo b;
    public cqat c;
    public ajku d;
    public ajnm e;
    public ajmq f;
    public ckcw g;
    public btvo h;
    public ajsj i;
    public Executor j;

    public static PendingIntent a(Application application) {
        return PendingIntent.getBroadcast(application, 0, new Intent(application, LocationCollectedBroadcastReceiver.class), 134217728);
    }

    final synchronized void b(Context context) {
        dxiq.c(this, context);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final LocationResult c;
        bvrj.UI_THREAD.c();
        if (intent == null) {
            return;
        }
        b(context);
        if (this.i.f()) {
            return;
        }
        if (LocationAvailability.b(intent) && LocationAvailability.b(intent)) {
            try {
                LocationAvailability locationAvailability = (LocationAvailability) intent.getExtras().getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
            } catch (ClassCastException unused) {
            }
        }
        if (!LocationResult.b(intent) || (c = LocationResult.c(intent)) == null) {
            return;
        }
        if (new eaow(this.e.f(), new eapd(this.c.b())).q(a)) {
            ahwo ahwoVar = this.b;
            if (ahwoVar == null) {
                return;
            }
            ahwoVar.b();
            return;
        }
        ahwo ahwoVar2 = this.b;
        if (ahwoVar2 != null) {
            ahwoVar2.b();
        }
        ((ckco) this.g.a(ckgd.L)).a(c.b.size());
        ((ckco) this.g.a(ckgd.K)).a(dcdc.q(dcft.i(c.b, new dbsl(this) { // from class: ajkd
            private final LocationCollectedBroadcastReceiver a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                LocationCollectedBroadcastReceiver locationCollectedBroadcastReceiver = this.a;
                Location location = (Location) obj;
                dqza dqzaVar = locationCollectedBroadcastReceiver.h.getLocationSharingParameters().J;
                if (dqzaVar == null) {
                    dqzaVar = dqza.c;
                }
                return new eaow(new eapd(location.getTime()), new eapd(locationCollectedBroadcastReceiver.c.b())).q(eaow.e((long) dqzaVar.a)) && location.getAccuracy() < ((float) dqzaVar.b);
            }
        })).size());
        if (c.a() != null) {
            ((ckcp) this.g.a(ckgd.I)).a(new eaow(new eapd(c.a().getTime()), new eapd(this.c.b())).b);
            ((ckco) this.g.a(ckgd.J)).a((int) c.a().getAccuracy());
        }
        this.e.e();
        dehn<Void> a2 = this.d.a();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        a2.Pk(new Runnable(this, c, goAsync) { // from class: ajkc
            private final LocationCollectedBroadcastReceiver a;
            private final LocationResult b;
            private final BroadcastReceiver.PendingResult c;

            {
                this.a = this;
                this.b = c;
                this.c = goAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LocationCollectedBroadcastReceiver locationCollectedBroadcastReceiver = this.a;
                LocationResult locationResult = this.b;
                final BroadcastReceiver.PendingResult pendingResult = this.c;
                dbsg<ajni> b = locationCollectedBroadcastReceiver.e.b();
                if (b.a()) {
                    b.b().c();
                    ahwo ahwoVar3 = locationCollectedBroadcastReceiver.b;
                    if (ahwoVar3 != null) {
                        ahwoVar3.b();
                    }
                    deha.q(locationCollectedBroadcastReceiver.f.d(b.b().c(), b.b().g(), dcdc.r(locationResult.b)), bvqj.a(new bvqg(pendingResult) { // from class: ajke
                        private final BroadcastReceiver.PendingResult a;

                        {
                            this.a = pendingResult;
                        }

                        @Override // defpackage.bvqg
                        public final void NU(Object obj) {
                            BroadcastReceiver.PendingResult pendingResult2 = this.a;
                            Boolean bool = (Boolean) obj;
                            int i = LocationCollectedBroadcastReceiver.k;
                            pendingResult2.finish();
                        }
                    }), locationCollectedBroadcastReceiver.j);
                    return;
                }
                pendingResult.finish();
                ahwo ahwoVar4 = locationCollectedBroadcastReceiver.b;
                if (ahwoVar4 == null) {
                    return;
                }
                ahwoVar4.b();
            }
        }, this.j);
    }
}
