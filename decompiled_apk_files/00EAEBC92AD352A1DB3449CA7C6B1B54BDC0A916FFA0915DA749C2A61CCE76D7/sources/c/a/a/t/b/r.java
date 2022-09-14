package c.a.a.t.b;

import android.graphics.Path;
import c.a.a.t.c.a;
import c.a.a.v.k.q;
import java.util.List;
/* loaded from: classes.dex */
public class r implements n, a.InterfaceC0064a {

    /* renamed from: b  reason: collision with root package name */
    private final boolean f2378b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.g f2379c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.t.c.a<?, Path> f2380d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2381e;

    /* renamed from: a  reason: collision with root package name */
    private final Path f2377a = new Path();

    /* renamed from: f  reason: collision with root package name */
    private b f2382f = new b();

    public r(c.a.a.g gVar, c.a.a.v.l.a aVar, c.a.a.v.k.o oVar) {
        oVar.a();
        this.f2378b = oVar.c();
        this.f2379c = gVar;
        this.f2380d = oVar.b().mo104a();
        aVar.a(this.f2380d);
        this.f2380d.a(this);
    }

    private void c() {
        this.f2381e = false;
        this.f2379c.invalidateSelf();
    }

    @Override // c.a.a.t.c.a.InterfaceC0064a
    public void a() {
        c();
    }

    @Override // c.a.a.t.b.c
    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof t) {
                t tVar = (t) cVar;
                if (tVar.f() == q.a.SIMULTANEOUSLY) {
                    this.f2382f.a(tVar);
                    tVar.a(this);
                }
            }
        }
    }

    @Override // c.a.a.t.b.n
    public Path b() {
        if (this.f2381e) {
            return this.f2377a;
        }
        this.f2377a.reset();
        if (!this.f2378b) {
            this.f2377a.set(this.f2380d.mo102f());
            this.f2377a.setFillType(Path.FillType.EVEN_ODD);
            this.f2382f.a(this.f2377a);
        }
        this.f2381e = true;
        return this.f2377a;
    }
}
