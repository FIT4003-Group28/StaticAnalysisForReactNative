package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: uto  reason: default package */
/* loaded from: classes4.dex */
public final class uto {
    private static final amzy c = amzy.l("com/google/android/libraries/performance/primes/Shutdown");
    final List a = new ArrayList();
    public volatile boolean b;

    public final synchronized void a() {
        if (!this.b) {
            this.b = true;
            ((amzw) ((amzw) c.c()).i("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 37, "Shutdown.java")).q("Shutdown ...");
            synchronized (this.a) {
                for (utp utpVar : this.a) {
                    try {
                        utpVar.a();
                    } catch (RuntimeException e) {
                        ((amzw) ((amzw) ((amzw) c.c()).h(e)).i("com/google/android/libraries/performance/primes/Shutdown", "shutdown", '+', "Shutdown.java")).q("ShutdownListener crashed");
                    }
                }
                this.a.clear();
                ((amzw) ((amzw) c.c()).i("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 47, "Shutdown.java")).q("All ShutdownListeners notified.");
            }
        }
    }
}
