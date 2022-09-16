package com.google.android.libraries.performance.primes.metrics.crash;

import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NativeCrashHandlerImpl implements uwk {
    private static final amzy c = amzy.l("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl");
    final CountDownLatch a = new CountDownLatch(1);
    final CountDownLatch b = new CountDownLatch(1);
    private boolean d;
    private final ampq e;

    public NativeCrashHandlerImpl(ampq ampqVar) {
        this.e = ampqVar;
    }

    private static native ByteBuffer awaitSignal();

    static native void doDiscardNativeCrashes();

    private static native boolean initializeSignalHandler();

    private static native void unblockSignalHandler();

    @Override // defpackage.uwk
    public final synchronized void a(final uwf uwfVar) {
        if (this.d) {
            return;
        }
        this.d = true;
        Thread thread = new Thread(new Runnable() { // from class: uwl
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandlerImpl.this.b(uwfVar);
            }
        }, "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }

    public final /* synthetic */ void b(uwf uwfVar) {
        if (((Boolean) ((azqb) ((ampv) this.e).a).get()).booleanValue()) {
            try {
                System.loadLibrary("native_crash_handler_jni");
                if (!initializeSignalHandler()) {
                    ((amzw) ((amzw) c.g()).i("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "lambda$initialize$0", 61, "NativeCrashHandlerImpl.java")).q("unable to initialize signal handler");
                    return;
                }
                try {
                    this.a.countDown();
                    ByteBuffer awaitSignal = awaitSignal();
                    aoug aougVar = null;
                    if (awaitSignal != null) {
                        try {
                            aougVar = (aoug) aopi.parseFrom(aoug.a, awaitSignal, aoos.a());
                        } catch (Throwable unused) {
                        }
                    }
                    aopa h = ((uwj) uwfVar).h();
                    h.copyOnWrite();
                    baak baakVar = (baak) h.instance;
                    baak baakVar2 = baak.a;
                    baakVar.g = 5;
                    baakVar.b |= 16;
                    if (aougVar != null) {
                        h.copyOnWrite();
                        baak baakVar3 = (baak) h.instance;
                        baakVar3.l = aougVar;
                        baakVar3.b |= 512;
                    }
                    ((uwj) uwfVar).g((baak) h.mo39build());
                    return;
                } finally {
                    unblockSignalHandler();
                }
            } catch (UnsatisfiedLinkError e) {
                ((amzw) ((amzw) ((amzw) c.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "lambda$initialize$0", '9', "NativeCrashHandlerImpl.java")).q("unable to load native_crash_handler_jni");
                return;
            }
        }
        this.b.countDown();
    }
}
