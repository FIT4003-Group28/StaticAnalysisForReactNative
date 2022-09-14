package com.facebook.imagepipeline.b.a;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.i.d;
import com.facebook.imagepipeline.m.ag;
import com.facebook.imagepipeline.m.ak;
import com.facebook.imagepipeline.m.c;
import com.facebook.imagepipeline.m.e;
import com.facebook.imagepipeline.m.j;
import com.facebook.imagepipeline.m.s;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* compiled from: OkHttpNetworkFetcher.java */
/* loaded from: classes.dex */
public class b extends c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final Call.Factory f2528a;

    /* renamed from: b  reason: collision with root package name */
    private Executor f2529b;

    /* compiled from: OkHttpNetworkFetcher.java */
    /* loaded from: classes.dex */
    public static class a extends s {

        /* renamed from: a  reason: collision with root package name */
        public long f2536a;

        /* renamed from: b  reason: collision with root package name */
        public long f2537b;

        /* renamed from: c  reason: collision with root package name */
        public long f2538c;

        public a(j<d> jVar, ak akVar) {
            super(jVar, akVar);
        }
    }

    public b(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.dispatcher().executorService());
    }

    public b(Call.Factory factory, Executor executor) {
        this.f2528a = factory;
        this.f2529b = executor;
    }

    @Override // com.facebook.imagepipeline.m.ag
    /* renamed from: a */
    public a b(j<d> jVar, ak akVar) {
        return new a(jVar, akVar);
    }

    @Override // com.facebook.imagepipeline.m.ag
    public void a(a aVar, ag.a aVar2) {
        aVar.f2536a = SystemClock.elapsedRealtime();
        try {
            a(aVar, aVar2, new Request.Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(aVar.e().toString()).get().build());
        } catch (Exception e) {
            aVar2.a(e);
        }
    }

    @Override // com.facebook.imagepipeline.m.c, com.facebook.imagepipeline.m.ag
    /* renamed from: a */
    public void b(a aVar, int i) {
        aVar.f2538c = SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.imagepipeline.m.c, com.facebook.imagepipeline.m.ag
    /* renamed from: b */
    public Map<String, String> a(a aVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(aVar.f2537b - aVar.f2536a));
        hashMap.put("fetch_time", Long.toString(aVar.f2538c - aVar.f2537b));
        hashMap.put("total_time", Long.toString(aVar.f2538c - aVar.f2536a));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(final a aVar, final ag.a aVar2, Request request) {
        final Call newCall = this.f2528a.newCall(request);
        aVar.b().a(new e() { // from class: com.facebook.imagepipeline.b.a.b.1
            @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
            public void a() {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    b.this.f2529b.execute(new Runnable() { // from class: com.facebook.imagepipeline.b.a.b.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            newCall.cancel();
                        }
                    });
                } else {
                    newCall.cancel();
                }
            }
        });
        newCall.enqueue(new Callback() { // from class: com.facebook.imagepipeline.b.a.b.2
            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                aVar.f2537b = SystemClock.elapsedRealtime();
                ResponseBody body = response.body();
                try {
                    try {
                        try {
                        } catch (Exception e) {
                            b.this.a(call, e, aVar2);
                            body.close();
                        }
                        if (response.isSuccessful()) {
                            long contentLength = body.contentLength();
                            if (contentLength < 0) {
                                contentLength = 0;
                            }
                            aVar2.a(body.byteStream(), (int) contentLength);
                            body.close();
                            return;
                        }
                        b.this.a(call, new IOException("Unexpected HTTP code " + response), aVar2);
                        try {
                            body.close();
                        } catch (Exception e2) {
                            com.facebook.common.e.a.a("OkHttpNetworkFetchProducer", "Exception when closing response body", e2);
                        }
                    } catch (Throwable th) {
                        try {
                            body.close();
                        } catch (Exception e3) {
                            com.facebook.common.e.a.a("OkHttpNetworkFetchProducer", "Exception when closing response body", e3);
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    com.facebook.common.e.a.a("OkHttpNetworkFetchProducer", "Exception when closing response body", e4);
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                b.this.a(call, iOException, aVar2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Call call, Exception exc, ag.a aVar) {
        if (call.isCanceled()) {
            aVar.a();
        } else {
            aVar.a(exc);
        }
    }
}
