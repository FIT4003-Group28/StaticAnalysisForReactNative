package defpackage;

import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* renamed from: axbi  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class axbi implements bvqg {
    static final bvqg a = new axbi();

    private axbi() {
    }

    @Override // defpackage.bvqg
    public final void NU(Object obj) {
        bcl bclVar = (bcl) obj;
        try {
            bbo bboVar = new bbo();
            bboVar.e("worker_name_key", "PassiveAssistDataStoreExpirationWorker");
            bbp a2 = bboVar.a();
            bbk bbkVar = new bbk();
            bbkVar.c = 1;
            bbkVar.a = false;
            final bci f = new bch(GmmWorkerWrapper.class, 7L, TimeUnit.DAYS).d("PASSIVE_ASSIST.CLEAR_EXPIRED_DATA").c(a2).b(bbkVar.a()).f();
            deew.h(bclVar.f("PASSIVE_ASSIST.CLEAR_EXPIRED_DATA", 2, f).a(), new dbrn(f) { // from class: axbe
                private final bci a;

                {
                    this.a = f;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj2) {
                    return this.a.a;
                }
            }, dege.a).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }
}
