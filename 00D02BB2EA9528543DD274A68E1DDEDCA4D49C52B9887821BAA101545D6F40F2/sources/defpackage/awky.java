package defpackage;

import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
/* compiled from: PG */
/* renamed from: awky  reason: default package */
/* loaded from: classes3.dex */
public final class awky {
    public final isa a;
    private final bcl b;

    public awky(bcl bclVar, isa isaVar) {
        this.b = bclVar;
        this.a = isaVar;
    }

    public final dehn<?> a(bbo bboVar, bbk bbkVar) {
        try {
            bboVar.e("worker_name_key", "OfflineManualDownloadWorker");
            bbp a = bboVar.a();
            bbkVar.a = false;
            final bcb f = new bca(GmmWorkerWrapper.class).d("OfflineManualDownloadRescheduleTask").c(a).b(bbkVar.a()).f();
            return deew.h(this.b.d("OfflineManualDownloadRescheduleTask", 1, f).a(), new dbrn(this, f) { // from class: awkx
                private final awky a;
                private final bcb b;

                {
                    this.a = this;
                    this.b = f;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    awky awkyVar = this.a;
                    try {
                        return this.b.a;
                    } catch (RuntimeException e) {
                        awkyVar.a.c(16, e);
                        return bbx.c();
                    }
                }
            }, dege.a);
        } catch (RuntimeException e) {
            this.a.c(16, e);
            return deha.a(bbx.c());
        }
    }
}
