package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
/* compiled from: BitmapPool.java */
@TargetApi(21)
/* loaded from: classes.dex */
public class d extends a<Bitmap> {
    @Override // com.facebook.imagepipeline.memory.a
    protected int c(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int d(int i) {
        return i;
    }

    public d(com.facebook.common.g.c cVar, t tVar, u uVar) {
        super(cVar, tVar, uVar);
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: i */
    public Bitmap b(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: a */
    public void b(Bitmap bitmap) {
        com.facebook.common.d.i.a(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public int c(Bitmap bitmap) {
        com.facebook.common.d.i.a(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean d(Bitmap bitmap) {
        com.facebook.common.d.i.a(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
