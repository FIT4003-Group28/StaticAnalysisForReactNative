package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
@TargetApi(21)
/* loaded from: classes.dex */
public class h extends a<Bitmap> implements d {
    public h(c.d.d.g.c cVar, g0 g0Var, h0 h0Var) {
        super(cVar, g0Var, h0Var);
        a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: a */
    public Bitmap mo187a(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: a */
    public Bitmap mo181a(f<Bitmap> fVar) {
        Bitmap bitmap = (Bitmap) super.mo181a((f<Object>) fVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: a */
    public void b(Bitmap bitmap) {
        c.d.d.d.i.a(bitmap);
        bitmap.recycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public int c(Bitmap bitmap) {
        c.d.d.d.i.a(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean d(Bitmap bitmap) {
        c.d.d.d.i.a(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int d(int i) {
        return i;
    }

    @Override // com.facebook.imagepipeline.memory.a
    protected int e(int i) {
        return i;
    }
}
