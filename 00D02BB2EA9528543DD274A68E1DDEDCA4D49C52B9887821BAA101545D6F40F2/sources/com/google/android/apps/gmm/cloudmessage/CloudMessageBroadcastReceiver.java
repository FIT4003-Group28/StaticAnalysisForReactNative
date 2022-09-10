package com.google.android.apps.gmm.cloudmessage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CloudMessageBroadcastReceiver extends BroadcastReceiver {
    public dxio<pad> a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        pad padVar;
        dehn a;
        dxiq.c(this, context);
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            try {
                final pad a2 = this.a.a();
                try {
                    bbo bboVar = new bbo();
                    bboVar.e("worker_name_key", "CloudMessageWorker");
                    bbp a3 = bboVar.a();
                    bbk bbkVar = new bbk();
                    bbkVar.c = 2;
                    bbkVar.a = false;
                    final bcb f = new bca(GmmWorkerWrapper.class).d("CLOUD_MESSAGE").c(a3).b(bbkVar.a()).f();
                    a = deew.h(a2.a.d("CLOUD_MESSAGE", 1, f).a(), new dbrn(a2, f) { // from class: pac
                        private final pad a;
                        private final bcb b;

                        {
                            this.a = a2;
                            this.b = f;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            pad padVar2 = this.a;
                            try {
                                return this.b.a;
                            } catch (RuntimeException e) {
                                padVar2.b.c(3, e);
                                return bbx.c();
                            }
                        }
                    }, dege.a);
                } catch (RuntimeException e) {
                    padVar.b.c(3, e);
                    a = deha.a(bbx.c());
                }
                a.get();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }
}
