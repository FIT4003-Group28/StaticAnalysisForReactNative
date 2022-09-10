package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dypd  reason: default package */
/* loaded from: classes6.dex */
public final class dypd {
    private static final Logger g = Logger.getLogger(dypd.class.getName());
    public final long a;
    public final dbtp b;
    public Map<dyqe, Executor> c = new LinkedHashMap();
    public boolean d;
    public Throwable e;
    public long f;

    public dypd(long j, dbtp dbtpVar) {
        this.a = j;
        this.b = dbtpVar;
    }

    public static void a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            g.logp(Level.SEVERE, "io.grpc.internal.Http2Ping", "doExecute", "Failed to execute PingCallback", th);
        }
    }

    public static void b(dyqe dyqeVar, Executor executor, Throwable th) {
        a(executor, d(dyqeVar, th));
    }

    public static Runnable c(dyqe dyqeVar, long j) {
        return new dypb();
    }

    public static Runnable d(dyqe dyqeVar, Throwable th) {
        return new dypc(dyqeVar);
    }
}
