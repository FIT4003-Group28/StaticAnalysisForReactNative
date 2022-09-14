package c.a.a.t.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import c.a.a.t.c.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class g implements e, a.InterfaceC0064a, k {

    /* renamed from: c  reason: collision with root package name */
    private final c.a.a.v.l.a f2332c;

    /* renamed from: d  reason: collision with root package name */
    private final String f2333d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f2334e;

    /* renamed from: g  reason: collision with root package name */
    private final c.a.a.t.c.a<Integer, Integer> f2336g;

    /* renamed from: h  reason: collision with root package name */
    private final c.a.a.t.c.a<Integer, Integer> f2337h;
    private c.a.a.t.c.a<ColorFilter, ColorFilter> i;
    private final c.a.a.g j;

    /* renamed from: a  reason: collision with root package name */
    private final Path f2330a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Paint f2331b = new c.a.a.t.a(1);

    /* renamed from: f  reason: collision with root package name */
    private final List<n> f2335f = new ArrayList();

    public g(c.a.a.g gVar, c.a.a.v.l.a aVar, c.a.a.v.k.m mVar) {
        this.f2332c = aVar;
        this.f2333d = mVar.c();
        this.f2334e = mVar.e();
        this.j = gVar;
        if (mVar.a() == null || mVar.d() == null) {
            this.f2336g = null;
            this.f2337h = null;
            return;
        }
        this.f2330a.setFillType(mVar.b());
        this.f2336g = mVar.a().mo104a();
        this.f2336g.a(this);
        aVar.a(this.f2336g);
        this.f2337h = mVar.d().mo104a();
        this.f2337h.a(this);
        aVar.a(this.f2337h);
    }

    @Override // c.a.a.t.c.a.InterfaceC0064a
    public void a() {
        this.j.invalidateSelf();
    }

    @Override // c.a.a.t.b.e
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.f2334e) {
            return;
        }
        c.a.a.c.a("FillContent#draw");
        this.f2331b.setColor(((c.a.a.t.c.b) this.f2336g).i());
        this.f2331b.setAlpha(c.a.a.y.g.a((int) ((((i / 255.0f) * this.f2337h.mo102f().intValue()) / 100.0f) * 255.0f), 0, 255));
        c.a.a.t.c.a<ColorFilter, ColorFilter> aVar = this.i;
        if (aVar != null) {
            this.f2331b.setColorFilter(aVar.mo102f());
        }
        this.f2330a.reset();
        for (int i2 = 0; i2 < this.f2335f.size(); i2++) {
            this.f2330a.addPath(this.f2335f.get(i2).b(), matrix);
        }
        canvas.drawPath(this.f2330a, this.f2331b);
        c.a.a.c.b("FillContent#draw");
    }

    @Override // c.a.a.t.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f2330a.reset();
        for (int i = 0; i < this.f2335f.size(); i++) {
            this.f2330a.addPath(this.f2335f.get(i).b(), matrix);
        }
        this.f2330a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // c.a.a.v.f
    public void a(c.a.a.v.e eVar, int i, List<c.a.a.v.e> list, c.a.a.v.e eVar2) {
        c.a.a.y.g.a(eVar, i, list, eVar2, this);
    }

    @Override // c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        c.a.a.t.c.a<Integer, Integer> aVar;
        if (t == c.a.a.l.f2279a) {
            aVar = this.f2336g;
        } else if (t != c.a.a.l.f2282d) {
            if (t != c.a.a.l.B) {
                return;
            }
            if (cVar == null) {
                this.i = null;
                return;
            }
            this.i = new c.a.a.t.c.p(cVar);
            this.i.a(this);
            this.f2332c.a(this.i);
            return;
        } else {
            aVar = this.f2337h;
        }
        aVar.a((c.a.a.z.c<Integer>) cVar);
    }

    @Override // c.a.a.t.b.c
    public void a(List<c> list, List<c> list2) {
        for (int i = 0; i < list2.size(); i++) {
            c cVar = list2.get(i);
            if (cVar instanceof n) {
                this.f2335f.add((n) cVar);
            }
        }
    }

    @Override // c.a.a.t.b.c
    public String getName() {
        return this.f2333d;
    }
}
