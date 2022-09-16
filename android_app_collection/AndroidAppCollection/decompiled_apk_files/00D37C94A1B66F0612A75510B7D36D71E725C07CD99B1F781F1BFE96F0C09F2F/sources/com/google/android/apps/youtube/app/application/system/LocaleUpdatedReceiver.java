package com.google.android.apps.youtube.app.application.system;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class LocaleUpdatedReceiver extends ege {
    public yjs a;

    @Override // defpackage.ege, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a(context);
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            this.a.e("locale_update_runner", 1L, true, 0, null, null, false);
        } else {
            zep.b("Received a malicious intent with unexpected action.");
        }
    }
}
