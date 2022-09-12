package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: byrw  reason: default package */
/* loaded from: classes4.dex */
final class byrw {
    private static final dcqe a = dcqe.c("byrw");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bbx a(ahth ahthVar, long j, boolean z, long j2, byrv byrvVar, @dzsi ckco ckcoVar) {
        GmmLocation gmmLocation;
        try {
            gmmLocation = ahthVar.a().get(j, TimeUnit.SECONDS);
        } catch (Exception e) {
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
            if (z) {
                c(ckcoVar, 2);
                return b(e);
            }
            gmmLocation = null;
        }
        if (gmmLocation != null || !z) {
            try {
                byqf byqfVar = byrvVar.a(gmmLocation).get(j2, TimeUnit.SECONDS);
                byqf byqfVar2 = byqf.SUCCESS;
                int ordinal = byqfVar.ordinal();
                if (ordinal == 0) {
                    c(ckcoVar, 5);
                    return bbx.a();
                } else if (ordinal == 1) {
                    c(ckcoVar, 6);
                    return bbx.c();
                } else if (ordinal == 2) {
                    c(ckcoVar, 7);
                    return bbx.b();
                } else {
                    c(ckcoVar, 8);
                    bvoo.h("Unknown TrafficRpcStatus: %s", byqfVar);
                    return bbx.c();
                }
            } catch (Exception e2) {
                if (e2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                c(ckcoVar, 4);
                return b(e2);
            }
        }
        c(ckcoVar, 3);
        return bbx.b();
    }

    private static bbx b(Exception exc) {
        Throwable e = dbue.e(exc);
        if ((e instanceof TimeoutException) || (e instanceof InterruptedException)) {
            return bbx.b();
        }
        return bbx.c();
    }

    private static void c(@dzsi ckco ckcoVar, int i) {
        if (ckcoVar != null) {
            ckcoVar.a(i - 1);
        }
    }
}
