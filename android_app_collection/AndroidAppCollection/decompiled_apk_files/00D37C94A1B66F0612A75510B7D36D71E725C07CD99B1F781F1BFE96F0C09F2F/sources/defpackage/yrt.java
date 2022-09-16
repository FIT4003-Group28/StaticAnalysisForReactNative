package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.CallbackException;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
/* compiled from: PG */
/* renamed from: yrt  reason: default package */
/* loaded from: classes4.dex */
public class yrt extends RequestFinishedInfo.Listener {
    public String a;
    private final yqm b;

    public yrt(yqm yqmVar, Executor executor) {
        super(executor);
        this.b = yqmVar;
    }

    public static yql a(RequestFinishedInfo requestFinishedInfo, String str) {
        azzy azzyVar;
        Integer num;
        List list;
        yqk yqkVar = new yqk();
        String url = requestFinishedInfo.getUrl();
        if (url != null) {
            yqkVar.a = url;
            if (str != null) {
                yqkVar.o = str;
            }
            UrlResponseInfo responseInfo = requestFinishedInfo.getResponseInfo();
            if (responseInfo != null) {
                yqkVar.h = Integer.valueOf(responseInfo.getHttpStatusCode());
                yqkVar.i = responseInfo.getNegotiatedProtocol();
                Map allHeaders = responseInfo.getAllHeaders();
                if (allHeaders != null && (list = (List) allHeaders.get("Content-Type")) != null && !list.isEmpty()) {
                    yqkVar.b = (String) list.get(0);
                }
            }
            RequestFinishedInfo.Metrics metrics = requestFinishedInfo.getMetrics();
            if (metrics != null) {
                yqkVar.c = metrics.getReceivedByteCount();
                yqkVar.d = metrics.getSentByteCount();
                yqkVar.e = metrics.getRequestStart() == null ? null : Long.valueOf(metrics.getRequestStart().getTime());
                yqkVar.f = metrics.getTtfbMs();
                yqkVar.g = metrics.getTotalTimeMs();
            }
            int finishedReason = requestFinishedInfo.getFinishedReason();
            int i = 2;
            if (finishedReason == 0) {
                azzyVar = azzy.SUCCEEDED;
            } else if (finishedReason == 1) {
                azzyVar = azzy.FAILED;
            } else if (finishedReason == 2) {
                azzyVar = azzy.CANCELED;
            } else {
                azzyVar = azzy.REQUEST_STATUS_UNSPECIFIED;
            }
            yqkVar.j = Integer.valueOf(azzyVar.e);
            if (requestFinishedInfo.getException() != null) {
                yqkVar.n = requestFinishedInfo.getException();
                CronetException exception = requestFinishedInfo.getException();
                if (!(exception instanceof CallbackException)) {
                    if (exception instanceof NetworkException) {
                        switch (((NetworkException) exception).getErrorCode()) {
                            case 1:
                                i = 3;
                                break;
                            case 2:
                                i = 4;
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
                        }
                    }
                    i = 1;
                }
                yqkVar.k = Integer.valueOf(i - 1);
                if (requestFinishedInfo.getException() instanceof QuicException) {
                    yqkVar.l = Integer.valueOf(((QuicException) requestFinishedInfo.getException()).getQuicDetailedErrorCode());
                }
            }
            if (requestFinishedInfo.getAnnotations() != null) {
                Collection annotations = requestFinishedInfo.getAnnotations();
                ArrayList arrayList = new ArrayList();
                for (Object obj : annotations) {
                    if (obj instanceof yrs) {
                        Collection collection = ((yrs) obj).a;
                        if (collection != null) {
                            arrayList.addAll(collection);
                        }
                    } else {
                        arrayList.add(obj);
                    }
                }
                yqkVar.m = arrayList;
            }
            String str2 = yqkVar.a;
            if (str2 == null || (num = yqkVar.j) == null) {
                StringBuilder sb = new StringBuilder();
                if (yqkVar.a == null) {
                    sb.append(" url");
                }
                if (yqkVar.j == null) {
                    sb.append(" requestStatus");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            return new yql(str2, yqkVar.b, yqkVar.c, yqkVar.d, yqkVar.e, yqkVar.f, yqkVar.g, yqkVar.h, yqkVar.i, num.intValue(), yqkVar.k, yqkVar.l, yqkVar.m, yqkVar.n, yqkVar.o);
        }
        throw new NullPointerException("Null url");
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        this.b.a(a(requestFinishedInfo, this.a));
    }
}
