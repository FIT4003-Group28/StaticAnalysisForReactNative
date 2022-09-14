package com.facebook.imagepipeline.d;

import android.net.Uri;
/* compiled from: DefaultCacheKeyFactory.java */
/* loaded from: classes.dex */
public class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private static j f2595a;

    protected Uri a(Uri uri) {
        return uri;
    }

    protected j() {
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f2595a == null) {
                f2595a = new j();
            }
            jVar = f2595a;
        }
        return jVar;
    }

    @Override // com.facebook.imagepipeline.d.f
    public com.facebook.b.a.d a(com.facebook.imagepipeline.n.b bVar, Object obj) {
        return new c(a(bVar.b()).toString(), bVar.g(), bVar.h(), bVar.i(), null, null, obj);
    }

    @Override // com.facebook.imagepipeline.d.f
    public com.facebook.b.a.d b(com.facebook.imagepipeline.n.b bVar, Object obj) {
        com.facebook.b.a.d dVar;
        String str;
        com.facebook.imagepipeline.n.e p = bVar.p();
        if (p != null) {
            com.facebook.b.a.d a2 = p.a();
            str = p.getClass().getName();
            dVar = a2;
        } else {
            dVar = null;
            str = null;
        }
        return new c(a(bVar.b()).toString(), bVar.g(), bVar.h(), bVar.i(), dVar, str, obj);
    }

    @Override // com.facebook.imagepipeline.d.f
    public com.facebook.b.a.d c(com.facebook.imagepipeline.n.b bVar, Object obj) {
        return a(bVar, bVar.b(), obj);
    }

    @Override // com.facebook.imagepipeline.d.f
    public com.facebook.b.a.d a(com.facebook.imagepipeline.n.b bVar, Uri uri, Object obj) {
        return new com.facebook.b.a.i(a(uri).toString());
    }
}
