package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: aelh  reason: default package */
/* loaded from: classes.dex */
public final class aelh extends RequestFinishedInfo.Listener {
    private final aeki a;
    private final aflx b;
    private final boolean c;

    public aelh(Executor executor, aeki aekiVar, aflx aflxVar, boolean z) {
        super(executor);
        afms.a(aekiVar);
        this.a = aekiVar;
        this.b = aflxVar;
        this.c = z;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        UrlResponseInfo responseInfo;
        Uri parse;
        String path;
        RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
        if (metrics != null && (responseInfo = requestFinishedInfo.getResponseInfo()) != null && responseInfo.getHttpStatusCode() >= 200 && responseInfo.getHttpStatusCode() < 300 && (path = (parse = Uri.parse(responseInfo.getUrl())).getPath()) != null && path.contains("initplayback")) {
            Date sendingStart = metrics.getSendingStart();
            Date requestStart = metrics.getRequestStart();
            Long ttfbMs = metrics.getTtfbMs();
            if (sendingStart == null || requestStart == null || ttfbMs == null) {
                return;
            }
            long longValue = ttfbMs.longValue() - (sendingStart.getTime() - requestStart.getTime());
            this.a.d(parse.getHost(), longValue);
            if (!this.c || this.b == null || parse.getBooleanQueryParameter("owc", false) || parse.getQueryParameter("psid") != null) {
                return;
            }
            if (metrics.getSocketReused()) {
                this.b.aT(new aedo());
            }
            this.b.aT(new aedf(longValue));
        }
    }
}
