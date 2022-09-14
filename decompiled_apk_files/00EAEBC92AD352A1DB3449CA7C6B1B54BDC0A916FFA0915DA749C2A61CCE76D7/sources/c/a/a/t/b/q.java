package c.a.a.t.b;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import c.a.a.t.c.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public class q implements e, n, j, a.InterfaceC0064a, k {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f2369a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Path f2370b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.g f2371c;

    /* renamed from: d  reason: collision with root package name */
    private final c.a.a.v.l.a f2372d;

    /* renamed from: e  reason: collision with root package name */
    private final String f2373e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2374f;

    /* renamed from: g  reason: collision with root package name */
    private final c.a.a.t.c.a<Float, Float> f2375g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a.a.t.c.a<Float, Float> f2376h;
    private final c.a.a.t.c.o i;
    private d j;

    public q(c.a.a.g gVar, c.a.a.v.l.a aVar, c.a.a.v.k.k kVar) {
        this.f2371c = gVar;
        this.f2372d = aVar;
        this.f2373e = kVar.b();
        this.f2374f = kVar.e();
        this.f2375g = kVar.a().mo104a();
        aVar.a(this.f2375g);
        this.f2375g.a(this);
        this.f2376h = kVar.c().mo104a();
        aVar.a(this.f2376h);
        this.f2376h.a(this);
        this.i = kVar.d().a();
        this.i.a(aVar);
        this.i.a(this);
    }

    @Override // c.a.a.t.c.a.InterfaceC0064a
    public void a() {
        this.f2371c.invalidateSelf();
    }

    @Override // c.a.a.t.b.e
    public void a(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.f2375g.mo102f().floatValue();
        float floatValue2 = this.f2376h.mo102f().floatValue();
        float floatValue3 = this.i.d().mo102f().floatValue() / 100.0f;
        float floatValue4 = this.i.a().mo102f().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f2369a.set(matrix);
            float f2 = i2;
            this.f2369a.preConcat(this.i.a(f2 + floatValue2));
            this.j.a(canvas, this.f2369a, (int) (i * c.a.a.y.g.c(floatValue3, floatValue4, f2 / floatValue)));
        }
    }

    @Override // c.a.a.t.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.j.a(rectF, matrix, z);
    }

    @Override // c.a.a.v.f
    public void a(c.a.a.v.e eVar, int i, List<c.a.a.v.e> list, c.a.a.v.e eVar2) {
        c.a.a.y.g.a(eVar, i, list, eVar2, this);
    }

    @Override // c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        c.a.a.t.c.a<Float, Float> aVar;
        if (this.i.a(t, cVar)) {
            return;
        }
        if (t == c.a.a.l.q) {
            aVar = this.f2375g;
        } else if (t != c.a.a.l.r) {
            return;
        } else {
            aVar = this.f2376h;
        }
        aVar.a((c.a.a.z.c<Float>) cVar);
    }

    @Override // c.a.a.t.b.c
    public void a(List<c> list, List<c> list2) {
        this.j.a(list, list2);
    }

    @Override // c.a.a.t.b.j
    public void a(ListIterator<c> listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new d(this.f2371c, this.f2372d, "Repeater", this.f2374f, arrayList, null);
    }

    @Override // c.a.a.t.b.n
    public Path b() {
        Path b2 = this.j.b();
        this.f2370b.reset();
        float floatValue = this.f2375g.mo102f().floatValue();
        float floatValue2 = this.f2376h.mo102f().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f2369a.set(this.i.a(i + floatValue2));
            this.f2370b.addPath(b2, this.f2369a);
        }
        return this.f2370b;
    }

    @Override // c.a.a.t.b.c
    public String getName() {
        return this.f2373e;
    }
}
