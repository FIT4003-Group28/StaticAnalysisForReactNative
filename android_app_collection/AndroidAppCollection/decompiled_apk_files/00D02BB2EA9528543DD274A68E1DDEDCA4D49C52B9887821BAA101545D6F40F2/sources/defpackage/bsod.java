package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bsod  reason: default package */
/* loaded from: classes4.dex */
public final class bsod {
    public final ckmp a;
    private final Executor b;

    public bsod(ckmp ckmpVar, Executor executor) {
        this.a = ckmpVar;
        this.b = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b.execute(new Runnable(this) { // from class: bsoc
            private final bsod a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.c(ckmk.GMM_COMPONENT_TRANSITION_SEARCH_TRAVERSAL_RESULTS_LIST_ON_CARD_FOCUSED, ckmo.OK);
            }
        });
    }
}
