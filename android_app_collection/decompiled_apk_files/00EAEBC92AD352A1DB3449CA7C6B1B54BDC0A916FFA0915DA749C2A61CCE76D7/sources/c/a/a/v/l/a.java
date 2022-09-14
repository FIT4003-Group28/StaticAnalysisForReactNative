package c.a.a.v.l;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import c.a.a.t.c.a;
import c.a.a.t.c.o;
import c.a.a.v.k.g;
import c.a.a.v.k.l;
import c.a.a.v.l.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class a implements c.a.a.t.b.e, a.InterfaceC0064a, c.a.a.v.f {
    private final String l;
    final c.a.a.g n;
    final d o;
    private c.a.a.t.c.g p;
    private a q;
    private a r;
    private List<a> s;
    final o u;

    /* renamed from: a  reason: collision with root package name */
    private final Path f2576a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f2577b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    private final Paint f2578c = new c.a.a.t.a(1);

    /* renamed from: d  reason: collision with root package name */
    private final Paint f2579d = new c.a.a.t.a(1, PorterDuff.Mode.DST_IN);

    /* renamed from: e  reason: collision with root package name */
    private final Paint f2580e = new c.a.a.t.a(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: f  reason: collision with root package name */
    private final Paint f2581f = new c.a.a.t.a(1);

    /* renamed from: g  reason: collision with root package name */
    private final Paint f2582g = new c.a.a.t.a(PorterDuff.Mode.CLEAR);

    /* renamed from: h  reason: collision with root package name */
    private final RectF f2583h = new RectF();
    private final RectF i = new RectF();
    private final RectF j = new RectF();
    private final RectF k = new RectF();
    final Matrix m = new Matrix();
    private final List<c.a.a.t.c.a<?, ?>> t = new ArrayList();
    private boolean v = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.a.a.v.l.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0065a implements a.InterfaceC0064a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a.a.t.c.c f2584a;

        C0065a(c.a.a.t.c.c cVar) {
            this.f2584a = cVar;
        }

        @Override // c.a.a.t.c.a.InterfaceC0064a
        public void a() {
            a.this.a(this.f2584a.i() == 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2586a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f2587b = new int[g.a.values().length];

        static {
            try {
                f2587b[g.a.MASK_MODE_SUBTRACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2587b[g.a.MASK_MODE_INTERSECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2587b[g.a.MASK_MODE_ADD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2586a = new int[d.a.values().length];
            try {
                f2586a[d.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2586a[d.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2586a[d.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2586a[d.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2586a[d.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2586a[d.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2586a[d.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(c.a.a.g gVar, d dVar) {
        Paint paint;
        PorterDuffXfermode porterDuffXfermode;
        this.n = gVar;
        this.o = dVar;
        this.l = dVar.g() + "#draw";
        if (dVar.f() == d.b.INVERT) {
            paint = this.f2581f;
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        } else {
            paint = this.f2581f;
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        }
        paint.setXfermode(porterDuffXfermode);
        this.u = dVar.u().a();
        this.u.a((a.InterfaceC0064a) this);
        if (dVar.e() != null && !dVar.e().isEmpty()) {
            this.p = new c.a.a.t.c.g(dVar.e());
            for (c.a.a.t.c.a<l, Path> aVar : this.p.a()) {
                aVar.a(this);
            }
            for (c.a.a.t.c.a<Integer, Integer> aVar2 : this.p.c()) {
                a(aVar2);
                aVar2.a(this);
            }
        }
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(d dVar, c.a.a.g gVar, c.a.a.e eVar) {
        switch (b.f2586a[dVar.d().ordinal()]) {
            case 1:
                return new f(gVar, dVar);
            case 2:
                return new c.a.a.v.l.b(gVar, dVar, eVar.c(dVar.k()), eVar);
            case 3:
                return new g(gVar, dVar);
            case 4:
                return new c(gVar, dVar);
            case 5:
                return new e(gVar, dVar);
            case 6:
                return new h(gVar, dVar);
            default:
                c.a.a.y.d.b("Unknown layer type " + dVar.d());
                return null;
        }
    }

    private void a(Canvas canvas) {
        c.a.a.c.a("Layer#clearLayer");
        RectF rectF = this.f2583h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f2582g);
        c.a.a.c.b("Layer#clearLayer");
    }

    private void a(Canvas canvas, Matrix matrix) {
        c.a.a.c.a("Layer#saveLayer");
        a(canvas, this.f2583h, this.f2579d, false);
        c.a.a.c.b("Layer#saveLayer");
        for (int i = 0; i < this.p.b().size(); i++) {
            c.a.a.v.k.g gVar = this.p.b().get(i);
            c.a.a.t.c.a<l, Path> aVar = this.p.a().get(i);
            c.a.a.t.c.a<Integer, Integer> aVar2 = this.p.c().get(i);
            int i2 = b.f2587b[gVar.a().ordinal()];
            if (i2 == 1) {
                if (i == 0) {
                    Paint paint = new Paint();
                    paint.setColor(-16777216);
                    canvas.drawRect(this.f2583h, paint);
                }
                if (gVar.d()) {
                    e(canvas, matrix, gVar, aVar, aVar2);
                } else {
                    f(canvas, matrix, gVar, aVar, aVar2);
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    if (gVar.d()) {
                        c(canvas, matrix, gVar, aVar, aVar2);
                    } else {
                        a(canvas, matrix, gVar, aVar, aVar2);
                    }
                }
            } else if (gVar.d()) {
                d(canvas, matrix, gVar, aVar, aVar2);
            } else {
                b(canvas, matrix, gVar, aVar, aVar2);
            }
        }
        c.a.a.c.a("Layer#restoreLayer");
        canvas.restore();
        c.a.a.c.b("Layer#restoreLayer");
    }

    private void a(Canvas canvas, Matrix matrix, c.a.a.v.k.g gVar, c.a.a.t.c.a<l, Path> aVar, c.a.a.t.c.a<Integer, Integer> aVar2) {
        this.f2576a.set(aVar.mo102f());
        this.f2576a.transform(matrix);
        this.f2578c.setAlpha((int) (aVar2.mo102f().intValue() * 2.55f));
        canvas.drawPath(this.f2576a, this.f2578c);
    }

    @SuppressLint({"WrongConstant"})
    private void a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, z ? 31 : 19);
        } else {
            canvas.saveLayer(rectF, paint);
        }
    }

    private void a(RectF rectF, Matrix matrix) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (!c()) {
            return;
        }
        int size = this.p.b().size();
        for (int i = 0; i < size; i++) {
            c.a.a.v.k.g gVar = this.p.b().get(i);
            this.f2576a.set(this.p.a().get(i).mo102f());
            this.f2576a.transform(matrix);
            int i2 = b.f2587b[gVar.a().ordinal()];
            if (i2 == 1) {
                return;
            }
            if ((i2 == 2 || i2 == 3) && gVar.d()) {
                return;
            }
            this.f2576a.computeBounds(this.k, false);
            RectF rectF2 = this.i;
            if (i == 0) {
                rectF2.set(this.k);
            } else {
                rectF2.set(Math.min(rectF2.left, this.k.left), Math.min(this.i.top, this.k.top), Math.max(this.i.right, this.k.right), Math.max(this.i.bottom, this.k.bottom));
            }
        }
        if (rectF.intersect(this.i)) {
            return;
        }
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (z != this.v) {
            this.v = z;
            f();
        }
    }

    private void b(float f2) {
        this.n.e().k().a(this.o.g(), f2);
    }

    private void b(Canvas canvas, Matrix matrix, c.a.a.v.k.g gVar, c.a.a.t.c.a<l, Path> aVar, c.a.a.t.c.a<Integer, Integer> aVar2) {
        a(canvas, this.f2583h, this.f2579d, true);
        this.f2576a.set(aVar.mo102f());
        this.f2576a.transform(matrix);
        this.f2578c.setAlpha((int) (aVar2.mo102f().intValue() * 2.55f));
        canvas.drawPath(this.f2576a, this.f2578c);
        canvas.restore();
    }

    private void b(RectF rectF, Matrix matrix) {
        if (d() && this.o.f() != d.b.INVERT) {
            this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.q.a(this.j, matrix, true);
            if (rectF.intersect(this.j)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void c(Canvas canvas, Matrix matrix, c.a.a.v.k.g gVar, c.a.a.t.c.a<l, Path> aVar, c.a.a.t.c.a<Integer, Integer> aVar2) {
        a(canvas, this.f2583h, this.f2578c, true);
        canvas.drawRect(this.f2583h, this.f2578c);
        this.f2576a.set(aVar.mo102f());
        this.f2576a.transform(matrix);
        this.f2578c.setAlpha((int) (aVar2.mo102f().intValue() * 2.55f));
        canvas.drawPath(this.f2576a, this.f2580e);
        canvas.restore();
    }

    private void d(Canvas canvas, Matrix matrix, c.a.a.v.k.g gVar, c.a.a.t.c.a<l, Path> aVar, c.a.a.t.c.a<Integer, Integer> aVar2) {
        a(canvas, this.f2583h, this.f2579d, true);
        canvas.drawRect(this.f2583h, this.f2578c);
        this.f2580e.setAlpha((int) (aVar2.mo102f().intValue() * 2.55f));
        this.f2576a.set(aVar.mo102f());
        this.f2576a.transform(matrix);
        canvas.drawPath(this.f2576a, this.f2580e);
        canvas.restore();
    }

    private void e() {
        if (this.s != null) {
            return;
        }
        if (this.r == null) {
            this.s = Collections.emptyList();
            return;
        }
        this.s = new ArrayList();
        for (a aVar = this.r; aVar != null; aVar = aVar.r) {
            this.s.add(aVar);
        }
    }

    private void e(Canvas canvas, Matrix matrix, c.a.a.v.k.g gVar, c.a.a.t.c.a<l, Path> aVar, c.a.a.t.c.a<Integer, Integer> aVar2) {
        a(canvas, this.f2583h, this.f2580e, true);
        canvas.drawRect(this.f2583h, this.f2578c);
        this.f2580e.setAlpha((int) (aVar2.mo102f().intValue() * 2.55f));
        this.f2576a.set(aVar.mo102f());
        this.f2576a.transform(matrix);
        canvas.drawPath(this.f2576a, this.f2580e);
        canvas.restore();
    }

    private void f() {
        this.n.invalidateSelf();
    }

    private void f(Canvas canvas, Matrix matrix, c.a.a.v.k.g gVar, c.a.a.t.c.a<l, Path> aVar, c.a.a.t.c.a<Integer, Integer> aVar2) {
        this.f2576a.set(aVar.mo102f());
        this.f2576a.transform(matrix);
        canvas.drawPath(this.f2576a, this.f2580e);
    }

    private void g() {
        boolean z = true;
        if (this.o.c().isEmpty()) {
            a(true);
            return;
        }
        c.a.a.t.c.c cVar = new c.a.a.t.c.c(this.o.c());
        cVar.h();
        cVar.a(new C0065a(cVar));
        if (cVar.mo102f().floatValue() != 1.0f) {
            z = false;
        }
        a(z);
        a(cVar);
    }

    @Override // c.a.a.t.c.a.InterfaceC0064a
    public void a() {
        f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f2) {
        this.u.b(f2);
        if (this.p != null) {
            for (int i = 0; i < this.p.a().size(); i++) {
                this.p.a().get(i).a(f2);
            }
        }
        if (this.o.t() != 0.0f) {
            f2 /= this.o.t();
        }
        a aVar = this.q;
        if (aVar != null) {
            this.q.a(aVar.o.t() * f2);
        }
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            this.t.get(i2).a(f2);
        }
    }

    @Override // c.a.a.t.b.e
    public void a(Canvas canvas, Matrix matrix, int i) {
        c.a.a.c.a(this.l);
        if (!this.v || this.o.v()) {
            c.a.a.c.b(this.l);
            return;
        }
        e();
        c.a.a.c.a("Layer#parentMatrix");
        this.f2577b.reset();
        this.f2577b.set(matrix);
        for (int size = this.s.size() - 1; size >= 0; size--) {
            this.f2577b.preConcat(this.s.get(size).u.b());
        }
        c.a.a.c.b("Layer#parentMatrix");
        int intValue = (int) ((((i / 255.0f) * (this.u.c() == null ? 100 : this.u.c().mo102f().intValue())) / 100.0f) * 255.0f);
        if (!d() && !c()) {
            this.f2577b.preConcat(this.u.b());
            c.a.a.c.a("Layer#drawLayer");
            b(canvas, this.f2577b, intValue);
            c.a.a.c.b("Layer#drawLayer");
            b(c.a.a.c.b(this.l));
            return;
        }
        c.a.a.c.a("Layer#computeBounds");
        a(this.f2583h, this.f2577b, false);
        b(this.f2583h, matrix);
        this.f2577b.preConcat(this.u.b());
        a(this.f2583h, this.f2577b);
        if (!this.f2583h.intersect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight())) {
            this.f2583h.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        c.a.a.c.b("Layer#computeBounds");
        if (!this.f2583h.isEmpty()) {
            c.a.a.c.a("Layer#saveLayer");
            a(canvas, this.f2583h, this.f2578c, true);
            c.a.a.c.b("Layer#saveLayer");
            a(canvas);
            c.a.a.c.a("Layer#drawLayer");
            b(canvas, this.f2577b, intValue);
            c.a.a.c.b("Layer#drawLayer");
            if (c()) {
                a(canvas, this.f2577b);
            }
            if (d()) {
                c.a.a.c.a("Layer#drawMatte");
                c.a.a.c.a("Layer#saveLayer");
                a(canvas, this.f2583h, this.f2581f, false);
                c.a.a.c.b("Layer#saveLayer");
                a(canvas);
                this.q.a(canvas, matrix, intValue);
                c.a.a.c.a("Layer#restoreLayer");
                canvas.restore();
                c.a.a.c.b("Layer#restoreLayer");
                c.a.a.c.b("Layer#drawMatte");
            }
            c.a.a.c.a("Layer#restoreLayer");
            canvas.restore();
            c.a.a.c.b("Layer#restoreLayer");
        }
        b(c.a.a.c.b(this.l));
    }

    @Override // c.a.a.t.b.e
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f2583h.set(0.0f, 0.0f, 0.0f, 0.0f);
        e();
        this.m.set(matrix);
        if (z) {
            List<a> list = this.s;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.m.preConcat(this.s.get(size).u.b());
                }
            } else {
                a aVar = this.r;
                if (aVar != null) {
                    this.m.preConcat(aVar.u.b());
                }
            }
        }
        this.m.preConcat(this.u.b());
    }

    public void a(c.a.a.t.c.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.t.add(aVar);
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
        b(eVar, i + eVar.b(getName(), i), list, eVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(a aVar) {
        this.q = aVar;
    }

    @Override // c.a.a.v.f
    public <T> void a(T t, c.a.a.z.c<T> cVar) {
        this.u.a(t, cVar);
    }

    @Override // c.a.a.t.b.c
    public void a(List<c.a.a.t.b.c> list, List<c.a.a.t.b.c> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d b() {
        return this.o;
    }

    abstract void b(Canvas canvas, Matrix matrix, int i);

    public void b(c.a.a.t.c.a<?, ?> aVar) {
        this.t.remove(aVar);
    }

    void b(c.a.a.v.e eVar, int i, List<c.a.a.v.e> list, c.a.a.v.e eVar2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a aVar) {
        this.r = aVar;
    }

    boolean c() {
        c.a.a.t.c.g gVar = this.p;
        return gVar != null && !gVar.a().isEmpty();
    }

    boolean d() {
        return this.q != null;
    }

    @Override // c.a.a.t.b.c
    public String getName() {
        return this.o.g();
    }
}
