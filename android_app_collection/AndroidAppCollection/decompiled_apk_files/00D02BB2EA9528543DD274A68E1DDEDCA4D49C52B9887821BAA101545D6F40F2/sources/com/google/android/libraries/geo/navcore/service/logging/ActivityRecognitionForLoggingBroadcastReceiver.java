package com.google.android.libraries.geo.navcore.service.logging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.location.ActivityRecognitionResult;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ActivityRecognitionForLoggingBroadcastReceiver extends BroadcastReceiver {
    public btrm a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ActivityRecognitionResult b;
        dxiq.c(this, context);
        if (intent == null || !ActivityRecognitionResult.a(intent) || (b = ActivityRecognitionResult.b(intent)) == null) {
            return;
        }
        this.a.b(new crhc(b));
    }
}
