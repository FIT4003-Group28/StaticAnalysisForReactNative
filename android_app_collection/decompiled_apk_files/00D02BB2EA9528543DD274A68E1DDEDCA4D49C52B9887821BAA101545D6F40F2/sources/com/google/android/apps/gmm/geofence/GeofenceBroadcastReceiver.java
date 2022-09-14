package com.google.android.apps.gmm.geofence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.ArrayList;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GeofenceBroadcastReceiver extends BroadcastReceiver {
    public acje a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"ACTION_RECEIVE_GEOFENCE_TRANSITION".equals(intent.getAction())) {
            return;
        }
        dxiq.c(this, context);
        final cokn a = cokn.a(intent);
        if (a.b()) {
            cokh.a(a.a);
        }
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        final acje acjeVar = this.a;
        ArrayList arrayList = new ArrayList();
        for (ParcelableGeofence parcelableGeofence : a.c) {
            acjm acjmVar = acjeVar.d;
            arrayList.add(deew.g(acjmVar.a.l(bwrj.GEOFENCE_DATA, parcelableGeofence.a, (dssr) acjz.m.cu(7)), new defg(acjeVar, a) { // from class: aciz
                private final acje a;
                private final cokn b;

                {
                    this.a = acjeVar;
                    this.b = a;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    acje acjeVar2 = this.a;
                    cokn coknVar = this.b;
                    acjz acjzVar = (acjz) obj;
                    int a2 = acjt.a(acjzVar.k);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    ahyb ahybVar = a2 == 2 ? acjeVar2.e : null;
                    if (ahybVar != null) {
                        acjw a3 = acjr.a(acjzVar);
                        dzvx.c(coknVar, "event");
                        dzvx.c(a3, "geofence");
                        if (coknVar.b()) {
                            cokh.a(coknVar.a);
                        } else {
                            ahyb.a(coknVar, a3);
                            ahwo ahwoVar = ahybVar.a;
                            if (ahwoVar != null) {
                                ahyb.a(coknVar, a3);
                                ahwoVar.b();
                            }
                        }
                    }
                    return deha.a(acjzVar);
                }
            }, acjeVar.f));
        }
        if (arrayList.isEmpty()) {
            goAsync.finish();
        } else {
            deha.l(arrayList).b(new Callable(goAsync) { // from class: acja
                private final BroadcastReceiver.PendingResult a;

                {
                    this.a = goAsync;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    BroadcastReceiver.PendingResult pendingResult = this.a;
                    dcdn<acjq, Integer> dcdnVar = acje.a;
                    pendingResult.finish();
                    return true;
                }
            }, acjeVar.f);
        }
    }
}
