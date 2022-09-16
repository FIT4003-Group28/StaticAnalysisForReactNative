package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import c.d.d.d.i;
import com.facebook.imagepipeline.memory.q;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
@TargetApi(19)
/* loaded from: classes.dex */
public class d extends DalvikPurgeableDecoder {

    /* renamed from: c  reason: collision with root package name */
    private final q f5294c;

    public d(q qVar) {
        this.f5294c = qVar;
    }

    private static void a(byte[] bArr, int i) {
        bArr[i] = -1;
        bArr[i + 1] = -39;
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap a(c.d.d.h.a<c.d.d.g.g> aVar, int i, BitmapFactory.Options options) {
        byte[] bArr = DalvikPurgeableDecoder.a(aVar, i) ? null : DalvikPurgeableDecoder.f5278b;
        c.d.d.g.g b2 = aVar.b();
        i.a(i <= b2.size());
        int i2 = i + 2;
        c.d.d.h.a<byte[]> a2 = this.f5294c.a(i2);
        try {
            byte[] b3 = a2.b();
            b2.a(0, b3, 0, i);
            if (bArr != null) {
                a(b3, i);
                i = i2;
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b3, 0, i, options);
            i.a(decodeByteArray, "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            c.d.d.h.a.b(a2);
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    protected Bitmap a(c.d.d.h.a<c.d.d.g.g> aVar, BitmapFactory.Options options) {
        c.d.d.g.g b2 = aVar.b();
        int size = b2.size();
        c.d.d.h.a<byte[]> a2 = this.f5294c.a(size);
        try {
            byte[] b3 = a2.b();
            b2.a(0, b3, 0, size);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b3, 0, size, options);
            i.a(decodeByteArray, "BitmapFactory returned null");
            return decodeByteArray;
        } finally {
            c.d.d.h.a.b(a2);
        }
    }
}
