package defpackage;

import java.util.Collection;
import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.RequestFinishedInfo;
/* compiled from: PG */
/* renamed from: bufp  reason: default package */
/* loaded from: classes.dex */
final class bufp extends RequestFinishedInfo.Listener {
    final /* synthetic */ dxio a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bufp(Executor executor, dxio dxioVar) {
        super(executor);
        this.a = dxioVar;
    }

    private static final long a(@dzsi Date date) {
        if (date != null) {
            return TimeUnit.MILLISECONDS.toNanos(date.getTime());
        }
        return 0L;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        Collection<Object> annotations = requestFinishedInfo.getAnnotations();
        if (annotations == null) {
            return;
        }
        for (Object obj : annotations) {
            if (obj instanceof buhg) {
                buhg buhgVar = (buhg) obj;
                if (requestFinishedInfo.getFinishedReason() == 0) {
                    RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
                    btum btumVar = new btum();
                    btumVar.a = ((Long) dbsg.j(metrics.getReceivedByteCount()).c(0L)).longValue();
                    btumVar.b = ((Long) dbsg.j(metrics.getSentByteCount()).c(0L)).longValue();
                    ((btup) this.a.a()).d(btumVar, a(metrics.getSendingEnd()), a(metrics.getResponseStart()), a(metrics.getRequestEnd()), buhgVar.a());
                    btzu b = buhgVar.b();
                    Date sendingStart = metrics.getSendingStart();
                    if (sendingStart != null) {
                        b.c(sendingStart.getTime());
                    }
                    Date sendingEnd = metrics.getSendingEnd();
                    if (sendingEnd != null) {
                        b.e(sendingEnd.getTime());
                    }
                    Date responseStart = metrics.getResponseStart();
                    if (responseStart != null) {
                        b.b(responseStart.getTime());
                    }
                    Date requestEnd = metrics.getRequestEnd();
                    if (requestEnd != null) {
                        b.d(requestEnd.getTime());
                    }
                }
                buhgVar.b().a();
            }
        }
    }
}
