package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agwa  reason: default package */
/* loaded from: classes.dex */
public final class agwa implements ynl {
    static final long a = TimeUnit.MINUTES.toMillis(1);
    private final Context b;
    private final ScheduledExecutorService c;
    private final agvw d;
    private ScheduledFuture e;
    private long f = Long.MAX_VALUE;

    public agwa(Context context, yni yniVar, ScheduledExecutorService scheduledExecutorService, agvw agvwVar) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = agvwVar;
        yniVar.g(this);
    }

    private final synchronized void d(Class cls) {
        this.e = this.c.schedule(new agvz(this, cls), a, TimeUnit.MILLISECONDS);
    }

    final synchronized void a() {
        ScheduledFuture scheduledFuture = this.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.e = null;
        }
        this.f = Long.MAX_VALUE;
    }

    public final synchronized void b(Class cls) {
        if (this.d.b() >= this.f) {
            Context context = this.b;
            ahdm.a(context, new Intent(context, cls).setAction("com.google.android.libraries.youtube.offline.transfer.service.ActionWakeup"));
            this.f = Long.MAX_VALUE;
            return;
        }
        d(cls);
    }

    public final synchronized void c(String str, long j) {
        try {
            Class<?> cls = Class.forName(str);
            ScheduledFuture scheduledFuture = this.e;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                d(cls);
            }
            if (this.f <= j) {
                return;
            }
            this.f = j;
        } catch (ClassNotFoundException e) {
            zep.d("Failed to resolve transfer service.", e);
        }
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                yvy yvyVar = (yvy) obj;
                a();
                return null;
            } else if (i == 1) {
                afwd afwdVar = (afwd) obj;
                a();
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{yvy.class, afwd.class};
    }
}
