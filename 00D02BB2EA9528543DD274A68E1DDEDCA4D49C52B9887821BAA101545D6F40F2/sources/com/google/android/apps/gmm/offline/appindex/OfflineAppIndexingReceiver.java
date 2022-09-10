package com.google.android.apps.gmm.offline.appindex;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OfflineAppIndexingReceiver extends BroadcastReceiver {
    public avlq a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        avlq avlqVar;
        dehn a;
        dxiq.c(this, context);
        if (intent != null) {
            intent.toString();
        }
        if (intent != null && "com.google.firebase.appindexing.UPDATE_INDEX".equals(intent.getAction())) {
            try {
                final avlq avlqVar2 = this.a;
                try {
                    bbo bboVar = new bbo();
                    bboVar.e("worker_name_key", "OfflineAppIndexingWorker");
                    bbp a2 = bboVar.a();
                    bbk bbkVar = new bbk();
                    bbkVar.c = 1;
                    bbkVar.a = false;
                    final bcb f = new bca(GmmWorkerWrapper.class).d("OfflineAppIndexingScheduler.TASK_TAG").c(a2).b(bbkVar.a()).f();
                    a = deew.h(avlqVar2.a.d("OfflineAppIndexingScheduler.TASK_TAG", 1, f).a(), new dbrn(avlqVar2, f) { // from class: avlp
                        private final avlq a;
                        private final bcb b;

                        {
                            this.a = avlqVar2;
                            this.b = f;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            avlq avlqVar3 = this.a;
                            try {
                                return this.b.a;
                            } catch (RuntimeException e) {
                                avlqVar3.b.c(13, e);
                                return bbx.c();
                            }
                        }
                    }, dege.a);
                } catch (RuntimeException e) {
                    avlqVar.b.c(13, e);
                    a = deha.a(bbx.c());
                }
                a.get();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }
}
