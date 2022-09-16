package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: uwa  reason: default package */
/* loaded from: classes4.dex */
public final class uwa implements uvo {
    public static final amzy a = amzy.l("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService");
    public final ankx b;
    public final axnm c;

    public uwa(uvn uvnVar, final Context context, ankx ankxVar, axnm axnmVar, azqb azqbVar, azqb azqbVar2) {
        new AtomicBoolean(false);
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
        uvnVar.a(ankxVar, axnmVar, azqbVar);
        this.b = ankxVar;
        this.c = axnmVar;
        aqxo.i(new amqo() { // from class: uvx
            @Override // defpackage.amqo
            public final Object get() {
                Object j;
                uwa uwaVar = uwa.this;
                Context context2 = context;
                synchronized (uwaVar) {
                    String b = uul.b();
                    String concat = String.valueOf(b).concat(".trace");
                    File filesDir = context2.getFilesDir();
                    String valueOf = String.valueOf(b);
                    File file = new File(filesDir, valueOf.length() != 0 ? "primes_profiling_".concat(valueOf) : new String("primes_profiling_"));
                    if (file.exists() || file.mkdir()) {
                        File file2 = new File(file, concat);
                        file2.deleteOnExit();
                        try {
                            if (file2.exists()) {
                                file2.delete();
                            }
                        } catch (RuntimeException e) {
                            ((amzw) ((amzw) ((amzw) uwa.a.c()).h(e)).i("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "clearFileAndSwallowResultingExceptions", (char) 368, "CpuProfilingService.java")).q("Exception when clearing trace file.");
                        }
                        j = ampq.j(file2);
                    } else {
                        ((amzw) ((amzw) uwa.a.c()).i("com/google/android/libraries/performance/primes/metrics/cpuprofiling/CpuProfilingService", "lambda$new$0", 117, "CpuProfilingService.java")).q("Could not create directory");
                        j = amon.a;
                    }
                }
                return j;
            }
        });
        aqxo.i(new uvy(azqbVar2));
    }

    @Override // defpackage.uvo, defpackage.ver
    public final void a() {
        anlz.t(new Runnable() { // from class: uvz
            @Override // java.lang.Runnable
            public final void run() {
                uwa.this.b();
            }
        }, this.b);
    }

    public final synchronized void b() {
        int i = ((uvw) this.c.get()).a;
    }
}
