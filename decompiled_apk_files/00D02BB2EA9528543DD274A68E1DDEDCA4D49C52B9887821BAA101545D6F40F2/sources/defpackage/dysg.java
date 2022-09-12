package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
/* compiled from: PG */
/* renamed from: dysg  reason: default package */
/* loaded from: classes6.dex */
final class dysg extends WeakReference<dysh> {
    public static final /* synthetic */ int a = 0;
    private static final boolean b = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException c;
    private final ReferenceQueue<dysh> d;
    private final ConcurrentMap<dysg, dysg> e;
    private final String f;
    private final Reference<RuntimeException> g;
    private final AtomicBoolean h;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        c = runtimeException;
    }

    public dysg(dysh dyshVar, dyhi dyhiVar, ReferenceQueue<dysh> referenceQueue, ConcurrentMap<dysg, dysg> concurrentMap) {
        super(dyshVar, referenceQueue);
        RuntimeException runtimeException;
        this.h = new AtomicBoolean();
        if (b) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = c;
        }
        this.g = new SoftReference(runtimeException);
        this.f = dyhiVar.toString();
        this.d = referenceQueue;
        this.e = concurrentMap;
        concurrentMap.put(this, this);
        b(referenceQueue);
    }

    static void b(ReferenceQueue<dysh> referenceQueue) {
        while (true) {
            dysg dysgVar = (dysg) referenceQueue.poll();
            if (dysgVar != null) {
                RuntimeException runtimeException = dysgVar.g.get();
                dysgVar.c();
                if (!dysgVar.h.get()) {
                    Level level = Level.SEVERE;
                    if (dysh.b.isLoggable(level)) {
                        String property = System.getProperty("line.separator");
                        StringBuilder sb = new StringBuilder(String.valueOf(property).length() + 148);
                        sb.append("*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*");
                        sb.append(property);
                        sb.append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        LogRecord logRecord = new LogRecord(level, sb.toString());
                        logRecord.setLoggerName(dysh.b.getName());
                        logRecord.setParameters(new Object[]{dysgVar.f});
                        logRecord.setThrown(runtimeException);
                        dysh.b.log(logRecord);
                    }
                }
            } else {
                return;
            }
        }
    }

    private final void c() {
        super.clear();
        this.e.remove(this);
        this.g.clear();
    }

    public final void a() {
        if (!this.h.getAndSet(true)) {
            clear();
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        c();
        b(this.d);
    }
}
