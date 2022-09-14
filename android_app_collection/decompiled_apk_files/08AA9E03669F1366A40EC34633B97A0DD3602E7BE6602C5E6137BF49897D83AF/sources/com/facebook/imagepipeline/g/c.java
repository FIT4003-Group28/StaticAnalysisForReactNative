package com.facebook.imagepipeline.g;

import com.facebook.imagepipeline.m.aj;
import com.facebook.imagepipeline.m.ap;
/* compiled from: CloseableProducerToDataSourceAdapter.java */
/* loaded from: classes.dex */
public class c<T> extends a<com.facebook.common.h.a<T>> {
    @Override // com.facebook.c.a
    protected /* bridge */ /* synthetic */ void a(Object obj) {
        a((com.facebook.common.h.a) ((com.facebook.common.h.a) obj));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.g.a
    public /* synthetic */ void b(Object obj, boolean z) {
        a((com.facebook.common.h.a) ((com.facebook.common.h.a) obj), z);
    }

    public static <T> com.facebook.c.c<com.facebook.common.h.a<T>> a(aj<com.facebook.common.h.a<T>> ajVar, ap apVar, com.facebook.imagepipeline.j.c cVar) {
        return new c(ajVar, apVar, cVar);
    }

    private c(aj<com.facebook.common.h.a<T>> ajVar, ap apVar, com.facebook.imagepipeline.j.c cVar) {
        super(ajVar, apVar, cVar);
    }

    @Override // com.facebook.c.a, com.facebook.c.c
    /* renamed from: j */
    public com.facebook.common.h.a<T> d() {
        return com.facebook.common.h.a.b((com.facebook.common.h.a) super.d());
    }

    protected void a(com.facebook.common.h.a<T> aVar) {
        com.facebook.common.h.a.c(aVar);
    }

    protected void a(com.facebook.common.h.a<T> aVar, boolean z) {
        super.b((c<T>) com.facebook.common.h.a.b(aVar), z);
    }
}
