package c.d.h.a.a.i;

import android.graphics.Rect;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final c.d.h.a.a.d f2934a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.common.time.b f2935b;

    /* renamed from: c  reason: collision with root package name */
    private final h f2936c = new h();

    /* renamed from: d  reason: collision with root package name */
    private c f2937d;

    /* renamed from: e  reason: collision with root package name */
    private b f2938e;

    /* renamed from: f  reason: collision with root package name */
    private c.d.h.a.a.i.i.c f2939f;

    /* renamed from: g  reason: collision with root package name */
    private c.d.h.a.a.i.i.a f2940g;

    /* renamed from: h  reason: collision with root package name */
    private c.d.j.l.b f2941h;
    private List<f> i;
    private boolean j;

    public g(com.facebook.common.time.b bVar, c.d.h.a.a.d dVar) {
        this.f2935b = bVar;
        this.f2934a = dVar;
    }

    private void d() {
        if (this.f2940g == null) {
            this.f2940g = new c.d.h.a.a.i.i.a(this.f2935b, this.f2936c, this);
        }
        if (this.f2939f == null) {
            this.f2939f = new c.d.h.a.a.i.i.c(this.f2935b, this.f2936c);
        }
        if (this.f2938e == null) {
            this.f2938e = new c.d.h.a.a.i.i.b(this.f2936c, this);
        }
        c cVar = this.f2937d;
        if (cVar == null) {
            this.f2937d = new c(this.f2934a.k(), this.f2938e);
        } else {
            cVar.c(this.f2934a.k());
        }
        if (this.f2941h == null) {
            this.f2941h = new c.d.j.l.b(this.f2939f, this.f2937d);
        }
    }

    public void a() {
        c.d.h.h.b b2 = this.f2934a.b();
        if (b2 == null || b2.a() == null) {
            return;
        }
        Rect bounds = b2.a().getBounds();
        this.f2936c.d(bounds.width());
        this.f2936c.c(bounds.height());
    }

    public void a(f fVar) {
        if (fVar == null) {
            return;
        }
        if (this.i == null) {
            this.i = new LinkedList();
        }
        this.i.add(fVar);
    }

    public void a(h hVar, int i) {
        List<f> list;
        if (!this.j || (list = this.i) == null || list.isEmpty()) {
            return;
        }
        e c2 = hVar.c();
        for (f fVar : this.i) {
            fVar.b(c2, i);
        }
    }

    public void a(boolean z) {
        this.j = z;
        if (!z) {
            b bVar = this.f2938e;
            if (bVar != null) {
                this.f2934a.b(bVar);
            }
            c.d.h.a.a.i.i.a aVar = this.f2940g;
            if (aVar != null) {
                this.f2934a.b((c.d.h.c.d) aVar);
            }
            c.d.j.l.b bVar2 = this.f2941h;
            if (bVar2 == null) {
                return;
            }
            this.f2934a.b((c.d.j.l.c) bVar2);
            return;
        }
        d();
        b bVar3 = this.f2938e;
        if (bVar3 != null) {
            this.f2934a.a(bVar3);
        }
        c.d.h.a.a.i.i.a aVar2 = this.f2940g;
        if (aVar2 != null) {
            this.f2934a.a((c.d.h.c.d) aVar2);
        }
        c.d.j.l.b bVar4 = this.f2941h;
        if (bVar4 == null) {
            return;
        }
        this.f2934a.a((c.d.j.l.c) bVar4);
    }

    public void b() {
        List<f> list = this.i;
        if (list != null) {
            list.clear();
        }
    }

    public void b(h hVar, int i) {
        List<f> list;
        hVar.a(i);
        if (!this.j || (list = this.i) == null || list.isEmpty()) {
            return;
        }
        if (i == 3) {
            a();
        }
        e c2 = hVar.c();
        for (f fVar : this.i) {
            fVar.a(c2, i);
        }
    }

    public void c() {
        b();
        a(false);
        this.f2936c.b();
    }
}
