package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import c.e.a.a.i.h;
import com.google.android.datatransport.cct.b.a;
import com.google.android.datatransport.cct.b.j;
import com.google.android.datatransport.cct.b.k;
import com.google.android.datatransport.cct.b.l;
import com.google.android.datatransport.cct.b.m;
import com.google.android.datatransport.cct.b.n;
import com.google.android.datatransport.cct.b.o;
import com.google.android.datatransport.cct.b.p;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements m {

    /* renamed from: a  reason: collision with root package name */
    private final c.e.b.k.a f6675a;

    /* renamed from: b  reason: collision with root package name */
    private final ConnectivityManager f6676b;

    /* renamed from: c  reason: collision with root package name */
    final URL f6677c;

    /* renamed from: d  reason: collision with root package name */
    private final c.e.a.a.i.y.a f6678d;

    /* renamed from: e  reason: collision with root package name */
    private final c.e.a.a.i.y.a f6679e;

    /* renamed from: f  reason: collision with root package name */
    private final int f6680f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        final URL f6681a;

        /* renamed from: b  reason: collision with root package name */
        final j f6682b;

        /* renamed from: c  reason: collision with root package name */
        final String f6683c;

        a(URL url, j jVar, String str) {
            this.f6681a = url;
            this.f6682b = jVar;
            this.f6683c = str;
        }

        a a(URL url) {
            return new a(url, this.f6682b, this.f6683c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final int f6684a;

        /* renamed from: b  reason: collision with root package name */
        final URL f6685b;

        /* renamed from: c  reason: collision with root package name */
        final long f6686c;

        b(int i, URL url, long j) {
            this.f6684a = i;
            this.f6685b = url;
            this.f6686c = j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, c.e.a.a.i.y.a aVar, c.e.a.a.i.y.a aVar2) {
        c.e.b.k.i.d dVar = new c.e.b.k.i.d();
        dVar.a(com.google.android.datatransport.cct.b.b.f6589a);
        dVar.a(true);
        this.f6675a = dVar.a();
        this.f6676b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f6677c = a(com.google.android.datatransport.cct.a.f6582c);
        this.f6678d = aVar2;
        this.f6679e = aVar;
        this.f6680f = 40000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ a a(a aVar, b bVar) {
        URL url = bVar.f6685b;
        if (url != null) {
            c.e.a.a.i.u.a.a("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.a(bVar.f6685b);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b a(a aVar) {
        c.e.a.a.i.u.a.a("CctTransportBackend", "Making request to: %s", aVar.f6681a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f6681a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f6680f);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "2.2.3"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f6683c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                this.f6675a.a(aVar.f6682b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                c.e.a.a.i.u.a.a("CctTransportBackend", "Status Code: " + responseCode);
                c.e.a.a.i.u.a.a("CctTransportBackend", "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                c.e.a.a.i.u.a.a("CctTransportBackend", "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                }
                if (responseCode != 200) {
                    return new b(responseCode, null, 0L);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                    b bVar = new b(responseCode, null, n.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a());
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return bVar;
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        } catch (c.e.b.k.c | IOException e2) {
            c.e.a.a.i.u.a.a("CctTransportBackend", "Couldn't encode request, returning with 400", e2);
            return new b(400, null, 0L);
        }
    }

    private static URL a(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException("Invalid url: " + str, e2);
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public h a(h hVar) {
        int subtype;
        o.b bVar;
        NetworkInfo activeNetworkInfo = this.f6676b.getActiveNetworkInfo();
        h.a h2 = hVar.h();
        h2.a("sdk-version", Build.VERSION.SDK_INT);
        h2.a("model", Build.MODEL);
        h2.a("hardware", Build.HARDWARE);
        h2.a("device", Build.DEVICE);
        h2.a("product", Build.PRODUCT);
        h2.a("os-uild", Build.ID);
        h2.a("manufacturer", Build.MANUFACTURER);
        h2.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        h2.a("tz-offset", TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        h2.a("net-type", activeNetworkInfo == null ? o.c.u.a() : activeNetworkInfo.getType());
        if (activeNetworkInfo == null) {
            bVar = o.b.f6652c;
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype != -1) {
                if (o.b.a(subtype) == null) {
                    subtype = 0;
                }
                h2.a("mobile-subtype", subtype);
                return h2.a();
            }
            bVar = o.b.w;
        }
        subtype = bVar.a();
        h2.a("mobile-subtype", subtype);
        return h2.a();
    }

    @Override // com.google.android.datatransport.runtime.backends.m
    public g a(com.google.android.datatransport.runtime.backends.f fVar) {
        l.a a2;
        HashMap hashMap = new HashMap();
        for (h hVar : fVar.a()) {
            String f2 = hVar.f();
            if (!hashMap.containsKey(f2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                hashMap.put(f2, arrayList);
            } else {
                ((List) hashMap.get(f2)).add(hVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            h hVar2 = (h) ((List) entry.getValue()).get(0);
            m.a h2 = com.google.android.datatransport.cct.b.m.h();
            h2.a(p.f6666b);
            h2.a(this.f6679e.a());
            h2.b(this.f6678d.a());
            k.a c2 = k.c();
            c2.a(k.b.f6651c);
            a.AbstractC0141a i = com.google.android.datatransport.cct.b.a.i();
            i.a(Integer.valueOf(hVar2.b("sdk-version")));
            i.e(hVar2.a("model"));
            i.c(hVar2.a("hardware"));
            i.a(hVar2.a("device"));
            i.g(hVar2.a("product"));
            i.f(hVar2.a("os-uild"));
            i.d(hVar2.a("manufacturer"));
            i.b(hVar2.a("fingerprint"));
            c2.a(i.a());
            h2.a(c2.a());
            try {
                h2.a(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                h2.b((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (h hVar3 : (List) entry.getValue()) {
                c.e.a.a.i.g c3 = hVar3.c();
                c.e.a.a.b b2 = c3.b();
                if (b2.equals(c.e.a.a.b.a("proto"))) {
                    a2 = l.a(c3.a());
                } else if (b2.equals(c.e.a.a.b.a("json"))) {
                    a2 = l.a(new String(c3.a(), Charset.forName("UTF-8")));
                } else {
                    c.e.a.a.i.u.a.b("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b2);
                }
                a2.a(hVar3.d());
                a2.b(hVar3.g());
                a2.c(hVar3.c("tz-offset"));
                o.a c4 = o.c();
                c4.a(o.c.a(hVar3.b("net-type")));
                c4.a(o.b.a(hVar3.b("mobile-subtype")));
                a2.a(c4.a());
                if (hVar3.b() != null) {
                    a2.a(hVar3.b());
                }
                arrayList3.add(a2.a());
            }
            h2.a(arrayList3);
            arrayList2.add(h2.a());
        }
        j a3 = j.a(arrayList2);
        String str = null;
        URL url = this.f6677c;
        if (fVar.b() != null) {
            try {
                com.google.android.datatransport.cct.a a4 = com.google.android.datatransport.cct.a.a(fVar.b());
                if (a4.d() != null) {
                    str = a4.d();
                }
                if (a4.e() != null) {
                    url = a(a4.e());
                }
            } catch (IllegalArgumentException unused2) {
                return g.c();
            }
        }
        try {
            b bVar = (b) c.e.a.a.i.v.b.a(5, new a(url, a3, str), c.a(this), d.a());
            if (bVar.f6684a == 200) {
                return g.a(bVar.f6686c);
            }
            int i2 = bVar.f6684a;
            if (i2 < 500 && i2 != 404) {
                return g.c();
            }
            return g.d();
        } catch (IOException e2) {
            c.e.a.a.i.u.a.a("CctTransportBackend", "Could not make request to the backend", (Throwable) e2);
            return g.d();
        }
    }
}
