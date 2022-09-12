package com.google.android.apps.gmm.reportaproblem.common.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DismissNotificationBroadcastReceiver extends BroadcastReceiver {
    public bomi a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dehn a;
        dxiq.c(this, context);
        try {
            final bomi bomiVar = this.a;
            Bundle extras = intent.getExtras();
            try {
                bbo bboVar = new bbo();
                bboVar.e("worker_name_key", "DismissNotificationWorker");
                if (extras != null) {
                    bboVar.e("gaia_id", extras.getString("gaia_id"));
                }
                bbk bbkVar = new bbk();
                bbkVar.c = 1;
                bbkVar.a = false;
                final bcb f = new bca(GmmWorkerWrapper.class).d("DismissNotificationScheduler").c(bboVar.a()).b(bbkVar.a()).f();
                a = deew.h(bomiVar.a.d("DismissNotificationScheduler", 1, f).a(), new dbrn(bomiVar, f) { // from class: bomh
                    private final bomi a;
                    private final bcb b;

                    {
                        this.a = bomiVar;
                        this.b = f;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        bomi bomiVar2 = this.a;
                        try {
                            return this.b.a;
                        } catch (RuntimeException e) {
                            bomiVar2.b.c(5, e);
                            return bbx.c();
                        }
                    }
                }, dege.a);
            } catch (RuntimeException e) {
                bomiVar.b.c(5, e);
                a = deha.a(bbx.c());
            }
            a.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }
}
