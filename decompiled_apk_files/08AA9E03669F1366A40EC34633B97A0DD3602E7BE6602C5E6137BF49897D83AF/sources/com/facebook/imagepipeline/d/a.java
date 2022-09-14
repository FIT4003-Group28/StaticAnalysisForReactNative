package com.facebook.imagepipeline.d;
/* compiled from: BitmapCountingMemoryCacheFactory.java */
/* loaded from: classes.dex */
public class a {
    public static h<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> a(com.facebook.common.d.k<u> kVar, com.facebook.common.g.c cVar, com.facebook.imagepipeline.c.f fVar, boolean z) {
        h<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> hVar = new h<>(new ac<com.facebook.imagepipeline.i.b>() { // from class: com.facebook.imagepipeline.d.a.1
            @Override // com.facebook.imagepipeline.d.ac
            public int a(com.facebook.imagepipeline.i.b bVar) {
                return bVar.b();
            }
        }, new d(), kVar, fVar, z);
        cVar.a(hVar);
        return hVar;
    }
}
