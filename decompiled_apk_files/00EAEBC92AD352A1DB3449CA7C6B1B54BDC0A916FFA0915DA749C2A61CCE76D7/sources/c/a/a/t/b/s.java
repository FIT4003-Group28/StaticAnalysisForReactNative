package c.a.a.t.b;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
/* loaded from: classes.dex */
public class s extends a {
    private final c.a.a.v.l.a o;
    private final String p;
    private final boolean q;
    private final c.a.a.t.c.a<Integer, Integer> r;
    private c.a.a.t.c.a<ColorFilter, ColorFilter> s;

    public s(c.a.a.g gVar, c.a.a.v.l.a aVar, c.a.a.v.k.p pVar) {
        super(gVar, aVar, pVar.a().a(), pVar.d().a(), pVar.f(), pVar.h(), pVar.i(), pVar.e(), pVar.c());
        this.o = aVar;
        this.p = pVar.g();
        this.q = pVar.j();
        this.r = pVar.b().mo104a();
        this.r.a(this);
        aVar.a(this.r);
    }

    @Override // c.a.a.t.b.a, c.a.a.t.b.e
    public void a(Canvas canvas, Matrix matrix, int i) {
        if (this.q) {
            return;
        }
        this.i.setColor(((c.a.a.t.c.b) this.r).i());
        c.a.a.t.c.a<ColorFilter, ColorFilter> aVar = this.s;
        if (aVar != null) {
            this.i.setColorFilter(aVar.mo102f());
        }
        super.a(canvas, matrix, i);
    }

    @Override // c.a.a.t.b.a, c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        super.a((s) t, (c.a.a.z.c<s>) cVar);
        if (t == c.a.a.l.f2280b) {
            this.r.a((c.a.a.z.c<Integer>) cVar);
        } else if (t != c.a.a.l.B) {
        } else {
            if (cVar == null) {
                this.s = null;
                return;
            }
            this.s = new c.a.a.t.c.p(cVar);
            this.s.a(this);
            this.o.a(this.r);
        }
    }

    @Override // c.a.a.t.b.c
    public String getName() {
        return this.p;
    }
}
