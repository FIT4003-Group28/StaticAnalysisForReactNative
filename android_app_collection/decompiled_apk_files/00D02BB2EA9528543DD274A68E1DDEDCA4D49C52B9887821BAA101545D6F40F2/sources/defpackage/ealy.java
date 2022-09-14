package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ealy  reason: default package */
/* loaded from: classes6.dex */
public final class ealy {
    final eamm a;
    final Executor b;
    final Executor c;
    final /* synthetic */ eamc d;

    public ealy(eamc eamcVar, UrlRequest.Callback callback, Executor executor) {
        this.d = eamcVar;
        this.a = new eamm(callback);
        if (eamcVar.g) {
            this.b = executor;
            this.c = null;
            return;
        }
        this.b = new eamf(executor);
        this.c = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(eamd eamdVar) {
        try {
            this.b.execute(new ealq(this.d, eamdVar));
        } catch (RejectedExecutionException e) {
            this.d.d(new eakn("Exception posting task to executor", e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        a(new ealt(this));
    }
}
