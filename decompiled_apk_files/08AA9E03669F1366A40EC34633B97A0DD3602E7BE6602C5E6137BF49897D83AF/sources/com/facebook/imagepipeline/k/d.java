package com.facebook.imagepipeline.k;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.common.d.i;
import com.facebook.common.g.g;
import com.facebook.imagepipeline.memory.j;
/* compiled from: KitKatPurgeableDecoder.java */
@TargetApi(19)
/* loaded from: classes.dex */
public class d extends b {

    /* renamed from: b  reason: collision with root package name */
    private final j f2721b;

    @Override // com.facebook.imagepipeline.k.b
    public /* bridge */ /* synthetic */ com.facebook.common.h.a a(Bitmap bitmap) {
        return super.a(bitmap);
    }

    @Override // com.facebook.imagepipeline.k.b, com.facebook.imagepipeline.k.e
    public /* bridge */ /* synthetic */ com.facebook.common.h.a a(com.facebook.imagepipeline.i.d dVar, Bitmap.Config config) {
        return super.a(dVar, config);
    }

    @Override // com.facebook.imagepipeline.k.b, com.facebook.imagepipeline.k.e
    public /* bridge */ /* synthetic */ com.facebook.common.h.a a(com.facebook.imagepipeline.i.d dVar, Bitmap.Config config, int i) {
        return super.a(dVar, config, i);
    }

    public d(j jVar) {
        this.f2721b = jVar;
    }

    @Override // com.facebook.imagepipeline.k.b
    protected Bitmap a(com.facebook.common.h.a<g> aVar, BitmapFactory.Options options) {
        g a2 = aVar.a();
        int a3 = a2.a();
        com.facebook.common.h.a<byte[]> a4 = this.f2721b.a(a3);
        try {
            byte[] a5 = a4.a();
            a2.a(0, a5, 0, a3);
            return (Bitmap) i.a(BitmapFactory.decodeByteArray(a5, 0, a3, options), "BitmapFactory returned null");
        } finally {
            com.facebook.common.h.a.c(a4);
        }
    }

    @Override // com.facebook.imagepipeline.k.b
    protected Bitmap a(com.facebook.common.h.a<g> aVar, int i, BitmapFactory.Options options) {
        byte[] bArr = a(aVar, i) ? null : f2718a;
        g a2 = aVar.a();
        i.a(i <= a2.a());
        int i2 = i + 2;
        com.facebook.common.h.a<byte[]> a3 = this.f2721b.a(i2);
        try {
            byte[] a4 = a3.a();
            a2.a(0, a4, 0, i);
            if (bArr != null) {
                a(a4, i);
                i = i2;
            }
            return (Bitmap) i.a(BitmapFactory.decodeByteArray(a4, 0, i, options), "BitmapFactory returned null");
        } finally {
            com.facebook.common.h.a.c(a3);
        }
    }

    private static void a(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }
}
