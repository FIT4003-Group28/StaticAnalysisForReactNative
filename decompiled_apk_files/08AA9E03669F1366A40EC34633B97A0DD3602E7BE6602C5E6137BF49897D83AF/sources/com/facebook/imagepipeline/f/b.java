package com.facebook.imagepipeline.f;

import com.facebook.b.b.e;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: DiskStorageCacheFactory.java */
/* loaded from: classes.dex */
public class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private c f2644a;

    public b(c cVar) {
        this.f2644a = cVar;
    }

    public static com.facebook.b.b.e a(com.facebook.b.b.c cVar, com.facebook.b.b.d dVar) {
        return a(cVar, dVar, Executors.newSingleThreadExecutor());
    }

    public static com.facebook.b.b.e a(com.facebook.b.b.c cVar, com.facebook.b.b.d dVar, Executor executor) {
        return new com.facebook.b.b.e(dVar, cVar.g(), new e.b(cVar.f(), cVar.e(), cVar.d()), cVar.i(), cVar.h(), cVar.j(), cVar.k(), executor, cVar.l());
    }

    @Override // com.facebook.imagepipeline.f.f
    public com.facebook.b.b.i a(com.facebook.b.b.c cVar) {
        return a(cVar, this.f2644a.a(cVar));
    }
}
