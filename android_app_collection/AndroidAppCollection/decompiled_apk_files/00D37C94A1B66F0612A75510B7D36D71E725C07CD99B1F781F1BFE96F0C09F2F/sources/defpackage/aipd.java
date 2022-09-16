package defpackage;

import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.protocol.HttpContext;
/* compiled from: PG */
/* renamed from: aipd  reason: default package */
/* loaded from: classes.dex */
final class aipd implements HttpResponseInterceptor {
    public final void process(HttpResponse httpResponse, HttpContext httpContext) {
        httpResponse.setHeader("Connection", "Close");
    }
}
