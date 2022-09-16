package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: udi  reason: default package */
/* loaded from: classes4.dex */
public abstract class udi extends BroadcastReceiver {
    static final AtomicBoolean a = new AtomicBoolean(false);
    public static final /* synthetic */ int b = 0;

    public static void b(udj udjVar, Intent intent, ubz ubzVar, long j) {
        int threadPriority = Process.getThreadPriority(0);
        try {
            Process.setThreadPriority(udjVar.a(intent));
            udjVar.b(intent, ubzVar, j);
        } finally {
            Process.setThreadPriority(threadPriority);
        }
    }

    public abstract udj a(Context context);

    public abstract boolean c();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        if (intent == null) {
            uev.c("ChimeBroadcastReceiver", new IllegalArgumentException(), "Null Intent received.", new Object[0]);
            return;
        }
        final long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        aqxo.p(true);
        long j = (intent.getFlags() & 268435456) > 0 ? 8500L : 58500L;
        aqxo.p(true);
        ubv e = ubz.e();
        e.a = Long.valueOf(j);
        e.b(SystemClock.uptimeMillis());
        ubz a2 = e.a();
        uev.d("ChimeBroadcastReceiver", "Intent received for action [%s] package [%s].", intent.getAction(), context.getApplicationContext().getPackageName());
        uid.a(context);
        uev.d("ChimeBroadcastReceiver", "Phenotype initialized.", new Object[0]);
        try {
            uem a3 = uel.a(context);
            a3.jt();
            if (c() && a3.ay().i) {
                uev.d("ChimeBroadcastReceiver", "BroadcastReceiver disabled by host app in ChimeConfig", new Object[0]);
                return;
            }
            final udj a4 = a(context);
            if (a4.c(intent)) {
                uev.d("ChimeBroadcastReceiver", "Validation OK for action [%s].", intent.getAction());
                uee aD = uel.a(context).aD();
                if (!uid.d(context)) {
                    aD.d(new Runnable() { // from class: udg
                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2 = intent;
                            udj udjVar = a4;
                            long j2 = micros;
                            int i = udi.b;
                            uev.d("ChimeBroadcastReceiver", "Executing action in Service [%s].", intent2.getAction());
                            udi.b(udjVar, intent2, ubz.b(), j2);
                        }
                    });
                } else {
                    boolean compareAndSet = a.compareAndSet(false, true);
                    if (axpy.a.get().c() && compareAndSet) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
                        if (elapsedRealtime <= axpy.a.get().a()) {
                            a2 = a2.c(elapsedRealtime);
                        }
                    }
                    BroadcastReceiver.PendingResult goAsync = goAsync();
                    boolean isOrderedBroadcast = isOrderedBroadcast();
                    final ubz ubzVar = a2;
                    Runnable runnable = new Runnable() { // from class: udh
                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2 = intent;
                            udj udjVar = a4;
                            ubz ubzVar2 = ubzVar;
                            long j2 = micros;
                            int i = udi.b;
                            uev.d("ChimeBroadcastReceiver", "Executing action in BroadcastReceiver [%s].", intent2.getAction());
                            udi.b(udjVar, intent2, ubzVar2, j2);
                        }
                    };
                    if (!axpy.b()) {
                        a2 = ubz.b();
                    }
                    aD.c(goAsync, isOrderedBroadcast, runnable, a2);
                }
            } else {
                uev.d("ChimeBroadcastReceiver", "Validation failed for action [%s].", intent.getAction());
            }
            if (!isOrderedBroadcast()) {
                return;
            }
            setResultCode(-1);
        } catch (IllegalStateException e2) {
            uev.f("ChimeBroadcastReceiver", e2, "BroadcastReceiver stopped", new Object[0]);
        }
    }
}
