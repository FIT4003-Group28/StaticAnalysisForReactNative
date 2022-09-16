package com.google.android.apps.gmm.ugc.phototaken;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class StartPhotoTakenNotifierServiceReceiver extends BroadcastReceiver {
    public ckcw a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ckhc ckhcVar;
        dxiq.c(this, context);
        ckcw ckcwVar = this.a;
        intent.setAction(PhotoTakenNotifierService.a);
        intent.setClass(context, PhotoTakenNotifierService.class);
        ckcwVar.f(ckhc.PHOTO_TAKEN_NOTIFICATION_START_NOTIFIER_SERVICE_RECEIVER);
        try {
            try {
                context.startService(intent);
                ckhcVar = ckhc.PHOTO_TAKEN_NOTIFICATION_START_NOTIFIER_SERVICE_RECEIVER;
            } catch (SecurityException unused) {
                ((ckcn) ckcwVar.a(ckdz.h)).a();
                ckhcVar = ckhc.PHOTO_TAKEN_NOTIFICATION_START_NOTIFIER_SERVICE_RECEIVER;
            }
            ckcwVar.g(ckhcVar);
        } catch (Throwable th) {
            ckcwVar.g(ckhc.PHOTO_TAKEN_NOTIFICATION_START_NOTIFIER_SERVICE_RECEIVER);
            throw th;
        }
    }
}
