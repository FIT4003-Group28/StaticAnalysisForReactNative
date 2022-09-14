package c;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
/* compiled from: AsyncTimeout.java */
/* loaded from: classes.dex */
public class a extends u {
    private static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    private static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    static a head;
    private boolean inQueue;
    private a next;
    private long timeoutAt;

    protected void timedOut() {
    }

    public final void enter() {
        if (this.inQueue) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos == 0 && !hasDeadline) {
            return;
        }
        this.inQueue = true;
        scheduleTimeout(this, timeoutNanos, hasDeadline);
    }

    private static synchronized void scheduleTimeout(a aVar, long j, boolean z) {
        synchronized (a.class) {
            if (head == null) {
                head = new a();
                new C0029a().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i != 0 && z) {
                aVar.timeoutAt = Math.min(j, aVar.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (i != 0) {
                aVar.timeoutAt = j + nanoTime;
            } else if (z) {
                aVar.timeoutAt = aVar.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long remainingNanos = aVar.remainingNanos(nanoTime);
            a aVar2 = head;
            while (aVar2.next != null && remainingNanos >= aVar2.next.remainingNanos(nanoTime)) {
                aVar2 = aVar2.next;
            }
            aVar.next = aVar2.next;
            aVar2.next = aVar;
            if (aVar2 == head) {
                a.class.notify();
            }
        }
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return cancelScheduledTimeout(this);
    }

    private static synchronized boolean cancelScheduledTimeout(a aVar) {
        synchronized (a.class) {
            for (a aVar2 = head; aVar2 != null; aVar2 = aVar2.next) {
                if (aVar2.next == aVar) {
                    aVar2.next = aVar.next;
                    aVar.next = null;
                    return false;
                }
            }
            return true;
        }
    }

    private long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final s sink(final s sVar) {
        return new s() { // from class: c.a.1
            @Override // c.s
            public void write(c cVar, long j) {
                v.a(cVar.f1283b, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j > 0) {
                        p pVar = cVar.f1282a;
                        while (true) {
                            if (j2 >= 65536) {
                                break;
                            }
                            j2 += cVar.f1282a.f1321c - cVar.f1282a.f1320b;
                            if (j2 >= j) {
                                j2 = j;
                                break;
                            }
                            pVar = pVar.f;
                        }
                        a.this.enter();
                        try {
                            try {
                                sVar.write(cVar, j2);
                                j -= j2;
                                a.this.exit(true);
                            } catch (IOException e) {
                                throw a.this.exit(e);
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

            @Override // c.s, java.io.Flushable
            public void flush() {
                a.this.enter();
                try {
                    try {
                        sVar.flush();
                        a.this.exit(true);
                    } catch (IOException e) {
                        throw a.this.exit(e);
                    }
                } catch (Throwable th) {
                    a.this.exit(false);
                    throw th;
                }
            }

            @Override // c.s, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                a.this.enter();
                try {
                    try {
                        sVar.close();
                        a.this.exit(true);
                    } catch (IOException e) {
                        throw a.this.exit(e);
                    }
                } catch (Throwable th) {
                    a.this.exit(false);
                    throw th;
                }
            }

            @Override // c.s
            public u timeout() {
                return a.this;
            }

            public String toString() {
                return "AsyncTimeout.sink(" + sVar + ")";
            }
        };
    }

    public final t source(final t tVar) {
        return new t() { // from class: c.a.2
            @Override // c.t
            public long read(c cVar, long j) {
                a.this.enter();
                try {
                    try {
                        long read = tVar.read(cVar, j);
                        a.this.exit(true);
                        return read;
                    } catch (IOException e) {
                        throw a.this.exit(e);
                    }
                } catch (Throwable th) {
                    a.this.exit(false);
                    throw th;
                }
            }

            @Override // c.t, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    try {
                        tVar.close();
                        a.this.exit(true);
                    } catch (IOException e) {
                        throw a.this.exit(e);
                    }
                } catch (Throwable th) {
                    a.this.exit(false);
                    throw th;
                }
            }

            @Override // c.t
            public u timeout() {
                return a.this;
            }

            public String toString() {
                return "AsyncTimeout.source(" + tVar + ")";
            }
        };
    }

    final void exit(boolean z) {
        if (!exit() || !z) {
            return;
        }
        throw newTimeoutException(null);
    }

    final IOException exit(IOException iOException) {
        return !exit() ? iOException : newTimeoutException(iOException);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncTimeout.java */
    /* renamed from: c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0029a extends Thread {
        C0029a() {
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
                java.lang.Class<c.a> r0 = c.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                c.a r1 = c.a.awaitTimeout()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                c.a r2 = c.a.head     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                c.a.head = r1     // Catch: java.lang.Throwable -> L19
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
            throw new UnsupportedOperationException("Method not decompiled: c.a.C0029a.run():void");
        }
    }

    static a awaitTimeout() {
        a aVar = head.next;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            a.class.wait(IDLE_TIMEOUT_MILLIS);
            if (head.next == null && System.nanoTime() - nanoTime >= IDLE_TIMEOUT_NANOS) {
                return head;
            }
            return null;
        }
        long remainingNanos = aVar.remainingNanos(System.nanoTime());
        if (remainingNanos > 0) {
            long j = remainingNanos / 1000000;
            a.class.wait(j, (int) (remainingNanos - (1000000 * j)));
            return null;
        }
        head.next = aVar.next;
        aVar.next = null;
        return aVar;
    }
}
