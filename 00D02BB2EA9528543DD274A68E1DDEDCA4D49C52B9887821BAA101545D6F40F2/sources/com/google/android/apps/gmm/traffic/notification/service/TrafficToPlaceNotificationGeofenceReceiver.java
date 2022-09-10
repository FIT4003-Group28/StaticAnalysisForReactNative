package com.google.android.apps.gmm.traffic.notification.service;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.google.android.apps.gmm.traffic.notification.service.TrafficToPlaceNotificationGeofenceReceiver;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TrafficToPlaceNotificationGeofenceReceiver extends BroadcastReceiver {
    private static final dcqe g = dcqe.c("com.google.android.apps.gmm.traffic.notification.service.TrafficToPlaceNotificationGeofenceReceiver");
    public ckcw a;
    public auhi b;
    public byqh c;
    public dxio<byye> d;
    public akfa e;
    public bvrb f;

    private final void a(final qjj qjjVar, final String str, final Intent intent) {
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.f.b(new Runnable(this, qjjVar, str, intent, goAsync) { // from class: byrx
            private final TrafficToPlaceNotificationGeofenceReceiver a;
            private final qjj b;
            private final String c;
            private final Intent d;
            private final BroadcastReceiver.PendingResult e;

            {
                this.a = this;
                this.b = qjjVar;
                this.c = str;
                this.d = intent;
                this.e = goAsync;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TrafficToPlaceNotificationGeofenceReceiver trafficToPlaceNotificationGeofenceReceiver = this.a;
                qjj qjjVar2 = this.b;
                String str2 = this.c;
                Intent intent2 = this.d;
                BroadcastReceiver.PendingResult pendingResult = this.e;
                btlu btluVar = null;
                String stringExtra = intent2.hasExtra("ObfuscatedGaia") ? intent2.getStringExtra("ObfuscatedGaia") : null;
                if (!dbsj.d(stringExtra)) {
                    btluVar = trafficToPlaceNotificationGeofenceReceiver.e.n(stringExtra);
                }
                trafficToPlaceNotificationGeofenceReceiver.c.i(qjjVar2, str2, btluVar);
                pendingResult.finish();
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b(defpackage.cokn r6, defpackage.qjj r7) {
        /*
            r5 = this;
            int r0 = r7.ordinal()
            r1 = 3
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L17
            if (r0 == r1) goto L1a
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r0 = 0
            r6[r0] = r7
            java.lang.String r7 = "Unknown notification type: %s"
            defpackage.bvoo.h(r7, r6)
            return
        L17:
            ckgz r7 = defpackage.ckht.aw
            goto L1c
        L1a:
            ckgz r7 = defpackage.ckht.ak
        L1c:
            r0 = 4
            r3 = 2
            if (r6 != 0) goto L22
            r1 = 2
            goto L38
        L22:
            boolean r4 = r6.b()
            if (r4 == 0) goto L29
            goto L38
        L29:
            int r6 = r6.b
            if (r6 == r2) goto L37
            if (r6 == r3) goto L35
            if (r6 == r0) goto L33
            r1 = 1
            goto L38
        L33:
            r1 = 4
            goto L38
        L35:
            r1 = 6
            goto L38
        L37:
            r1 = 5
        L38:
            ckcw r6 = r5.a
            java.lang.Object r6 = r6.a(r7)
            ckco r6 = (defpackage.ckco) r6
            int r1 = r1 + (-1)
            r6.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.traffic.notification.service.TrafficToPlaceNotificationGeofenceReceiver.b(cokn, qjj):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gmm.traffic.notification.service.TrafficToPlaceNotificationGeofenceReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
