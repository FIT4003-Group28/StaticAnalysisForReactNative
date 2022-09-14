package com.facebook.imagepipeline.g;

import android.graphics.Bitmap;
/* compiled from: BaseBitmapDataSubscriber.java */
/* loaded from: classes.dex */
public abstract class b extends com.facebook.c.b<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> {
    protected abstract void a(Bitmap bitmap);

    @Override // com.facebook.c.b
    public void e(com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> cVar) {
        if (!cVar.b()) {
            return;
        }
        com.facebook.common.h.a<com.facebook.imagepipeline.i.b> d2 = cVar.d();
        Bitmap bitmap = null;
        if (d2 != null && (d2.a() instanceof com.facebook.imagepipeline.i.a)) {
            bitmap = ((com.facebook.imagepipeline.i.a) d2.a()).a();
        }
        try {
            a(bitmap);
        } finally {
            com.facebook.common.h.a.c(d2);
        }
    }
}
