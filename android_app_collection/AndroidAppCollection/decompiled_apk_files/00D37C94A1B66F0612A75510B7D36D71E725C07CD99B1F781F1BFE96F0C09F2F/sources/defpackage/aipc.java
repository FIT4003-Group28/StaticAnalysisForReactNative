package defpackage;

import android.net.Uri;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.MethodNotSupportedException;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandler;
/* compiled from: PG */
/* renamed from: aipc  reason: default package */
/* loaded from: classes.dex */
public abstract class aipc implements HttpRequestHandler {
    protected abstract void a(Uri uri, Header header, HttpResponse httpResponse);

    public final void handle(HttpRequest httpRequest, HttpResponse httpResponse, HttpContext httpContext) {
        try {
            String method = httpRequest.getRequestLine().getMethod();
            if (!zav.f(1).equalsIgnoreCase(method)) {
                String valueOf = String.valueOf(method);
                throw new MethodNotSupportedException(valueOf.length() != 0 ? "Method not supported: ".concat(valueOf) : new String("Method not supported: "));
            } else {
                a(Uri.parse(httpRequest.getRequestLine().getUri()), httpRequest.getLastHeader("Range"), httpResponse);
            }
        } catch (RuntimeException e) {
            throw new HttpException("Internal error while handling request.", e);
        }
    }
}
