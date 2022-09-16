package com.facebook.react.modules.network;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static f f5720a;

    public static OkHttpClient.Builder a(Context context, int i) {
        OkHttpClient.Builder b2 = b();
        return i == 0 ? b2 : b2.cache(new Cache(new File(context.getCacheDir(), "http-cache"), i));
    }

    public static OkHttpClient.Builder a(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT <= 19) {
            try {
                builder.sslSocketFactory(new o());
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e2) {
                c.d.d.e.a.b("OkHttpClientProvider", "Error while enabling TLS 1.2", e2);
            }
        }
        return builder;
    }

    public static OkHttpClient a() {
        f fVar = f5720a;
        return fVar != null ? fVar.a() : b().build();
    }

    public static OkHttpClient a(Context context) {
        f fVar = f5720a;
        return fVar != null ? fVar.a() : b(context).build();
    }

    public static OkHttpClient.Builder b() {
        OkHttpClient.Builder cookieJar = new OkHttpClient.Builder().connectTimeout(0L, TimeUnit.MILLISECONDS).readTimeout(0L, TimeUnit.MILLISECONDS).writeTimeout(0L, TimeUnit.MILLISECONDS).cookieJar(new l());
        try {
            Security.insertProviderAt((Provider) Class.forName("org.conscrypt.OpenSSLProvider").newInstance(), 1);
            return cookieJar;
        } catch (Exception unused) {
            a(cookieJar);
            return cookieJar;
        }
    }

    public static OkHttpClient.Builder b(Context context) {
        return a(context, 10485760);
    }
}
