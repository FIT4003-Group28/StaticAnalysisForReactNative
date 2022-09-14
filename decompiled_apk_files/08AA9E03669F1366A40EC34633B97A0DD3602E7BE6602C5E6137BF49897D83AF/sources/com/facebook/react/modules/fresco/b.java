package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.b.a.b;
import com.facebook.imagepipeline.m.ag;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.an;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
/* compiled from: ReactOkHttpNetworkFetcher.java */
/* loaded from: classes.dex */
class b extends com.facebook.imagepipeline.b.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final OkHttpClient f3567a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f3568b;

    public b(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.f3567a = okHttpClient;
        this.f3568b = okHttpClient.dispatcher().executorService();
    }

    private Map<String, String> a(an anVar) {
        if (anVar == null) {
            return null;
        }
        ReadableMapKeySetIterator a2 = anVar.a();
        HashMap hashMap = new HashMap();
        while (a2.hasNextKey()) {
            String nextKey = a2.nextKey();
            hashMap.put(nextKey, anVar.getString(nextKey));
        }
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.b.a.b, com.facebook.imagepipeline.m.ag
    public void a(b.a aVar, ag.a aVar2) {
        aVar.f2536a = SystemClock.elapsedRealtime();
        Uri e = aVar.e();
        Map<String, String> a2 = aVar.b().a() instanceof a ? a(((a) aVar.b().a()).r()) : null;
        if (a2 == null) {
            a2 = Collections.emptyMap();
        }
        a(aVar, aVar2, new Request.Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(e.toString()).headers(Headers.of(a2)).get().build());
    }
}
