package com.facebook.react.modules.network;

import android.os.Build;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;
/* compiled from: OkHttpClientProvider.java */
/* loaded from: classes.dex */
public class e {
    public static OkHttpClient a() {
        return a(new OkHttpClient.Builder().connectTimeout(0L, TimeUnit.MILLISECONDS).readTimeout(0L, TimeUnit.MILLISECONDS).writeTimeout(0L, TimeUnit.MILLISECONDS).cookieJar(new i())).build();
    }

    public static OkHttpClient.Builder a(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 19) {
            try {
                builder.sslSocketFactory(new l());
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e) {
                com.facebook.common.e.a.b("OkHttpClientProvider", "Error while enabling TLS 1.2", e);
            }
        }
        return builder;
    }
}
