package c.d.j.n;

import android.net.Uri;
import c.d.j.n.f0;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class t extends c.d.j.n.c<c> {

    /* renamed from: a  reason: collision with root package name */
    private int f3559a;

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f3560b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.common.time.b f3561c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f3562b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f0.a f3563c;

        a(c cVar, f0.a aVar) {
            this.f3562b = cVar;
            this.f3563c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.b(this.f3562b, this.f3563c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Future f3565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f0.a f3566b;

        b(t tVar, Future future, f0.a aVar) {
            this.f3565a = future;
            this.f3566b = aVar;
        }

        @Override // c.d.j.n.l0
        public void a() {
            if (this.f3565a.cancel(false)) {
                this.f3566b.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends s {

        /* renamed from: f  reason: collision with root package name */
        private long f3567f;

        /* renamed from: g  reason: collision with root package name */
        private long f3568g;

        /* renamed from: h  reason: collision with root package name */
        private long f3569h;

        public c(k<c.d.j.k.d> kVar, k0 k0Var) {
            super(kVar, k0Var);
        }
    }

    public t(int i) {
        this(RealtimeSinceBootClock.get());
        this.f3559a = i;
    }

    t(com.facebook.common.time.b bVar) {
        this.f3560b = Executors.newFixedThreadPool(3);
        this.f3561c = bVar;
    }

    private static String a(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    static HttpURLConnection a(Uri uri) {
        return (HttpURLConnection) c.d.d.k.f.k(uri).openConnection();
    }

    private HttpURLConnection a(Uri uri, int i) {
        HttpURLConnection a2 = a(uri);
        a2.setConnectTimeout(this.f3559a);
        int responseCode = a2.getResponseCode();
        if (b(responseCode)) {
            return a2;
        }
        if (!a(responseCode)) {
            a2.disconnect();
            throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
        }
        String headerField = a2.getHeaderField("Location");
        a2.disconnect();
        Uri parse = headerField == null ? null : Uri.parse(headerField);
        String scheme = uri.getScheme();
        if (i > 0 && parse != null && !parse.getScheme().equals(scheme)) {
            return a(parse, i - 1);
        }
        throw new IOException(i == 0 ? a("URL %s follows too many redirects", uri.toString()) : a("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
    }

    private static boolean a(int i) {
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean b(int i) {
        return i >= 200 && i < 300;
    }

    @Override // c.d.j.n.f0
    /* renamed from: a */
    public /* bridge */ /* synthetic */ s mo144a(k kVar, k0 k0Var) {
        return mo144a((k<c.d.j.k.d>) kVar, k0Var);
    }

    @Override // c.d.j.n.f0
    /* renamed from: a  reason: collision with other method in class */
    public c mo144a(k<c.d.j.k.d> kVar, k0 k0Var) {
        return new c(kVar, k0Var);
    }

    @Override // c.d.j.n.f0
    /* renamed from: a */
    public Map<String, String> b(c cVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f3568g - cVar.f3567f));
        hashMap.put("fetch_time", Long.toString(cVar.f3569h - cVar.f3568g));
        hashMap.put("total_time", Long.toString(cVar.f3569h - cVar.f3567f));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    @Override // c.d.j.n.f0
    public void a(c cVar, f0.a aVar) {
        cVar.f3567f = this.f3561c.now();
        cVar.b().a(new b(this, this.f3560b.submit(new a(cVar, aVar)), aVar));
    }

    @Override // c.d.j.n.f0
    /* renamed from: b */
    public void a(c cVar, int i) {
        cVar.f3569h = this.f3561c.now();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void b(c.d.j.n.t.c r5, c.d.j.n.f0.a r6) {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.h()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r2 = 5
            java.net.HttpURLConnection r1 = r4.a(r1, r2)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            com.facebook.common.time.b r2 = r4.f3561c     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            long r2 = r2.now()     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            c.d.j.n.t.c.b(r5, r2)     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            if (r1 == 0) goto L1d
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            r5 = -1
            r6.a(r0, r5)     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
        L1d:
            if (r0 == 0) goto L24
            r0.close()     // Catch: java.io.IOException -> L23
            goto L24
        L23:
        L24:
            if (r1 == 0) goto L3d
            goto L3a
        L27:
            r5 = move-exception
            goto L2e
        L29:
            r5 = move-exception
            r1 = r0
            goto L3f
        L2c:
            r5 = move-exception
            r1 = r0
        L2e:
            r6.a(r5)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L38
            r0.close()     // Catch: java.io.IOException -> L37
            goto L38
        L37:
        L38:
            if (r1 == 0) goto L3d
        L3a:
            r1.disconnect()
        L3d:
            return
        L3e:
            r5 = move-exception
        L3f:
            if (r0 == 0) goto L46
            r0.close()     // Catch: java.io.IOException -> L45
            goto L46
        L45:
        L46:
            if (r1 == 0) goto L4b
            r1.disconnect()
        L4b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.d.j.n.t.b(c.d.j.n.t$c, c.d.j.n.f0$a):void");
    }
}
