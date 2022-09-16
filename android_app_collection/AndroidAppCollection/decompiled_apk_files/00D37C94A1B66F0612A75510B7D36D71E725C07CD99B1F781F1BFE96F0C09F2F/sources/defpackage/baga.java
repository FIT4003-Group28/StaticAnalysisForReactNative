package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.UrlRequest;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baga  reason: default package */
/* loaded from: classes2.dex */
public final class baga {
    final bagx a;
    final Executor b;
    final Executor c;
    final /* synthetic */ bagd d;

    public baga(bagd bagdVar, UrlRequest.Callback callback, Executor executor) {
        this.d = bagdVar;
        this.a = new bagx(callback);
        if (bagdVar.h) {
            this.b = executor;
            this.c = null;
            return;
        }
        this.b = new bagg(executor);
        this.c = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(bage bageVar) {
        try {
            this.b.execute(new baft(this.d, bageVar, 2));
        } catch (RejectedExecutionException e) {
            this.d.e(new baem("Exception posting task to executor", e));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        a(new bafw(this));
    }
}
