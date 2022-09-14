package com.facebook.imagepipeline.m;

import android.net.Uri;
import com.facebook.imagepipeline.m.ag;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import okhttp3.internal.http.StatusLine;
/* compiled from: HttpUrlConnectionNetworkFetcher.java */
/* loaded from: classes.dex */
public class t extends c<s> {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f2891a;

    private static boolean a(int i) {
        return i >= 200 && i < 300;
    }

    private static boolean b(int i) {
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
            case StatusLine.HTTP_TEMP_REDIRECT /* 307 */:
            case StatusLine.HTTP_PERM_REDIRECT /* 308 */:
                return true;
            case 304:
            case 305:
            case 306:
            default:
                return false;
        }
    }

    public t() {
        this(Executors.newFixedThreadPool(3));
    }

    t(ExecutorService executorService) {
        this.f2891a = executorService;
    }

    @Override // com.facebook.imagepipeline.m.ag
    public s b(j<com.facebook.imagepipeline.i.d> jVar, ak akVar) {
        return new s(jVar, akVar);
    }

    @Override // com.facebook.imagepipeline.m.ag
    public void a(final s sVar, final ag.a aVar) {
        final Future<?> submit = this.f2891a.submit(new Runnable() { // from class: com.facebook.imagepipeline.m.t.1
            @Override // java.lang.Runnable
            public void run() {
                t.this.b(sVar, aVar);
            }
        });
        sVar.b().a(new e() { // from class: com.facebook.imagepipeline.m.t.2
            @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
            public void a() {
                if (submit.cancel(false)) {
                    aVar.a();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void b(com.facebook.imagepipeline.m.s r4, com.facebook.imagepipeline.m.ag.a r5) {
        /*
            r3 = this;
            r0 = 0
            android.net.Uri r4 = r4.e()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            r1 = 5
            java.net.HttpURLConnection r4 = r3.a(r4, r1)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L34
            if (r4 == 0) goto L26
            java.io.InputStream r1 = r4.getInputStream()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L21
            r0 = -1
            r5.a(r1, r0)     // Catch: java.lang.Throwable -> L16 java.io.IOException -> L19
            r0 = r1
            goto L26
        L16:
            r5 = move-exception
            r0 = r1
            goto L46
        L19:
            r0 = move-exception
            r2 = r1
            r1 = r4
            r4 = r0
            r0 = r2
            goto L36
        L1f:
            r5 = move-exception
            goto L46
        L21:
            r1 = move-exception
            r2 = r1
            r1 = r4
            r4 = r2
            goto L36
        L26:
            if (r0 == 0) goto L2b
            r0.close()     // Catch: java.io.IOException -> L2b
        L2b:
            if (r4 == 0) goto L43
            r4.disconnect()
            goto L43
        L31:
            r5 = move-exception
            r4 = r0
            goto L46
        L34:
            r4 = move-exception
            r1 = r0
        L36:
            r5.a(r4)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L3e
            r0.close()     // Catch: java.io.IOException -> L3e
        L3e:
            if (r1 == 0) goto L43
            r1.disconnect()
        L43:
            return
        L44:
            r5 = move-exception
            r4 = r1
        L46:
            if (r0 == 0) goto L4b
            r0.close()     // Catch: java.io.IOException -> L4b
        L4b:
            if (r4 == 0) goto L50
            r4.disconnect()
        L50:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.m.t.b(com.facebook.imagepipeline.m.s, com.facebook.imagepipeline.m.ag$a):void");
    }

    private HttpURLConnection a(Uri uri, int i) {
        HttpURLConnection a2 = a(uri);
        int responseCode = a2.getResponseCode();
        if (a(responseCode)) {
            return a2;
        }
        if (b(responseCode)) {
            String headerField = a2.getHeaderField("Location");
            a2.disconnect();
            Uri parse = headerField == null ? null : Uri.parse(headerField);
            String scheme = uri.getScheme();
            if (i > 0 && parse != null && !parse.getScheme().equals(scheme)) {
                return a(parse, i - 1);
            }
            throw new IOException(i == 0 ? a("URL %s follows too many redirects", uri.toString()) : a("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        a2.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
    }

    static HttpURLConnection a(Uri uri) {
        return (HttpURLConnection) new URL(uri.toString()).openConnection();
    }

    private static String a(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }
}
