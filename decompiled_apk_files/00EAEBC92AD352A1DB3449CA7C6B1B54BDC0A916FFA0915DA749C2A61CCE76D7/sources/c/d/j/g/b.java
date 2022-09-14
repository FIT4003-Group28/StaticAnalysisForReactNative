package c.d.j.g;

import android.graphics.Bitmap;
/* loaded from: classes.dex */
public abstract class b extends c.d.e.b<c.d.d.h.a<c.d.j.k.b>> {
    protected abstract void a(Bitmap bitmap);

    @Override // c.d.e.b
    public void f(c.d.e.c<c.d.d.h.a<c.d.j.k.b>> cVar) {
        if (!cVar.d()) {
            return;
        }
        c.d.d.h.a<c.d.j.k.b> mo140b = cVar.mo140b();
        Bitmap bitmap = null;
        if (mo140b != null && (mo140b.b() instanceof c.d.j.k.a)) {
            bitmap = ((c.d.j.k.a) mo140b.b()).f();
        }
        try {
            a(bitmap);
        } finally {
            c.d.d.h.a.b(mo140b);
        }
    }
}
