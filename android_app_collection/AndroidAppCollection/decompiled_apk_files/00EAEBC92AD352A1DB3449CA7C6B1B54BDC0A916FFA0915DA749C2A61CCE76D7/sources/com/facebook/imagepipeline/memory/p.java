package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import java.util.Set;
/* loaded from: classes.dex */
public class p implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Bitmap> f5260a = c.d.d.d.k.b();

    @Override // c.d.d.g.e, c.d.d.h.c
    public void a(Bitmap bitmap) {
        c.d.d.d.i.a(bitmap);
        this.f5260a.remove(bitmap);
        bitmap.recycle();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.d.d.g.e
    /* renamed from: get */
    public Bitmap mo186get(int i) {
        Bitmap createBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        this.f5260a.add(createBitmap);
        return createBitmap;
    }
}
