package defpackage;

import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amdz  reason: default package */
/* loaded from: classes2.dex */
public final class amdz extends RequestFinishedInfo.Listener {
    final /* synthetic */ ckcw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amdz(Executor executor, ckcw ckcwVar) {
        super(executor);
        this.a = ckcwVar;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        ckha ckhaVar;
        Collection<Object> annotations = requestFinishedInfo.getAnnotations();
        if (annotations == null) {
            return;
        }
        for (Object obj : annotations) {
            if (obj instanceof amdw) {
                RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
                Long l = (Long) dbsg.j(metrics.getSentByteCount()).c(0L);
                Long l2 = (Long) dbsg.j(metrics.getReceivedByteCount()).c(0L);
                ckcw ckcwVar = this.a;
                if (((amdw) obj).a()) {
                    ckhaVar = ckkw.d;
                } else {
                    ckhaVar = ckkw.e;
                }
                ckcp ckcpVar = (ckcp) ckcwVar.a(ckhaVar);
                if (l.longValue() > 0) {
                    ckcpVar.a(l.longValue());
                }
                if (l2.longValue() > 0) {
                    ckcpVar.a(l2.longValue());
                }
            }
        }
    }
}
