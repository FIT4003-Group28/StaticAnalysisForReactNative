package com.facebook.f.a.a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.d.h;
import com.facebook.common.d.k;
import com.facebook.f.e.i;
import com.facebook.f.e.n;
import com.facebook.f.e.o;
import com.facebook.imagepipeline.d.t;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* compiled from: PipelineDraweeController.java */
/* loaded from: classes.dex */
public class d extends com.facebook.f.c.a<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>, com.facebook.imagepipeline.i.e> {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f2350a = d.class;

    /* renamed from: b  reason: collision with root package name */
    private final Resources f2351b;

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.imagepipeline.a.a.a f2352c;

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.common.d.e<a> f2353d;
    private t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> e;
    private com.facebook.b.a.d f;
    private k<com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>> g;
    private boolean h;
    private final a i;

    public d(Resources resources, com.facebook.f.b.a aVar, com.facebook.imagepipeline.a.a.a aVar2, Executor executor, t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b> tVar, k<com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>> kVar, String str, com.facebook.b.a.d dVar, Object obj, com.facebook.common.d.e<a> eVar) {
        super(aVar, executor, str, obj);
        this.i = new a() { // from class: com.facebook.f.a.a.d.1
            @Override // com.facebook.f.a.a.a
            public boolean a(com.facebook.imagepipeline.i.b bVar) {
                return true;
            }

            @Override // com.facebook.f.a.a.a
            public Drawable b(com.facebook.imagepipeline.i.b bVar) {
                if (!(bVar instanceof com.facebook.imagepipeline.i.c)) {
                    if (d.this.f2352c == null) {
                        return null;
                    }
                    return d.this.f2352c.a(bVar);
                }
                com.facebook.imagepipeline.i.c cVar = (com.facebook.imagepipeline.i.c) bVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(d.this.f2351b, cVar.a());
                return (cVar.h() == 0 || cVar.h() == -1) ? bitmapDrawable : new i(bitmapDrawable, cVar.h());
            }
        };
        this.f2351b = resources;
        this.f2352c = aVar2;
        this.e = tVar;
        this.f = dVar;
        this.f2353d = eVar;
        a(kVar);
    }

    public void a(k<com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>> kVar, String str, com.facebook.b.a.d dVar, Object obj) {
        super.a(str, obj);
        a(kVar);
        this.f = dVar;
    }

    public void a(boolean z) {
        this.h = z;
    }

    private void a(k<com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>>> kVar) {
        this.g = kVar;
        a((com.facebook.imagepipeline.i.b) null);
    }

    @Override // com.facebook.f.c.a
    protected com.facebook.c.c<com.facebook.common.h.a<com.facebook.imagepipeline.i.b>> a() {
        if (com.facebook.common.e.a.a(2)) {
            com.facebook.common.e.a.a(f2350a, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        return this.g.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.f.c.a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public Drawable d(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar) {
        Drawable b2;
        com.facebook.common.d.i.b(com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar));
        com.facebook.imagepipeline.i.b a2 = aVar.a();
        a(a2);
        if (this.f2353d != null) {
            Iterator<a> it = this.f2353d.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.a(a2) && (b2 = next.b(a2)) != null) {
                    return b2;
                }
            }
        }
        Drawable b3 = this.i.b(a2);
        if (b3 != null) {
            return b3;
        }
        throw new UnsupportedOperationException("Unrecognized image class: " + a2);
    }

    @Override // com.facebook.f.c.a, com.facebook.f.h.a
    public void a(com.facebook.f.h.b bVar) {
        super.a(bVar);
        a((com.facebook.imagepipeline.i.b) null);
    }

    private void a(com.facebook.imagepipeline.i.b bVar) {
        n a2;
        if (!this.h) {
            return;
        }
        Drawable j = j();
        if (j == null) {
            j = new com.facebook.f.d.a();
            b(j);
        }
        if (!(j instanceof com.facebook.f.d.a)) {
            return;
        }
        com.facebook.f.d.a aVar = (com.facebook.f.d.a) j;
        aVar.a(e());
        com.facebook.f.h.b i = i();
        o.b bVar2 = null;
        if (i != null && (a2 = o.a(i.a())) != null) {
            bVar2 = a2.b();
        }
        aVar.a(bVar2);
        if (bVar != null) {
            aVar.a(bVar.f(), bVar.g());
            aVar.a(bVar.b());
            return;
        }
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.f.c.a
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public com.facebook.imagepipeline.i.e c(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar) {
        com.facebook.common.d.i.b(com.facebook.common.h.a.a((com.facebook.common.h.a<?>) aVar));
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.f.c.a
    /* renamed from: c  reason: avoid collision after fix types in other method */
    public int b(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar) {
        if (aVar != null) {
            return aVar.e();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.f.c.a
    /* renamed from: d  reason: avoid collision after fix types in other method */
    public void a(com.facebook.common.h.a<com.facebook.imagepipeline.i.b> aVar) {
        com.facebook.common.h.a.c(aVar);
    }

    @Override // com.facebook.f.c.a
    protected void a(Drawable drawable) {
        if (drawable instanceof com.facebook.e.a.a) {
            ((com.facebook.e.a.a) drawable).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.f.c.a
    /* renamed from: b */
    public com.facebook.common.h.a<com.facebook.imagepipeline.i.b> c() {
        if (this.e == null || this.f == null) {
            return null;
        }
        com.facebook.common.h.a<com.facebook.imagepipeline.i.b> a2 = this.e.a((t<com.facebook.b.a.d, com.facebook.imagepipeline.i.b>) this.f);
        if (a2 == null || a2.a().d().c()) {
            return a2;
        }
        a2.close();
        return null;
    }

    @Override // com.facebook.f.c.a
    public String toString() {
        return h.a(this).a("super", super.toString()).a("dataSourceSupplier", this.g).toString();
    }
}
