package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class FirebaseInstanceIdReceiver extends cnlo {
    private static Intent f(String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // defpackage.cnlo
    protected final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) cpda.d(new derm(context).a(cloudMessage.a))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @Override // defpackage.cnlo
    protected final void b(Context context, Bundle bundle) {
        try {
            cpda.d(new derm(context).a(f("com.google.firebase.messaging.NOTIFICATION_OPEN", bundle)));
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.cnlo
    protected final void c(Context context, Bundle bundle) {
        try {
            cpda.d(new derm(context).a(f("com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle)));
        } catch (InterruptedException | ExecutionException unused) {
        }
    }
}
