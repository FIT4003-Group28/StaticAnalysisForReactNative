package c.d.h.a.a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c.d.h.e.j;
/* loaded from: classes.dex */
public class a implements c.d.j.j.a {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f2912a;

    /* renamed from: b  reason: collision with root package name */
    private final c.d.j.j.a f2913b;

    public a(Resources resources, c.d.j.j.a aVar) {
        this.f2912a = resources;
        this.f2913b = aVar;
    }

    private static boolean a(c.d.j.k.c cVar) {
        return (cVar.g() == 1 || cVar.g() == 0) ? false : true;
    }

    private static boolean b(c.d.j.k.c cVar) {
        return (cVar.h() == 0 || cVar.h() == -1) ? false : true;
    }

    @Override // c.d.j.j.a
    public boolean a(c.d.j.k.b bVar) {
        return true;
    }

    @Override // c.d.j.j.a
    public Drawable b(c.d.j.k.b bVar) {
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("DefaultDrawableFactory#createDrawable");
            }
            if (bVar instanceof c.d.j.k.c) {
                c.d.j.k.c cVar = (c.d.j.k.c) bVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f2912a, cVar.f());
                if (!b(cVar) && !a(cVar)) {
                    return bitmapDrawable;
                }
                j jVar = new j(bitmapDrawable, cVar.h(), cVar.g());
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
                return jVar;
            } else if (this.f2913b == null || !this.f2913b.a(bVar)) {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
                return null;
            } else {
                Drawable b2 = this.f2913b.b(bVar);
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
                return b2;
            }
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }
}
