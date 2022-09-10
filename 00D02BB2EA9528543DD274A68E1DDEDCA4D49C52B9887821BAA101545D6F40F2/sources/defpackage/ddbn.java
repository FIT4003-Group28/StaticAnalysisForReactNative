package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: ddbn  reason: default package */
/* loaded from: classes5.dex */
public final class ddbn<T> extends dees<T> {
    public static final Logger a = Logger.getLogger(ddbn.class.getCanonicalName());
    public static final Object b = new Object();
    static final ddbd i = new ddbd();
    public final dbty<? extends dehn<T>> c;
    public final ddbc d;
    public final dbsl<? super Exception> e;
    public final dbtp f;
    public final dehq g;
    private final Executor l;
    public volatile int h = 0;
    private final AtomicReference<dehn<Object>> m = new AtomicReference<>(deha.a(new Object()));

    public ddbn(dbty dbtyVar, ddbc ddbcVar, dbsl dbslVar, Executor executor, ScheduledExecutorService scheduledExecutorService, dbug dbugVar, ddbd ddbdVar) {
        dbsk.s(dbtyVar);
        this.c = dbtyVar;
        dbsk.s(ddbcVar);
        this.d = ddbcVar;
        dbsk.s(dbslVar);
        this.e = dbslVar;
        dbsk.s(executor);
        ddbf ddbfVar = new ddbf(this, executor);
        this.l = ddbfVar;
        this.g = dehx.d(scheduledExecutorService);
        this.f = dbtp.c(dbugVar);
        f(0L, TimeUnit.MILLISECONDS);
        Pk(new ddbe(), ddbfVar);
    }

    public static <T> ddbn<T> d(dbty<? extends dehn<T>> dbtyVar, ddbc ddbcVar, dbsl<? super Exception> dbslVar, ScheduledExecutorService scheduledExecutorService) {
        ScheduledExecutorService scheduledExecutorService2;
        ddbl ddblVar = new ddbl();
        ddblVar.b = dbsg.i(scheduledExecutorService);
        dbsk.m(ddblVar.b.a(), "Either executor or scheduledExecutorService needs to be set.");
        dbsg<ScheduledExecutorService> dbsgVar = ddblVar.b;
        dbsk.s(dbsgVar);
        ScheduledExecutorService b2 = dbsgVar.b();
        if (!ddblVar.b.a()) {
            scheduledExecutorService2 = ddbm.a;
        } else {
            scheduledExecutorService2 = ddblVar.b.b();
        }
        return new ddbn<>(dbtyVar, ddbcVar, dbslVar, b2, scheduledExecutorService2, ddblVar.c, ddblVar.d);
    }

    @Override // defpackage.dees
    protected final void OO() {
        dehn<Object> andSet = this.m.getAndSet(deha.c());
        if (andSet != null) {
            boolean z = true;
            if (isCancelled() && !i()) {
                z = false;
            }
            andSet.cancel(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dees
    public final String OP() {
        String sb;
        dehn<Object> dehnVar = this.m.get();
        String obj = dehnVar.toString();
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.e);
        String valueOf3 = String.valueOf(this.d);
        int i2 = this.h;
        if (dehnVar.isDone()) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 14);
            sb2.append(", activeTry=[");
            sb2.append(obj);
            sb2.append("]");
            sb = sb2.toString();
        }
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb3 = new StringBuilder(length + 70 + length2 + String.valueOf(valueOf3).length() + String.valueOf(sb).length());
        sb3.append("futureSupplier=[");
        sb3.append(valueOf);
        sb3.append("], shouldContinue=[");
        sb3.append(valueOf2);
        sb3.append("], strategy=[");
        sb3.append(valueOf3);
        sb3.append("], tries=[");
        sb3.append(i2);
        sb3.append("]");
        sb3.append(sb);
        return sb3.toString();
    }

    public final void f(long j, TimeUnit timeUnit) {
        deig d = deig.d();
        dehn<Object> andSet = this.m.getAndSet(d);
        if (j != 0) {
            andSet = deew.g(andSet, new ddbh(this, j, timeUnit), dege.a);
        }
        dehn g = deew.g(andSet, new ddbi(this), this.l);
        d.p(deee.h(g, Exception.class, new ddbj(this, g), this.l));
        d.Pk(new ddbk(this, d), dege.a);
    }
}
