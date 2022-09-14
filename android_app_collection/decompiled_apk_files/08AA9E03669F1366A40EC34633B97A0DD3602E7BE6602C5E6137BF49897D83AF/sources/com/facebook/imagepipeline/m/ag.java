package com.facebook.imagepipeline.m;

import com.facebook.imagepipeline.m.s;
import java.io.InputStream;
import java.util.Map;
/* compiled from: NetworkFetcher.java */
/* loaded from: classes.dex */
public interface ag<FETCH_STATE extends s> {

    /* compiled from: NetworkFetcher.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(InputStream inputStream, int i);

        void a(Throwable th);
    }

    Map<String, String> a(FETCH_STATE fetch_state, int i);

    void a(FETCH_STATE fetch_state, a aVar);

    boolean a(FETCH_STATE fetch_state);

    FETCH_STATE b(j<com.facebook.imagepipeline.i.d> jVar, ak akVar);

    void b(FETCH_STATE fetch_state, int i);
}
