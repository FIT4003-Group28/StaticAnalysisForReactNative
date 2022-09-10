package com.google.android.apps.gmm.locationsharing.reporting;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.locationsharing.reporting.ActivityRecognitionBroadcastReceiver;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ActivityRecognitionBroadcastReceiver extends BroadcastReceiver {
    static final eaow a = eaow.d(15);
    private static final dcep<Integer> g = dcep.G(0, 1, 2, 8, 3, 7, new Integer[0]);
    private static final dced<Integer, Integer> h;
    public cqat b;
    @dzsi
    public ahwo c;
    public ajku d;
    public bvrb e;
    @dzsi
    public eapd f;
    private int i = 4;

    static {
        dcdd a2 = dcde.a();
        a2.b(2, 7);
        a2.b(2, 8);
        h = a2.a();
    }

    final synchronized void a(Context context, final int i) {
        bvrj.UI_THREAD.c();
        dxiq.c(this, context);
        ahwo ahwoVar = this.c;
        if (ahwoVar != null) {
            ajjt.d(i);
            ahwoVar.b();
        }
        final eapd eapdVar = new eapd(this.b.b());
        if (i != 5 && i != 4) {
            this.i = i;
            this.f = eapdVar;
            this.d.g(i);
            return;
        }
        if (i == this.i) {
            return;
        }
        this.i = i;
        this.f = eapdVar;
        this.e.a(new Runnable(this, eapdVar, i) { // from class: ajjp
            private final ActivityRecognitionBroadcastReceiver a;
            private final eapd b;
            private final int c;

            {
                this.a = this;
                this.b = eapdVar;
                this.c = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ActivityRecognitionBroadcastReceiver activityRecognitionBroadcastReceiver = this.a;
                eapd eapdVar2 = this.b;
                int i2 = this.c;
                synchronized (activityRecognitionBroadcastReceiver) {
                    eapd eapdVar3 = activityRecognitionBroadcastReceiver.f;
                    if (eapdVar3 != null && eapdVar2.equals(eapdVar3)) {
                        activityRecognitionBroadcastReceiver.d.g(i2);
                    }
                }
            }
        }, bvrj.UI_THREAD, a.b);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        bvrj.UI_THREAD.c();
        bvrj.UI_THREAD.c();
        if (intent != null && ActivityRecognitionResult.a(intent)) {
            ActivityRecognitionResult b = ActivityRecognitionResult.b(intent);
            dcpd<Integer> it = g.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                if (b.e(it.next().intValue()) <= 0) {
                    z2 = false;
                }
                z |= z2;
            }
            List<DetectedActivity> list = b.a;
            for (int i2 = 0; i2 < list.size(); i2++) {
                DetectedActivity detectedActivity = list.get(i2);
                dcpd<Integer> it2 = h.h(Integer.valueOf(detectedActivity.a())).iterator();
                boolean z3 = false;
                while (it2.hasNext()) {
                    z3 |= !(b.e(it2.next().intValue()) <= 0);
                }
                if (!z3 && (g.contains(Integer.valueOf(detectedActivity.a())) || !z)) {
                    i = detectedActivity.a();
                    break;
                }
            }
            i = 4;
            a(context, i);
        }
    }
}
