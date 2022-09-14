package c.d.h.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import c.d.d.d.h;
import c.d.d.d.i;
import c.d.d.d.l;
import c.d.h.e.q;
import c.d.h.e.r;
import c.d.j.d.p;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class d extends c.d.h.c.a<c.d.d.h.a<c.d.j.k.b>, c.d.j.k.e> {
    private static final Class<?> F = d.class;
    private c.d.d.d.e<c.d.j.j.a> A;
    private c.d.h.a.a.i.g B;
    private Set<c.d.j.l.c> C;
    private c.d.h.a.a.i.b D;
    private c.d.h.a.a.h.a E;
    private final c.d.j.j.a u;
    private final c.d.d.d.e<c.d.j.j.a> v;
    private final p<c.d.b.a.d, c.d.j.k.b> w;
    private c.d.b.a.d x;
    private l<c.d.e.c<c.d.d.h.a<c.d.j.k.b>>> y;
    private boolean z;

    public d(Resources resources, c.d.h.b.a aVar, c.d.j.j.a aVar2, Executor executor, p<c.d.b.a.d, c.d.j.k.b> pVar, c.d.d.d.e<c.d.j.j.a> eVar) {
        super(aVar, executor, null, null);
        this.u = new a(resources, aVar2);
        this.v = eVar;
        this.w = pVar;
    }

    private Drawable a(c.d.d.d.e<c.d.j.j.a> eVar, c.d.j.k.b bVar) {
        Drawable b2;
        if (eVar == null) {
            return null;
        }
        Iterator<c.d.j.j.a> it = eVar.iterator();
        while (it.hasNext()) {
            c.d.j.j.a next = it.next();
            if (next.a(bVar) && (b2 = next.b(bVar)) != null) {
                return b2;
            }
        }
        return null;
    }

    private void a(l<c.d.e.c<c.d.d.h.a<c.d.j.k.b>>> lVar) {
        this.y = lVar;
        a((c.d.j.k.b) null);
    }

    private void a(c.d.j.k.b bVar) {
        if (!this.z) {
            return;
        }
        if (h() == null) {
            c.d.h.d.a aVar = new c.d.h.d.a();
            c.d.h.d.b.a aVar2 = new c.d.h.d.b.a(aVar);
            this.E = new c.d.h.a.a.h.a();
            a((c.d.h.c.d) aVar2);
            b((Drawable) aVar);
        }
        if (this.D == null) {
            a(this.E);
        }
        if (!(h() instanceof c.d.h.d.a)) {
            return;
        }
        a(bVar, (c.d.h.d.a) h());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.h.c.a
    public Drawable a(c.d.d.h.a<c.d.j.k.b> aVar) {
        try {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a("PipelineDraweeController#createDrawable");
            }
            i.b(c.d.d.h.a.c(aVar));
            c.d.j.k.b b2 = aVar.b();
            a(b2);
            Drawable a2 = a(this.A, b2);
            if (a2 != null) {
                return a2;
            }
            Drawable a3 = a(this.v, b2);
            if (a3 != null) {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
                return a3;
            }
            Drawable b3 = this.u.b(b2);
            if (b3 != null) {
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
                return b3;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + b2);
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }

    @Override // c.d.h.c.a
    protected void a(Drawable drawable) {
        if (drawable instanceof c.d.g.a.a) {
            ((c.d.g.a.a) drawable).a();
        }
    }

    public void a(c.d.d.d.e<c.d.j.j.a> eVar) {
        this.A = eVar;
    }

    public void a(l<c.d.e.c<c.d.d.h.a<c.d.j.k.b>>> lVar, String str, c.d.b.a.d dVar, Object obj, c.d.d.d.e<c.d.j.j.a> eVar, c.d.h.a.a.i.b bVar) {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("PipelineDraweeController#initialize");
        }
        super.a(str, obj);
        a(lVar);
        this.x = dVar;
        a(eVar);
        o();
        a((c.d.j.k.b) null);
        a(bVar);
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
    }

    public synchronized void a(c.d.h.a.a.i.b bVar) {
        if (this.D instanceof c.d.h.a.a.i.a) {
            ((c.d.h.a.a.i.a) this.D).a(bVar);
        } else if (this.D != null) {
            this.D = new c.d.h.a.a.i.a(this.D, bVar);
        } else {
            this.D = bVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void a(c.d.h.a.a.i.f fVar) {
        if (this.B != null) {
            this.B.c();
        }
        if (fVar != null) {
            if (this.B == null) {
                this.B = new c.d.h.a.a.i.g(AwakeTimeSinceBootClock.get(), this);
            }
            this.B.a(fVar);
            this.B.a(true);
        }
    }

    @Override // c.d.h.c.a, c.d.h.h.a
    public void a(c.d.h.h.b bVar) {
        super.a(bVar);
        a((c.d.j.k.b) null);
    }

    protected void a(c.d.j.k.b bVar, c.d.h.d.a aVar) {
        q a2;
        aVar.a(k());
        c.d.h.h.b b2 = b();
        r.b bVar2 = null;
        if (b2 != null && (a2 = r.a(b2.a())) != null) {
            bVar2 = a2.c();
        }
        aVar.a(bVar2);
        aVar.b(this.E.a());
        if (bVar == null) {
            aVar.a();
            return;
        }
        aVar.a(bVar.b(), bVar.a());
        aVar.a(bVar.d());
    }

    public synchronized void a(c.d.j.l.c cVar) {
        if (this.C == null) {
            this.C = new HashSet();
        }
        this.C.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.h.c.a
    /* renamed from: a */
    public void b(String str, c.d.d.h.a<c.d.j.k.b> aVar) {
        super.b(str, aVar);
        synchronized (this) {
            if (this.D != null) {
                this.D.a(str, 5, true, "PipelineDraweeController");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.h.c.a
    /* renamed from: b */
    public int c(c.d.d.h.a<c.d.j.k.b> aVar) {
        if (aVar != null) {
            return aVar.c();
        }
        return 0;
    }

    public synchronized void b(c.d.h.a.a.i.b bVar) {
        if (this.D instanceof c.d.h.a.a.i.a) {
            ((c.d.h.a.a.i.a) this.D).b(bVar);
        } else if (this.D != null) {
            this.D = new c.d.h.a.a.i.a(this.D, bVar);
        } else {
            this.D = bVar;
        }
    }

    public synchronized void b(c.d.j.l.c cVar) {
        if (this.C == null) {
            return;
        }
        this.C.remove(cVar);
    }

    public void b(boolean z) {
        this.z = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.h.c.a
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public c.d.j.k.e d(c.d.d.h.a<c.d.j.k.b> aVar) {
        i.b(c.d.d.h.a.c(aVar));
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // c.d.h.c.a
    /* renamed from: d  reason: avoid collision after fix types in other method */
    public void e(c.d.d.h.a<c.d.j.k.b> aVar) {
        c.d.d.h.a.b(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.d.h.c.a
    /* renamed from: f */
    public c.d.d.h.a<c.d.j.k.b> mo128f() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("PipelineDraweeController#getCachedImage");
        }
        try {
            if (this.w != null && this.x != null) {
                c.d.d.h.a<c.d.j.k.b> aVar = this.w.get(this.x);
                if (aVar != null && !aVar.b().c().a()) {
                    aVar.close();
                    return null;
                }
                if (c.d.j.p.b.c()) {
                    c.d.j.p.b.a();
                }
                return aVar;
            }
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
            return null;
        } finally {
            if (c.d.j.p.b.c()) {
                c.d.j.p.b.a();
            }
        }
    }

    @Override // c.d.h.c.a
    protected c.d.e.c<c.d.d.h.a<c.d.j.k.b>> i() {
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a("PipelineDraweeController#getDataSource");
        }
        if (c.d.d.e.a.a(2)) {
            c.d.d.e.a.b(F, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        c.d.e.c<c.d.d.h.a<c.d.j.k.b>> mo139get = this.y.mo139get();
        if (c.d.j.p.b.c()) {
            c.d.j.p.b.a();
        }
        return mo139get;
    }

    protected void o() {
        synchronized (this) {
            this.D = null;
        }
    }

    public synchronized c.d.j.l.c p() {
        c.d.h.a.a.i.c cVar = null;
        if (this.D != null) {
            cVar = new c.d.h.a.a.i.c(k(), this.D);
        }
        if (this.C != null) {
            c.d.j.l.b bVar = new c.d.j.l.b(this.C);
            if (cVar != null) {
                bVar.a(cVar);
            }
            return bVar;
        }
        return cVar;
    }

    @Override // c.d.h.c.a
    public String toString() {
        h.b a2 = h.a(this);
        a2.a("super", super.toString());
        a2.a("dataSourceSupplier", this.y);
        return a2.toString();
    }
}
