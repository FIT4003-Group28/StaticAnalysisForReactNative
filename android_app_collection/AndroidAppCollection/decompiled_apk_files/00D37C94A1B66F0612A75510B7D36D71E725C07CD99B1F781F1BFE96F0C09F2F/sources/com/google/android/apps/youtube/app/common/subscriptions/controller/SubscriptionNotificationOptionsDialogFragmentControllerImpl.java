package com.google.android.apps.youtube.app.common.subscriptions.controller;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.dialog.DialogFragmentController;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SubscriptionNotificationOptionsDialogFragmentControllerImpl extends DialogFragmentController {
    public SubscriptionNotificationOptionsDialogFragmentControllerImpl(dt dtVar) {
        super(dtVar, "SubscriptionNotificationOptionsDialogFragmentController");
    }

    public final void g(avbl avblVar) {
        k();
        if (i() == null) {
            foc focVar = new foc();
            Bundle bundle = new Bundle();
            bundle.putByteArray("model", avblVar.toByteArray());
            focVar.ae(bundle);
            j(focVar);
        }
        n();
    }
}
