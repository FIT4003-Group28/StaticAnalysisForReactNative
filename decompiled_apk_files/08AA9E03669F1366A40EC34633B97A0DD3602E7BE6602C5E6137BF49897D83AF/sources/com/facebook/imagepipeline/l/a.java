package com.facebook.imagepipeline.l;

import android.graphics.Bitmap;
import com.facebook.b.a.d;
import com.facebook.common.d.i;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
/* compiled from: IterativeBoxBlurPostProcessor.java */
/* loaded from: classes.dex */
public class a extends com.facebook.imagepipeline.n.a {

    /* renamed from: b  reason: collision with root package name */
    private final int f2722b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2723c;

    /* renamed from: d  reason: collision with root package name */
    private d f2724d;

    public a(int i) {
        this(3, i);
    }

    public a(int i, int i2) {
        boolean z = false;
        i.a(i > 0);
        i.a(i2 > 0 ? true : z);
        this.f2722b = i;
        this.f2723c = i2;
    }

    @Override // com.facebook.imagepipeline.n.a
    public void a(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f2722b, this.f2723c);
    }

    @Override // com.facebook.imagepipeline.n.a, com.facebook.imagepipeline.n.e
    public d a() {
        if (this.f2724d == null) {
            this.f2724d = new com.facebook.b.a.i(String.format(null, "i%dr%d", Integer.valueOf(this.f2722b), Integer.valueOf(this.f2723c)));
        }
        return this.f2724d;
    }
}
