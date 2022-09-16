package defpackage;

import com.google.android.apps.youtube.app.common.rendering.SnappyRecyclerView;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mgc  reason: default package */
/* loaded from: classes3.dex */
public final class mgc {
    final /* synthetic */ mgk a;
    private final snc b;
    private final ScheduledExecutorService c;
    private ScheduledFuture d;

    public mgc(mgk mgkVar, snc sncVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = mgkVar;
        this.b = sncVar;
        this.c = scheduledExecutorService;
    }

    public final synchronized void a() {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        mgk mgkVar = this.a;
        apqk apqkVar = mgkVar.o;
        if (apqkVar == null) {
            return;
        }
        aopc aopcVar = (aopc) apqkVar.mo52toBuilder();
        aopcVar.e(apqi.c, true);
        mgkVar.o((apqk) aopcVar.mo39build());
    }

    public final synchronized void b(long j) {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        if (j <= 0) {
            return;
        }
        this.b.d();
        ScheduledExecutorService scheduledExecutorService = this.c;
        final mgk mgkVar = this.a;
        if (mgkVar.r == null) {
            mgkVar.r = new Runnable() { // from class: mfy
                @Override // java.lang.Runnable
                public final void run() {
                    mgk mgkVar2 = mgk.this;
                    int J2 = mgkVar2.u.J();
                    int i = J2 + 1;
                    int size = mgkVar2.f.size() - 1;
                    if (J2 >= 0) {
                        SnappyRecyclerView snappyRecyclerView = mgkVar2.t;
                        if (i > size) {
                            i = 0;
                        }
                        snappyRecyclerView.al(i);
                    }
                }
            };
        }
        this.d = scheduledExecutorService.schedule(mgkVar.r, j, TimeUnit.MILLISECONDS);
    }
}
