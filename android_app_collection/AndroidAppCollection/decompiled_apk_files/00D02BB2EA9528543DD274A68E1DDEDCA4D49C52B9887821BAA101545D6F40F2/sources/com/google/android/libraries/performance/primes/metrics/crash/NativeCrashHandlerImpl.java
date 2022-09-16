package com.google.android.libraries.performance.primes.metrics.crash;

import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class NativeCrashHandlerImpl {
    public final dbsg<dzsj<Boolean>> a;
    public final CountDownLatch b = new CountDownLatch(1);
    public final CountDownLatch c = new CountDownLatch(1);
    private boolean d;

    public NativeCrashHandlerImpl(dbsg<dzsj<Boolean>> dbsgVar) {
        this.a = dbsgVar;
    }

    public static native void awaitSignal();

    public static native boolean initializeSignalHandler();

    public static native void unblockSignalHandler();

    public final synchronized void a(final cwxq cwxqVar) {
        if (this.d) {
            return;
        }
        this.d = true;
        Thread thread = new Thread(new Runnable(this, cwxqVar) { // from class: cwxw
            private final NativeCrashHandlerImpl a;
            private final cwxq b;

            {
                this.a = this;
                this.b = cwxqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandlerImpl nativeCrashHandlerImpl = this.a;
                cwxq cwxqVar2 = this.b;
                if (((Boolean) ((dzsj) ((dbsu) nativeCrashHandlerImpl.a).a).a()).booleanValue()) {
                    System.loadLibrary("native_crash_handler_jni");
                    if (!NativeCrashHandlerImpl.initializeSignalHandler()) {
                        return;
                    }
                    try {
                        nativeCrashHandlerImpl.b.countDown();
                        NativeCrashHandlerImpl.awaitSignal();
                        eabd d = ((cwxu) cwxqVar2).d();
                        if (d.c) {
                            d.bF();
                            d.c = false;
                        }
                        eabf eabfVar = (eabf) d.b;
                        eabf eabfVar2 = eabf.k;
                        eabfVar.f = 5;
                        eabfVar.a |= 16;
                        ((cwxu) cwxqVar2).e(d.bK());
                        return;
                    } finally {
                        NativeCrashHandlerImpl.unblockSignalHandler();
                    }
                }
                nativeCrashHandlerImpl.c.countDown();
            }
        }, "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }
}
