package c.d.j.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import c.d.d.d.i;
@TargetApi(21)
/* loaded from: classes.dex */
public class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.d f3172a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.j.f.a f3173b;

    public a(com.facebook.imagepipeline.memory.d dVar, c.d.j.f.a aVar) {
        this.f3172a = dVar;
        this.f3173b = aVar;
    }

    @Override // c.d.j.c.f
    public c.d.d.h.a<Bitmap> b(int i, int i2, Bitmap.Config config) {
        Bitmap mo186get = this.f3172a.mo186get(com.facebook.imageutils.a.a(i, i2, config));
        i.a(mo186get.getAllocationByteCount() >= (i * i2) * com.facebook.imageutils.a.a(config));
        mo186get.reconfigure(i, i2, config);
        return this.f3173b.a(mo186get, this.f3172a);
    }
}
