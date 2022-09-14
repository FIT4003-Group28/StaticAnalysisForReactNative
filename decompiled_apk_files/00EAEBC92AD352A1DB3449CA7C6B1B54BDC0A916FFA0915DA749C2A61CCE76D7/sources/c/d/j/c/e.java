package c.d.j.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Rect;
@TargetApi(11)
/* loaded from: classes.dex */
public class e extends f {

    /* renamed from: e  reason: collision with root package name */
    private static final String f3177e = "e";

    /* renamed from: a  reason: collision with root package name */
    private final b f3178a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.platform.f f3179b;

    /* renamed from: c  reason: collision with root package name */
    private final c.d.j.f.a f3180c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3181d;

    public e(b bVar, com.facebook.imagepipeline.platform.f fVar, c.d.j.f.a aVar) {
        this.f3178a = bVar;
        this.f3179b = fVar;
        this.f3180c = aVar;
    }

    private c.d.d.h.a<Bitmap> c(int i, int i2, Bitmap.Config config) {
        return this.f3180c.a(Bitmap.createBitmap(i, i2, config), h.a());
    }

    @Override // c.d.j.c.f
    @TargetApi(12)
    public c.d.d.h.a<Bitmap> b(int i, int i2, Bitmap.Config config) {
        if (this.f3181d) {
            return c(i, i2, config);
        }
        c.d.d.h.a<c.d.d.g.g> a2 = this.f3178a.a((short) i, (short) i2);
        try {
            c.d.j.k.d dVar = new c.d.j.k.d(a2);
            dVar.a(c.d.i.b.f3144a);
            c.d.d.h.a<Bitmap> a3 = this.f3179b.a(dVar, config, (Rect) null, a2.b().size());
            if (a3.b().isMutable()) {
                a3.b().setHasAlpha(true);
                a3.b().eraseColor(0);
                c.d.j.k.d.c(dVar);
                return a3;
            }
            c.d.d.h.a.b(a3);
            this.f3181d = true;
            c.d.d.e.a.e(f3177e, "Immutable bitmap returned by decoder");
            c.d.d.h.a<Bitmap> c2 = c(i, i2, config);
            c.d.j.k.d.c(dVar);
            return c2;
        } finally {
            a2.close();
        }
    }
}
