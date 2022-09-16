package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ysb  reason: default package */
/* loaded from: classes4.dex */
public final class ysb extends UrlRequest.Callback {
    public final ysk a;
    public boolean b;
    public Object c;
    public boolean d;
    public boolean e;
    private final boolean f;
    private final yse g;
    private ysn h;
    private IOException i;

    /* JADX INFO: Access modifiers changed from: protected */
    public ysb(ysk yskVar, boolean z, yse yseVar) {
        this.a = yskVar;
        this.f = z;
        this.g = yseVar;
    }

    protected static /* bridge */ /* synthetic */ Object b(UrlResponseInfo urlResponseInfo, InputStream inputStream) {
        Integer num;
        abhq c = yqp.c();
        c.c(urlResponseInfo.getAllHeadersAsList());
        yqp a = c.a();
        yra yraVar = new yra();
        yraVar.b = Integer.valueOf(urlResponseInfo.getHttpStatusCode());
        String httpStatusText = urlResponseInfo.getHttpStatusText();
        if (httpStatusText != null) {
            yraVar.c = httpStatusText;
            abhq c2 = yqp.c();
            c2.c(urlResponseInfo.getAllHeadersAsList());
            yraVar.d = c2.a();
            String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
            if (negotiatedProtocol == null || negotiatedProtocol.isEmpty()) {
                negotiatedProtocol = "HTTP/1.1";
            }
            yraVar.a = negotiatedProtocol;
            if (inputStream != null) {
                String a2 = a.a("Content-Type");
                String a3 = a.a("content-encoding");
                String str = "-1";
                if ((a3 == null || "identity".equals(a3)) && a.a("transfer-encoding") == null) {
                    str = a.a("content-length");
                }
                yqz yqzVar = new yqz(a2, str);
                yqzVar.b = inputStream;
                yraVar.e = yqzVar;
            } else {
                yraVar.e = yqz.a;
            }
            String str2 = yraVar.a;
            if (str2 == null || (num = yraVar.b) == null || yraVar.c == null || yraVar.d == null) {
                StringBuilder sb = new StringBuilder();
                if (yraVar.a == null) {
                    sb.append(" protocol");
                }
                if (yraVar.b == null) {
                    sb.append(" statusCode");
                }
                if (yraVar.c == null) {
                    sb.append(" reasonPhrase");
                }
                if (yraVar.d == null) {
                    sb.append(" headers");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            return new yrb(str2, num.intValue(), yraVar.c, yraVar.d, yraVar.e);
        }
        throw new NullPointerException("Null reasonPhrase");
    }

    private final void c(IOException iOException) {
        this.a.a();
        this.d = true;
        this.i = iOException;
        ysn ysnVar = this.h;
        if (ysnVar != null) {
            ysnVar.a = null;
        }
    }

    public final void a() {
        IOException iOException = this.i;
        if (iOException == null) {
            return;
        }
        throw iOException;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.a();
        c(this.e ? null : ysl.a);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.a.a();
        Throwable cause = cronetException.getCause();
        CronetException cronetException2 = cronetException;
        if (cause instanceof IOException) {
            cronetException2 = (IOException) cause;
        }
        c(cronetException2);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
        this.a.a();
        if (this.h == null) {
            c(new IOException());
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        try {
            if (this.f) {
                if (this.g.d != null) {
                    zav.e(str);
                }
                urlRequest.followRedirect();
                return;
            }
            this.a.a();
            this.c = b(urlResponseInfo, null);
            this.b = true;
            this.e = true;
            urlRequest.cancel();
        } catch (IOException e) {
            c(e);
        }
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.a();
        ysn ysnVar = new ysn(urlRequest, this);
        this.h = ysnVar;
        this.c = b(urlResponseInfo, ysnVar);
        this.b = true;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        this.a.a();
        c(null);
    }
}
