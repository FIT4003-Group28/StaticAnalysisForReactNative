package com.teslamotors.plugins.notifications.gcm;

import android.content.Intent;
import com.google.android.gms.iid.InstanceIDListenerService;
/* loaded from: classes.dex */
public class TeslaInstanceIDListenerService extends InstanceIDListenerService {
    @Override // com.google.android.gms.iid.InstanceIDListenerService
    public void onTokenRefresh() {
        startService(new Intent(this, RegistrationIntentService.class));
    }
}
