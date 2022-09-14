package com.facebook.imagepipeline.m;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: LocalVideoThumbnailProducer.java */
/* loaded from: classes.dex */
public class ac implements aj<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f2727a;

    public ac(Executor executor) {
        this.f2727a = executor;
    }

    @Override // com.facebook.imagepipeline.m.aj
    public void a(j<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> jVar, ak akVar) {
        final am c2 = akVar.c();
        final String b2 = akVar.b();
        final com.facebook.imagepipeline.n.b a2 = akVar.a();
        final aq<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> aqVar = new aq<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>(jVar, c2, "VideoThumbnailProducer", b2) { // from class: com.facebook.imagepipeline.m.ac.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq, com.facebook.common.b.e
            public void a(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar) {
                super.a((AnonymousClass1) aVar);
                c2.a(b2, "VideoThumbnailProducer", aVar != null);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq, com.facebook.common.b.e
            public void a(Exception exc) {
                super.a(exc);
                c2.a(b2, "VideoThumbnailProducer", false);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.common.b.e
            /* renamed from: d */
            public com.facebook.common.h.a<com.facebook.imagepipeline.i.b> c() {
                Bitmap createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(a2.o().getPath(), ac.b(a2));
                if (createVideoThumbnail == null) {
                    return null;
                }
                return com.facebook.common.h.a.a(new com.facebook.imagepipeline.i.c(createVideoThumbnail, com.facebook.imagepipeline.c.g.a(), com.facebook.imagepipeline.i.f.f2710a, 0));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq
            /* renamed from: b */
            public Map<String, String> c(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar) {
                return com.facebook.common.d.f.a("createdThumbnail", String.valueOf(aVar != null));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.imagepipeline.m.aq, com.facebook.common.b.e
            /* renamed from: c  reason: avoid collision after fix types in other method */
            public void b(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar) {
                com.facebook.common.h.a.c(aVar);
            }
        };
        akVar.a(new e() { // from class: com.facebook.imagepipeline.m.ac.2
            @Override // com.facebook.imagepipeline.m.e, com.facebook.imagepipeline.m.al
            public void a() {
                aqVar.a();
            }
        });
        this.f2727a.execute(aqVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(com.facebook.imagepipeline.n.b bVar) {
        return (bVar.e() > 96 || bVar.f() > 96) ? 1 : 3;
    }
}
