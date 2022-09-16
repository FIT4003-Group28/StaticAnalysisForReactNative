package com.google.firebase.crashlytics.c.l;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.CacheControl;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
/* loaded from: classes.dex */
public class b {

    /* renamed from: f  reason: collision with root package name */
    private static final OkHttpClient f9034f = new OkHttpClient().newBuilder().callTimeout(10000, TimeUnit.MILLISECONDS).build();

    /* renamed from: a  reason: collision with root package name */
    private final a f9035a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9036b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f9037c;

    /* renamed from: e  reason: collision with root package name */
    private MultipartBody.Builder f9039e = null;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, String> f9038d = new HashMap();

    public b(a aVar, String str, Map<String, String> map) {
        this.f9035a = aVar;
        this.f9036b = str;
        this.f9037c = map;
    }

    private Request c() {
        Request.Builder cacheControl = new Request.Builder().cacheControl(new CacheControl.Builder().noCache().build());
        HttpUrl.Builder newBuilder = HttpUrl.parse(this.f9036b).newBuilder();
        for (Map.Entry<String, String> entry : this.f9037c.entrySet()) {
            newBuilder = newBuilder.addEncodedQueryParameter(entry.getKey(), entry.getValue());
        }
        Request.Builder url = cacheControl.url(newBuilder.build());
        for (Map.Entry<String, String> entry2 : this.f9038d.entrySet()) {
            url = url.header(entry2.getKey(), entry2.getValue());
        }
        MultipartBody.Builder builder = this.f9039e;
        return url.method(this.f9035a.name(), builder == null ? null : builder.build()).build();
    }

    private MultipartBody.Builder d() {
        if (this.f9039e == null) {
            this.f9039e = new MultipartBody.Builder().setType(MultipartBody.FORM);
        }
        return this.f9039e;
    }

    public b a(String str, String str2) {
        this.f9038d.put(str, str2);
        return this;
    }

    public b a(String str, String str2, String str3, File file) {
        this.f9039e = d().addFormDataPart(str, str2, RequestBody.create(MediaType.parse(str3), file));
        return this;
    }

    public b a(Map.Entry<String, String> entry) {
        a(entry.getKey(), entry.getValue());
        return this;
    }

    public d a() {
        return d.a(f9034f.newCall(c()).execute());
    }

    public b b(String str, String str2) {
        this.f9039e = d().addFormDataPart(str, str2);
        return this;
    }

    public String b() {
        return this.f9035a.name();
    }
}
