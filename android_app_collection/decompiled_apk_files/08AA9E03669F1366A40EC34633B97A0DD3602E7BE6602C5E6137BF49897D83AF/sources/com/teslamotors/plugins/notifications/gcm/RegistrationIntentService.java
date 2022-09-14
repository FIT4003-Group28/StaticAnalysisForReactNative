package com.teslamotors.plugins.notifications.gcm;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.a.c;
import android.util.Log;
import com.google.android.gms.iid.InstanceID;
import com.teslamotors.plugins.client.e;
/* loaded from: classes.dex */
public class RegistrationIntentService extends IntentService {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5409a = "RegistrationIntentService";

    public RegistrationIntentService() {
        super(f5409a);
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        try {
            String token = InstanceID.getInstance(this).getToken(e.a(this).h(), "GCM", null);
            String str = f5409a;
            Log.i(str, "GCM Registration Token: " + token);
            e.a(this).a(token);
            a(token);
        } catch (Exception e) {
            Log.e(f5409a, "Failed to complete token refresh", e);
        }
    }

    private void a(String str) {
        Intent intent = new Intent("remoteNotificationRegistered");
        intent.putExtra("deviceToken", str);
        c.a(this).a(intent);
    }
}
