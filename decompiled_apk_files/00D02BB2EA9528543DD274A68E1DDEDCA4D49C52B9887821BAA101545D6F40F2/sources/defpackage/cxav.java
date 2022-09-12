package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CallbackException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: cxav  reason: default package */
/* loaded from: classes5.dex */
public final class cxav extends RequestFinishedInfo.Listener {
    public cxav(Executor executor) {
        super(executor);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        RequestFinishedInfo.Metrics metrics;
        Map<String, List<String>> allHeaders;
        List<String> list;
        if (!cwsy.b().m() || requestFinishedInfo == null || (metrics = requestFinishedInfo.getMetrics()) == null) {
            return;
        }
        if (requestFinishedInfo.getAnnotations() != null) {
            for (Object obj : requestFinishedInfo.getAnnotations()) {
                if (obj instanceof csaf) {
                    return;
                }
            }
        }
        cxaj cxajVar = new cxaj(requestFinishedInfo.getUrl());
        if (requestFinishedInfo.getResponseInfo() != null && (allHeaders = requestFinishedInfo.getResponseInfo().getAllHeaders()) != null && (list = allHeaders.get("Content-Type")) != null && !list.isEmpty()) {
            cxajVar.k = list.get(0);
        }
        if (metrics.getReceivedByteCount() != null) {
            cxajVar.d = metrics.getReceivedByteCount().intValue();
        }
        if (metrics.getSentByteCount() != null) {
            cxajVar.e = metrics.getSentByteCount().intValue();
        }
        if (metrics.getTtfbMs() != null) {
            cxajVar.b = metrics.getTtfbMs().longValue();
        }
        if (metrics.getTotalTimeMs() != null) {
            cxajVar.c = metrics.getTotalTimeMs().longValue();
        }
        UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
        if (responseInfo != null) {
            int httpStatusCode = responseInfo.getHttpStatusCode();
            if (httpStatusCode >= 0) {
                cxajVar.j = httpStatusCode;
            }
            String negotiatedProtocol = responseInfo.getNegotiatedProtocol();
            if (negotiatedProtocol != null && !negotiatedProtocol.isEmpty()) {
                cxajVar.i = negotiatedProtocol;
            }
        }
        int finishedReason = requestFinishedInfo.getFinishedReason();
        int i = 4;
        int i2 = 2;
        if (finishedReason != 0) {
            i2 = finishedReason != 1 ? finishedReason != 2 ? 1 : 4 : 3;
        }
        cxajVar.w = i2;
        if (requestFinishedInfo.getException() != null) {
            if (requestFinishedInfo.getException() instanceof NetworkException) {
                switch (((NetworkException) requestFinishedInfo.getException()).getErrorCode()) {
                    case 1:
                        i = 3;
                        break;
                    case 2:
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 6;
                        break;
                    case 5:
                        i = 7;
                        break;
                    case 6:
                        i = 8;
                        break;
                    case 7:
                        i = 9;
                        break;
                    case 8:
                        i = 10;
                        break;
                    case 9:
                        i = 11;
                        break;
                    case 10:
                        i = 12;
                        break;
                    case 11:
                        i = 13;
                        break;
                    default:
                        i = 1;
                        break;
                }
                cxajVar.p = i - 1;
            } else if (requestFinishedInfo.getException() instanceof CallbackException) {
                cxajVar.p = 1;
            } else {
                cxajVar.p = 0;
            }
            if (requestFinishedInfo.getException() instanceof QuicException) {
                cxajVar.q = ((QuicException) requestFinishedInfo.getException()).getQuicDetailedErrorCode();
            }
        }
        cxajVar.n = 1;
        cwsy.b().d(cxajVar);
    }
}
