package c.d.j.d;

import android.net.Uri;
/* loaded from: classes.dex */
public class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private static j f3229a;

    protected j() {
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f3229a == null) {
                f3229a = new j();
            }
            jVar = f3229a;
        }
        return jVar;
    }

    protected Uri a(Uri uri) {
        return uri;
    }

    @Override // c.d.j.d.f
    public c.d.b.a.d a(c.d.j.o.c cVar, Uri uri, Object obj) {
        a(uri);
        return new c.d.b.a.i(uri.toString());
    }

    @Override // c.d.j.d.f
    public c.d.b.a.d a(c.d.j.o.c cVar, Object obj) {
        Uri p = cVar.p();
        a(p);
        return new c(p.toString(), cVar.l(), cVar.n(), cVar.c(), null, null, obj);
    }

    @Override // c.d.j.d.f
    public c.d.b.a.d b(c.d.j.o.c cVar, Object obj) {
        c.d.b.a.d dVar;
        String str;
        c.d.j.o.e f2 = cVar.f();
        if (f2 != null) {
            c.d.b.a.d a2 = f2.a();
            str = f2.getClass().getName();
            dVar = a2;
        } else {
            dVar = null;
            str = null;
        }
        Uri p = cVar.p();
        a(p);
        return new c(p.toString(), cVar.l(), cVar.n(), cVar.c(), dVar, str, obj);
    }

    @Override // c.d.j.d.f
    public c.d.b.a.d c(c.d.j.o.c cVar, Object obj) {
        return a(cVar, cVar.p(), obj);
    }
}
