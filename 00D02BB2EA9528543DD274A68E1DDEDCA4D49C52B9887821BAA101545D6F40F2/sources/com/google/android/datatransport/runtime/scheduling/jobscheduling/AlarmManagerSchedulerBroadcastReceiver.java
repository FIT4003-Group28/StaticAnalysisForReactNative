package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        clex.a(context);
        clev d = clew.d();
        d.b(queryParameter);
        d.c(clil.a(intValue));
        if (queryParameter2 != null) {
            ((clem) d).a = Base64.decode(queryParameter2, 0);
        }
        clex.b().a.a(d.a(), i, clfu.a);
    }
}
