package c.a.a.v.l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import c.a.a.l;
import c.a.a.t.c.p;
import c.a.a.v.l.d;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b extends c.a.a.v.l.a {
    private c.a.a.t.c.a<Float, Float> w;
    private final List<c.a.a.v.l.a> x;
    private final RectF y;
    private final RectF z;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2588a = new int[d.b.values().length];

        static {
            try {
                f2588a[d.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2588a[d.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(c.a.a.g gVar, d dVar, List<d> list, c.a.a.e eVar) {
        super(gVar, dVar);
        int i;
        c.a.a.v.l.a aVar;
        this.x = new ArrayList();
        this.y = new RectF();
        this.z = new RectF();
        c.a.a.v.j.b s = dVar.s();
        if (s != null) {
            this.w = s.mo104a();
            a(this.w);
            this.w.a(this);
        } else {
            this.w = null;
        }
        a.e.d dVar2 = new a.e.d(eVar.i().size());
        int size = list.size() - 1;
        c.a.a.v.l.a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            d dVar3 = list.get(size);
            c.a.a.v.l.a a2 = c.a.a.v.l.a.a(dVar3, gVar, eVar);
            if (a2 != null) {
                dVar2.c(a2.b().b(), a2);
                if (aVar2 != null) {
                    aVar2.a(a2);
                    aVar2 = null;
                } else {
                    this.x.add(0, a2);
                    int i2 = a.f2588a[dVar3.f().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        aVar2 = a2;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < dVar2.b(); i++) {
            c.a.a.v.l.a aVar3 = (c.a.a.v.l.a) dVar2.c(dVar2.a(i));
            if (aVar3 != null && (aVar = (c.a.a.v.l.a) dVar2.c(aVar3.b().h())) != null) {
                aVar3.b(aVar);
            }
        }
    }

    @Override // c.a.a.v.l.a
    public void a(float f2) {
        super.a(f2);
        if (this.w != null) {
            f2 = (this.w.mo102f().floatValue() * 1000.0f) / this.n.e().c();
        }
        if (this.o.t() != 0.0f) {
            f2 /= this.o.t();
        }
        float p = f2 - this.o.p();
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.x.get(size).a(p);
        }
    }

    @Override // c.a.a.v.l.a, c.a.a.t.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        super.a(rectF, matrix, z);
        for (int size = this.x.size() - 1; size >= 0; size--) {
            this.y.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.x.get(size).a(this.y, this.m, true);
            rectF.union(this.y);
        }
    }

    @Override // c.a.a.v.l.a, c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        super.a((b) t, (c.a.a.z.c<b>) cVar);
        if (t == l.A) {
            if (cVar == null) {
                this.w = null;
                return;
            }
            this.w = new p(cVar);
            a(this.w);
        }
    }

    @Override // c.a.a.v.l.a
    void b(Canvas canvas, Matrix matrix, int i) {
        c.a.a.c.a("CompositionLayer#draw");
        canvas.save();
        this.z.set(0.0f, 0.0f, this.o.j(), this.o.i());
        matrix.mapRect(this.z);
        for (int size = this.x.size() - 1; size >= 0; size--) {
            if (!this.z.isEmpty() ? canvas.clipRect(this.z) : true) {
                this.x.get(size).a(canvas, matrix, i);
            }
        }
        canvas.restore();
        c.a.a.c.b("CompositionLayer#draw");
    }

    @Override // c.a.a.v.l.a
    protected void b(c.a.a.v.e eVar, int i, List<c.a.a.v.e> list, c.a.a.v.e eVar2) {
        for (int i2 = 0; i2 < this.x.size(); i2++) {
            this.x.get(i2).a(eVar, i, list, eVar2);
        }
    }
}
