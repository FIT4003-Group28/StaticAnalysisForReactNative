package c.d.j.i;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import java.util.Map;
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f3359a;

    /* renamed from: b  reason: collision with root package name */
    private final c f3360b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.platform.f f3361c;

    /* renamed from: d  reason: collision with root package name */
    private final c f3362d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<c.d.i.c, c> f3363e;

    /* loaded from: classes.dex */
    class a implements c {
        a() {
        }

        @Override // c.d.j.i.c
        public c.d.j.k.b a(c.d.j.k.d dVar, int i, c.d.j.k.g gVar, c.d.j.e.b bVar) {
            c.d.i.c g2 = dVar.g();
            if (g2 == c.d.i.b.f3144a) {
                return b.this.d(dVar, i, gVar, bVar);
            }
            if (g2 == c.d.i.b.f3146c) {
                return b.this.c(dVar, i, gVar, bVar);
            }
            if (g2 == c.d.i.b.j) {
                return b.this.b(dVar, i, gVar, bVar);
            }
            if (g2 == c.d.i.c.f3152b) {
                throw new c.d.j.i.a("unknown image format", dVar);
            }
            return b.this.a(dVar, bVar);
        }
    }

    public b(c cVar, c cVar2, com.facebook.imagepipeline.platform.f fVar) {
        this(cVar, cVar2, fVar, null);
    }

    public b(c cVar, c cVar2, com.facebook.imagepipeline.platform.f fVar, Map<c.d.i.c, c> map) {
        this.f3362d = new a();
        this.f3359a = cVar;
        this.f3360b = cVar2;
        this.f3361c = fVar;
        this.f3363e = map;
    }

    private void a(c.d.j.r.a aVar, c.d.d.h.a<Bitmap> aVar2) {
        if (aVar == null) {
            return;
        }
        Bitmap b2 = aVar2.b();
        if (Build.VERSION.SDK_INT >= 12 && aVar.a()) {
            b2.setHasAlpha(true);
        }
        aVar.a(b2);
    }

    @Override // c.d.j.i.c
    public c.d.j.k.b a(c.d.j.k.d dVar, int i, c.d.j.k.g gVar, c.d.j.e.b bVar) {
        c cVar;
        c cVar2 = bVar.f3252g;
        if (cVar2 != null) {
            return cVar2.a(dVar, i, gVar, bVar);
        }
        c.d.i.c g2 = dVar.g();
        if (g2 == null || g2 == c.d.i.c.f3152b) {
            g2 = c.d.i.d.c(dVar.h());
            dVar.a(g2);
        }
        Map<c.d.i.c, c> map = this.f3363e;
        return (map == null || (cVar = map.get(g2)) == null) ? this.f3362d.a(dVar, i, gVar, bVar) : cVar.a(dVar, i, gVar, bVar);
    }

    public c.d.j.k.c a(c.d.j.k.d dVar, c.d.j.e.b bVar) {
        c.d.d.h.a<Bitmap> a2 = this.f3361c.a(dVar, bVar.f3251f, (Rect) null, bVar.i);
        try {
            a(bVar.f3253h, a2);
            return new c.d.j.k.c(a2, c.d.j.k.f.f3386d, dVar.i(), dVar.e());
        } finally {
            a2.close();
        }
    }

    public c.d.j.k.b b(c.d.j.k.d dVar, int i, c.d.j.k.g gVar, c.d.j.e.b bVar) {
        return this.f3360b.a(dVar, i, gVar, bVar);
    }

    public c.d.j.k.b c(c.d.j.k.d dVar, int i, c.d.j.k.g gVar, c.d.j.e.b bVar) {
        c cVar;
        if (dVar.A() == -1 || dVar.f() == -1) {
            throw new c.d.j.i.a("image width or height is incorrect", dVar);
        }
        return (bVar.f3250e || (cVar = this.f3359a) == null) ? a(dVar, bVar) : cVar.a(dVar, i, gVar, bVar);
    }

    public c.d.j.k.c d(c.d.j.k.d dVar, int i, c.d.j.k.g gVar, c.d.j.e.b bVar) {
        c.d.d.h.a<Bitmap> a2 = this.f3361c.a(dVar, bVar.f3251f, null, i, bVar.i);
        try {
            a(bVar.f3253h, a2);
            return new c.d.j.k.c(a2, gVar, dVar.i(), dVar.e());
        } finally {
            a2.close();
        }
    }
}
