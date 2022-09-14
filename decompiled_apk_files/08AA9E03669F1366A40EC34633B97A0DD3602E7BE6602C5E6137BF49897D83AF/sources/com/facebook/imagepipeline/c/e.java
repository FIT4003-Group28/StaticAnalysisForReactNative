package com.facebook.imagepipeline.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
/* compiled from: HoneycombBitmapFactory.java */
@TargetApi(11)
/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: a  reason: collision with root package name */
    private final b f2545a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.k.e f2546b;

    public e(b bVar, com.facebook.imagepipeline.k.e eVar) {
        this.f2545a = bVar;
        this.f2546b = eVar;
    }

    @Override // com.facebook.imagepipeline.c.f
    @TargetApi(12)
    public com.facebook.common.h.a<Bitmap> a(int i, int i2, Bitmap.Config config) {
        com.facebook.common.h.a<com.facebook.common.g.g> a2 = this.f2545a.a((short) i, (short) i2);
        try {
            com.facebook.imagepipeline.i.d dVar = new com.facebook.imagepipeline.i.d(a2);
            dVar.a(com.facebook.h.b.f2509a);
            com.facebook.common.h.a<Bitmap> a3 = this.f2546b.a(dVar, config, a2.a().a());
            a3.a().setHasAlpha(true);
            a3.a().eraseColor(0);
            com.facebook.imagepipeline.i.d.d(dVar);
            return a3;
        } finally {
            a2.close();
        }
    }
}
