package h;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class a extends w {
    private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    static a head;
    private boolean inQueue;
    private a next;
    private long timeoutAt;

    /* renamed from: h.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0203a implements u {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ u f10127b;

        C0203a(u uVar) {
            this.f10127b = uVar;
        }

        @Override // h.u, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a.this.enter();
            try {
                try {
                    this.f10127b.close();
                    a.this.exit(true);
                } catch (IOException e2) {
                    throw a.this.exit(e2);
                }
            } catch (Throwable th) {
                a.this.exit(false);
                throw th;
            }
        }

        @Override // h.u, java.io.Flushable
        public void flush() {
            a.this.enter();
            try {
                try {
                    this.f10127b.flush();
                    a.this.exit(true);
                } catch (IOException e2) {
                    throw a.this.exit(e2);
                }
            } catch (Throwable th) {
                a.this.exit(false);
                throw th;
            }
        }

        @Override // h.u
        public w timeout() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f10127b + ")";
        }

        @Override // h.u
        public void write(h.c cVar, long j) {
            x.a(cVar.f10134c, 0L, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    r rVar = cVar.f10133b;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += rVar.f10192c - rVar.f10191b;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        rVar = rVar.f10195f;
                    }
                    a.this.enter();
                    try {
                        try {
                            this.f10127b.write(cVar, j2);
                            j -= j2;
                            a.this.exit(true);
                        } catch (IOException e2) {
                            throw a.this.exit(e2);
                        }
                    } catch (Throwable th) {
                        a.this.exit(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f10129b;

        b(v vVar) {
            this.f10129b = vVar;
        }

        @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a.this.enter();
            try {
                try {
                    this.f10129b.close();
                    a.this.exit(true);
                } catch (IOException e2) {
                    throw a.this.exit(e2);
                }
            } catch (Throwable th) {
                a.this.exit(false);
                throw th;
            }
        }

        @Override // h.v
        public long read(h.c cVar, long j) {
            a.this.enter();
            try {
                try {
                    long read = this.f10129b.read(cVar, j);
                    a.this.exit(true);
                    return read;
                } catch (IOException e2) {
                    throw a.this.exit(e2);
                }
            } catch (Throwable th) {
                a.this.exit(false);
                throw th;
            }
        }

        @Override // h.v
        public w timeout() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f10129b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.timedOut();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<h.a> r0 = h.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                h.a r1 = h.a.awaitTimeout()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                h.a r2 = h.a.head     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                h.a.head = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.timedOut()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: h.a.c.run():void");
        }
    }

    static a awaitTimeout() {
        a aVar = head.next;
        long nanoTime = System.nanoTime();
        if (aVar == null) {
            a.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next == null && System.nanoTime() - nanoTime >= IDLE_TIMEOUT_NANOS) {
                return head;
            }
            return null;
        }
        long remainingNanos = aVar.remainingNanos(nanoTime);
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            a.class.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = aVar.next;
        aVar.next = null;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
        r1.next = r3.next;
        r3.next = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized boolean cancelScheduledTimeout(h.a r3) {
        /*
            java.lang.Class<h.a> r0 = h.a.class
            monitor-enter(r0)
            h.a r1 = h.a.head     // Catch: java.lang.Throwable -> L1a
        L5:
            if (r1 == 0) goto L18
            h.a r2 = r1.next     // Catch: java.lang.Throwable -> L1a
            if (r2 != r3) goto L15
            h.a r2 = r3.next     // Catch: java.lang.Throwable -> L1a
            r1.next = r2     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r3.next = r1     // Catch: java.lang.Throwable -> L1a
            r3 = 0
        L13:
            monitor-exit(r0)
            return r3
        L15:
            h.a r1 = r1.next     // Catch: java.lang.Throwable -> L1a
            goto L5
        L18:
            r3 = 1
            goto L13
        L1a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.cancelScheduledTimeout(h.a):boolean");
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:11:0x002b, B:16:0x003a, B:17:0x0040, B:19:0x0044, B:22:0x004f, B:23:0x0052, B:25:0x005c, B:15:0x0034, B:28:0x0061, B:29:0x0066), top: B:33:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized void scheduleTimeout(h.a r6, long r7, boolean r9) {
        /*
            java.lang.Class<h.a> r0 = h.a.class
            monitor-enter(r0)
            h.a r1 = h.a.head     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L16
            h.a r1 = new h.a     // Catch: java.lang.Throwable -> L67
            r1.<init>()     // Catch: java.lang.Throwable -> L67
            h.a.head = r1     // Catch: java.lang.Throwable -> L67
            h.a$c r1 = new h.a$c     // Catch: java.lang.Throwable -> L67
            r1.<init>()     // Catch: java.lang.Throwable -> L67
            r1.start()     // Catch: java.lang.Throwable -> L67
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L67
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            if (r9 == 0) goto L2f
            long r3 = r6.deadlineNanoTime()     // Catch: java.lang.Throwable -> L67
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L67
        L2b:
            long r7 = r7 + r1
            r6.timeoutAt = r7     // Catch: java.lang.Throwable -> L67
            goto L3a
        L2f:
            if (r5 == 0) goto L32
            goto L2b
        L32:
            if (r9 == 0) goto L61
            long r7 = r6.deadlineNanoTime()     // Catch: java.lang.Throwable -> L67
            r6.timeoutAt = r7     // Catch: java.lang.Throwable -> L67
        L3a:
            long r7 = r6.remainingNanos(r1)     // Catch: java.lang.Throwable -> L67
            h.a r9 = h.a.head     // Catch: java.lang.Throwable -> L67
        L40:
            h.a r3 = r9.next     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L52
            h.a r3 = r9.next     // Catch: java.lang.Throwable -> L67
            long r3 = r3.remainingNanos(r1)     // Catch: java.lang.Throwable -> L67
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L4f
            goto L52
        L4f:
            h.a r9 = r9.next     // Catch: java.lang.Throwable -> L67
            goto L40
        L52:
            h.a r7 = r9.next     // Catch: java.lang.Throwable -> L67
            r6.next = r7     // Catch: java.lang.Throwable -> L67
            r9.next = r6     // Catch: java.lang.Throwable -> L67
            h.a r6 = h.a.head     // Catch: java.lang.Throwable -> L67
            if (r9 != r6) goto L5f
            r0.notify()     // Catch: java.lang.Throwable -> L67
        L5f:
            monitor-exit(r0)
            return
        L61:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L67
            r6.<init>()     // Catch: java.lang.Throwable -> L67
            throw r6     // Catch: java.lang.Throwable -> L67
        L67:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.scheduleTimeout(h.a, long, boolean):void");
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos == 0 && !hasDeadline) {
                return;
            }
            this.inQueue = true;
            scheduleTimeout(this, timeoutNanos, hasDeadline);
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    final IOException exit(IOException iOException) {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    final void exit(boolean z) {
        if (!exit() || !z) {
            return;
        }
        throw newTimeoutException(null);
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final u sink(u uVar) {
        return new C0203a(uVar);
    }

    public final v source(v vVar) {
        return new b(vVar);
    }

    protected void timedOut() {
    }
}
