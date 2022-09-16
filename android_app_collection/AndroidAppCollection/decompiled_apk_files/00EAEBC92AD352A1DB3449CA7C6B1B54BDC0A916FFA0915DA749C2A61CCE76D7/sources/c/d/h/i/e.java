package c.d.h.i;

import android.net.Uri;
import c.d.d.d.l;
import c.d.d.k.f;
/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: h  reason: collision with root package name */
    private c.d.h.c.b f3135h;

    public static void a(l<? extends c.d.h.c.b> lVar) {
    }

    public void a(int i, Object obj) {
        a(f.a(i), obj);
    }

    public void a(Uri uri, Object obj) {
        c.d.h.c.b bVar = this.f3135h;
        bVar.a(obj);
        c.d.h.h.d mo129a = bVar.mo129a(uri);
        mo129a.mo133a(getController());
        setController(mo129a.mo132a());
    }

    public void a(String str, Object obj) {
        a(str != null ? Uri.parse(str) : null, obj);
    }

    protected c.d.h.c.b getControllerBuilder() {
        return this.f3135h;
    }

    public void setActualImageResource(int i) {
        a(i, (Object) null);
    }

    public void setImageRequest(c.d.j.o.c cVar) {
        c.d.h.c.b bVar = this.f3135h;
        bVar.b((c.d.h.c.b) cVar);
        bVar.mo133a(getController());
        setController(bVar.mo132a());
    }

    @Override // c.d.h.i.c, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // c.d.h.i.c, android.widget.ImageView
    public void setImageURI(Uri uri) {
        a(uri, (Object) null);
    }

    public void setImageURI(String str) {
        a(str, (Object) null);
    }
}
