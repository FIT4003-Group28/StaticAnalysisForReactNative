package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aigf  reason: default package */
/* loaded from: classes2.dex */
public final class aigf {
    public final dehq a;
    public final Set<aigd> b = new HashSet();
    public final Set<aige> c = new HashSet();
    private final Context d;
    @dzsi
    private ScheduledFuture<?> e;
    @dzsi
    private BroadcastReceiver f;

    public aigf(gga ggaVar, dehq dehqVar) {
        this.d = ggaVar;
        this.a = dehqVar;
    }

    public final synchronized void a(aigd aigdVar) {
        this.b.add(aigdVar);
        if (this.f == null) {
            aigc aigcVar = new aigc(this);
            this.f = aigcVar;
            Context context = this.d;
            dbsk.s(aigcVar);
            context.registerReceiver(aigcVar, new IntentFilter("android.intent.action.TIME_TICK"));
        }
    }

    public final synchronized void b(aige aigeVar) {
        this.c.add(aigeVar);
        if (this.e == null) {
            this.e = this.a.f(new Runnable(this) { // from class: aifz
                private final aigf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final aigf aigfVar = this.a;
                    aigfVar.a.execute(new Runnable(aigfVar) { // from class: aigb
                        private final aigf a;

                        {
                            this.a = aigfVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            aigf aigfVar2 = this.a;
                            synchronized (aigfVar2) {
                                for (aige aigeVar2 : aigfVar2.c) {
                                    aigeVar2.a();
                                }
                            }
                        }
                    });
                }
            }, 1L, 1L, TimeUnit.SECONDS);
        }
    }

    public final synchronized void c(aigd aigdVar) {
        BroadcastReceiver broadcastReceiver;
        this.b.remove(aigdVar);
        if (!this.b.isEmpty() || (broadcastReceiver = this.f) == null) {
            return;
        }
        this.d.unregisterReceiver(broadcastReceiver);
        this.f = null;
    }

    public final synchronized void d(aige aigeVar) {
        ScheduledFuture<?> scheduledFuture;
        this.c.remove(aigeVar);
        if (!this.c.isEmpty() || (scheduledFuture = this.e) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.e = null;
    }
}
