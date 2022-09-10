package com.google.android.apps.gmm.base.service.workmanager;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.Set;
/* compiled from: PG */
/* loaded from: classes.dex */
public class GmmWorkerWrapper extends ListenableWorker {
    public final WorkerParameters d;
    private final irw e;

    public GmmWorkerWrapper(Context context, WorkerParameters workerParameters, irw irwVar) {
        super(context, workerParameters);
        this.d = workerParameters;
        this.e = irwVar;
    }

    @Override // androidx.work.ListenableWorker
    public final dehn<bbx> c() {
        return deee.g(deew.h(degp.q(this.e.a(this.d)), new dbrn(this) { // from class: irq
            private final GmmWorkerWrapper a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                GmmWorkerWrapper gmmWorkerWrapper = this.a;
                bbx bbxVar = (bbx) obj;
                if (bbxVar.equals(bbx.c())) {
                    Set<String> set = gmmWorkerWrapper.d.c;
                }
                return bbxVar;
            }
        }, dege.a), Throwable.class, new dbrn(this) { // from class: irr
            private final GmmWorkerWrapper a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Set<String> set = this.a.d.c;
                ((Throwable) obj).getMessage();
                return bbx.c();
            }
        }, dege.a);
    }

    @Override // androidx.work.ListenableWorker
    public final void e() {
        Set<String> set = this.d.c;
    }
}
