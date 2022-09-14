package com.facebook.f.a.a;

import android.content.res.Resources;
import com.facebook.common.d.i;
import com.facebook.common.d.k;
import com.facebook.imagepipeline.d.t;
import java.util.concurrent.Executor;
/* compiled from: PipelineDraweeControllerFactory.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private Resources f2362a;

    /* renamed from: b  reason: collision with root package name */
    private com.facebook.f.b.a f2363b;

    /* renamed from: c  reason: collision with root package name */
    private com.facebook.imagepipeline.a.a.a f2364c;

    /* renamed from: d  reason: collision with root package name */
    private Executor f2365d;
    private t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> e;
    private com.facebook.common.d.e<a> f;
    private k<Boolean> g;

    public void a(Resources resources, com.facebook.f.b.a aVar, com.facebook.imagepipeline.a.a.a aVar2, Executor executor, t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> tVar, com.facebook.common.d.e<a> eVar, k<Boolean> kVar) {
        this.f2362a = resources;
        this.f2363b = aVar;
        this.f2364c = aVar2;
        this.f2365d = executor;
        this.e = tVar;
        this.f = eVar;
        this.g = kVar;
    }

    public d a(k<com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>> kVar, String str, com.facebook.b.a.d dVar, Object obj) {
        i.b(this.f2362a != null, "init() not called");
        d a2 = a(this.f2362a, this.f2363b, this.f2364c, this.f2365d, this.e, this.f, kVar, str, dVar, obj);
        if (this.g != null) {
            a2.a(this.g.b().booleanValue());
        }
        return a2;
    }

    protected d a(Resources resources, com.facebook.f.b.a aVar, com.facebook.imagepipeline.a.a.a aVar2, Executor executor, t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> tVar, com.facebook.common.d.e<a> eVar, k<com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>> kVar, String str, com.facebook.b.a.d dVar, Object obj) {
        return new d(resources, aVar, aVar2, executor, tVar, kVar, str, dVar, obj, eVar);
    }
}
