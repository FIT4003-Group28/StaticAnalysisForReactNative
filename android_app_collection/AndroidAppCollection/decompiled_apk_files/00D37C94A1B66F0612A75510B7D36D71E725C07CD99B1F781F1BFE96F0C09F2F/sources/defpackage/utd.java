package defpackage;
/* compiled from: PG */
/* renamed from: utd  reason: default package */
/* loaded from: classes4.dex */
public final class utd {
    public static final /* synthetic */ int b = 0;
    private static final amzy c = amzy.l("com/google/android/libraries/performance/primes/Primes");
    private static final utd d;
    private static volatile boolean e;
    private static volatile utd f;
    public final ute a;

    static {
        utd utdVar = new utd(new utc());
        d = utdVar;
        e = true;
        f = utdVar;
    }

    public utd(ute uteVar) {
        this.a = uteVar;
    }

    public static utd a() {
        if (f == d && e) {
            e = false;
            ((amzw) ((amzw) c.e()).i("com/google/android/libraries/performance/primes/Primes", "get", 136, "Primes.java")).q("Primes not initialized, returning default (no-op) Primes instance which will ignore all calls. Please call Primes.initialize(...) before using any Primes API.");
        }
        return f;
    }

    public static synchronized void b(uta utaVar) {
        synchronized (utd.class) {
            if (f == d) {
                if (!uwp.j()) {
                    ((amzw) ((amzw) c.g()).i("com/google/android/libraries/performance/primes/Primes", "initialize", 118, "Primes.java")).q("Primes.initialize() should only be called from the main thread.");
                }
                f = utaVar.a;
            } else {
                ((amzw) ((amzw) c.c()).i("com/google/android/libraries/performance/primes/Primes", "initialize", 114, "Primes.java")).q("Primes.initialize() is called more than once. This call will be ignored.");
            }
        }
    }
}
