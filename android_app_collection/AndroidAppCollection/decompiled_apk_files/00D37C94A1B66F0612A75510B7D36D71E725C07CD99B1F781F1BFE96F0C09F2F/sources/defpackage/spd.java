package defpackage;

import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: spd  reason: default package */
/* loaded from: classes4.dex */
public final class spd implements Runnable {
    public final Runnable a;
    final /* synthetic */ spe b;

    public spd(spe speVar, Runnable runnable) {
        this.b = speVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Thread currentThread = Thread.currentThread();
        ankx ankxVar = this.b.e;
        Runnable runnable = new Runnable() { // from class: spc
            @Override // java.lang.Runnable
            public final void run() {
                spd spdVar = spd.this;
                Thread thread = currentThread;
                String obj = spdVar.b.d ? spdVar.a.toString() : spdVar.a.getClass().toString();
                String a = sop.a(thread);
                spdVar.b.c.f();
                String valueOf = String.valueOf(spdVar.b.c.g());
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 71 + String.valueOf(valueOf).length() + String.valueOf(obj).length());
                sb.append("On ");
                sb.append(a);
                sb.append(" task took longer than 1 ");
                sb.append(valueOf);
                sb.append(" so assumed deadlocked: ");
                sb.append(obj);
                spi spiVar = new spi(sb.toString(), thread.getStackTrace());
                RuntimeException b = ammu.b(thread);
                if (b.getStackTrace().length > 0) {
                    spiVar.initCause(b);
                }
                ArrayList a2 = spdVar.b.a.a();
                a2.remove(thread);
                spm.b(spdVar.b.b, a2, spiVar);
            }
        };
        this.b.c.f();
        ankv b = ankxVar.b(runnable, 1L, this.b.c.g());
        try {
            this.a.run();
        } finally {
            b.cancel(false);
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
