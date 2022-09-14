package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c.e.a.a.i.m;
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        c.e.a.a.i.r.a(context);
        m.a d2 = c.e.a.a.i.m.d();
        d2.a(queryParameter);
        d2.a(c.e.a.a.i.z.a.a(intValue));
        if (queryParameter2 != null) {
            d2.a(Base64.decode(queryParameter2, 0));
        }
        c.e.a.a.i.r.b().a().a(d2.a(), i, b.a());
    }
}
