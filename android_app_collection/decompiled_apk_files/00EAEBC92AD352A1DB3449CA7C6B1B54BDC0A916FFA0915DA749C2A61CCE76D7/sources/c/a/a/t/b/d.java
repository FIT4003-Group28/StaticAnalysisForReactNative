package c.a.a.t.b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import c.a.a.t.c.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class d implements e, n, a.InterfaceC0064a, c.a.a.v.f {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f2314a;

    /* renamed from: b  reason: collision with root package name */
    private final Path f2315b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f2316c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2317d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2318e;

    /* renamed from: f  reason: collision with root package name */
    private final List<c> f2319f;

    /* renamed from: g  reason: collision with root package name */
    private final c.a.a.g f2320g;

    /* renamed from: h  reason: collision with root package name */
    private List<n> f2321h;
    private c.a.a.t.c.o i;

    public d(c.a.a.g gVar, c.a.a.v.l.a aVar, c.a.a.v.k.n nVar) {
        this(gVar, aVar, nVar.b(), nVar.c(), a(gVar, aVar, nVar.a()), a(nVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(c.a.a.g gVar, c.a.a.v.l.a aVar, String str, boolean z, List<c> list, c.a.a.v.j.l lVar) {
        this.f2314a = new Matrix();
        this.f2315b = new Path();
        this.f2316c = new RectF();
        this.f2317d = str;
        this.f2320g = gVar;
        this.f2318e = z;
        this.f2319f = list;
        if (lVar != null) {
            this.i = lVar.a();
            this.i.a(aVar);
            this.i.a(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }

    static c.a.a.v.j.l a(List<c.a.a.v.k.b> list) {
        for (int i = 0; i < list.size(); i++) {
            c.a.a.v.k.b bVar = list.get(i);
            if (bVar instanceof c.a.a.v.j.l) {
                return (c.a.a.v.j.l) bVar;
            }
        }
        return null;
    }

    private static List<c> a(c.a.a.g gVar, c.a.a.v.l.a aVar, List<c.a.a.v.k.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            c a2 = list.get(i).a(gVar, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    @Override // c.a.a.t.c.a.InterfaceC0064a
    public void a() {
        this.f2320g.invalidateSelf();
    }

    @Override // c.a.a.t.b.e
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.f2318e) {
            return;
        }
        this.f2314a.set(matrix);
        c.a.a.t.c.o oVar = this.i;
        if (oVar != null) {
            this.f2314a.preConcat(oVar.b());
            i = (int) (((((this.i.c() == null ? 100 : this.i.c().mo102f().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        for (int size = this.f2319f.size() - 1; size >= 0; size--) {
            c cVar = this.f2319f.get(size);
            if (cVar instanceof e) {
                ((e) cVar).a(canvas, this.f2314a, i);
            }
        }
    }

    @Override // c.a.a.t.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f2314a.set(matrix);
        c.a.a.t.c.o oVar = this.i;
        if (oVar != null) {
            this.f2314a.preConcat(oVar.b());
        }
        this.f2316c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f2319f.size() - 1; size >= 0; size--) {
            c cVar = this.f2319f.get(size);
            if (cVar instanceof e) {
                ((e) cVar).a(this.f2316c, this.f2314a, z);
                rectF.union(this.f2316c);
            }
        }
    }

    @Override // c.a.a.v.f
    public void a(c.a.a.v.e eVar, int i, List<c.a.a.v.e> list, c.a.a.v.e eVar2) {
        if (!eVar.c(getName(), i)) {
            return;
        }
        if (!"__container".equals(getName())) {
            eVar2 = eVar2.a(getName());
            if (eVar.a(getName(), i)) {
                list.add(eVar2.a(this));
            }
        }
        if (!eVar.d(getName(), i)) {
            return;
        }
        int b2 = i + eVar.b(getName(), i);
        for (int i2 = 0; i2 < this.f2319f.size(); i2++) {
            c cVar = this.f2319f.get(i2);
            if (cVar instanceof c.a.a.v.f) {
                ((c.a.a.v.f) cVar).a(eVar, b2, list, eVar2);
            }
        }
    }

    @Override // c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        c.a.a.t.c.o oVar = this.i;
        if (oVar != null) {
            oVar.a(t, cVar);
        }
    }

    @Override // c.a.a.t.b.c
    public void a(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f2319f.size());
        arrayList.addAll(list);
        for (int size = this.f2319f.size() - 1; size >= 0; size--) {
            c cVar = this.f2319f.get(size);
            cVar.a(arrayList, this.f2319f.subList(0, size));
            arrayList.add(cVar);
        }
    }

    @Override // c.a.a.t.b.n
    public Path b() {
        this.f2314a.reset();
        c.a.a.t.c.o oVar = this.i;
        if (oVar != null) {
            this.f2314a.set(oVar.b());
        }
        this.f2315b.reset();
        if (this.f2318e) {
            return this.f2315b;
        }
        for (int size = this.f2319f.size() - 1; size >= 0; size--) {
            c cVar = this.f2319f.get(size);
            if (cVar instanceof n) {
                this.f2315b.addPath(((n) cVar).b(), this.f2314a);
            }
        }
        return this.f2315b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<n> c() {
        if (this.f2321h == null) {
            this.f2321h = new ArrayList();
            for (int i = 0; i < this.f2319f.size(); i++) {
                c cVar = this.f2319f.get(i);
                if (cVar instanceof n) {
                    this.f2321h.add((n) cVar);
                }
            }
        }
        return this.f2321h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix d() {
        c.a.a.t.c.o oVar = this.i;
        if (oVar != null) {
            return oVar.b();
        }
        this.f2314a.reset();
        return this.f2314a;
    }

    @Override // c.a.a.t.b.c
    public String getName() {
        return this.f2317d;
    }
}
