package c.d.j.m;

import android.graphics.Bitmap;
import c.d.b.a.d;
import c.d.d.d.i;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
/* loaded from: classes.dex */
public class a extends c.d.j.o.a {

    /* renamed from: b  reason: collision with root package name */
    private final int f3391b;

    /* renamed from: c  reason: collision with root package name */
    private final int f3392c;

    /* renamed from: d  reason: collision with root package name */
    private d f3393d;

    public a(int i) {
        this(3, i);
    }

    public a(int i, int i2) {
        boolean z = true;
        i.a(i > 0);
        i.a(i2 <= 0 ? false : z);
        this.f3391b = i;
        this.f3392c = i2;
    }

    @Override // c.d.j.o.a, c.d.j.o.e
    public d a() {
        if (this.f3393d == null) {
            this.f3393d = new c.d.b.a.i(String.format(null, "i%dr%d", Integer.valueOf(this.f3391b), Integer.valueOf(this.f3392c)));
        }
        return this.f3393d;
    }

    @Override // c.d.j.o.a
    public void a(Bitmap bitmap) {
        NativeBlurFilter.a(bitmap, this.f3391b, this.f3392c);
    }
}
