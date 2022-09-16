package defpackage;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aare */
/* loaded from: classes.dex */
public final class aare implements afxq {
    public static final long a = TimeUnit.MINUTES.toMillis(30);
    public final snc b;
    public long c = Long.MIN_VALUE;
    private final ScheduledExecutorService d;
    private final aadd e;
    private ankt f;
    private final aarc g;

    public aare(aarc aarcVar, ScheduledExecutorService scheduledExecutorService, snc sncVar, aadd aaddVar) {
        this.d = scheduledExecutorService;
        this.g = aarcVar;
        this.b = sncVar;
        this.e = aaddVar;
    }

    public static /* synthetic */ void c(Throwable th) {
        afus.c(2, 5, "Error obtaining Spatula Header value.", th);
        zep.n("Error obtaining Spatula Header value.", th);
    }

    private final synchronized void e() {
        ankt anktVar = this.f;
        if (anktVar == null || anktVar.isDone()) {
            qst a2 = qis.a(this.g.a);
            qvx b = qvy.b();
            b.a = new qjn(1);
            b.c = 1520;
            ankt x = anlz.x(tjk.e(a2.s(b.a())), 300L, TimeUnit.MILLISECONDS, this.d);
            this.f = x;
            ylx.k(x, this.d, ngc.p, new ylw() { // from class: aard
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    aare aareVar = aare.this;
                    String str = (String) obj;
                    aareVar.c = aareVar.b.d();
                }
            });
        }
    }

    private final synchronized boolean f(Map map) {
        if (this.b.d() < a + this.c) {
            try {
                map.put("X-Goog-YTSpatula", (String) anlz.y(this.f));
                return true;
            } catch (ExecutionException e) {
                afus.c(2, 5, "Spatula header value valid but task not done.", e);
                zep.n("Spatula header value valid but task not done.", e);
            }
        } else {
            map.put("X-Goog-YTSpatula", "");
        }
        return false;
    }

    @Override // defpackage.afxq
    public final aswe a() {
        return aswe.SPATULA_V1;
    }

    @Override // defpackage.afxq
    public final void b(Map map, afye afyeVar) {
        athe atheVar = this.e.a().f;
        if (atheVar == null) {
            atheVar = athe.a;
        }
        if (!atheVar.e) {
            athe atheVar2 = this.e.a().f;
            if (atheVar2 == null) {
                atheVar2 = athe.a;
            }
            if (!atheVar2.f || !afyeVar.g().contains("/player")) {
                return;
            }
        }
        if (!f(map)) {
            e();
        }
    }

    @Override // defpackage.afxq
    public final boolean d() {
        return false;
    }
}
