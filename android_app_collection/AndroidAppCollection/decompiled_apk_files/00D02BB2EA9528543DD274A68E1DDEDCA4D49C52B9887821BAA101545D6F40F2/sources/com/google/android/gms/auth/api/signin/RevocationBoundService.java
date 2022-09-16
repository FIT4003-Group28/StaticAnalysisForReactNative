package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            return new cmue(this);
        }
        if (String.valueOf(intent.getAction()).length() != 0) {
            return null;
        }
        new String("Unknown action sent to RevocationBoundService: ");
        return null;
    }
}
