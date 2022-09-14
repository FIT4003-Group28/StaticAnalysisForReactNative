package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import c.d.j.b.a.b;
import c.d.j.n.f0;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
/* loaded from: classes.dex */
class b extends c.d.j.b.a.b {
    public b(OkHttpClient okHttpClient) {
        super(okHttpClient);
        okHttpClient.dispatcher().executorService();
    }

    private Map<String, String> a(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    @Override // c.d.j.b.a.b, c.d.j.n.f0
    public void a(b.c cVar, f0.a aVar) {
        cVar.f3169f = SystemClock.elapsedRealtime();
        Uri h2 = cVar.h();
        Map<String, String> a2 = cVar.b().f() instanceof a ? a(((a) cVar.b().f()).u()) : null;
        if (a2 == null) {
            a2 = Collections.emptyMap();
        }
        a(cVar, aVar, new Request.Builder().cacheControl(new CacheControl.Builder().noStore().build()).url(h2.toString()).headers(Headers.of(a2)).get().build());
    }
}
