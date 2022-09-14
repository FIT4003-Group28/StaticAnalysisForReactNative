package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import org.chromium.net.RequestFinishedInfo;
/* compiled from: PG */
/* renamed from: bufq  reason: default package */
/* loaded from: classes4.dex */
final class bufq extends RequestFinishedInfo.Listener {
    final /* synthetic */ dxio a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bufq(Executor executor, dxio dxioVar) {
        super(executor);
        this.a = dxioVar;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        long longValue = ((Long) dbsg.j(requestFinishedInfo.getMetrics().getSentByteCount()).c(0L)).longValue();
        long longValue2 = ((Long) dbsg.j(requestFinishedInfo.getMetrics().getReceivedByteCount()).c(0L)).longValue();
        String host = Uri.parse(requestFinishedInfo.getUrl()).getHost();
        if (host != null) {
            bttx bttxVar = (bttx) this.a.a();
            Matcher matcher = bttx.a.matcher(host);
            if (matcher.find()) {
                host = matcher.group();
            }
            bttxVar.b.b(ckgx.REQUEST_DOMAIN, new bttw(host));
            ((ckcp) bttxVar.b.a(ckja.aq)).a(longValue);
            ((ckcp) bttxVar.b.a(ckja.ar)).a(longValue2);
        }
    }
}
