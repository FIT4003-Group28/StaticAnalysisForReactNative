package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends qqt {
    @Override // defpackage.qqt
    protected final int b(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) rwd.d(aobp.b(cloudMessage.a, context, qrj.j))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.qqt
    protected final void c(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (aodm.g(putExtras)) {
            aodm.e("_nd", putExtras.getExtras());
        }
    }
}
