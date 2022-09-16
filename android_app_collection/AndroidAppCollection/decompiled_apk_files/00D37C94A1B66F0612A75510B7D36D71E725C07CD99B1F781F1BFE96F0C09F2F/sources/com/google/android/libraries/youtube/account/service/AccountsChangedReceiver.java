package com.google.android.libraries.youtube.account.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountsChangedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            zep.l("AccountsChangedReceiver: null intent received. Ignoring.");
        } else {
            AccountsChangedJobIntentService.d(context, AccountsChangedJobIntentService.class, intent);
        }
    }
}
