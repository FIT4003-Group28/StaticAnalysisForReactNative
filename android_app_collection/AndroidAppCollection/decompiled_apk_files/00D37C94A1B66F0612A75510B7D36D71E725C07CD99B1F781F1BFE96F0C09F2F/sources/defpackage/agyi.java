package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agyi  reason: default package */
/* loaded from: classes.dex */
public final class agyi implements agxu {
    public final PowerManager.WakeLock a;
    public final ahdf b;
    private final ScheduledExecutorService c;

    public agyi(Context context, ScheduledExecutorService scheduledExecutorService, ahdf ahdfVar) {
        this.c = scheduledExecutorService;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        powerManager.getClass();
        this.a = powerManager.newWakeLock(1, getClass().getName());
        this.b = ahdfVar;
    }

    @Override // defpackage.agxu
    public final void a(final agxp agxpVar) {
        anlz.t(new Runnable() { // from class: agyh
            @Override // java.lang.Runnable
            public final void run() {
                agyi agyiVar = agyi.this;
                agxp agxpVar2 = agxpVar;
                zep.g("Acquiring transfer wakelock");
                long millis = TimeUnit.HOURS.toMillis(agyiVar.b.a());
                long currentTimeMillis = System.currentTimeMillis();
                if (millis > 0) {
                    agyiVar.a.acquire(millis);
                } else {
                    agyiVar.a.acquire();
                }
                try {
                    agxpVar2.run();
                } finally {
                    agyiVar.b();
                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                    if (millis > 0) {
                        currentTimeMillis2 = Math.min(currentTimeMillis2, millis);
                    }
                    StringBuilder sb = new StringBuilder(50);
                    sb.append("Transfer wakelock held for ");
                    sb.append(currentTimeMillis2);
                    sb.append(" ms");
                    zep.l(sb.toString());
                }
            }
        }, this.c).qY(new Runnable() { // from class: agyg
            @Override // java.lang.Runnable
            public final void run() {
                String valueOf = String.valueOf(agyi.this.getClass().getName());
                if (valueOf.length() != 0) {
                    "[Offline] Transfer task succeeds with ".concat(valueOf);
                }
            }
        }, this.c);
    }

    public final void b() {
        try {
            this.a.release();
        } catch (RuntimeException unused) {
            zep.l("Wakelock already released.");
        }
    }
}
