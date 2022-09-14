package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ddbj  reason: default package */
/* loaded from: classes5.dex */
public final class ddbj implements defg<Exception, Object> {
    final /* synthetic */ dehn a;
    final /* synthetic */ ddbn b;

    public ddbj(ddbn ddbnVar, dehn dehnVar) {
        this.b = ddbnVar;
        this.a = dehnVar;
    }

    @Override // defpackage.defg
    public final /* bridge */ /* synthetic */ dehn<Object> a(Exception exc) {
        Exception exc2 = exc;
        if (this.a.isCancelled()) {
            return this.a;
        }
        ddbn ddbnVar = this.b;
        ddbc ddbcVar = ddbnVar.d;
        int i = ddbnVar.h;
        this.b.f.d(TimeUnit.MILLISECONDS);
        int f = ddbcVar.f(i);
        if (f < 0 || !this.b.e.a(exc2)) {
            ddbn.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "terminalExceptionCaught", "RetryingFuture caught terminal exception", (Throwable) exc2);
            int i2 = this.b.h;
            throw new ddaw(exc2);
        }
        ddbn.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "retryableExceptionCaught", "RetryingFuture caught exception; retrying", (Throwable) exc2);
        this.b.f(f, TimeUnit.MILLISECONDS);
        return deha.a(ddbn.b);
    }
}
