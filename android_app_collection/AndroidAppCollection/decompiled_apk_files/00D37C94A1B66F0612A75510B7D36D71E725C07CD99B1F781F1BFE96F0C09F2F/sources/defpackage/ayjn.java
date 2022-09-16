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
/* renamed from: ayjn  reason: default package */
/* loaded from: classes2.dex */
public final class ayjn extends WeakReference {
    public static final /* synthetic */ int a = 0;
    private static final boolean b = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException c;
    private final ReferenceQueue d;
    private final ConcurrentMap e;
    private final String f;
    private final Reference g;
    private final AtomicBoolean h;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        c = runtimeException;
    }

    public ayjn(ayjo ayjoVar, ayal ayalVar, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(ayjoVar, referenceQueue);
        RuntimeException runtimeException;
        this.h = new AtomicBoolean();
        if (b) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = c;
        }
        this.g = new SoftReference(runtimeException);
        this.f = ayalVar.toString();
        this.d = referenceQueue;
        this.e = concurrentMap;
        concurrentMap.put(this, this);
        b(referenceQueue);
    }

    static void b(ReferenceQueue referenceQueue) {
        while (true) {
            ayjn ayjnVar = (ayjn) referenceQueue.poll();
            if (ayjnVar != null) {
                RuntimeException runtimeException = (RuntimeException) ayjnVar.g.get();
                ayjnVar.c();
                if (!ayjnVar.h.get()) {
                    Level level = Level.SEVERE;
                    if (ayjo.b.isLoggable(level)) {
                        String property = System.getProperty("line.separator");
                        StringBuilder sb = new StringBuilder(String.valueOf(property).length() + 148);
                        sb.append("*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*");
                        sb.append(property);
                        sb.append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        LogRecord logRecord = new LogRecord(level, sb.toString());
                        logRecord.setLoggerName(ayjo.b.getName());
                        logRecord.setParameters(new Object[]{ayjnVar.f});
                        logRecord.setThrown(runtimeException);
                        ayjo.b.log(logRecord);
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
