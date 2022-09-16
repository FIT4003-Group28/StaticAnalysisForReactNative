package com.teslamotors.plugins.calendar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* loaded from: classes.dex */
public class CalendarReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5269a = "CalendarReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Intent a2 = CalendarSyncService.a(context, intent);
        if (a2 != null) {
            context.startService(a2);
        }
    }
}
