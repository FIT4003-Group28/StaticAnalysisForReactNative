package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpph  reason: default package */
/* loaded from: classes5.dex */
public class cpph<T, D> extends cppr<T, D> implements cppl {
    public static final cpvf<String> b = new cpvf<>("aplos.bar_fill_style");
    private HashMap<String, cppe<T, D>> a;
    private Paint d;
    private Paint e;
    private cppi f;
    private boolean g;
    private Integer h;
    private cpul i;
    private cpvi<T, D> j;
    private cppe<T, D> k;
    private boolean l;
    private LinkedHashSet<String> m;
    private LinkedHashSet<String> n;
    private boolean o;
    private cppd p;
    private HashSet<D> q;
    private RectF r;
    private RectF s;
    private cpsf<Float> t;
    private boolean u;
    private int v;

    public cpph(Context context) {
        super(context);
        this.a = cpwj.a();
        this.d = new Paint();
        this.e = new Paint();
        this.i = new cput();
        this.v = 1;
        this.l = true;
        this.m = cpwm.d();
        this.n = new LinkedHashSet<>();
        this.o = false;
        this.p = new cppd();
        this.q = cpwm.a();
        this.r = new RectF();
        this.s = new RectF();
        Float valueOf = Float.valueOf(0.0f);
        this.t = new cpsf<>(valueOf, valueOf);
        this.u = false;
        this.f = new cppi(context);
        c();
    }

    private final boolean a(cptb<T, D> cptbVar) {
        cppi cppiVar = this.f;
        return cppiVar.a && cppiVar.f && (cptbVar instanceof cptc);
    }

    protected static cppg[] i(boolean z, float f, int i, Integer num, cppk cppkVar) {
        cppg[] cppgVarArr = new cppg[i];
        float round = Math.round(cpqk.a(null, 1.0f));
        float f2 = (cppkVar.c - 1) * round;
        float f3 = f - f2;
        float f4 = 0.0f;
        int i2 = 0;
        while (i2 < i) {
            float floor = (float) Math.floor(((i2 < cppkVar.c ? cppkVar.a[i2] : 0) / cppkVar.b) * f3);
            if (num != null) {
                floor = Math.min(floor, num.intValue());
            }
            cppg cppgVar = new cppg();
            cppgVarArr[i2] = cppgVar;
            cppgVar.a = floor;
            cppgVar.b = f4 + (i2 * round);
            i2++;
            f4 += floor;
        }
        float round2 = Math.round((f - (f4 + f2)) / 2.0f);
        for (int i3 = 0; i3 < i; i3++) {
            cppg cppgVar2 = cppgVarArr[i3];
            float f5 = cppgVar2.b + round2;
            cppgVar2.b = f5;
            if (z) {
                double d = f5;
                double d2 = f;
                Double.isNaN(d2);
                Double.isNaN(d);
                cppgVar2.b = (float) Math.round(d - (d2 / 2.0d));
            }
        }
        return cppgVarArr;
    }

    private final void l(Canvas canvas, cppe<T, D> cppeVar) {
        Iterator<D> it = this.q.iterator();
        while (it.hasNext()) {
            int h = cppeVar.h(it.next());
            if (h != -1) {
                this.p.b();
                this.p.a = cppeVar.e(h) + cppeVar.i();
                this.p.b = cppeVar.j();
                cppj cppjVar = this.f.b;
                this.p.d = cppjVar == null ? 0.0f : cppjVar.a(cppeVar.j());
                float c = cppeVar.c(h);
                float b2 = cppeVar.b(h);
                this.p.a(m(c, b2), b2, cppeVar.f(h), (String) cppeVar.b.e(b, "aplos.SOLID").a(cppeVar.d(h), 0, cppeVar.b));
                this.i.a(canvas, this.p, this.v, this.r, this.d, this.e);
            }
        }
    }

    private static final float m(float f, float f2) {
        float f3 = f - f2;
        return (f3 == 0.0f || Math.abs(f3) > 0.0f) ? f : f2 + Math.copySign(0.0f, f3);
    }

    protected cpqn<T, D> b() {
        return new cpqo();
    }

    public final void c() {
        this.d.setAntiAlias(true);
        this.d.setStyle(Paint.Style.FILL);
        this.d.setDither(true);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setColor(-1);
        this.e.setAntiAlias(true);
        this.e.setDither(true);
        cppt.a(this, cpps.CLIP_PATH, cpps.CLIP_RECT);
    }

    public final cppi d() {
        if (this.g) {
            this.f = new cppi(this.f);
            this.g = false;
        }
        return this.f;
    }

    @Override // defpackage.cppr, defpackage.cpqf
    public final CharSequence e() {
        int size = this.m.size();
        if (d().a) {
            return MessageFormat.format(getContext().getString(R.string.aplosA11yChartTypeStackedBar), Integer.valueOf(size));
        }
        return MessageFormat.format(getContext().getString(R.string.aplosA11yChartTypeGroupBar), Integer.valueOf(size));
    }

    @Override // defpackage.cppr, defpackage.cpqf
    public final void f(cpoj<T, D> cpojVar, List<cpot> list, cptb<T, D> cptbVar) {
        String str;
        cpvi<T, D> b2;
        super.f(cpojVar, list, cptbVar);
        int size = list.size();
        cptg cptgVar = cpqg.a;
        ArrayList c = cpwi.c(list);
        LinkedHashSet<String> linkedHashSet = this.m;
        int i = -1;
        int i2 = 1;
        if ((cptbVar instanceof cptc) && cptbVar.f()) {
            for (int i3 = 0; i3 < c.size(); i3++) {
                cpvi<T, D> cpviVar = ((cpot) c.get(i3)).a;
                if (cptbVar.h(cpviVar, null) == 1) {
                    i = i3;
                    str = cpviVar.f;
                    break;
                }
            }
        }
        str = null;
        cppi cppiVar = this.f;
        if (cppiVar.a && cppiVar.f && i > 0) {
            c.add(0, (cpot) c.remove(i));
        }
        for (String str2 : cpwi.d(c, new cppf())) {
            if (!str2.equals(str)) {
                linkedHashSet.remove(str2);
                linkedHashSet.add(str2);
            }
        }
        if (str != null) {
            linkedHashSet.remove(str);
            linkedHashSet.add(str);
        }
        int i4 = 5;
        if (this.f.a) {
            int size2 = c.size();
            cpvi<T, D> cpviVar2 = null;
            cpve<T, D> cpveVar = null;
            int i5 = 0;
            while (i5 < size2) {
                cpot cpotVar = (cpot) c.get(i5);
                cpvi<T, D> cpviVar3 = cpotVar.a;
                cpve<T, D> a = cpotVar.a();
                cpwc.a(cpviVar3, a, cpviVar2, cpveVar);
                cpsm cpsmVar = cpotVar.f.a;
                if (cpsmVar.b == i4 && cpsmVar.a != cptgVar.a(1)) {
                    cpotVar.f.b(cpsm.c(1));
                }
                i5++;
                cpviVar2 = cpviVar3;
                cpveVar = a;
                i4 = 5;
            }
            ArrayList a2 = cpwi.a();
            for (int i6 = 0; i6 < c.size(); i6++) {
                a2.add(((cpot) c.get(i6)).a.f);
            }
            this.o = false;
            if (a2.size() == this.n.size() && this.n.containsAll(a2)) {
                Iterator<String> it = this.n.iterator();
                int i7 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!((String) a2.get(i7)).equals(it.next())) {
                        this.o = true;
                        break;
                    }
                    i7++;
                }
            }
            this.n.clear();
            this.n.addAll(a2);
            if (a(cptbVar)) {
                if (cpviVar2 == null) {
                    b2 = null;
                } else {
                    b2 = cpviVar2.b();
                    cpwl.h("Total", "name");
                    b2.f = "Total";
                    cpvf cpvfVar = cpvf.a;
                    Double valueOf = Double.valueOf((double) dcyn.a);
                    cpve<T, R> e = b2.e(cpvfVar, valueOf);
                    cpve<T, R> e2 = b2.e(cpvf.b, valueOf);
                    b2.j(cpvf.b, valueOf);
                    b2.i(cpvf.a, new cpwb(e, e2));
                }
                this.j = b2;
                b2.j(cpvf.e, Integer.valueOf(this.f.c));
            } else {
                this.j = null;
            }
        } else {
            int size3 = c.size();
            for (int i8 = 0; i8 < size3; i8++) {
                cpot cpotVar2 = (cpot) c.get(i8);
                cpsm cpsmVar2 = cpotVar2.f.a;
                if (cpsmVar2.b == 5 && cpsmVar2.a != cptgVar.a(size)) {
                    cpotVar2.f.b(cpsm.c(size));
                }
            }
        }
        if (true != ((cpny) cpojVar).a) {
            i2 = 2;
        }
        this.v = i2;
    }

    @Override // defpackage.cpqf
    public final void g(List<cpot> list, cptb<T, D> cptbVar) {
        int i;
        boolean z;
        List<cpot> list2 = list;
        this.r.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        int i2 = this.v;
        int i3 = i2 - 1;
        cpot cpotVar = null;
        if (i2 != 0) {
            boolean z2 = true;
            if (i3 == 0) {
                this.t.b(Float.valueOf(this.r.left), Float.valueOf(this.r.right));
            } else if (i3 == 1) {
                this.t.b(Float.valueOf(this.r.top), Float.valueOf(this.r.bottom));
            } else {
                throw new AssertionError();
            }
            HashMap a = cpwj.a();
            HashSet<String> c = cpwm.c(this.a.keySet());
            if (!a(cptbVar) || list.isEmpty()) {
                this.k = null;
            }
            cppi cppiVar = this.f;
            if (!cppiVar.a || !cppiVar.f || !this.o) {
                i = 0;
            } else {
                i = cptbVar.f() ? 1 : 2;
            }
            int size = this.f.a ? 1 : list.size();
            cppk cppkVar = new cppk(size);
            if (!list.isEmpty()) {
                cppg[] i4 = i(this.f.d, list2.get(0).e.l(), size, this.h, cppkVar);
                int i5 = 0;
                z = false;
                while (i5 < list.size()) {
                    cpot cpotVar2 = list2.get(i5);
                    cpvi<T, D> cpviVar = cpotVar2.a;
                    String str = cpviVar.f;
                    c.remove(str);
                    cppe<T, D> cppeVar = this.a.get(str);
                    if (cppeVar == null) {
                        cppeVar = new cppe<>(b());
                        z = true;
                    }
                    a.put(str, cppeVar);
                    cppeVar.a.r(i);
                    int i6 = z2 != this.f.a ? i5 : 0;
                    cpsk<D> cpskVar = cpotVar2.e;
                    cpsk<Double> cpskVar2 = cpotVar2.d;
                    cpve<T, D> a2 = cpotVar2.a();
                    boolean z3 = this.c;
                    cppg cppgVar = i4[i6];
                    cppeVar.a(cpskVar, cpskVar2, a2, cpviVar, z3, cppgVar.a, cppgVar.b, this.t);
                    i5++;
                    list2 = list;
                    cpotVar = cpotVar2;
                    i = i;
                    i4 = i4;
                    z2 = true;
                }
            } else {
                z = false;
            }
            if (a(cptbVar) && cpotVar != null) {
                if (this.k == null) {
                    this.k = new cppe<>(b());
                }
                cppg[] i7 = i(this.f.d, cpotVar.e.l(), size, this.h, cppkVar);
                cppe<T, D> cppeVar2 = this.k;
                cpsk<D> cpskVar3 = cpotVar.e;
                cpsk<Double> cpskVar4 = cpotVar.d;
                cpve<T, D> a3 = cpotVar.a();
                cpvi<T, D> cpviVar2 = this.j;
                cppg cppgVar2 = i7[0];
                cppeVar2.a(cpskVar3, cpskVar4, a3, cpviVar2, true, cppgVar2.a, cppgVar2.b, this.t);
                if (!c.isEmpty() || z) {
                    this.l = false;
                }
            }
            for (String str2 : c) {
                this.a.get(str2).a(null, null, null, cpvo.a(str2), this.c, 0.0f, 0.0f, this.t);
            }
            this.a.putAll(a);
            this.q.clear();
            for (cppe<T, D> cppeVar3 : this.a.values()) {
                this.q.addAll(cppeVar3.a.u(cppeVar3.c));
            }
            return;
        }
        throw null;
    }

    @Override // defpackage.cppr, defpackage.cpqf
    public final List<cpvg<T, D>> h(int i, int i2, boolean z) {
        int i3;
        int i4;
        float f;
        if (this.v == 2) {
            this.s.set(this.r.top, this.r.left, this.r.bottom, this.r.right);
            i4 = i;
            i3 = i2;
        } else {
            this.s.set(this.r);
            i3 = i;
            i4 = i2;
        }
        Collection<cppe<T, D>> values = this.a.values();
        RectF rectF = this.s;
        ArrayList a = cpwi.a();
        for (cppe<T, D> cppeVar : values) {
            synchronized (cppeVar) {
                int g = cppeVar.g();
                int i5 = -1;
                float f2 = Float.MAX_VALUE;
                int i6 = 0;
                while (true) {
                    f = 0.0f;
                    if (i6 >= g) {
                        break;
                    }
                    float e = cppeVar.e(i6) + cppeVar.i();
                    float j = cppeVar.j() + e;
                    if (rectF.intersects(e, rectF.top, j, rectF.bottom)) {
                        float f3 = i3;
                        float min = cpqk.c(f3, e, j) ? 0.0f : Math.min(Math.abs(e - f3), Math.abs(j - f3));
                        if (min < f2) {
                            f2 = (int) min;
                            i5 = i6;
                        } else if (min > f2) {
                            break;
                        }
                    }
                    i6++;
                }
                if (i5 >= 0) {
                    float b2 = cppeVar.b(i5);
                    float c = cppeVar.c(i5);
                    float f4 = i4;
                    if (!cpqk.c(f4, b2, c)) {
                        f = Math.min(Math.abs(b2 - f4), Math.abs(c - f4));
                    }
                    if (z || (f2 <= 10.0f && f <= 10.0f)) {
                        cpvg cpvgVar = new cpvg();
                        cpvgVar.a = cppeVar.b;
                        cppeVar.d(i5);
                        cpvgVar.b = cppeVar.a.k(i5);
                        cppeVar.e(i5);
                        cppeVar.a.m(i5);
                        cppeVar.c(i5);
                        cpvgVar.c = f2;
                        cpvgVar.d = f;
                        a.add(cpvgVar);
                    }
                }
            }
        }
        return a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean b2 = cppt.b(this, cpps.CLIP_PATH);
        if (b2) {
            canvas.save();
            canvas.clipRect(this.r);
        }
        if (!this.f.a) {
            Iterator<String> it = this.m.iterator();
            while (it.hasNext()) {
                l(canvas, this.a.get(it.next()));
            }
        } else {
            cppe<T, D> cppeVar = this.k;
            if (cppeVar != null && this.l) {
                l(canvas, cppeVar);
            }
            Iterator<D> it2 = this.q.iterator();
            while (it2.hasNext()) {
                D next = it2.next();
                this.p.b();
                cppd cppdVar = this.p;
                cppdVar.e = !this.u || !this.o;
                cppdVar.c = this.f.e;
                Iterator<String> it3 = this.m.iterator();
                while (it3.hasNext()) {
                    cppe<T, D> cppeVar2 = this.a.get(it3.next());
                    int h = cppeVar2.h(next);
                    if (h != -1) {
                        float j = cppeVar2.j();
                        cppd cppdVar2 = this.p;
                        if (j > cppdVar2.b) {
                            cppdVar2.b = j;
                            cppdVar2.a = cppeVar2.e(h) + cppeVar2.i();
                        }
                        float c = cppeVar2.c(h);
                        float b3 = cppeVar2.b(h);
                        this.p.a(m(c, b3), b3, cppeVar2.f(h), (String) cppeVar2.b.e(b, "aplos.SOLID").a(cppeVar2.d(h), 0, cppeVar2.b));
                    }
                }
                cppj cppjVar = this.f.b;
                float a = cppjVar == null ? 0.0f : cppjVar.a(this.p.b);
                cppd cppdVar3 = this.p;
                cppdVar3.d = a;
                this.i.a(canvas, cppdVar3, this.v, this.r, this.d, this.e);
            }
        }
        if (b2) {
            canvas.restore();
        }
    }

    @Override // defpackage.cppl
    public void setAnimationPercent(float f) {
        this.u = f < 1.0f;
        ArrayList c = cpwi.c(this.a.keySet());
        int size = c.size();
        for (int i = 0; i < size; i++) {
            String str = (String) c.get(i);
            cppe<T, D> cppeVar = this.a.get(str);
            cppeVar.setAnimationPercent(f);
            if (cppeVar.g() == 0) {
                this.a.remove(str);
                this.m.remove(str);
            }
        }
        cppe<T, D> cppeVar2 = this.k;
        if (cppeVar2 != null) {
            cppeVar2.setAnimationPercent(f);
        }
        if (f == 1.0f) {
            this.l = true;
        }
        invalidate();
    }

    public void setBarDrawer(cpul cpulVar) {
        cpwl.h(cpulVar, "barDrawer");
        this.i = cpulVar;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof cppw) {
            ((cppw) layoutParams).d();
        }
    }

    public void setMaxBarWidth(int i) {
        this.h = Integer.valueOf(i);
    }

    public cpph(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cpph(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = cpwj.a();
        this.d = new Paint();
        this.e = new Paint();
        this.i = new cput();
        this.v = 1;
        this.l = true;
        this.m = cpwm.d();
        this.n = new LinkedHashSet<>();
        this.o = false;
        this.p = new cppd();
        this.q = cpwm.a();
        this.r = new RectF();
        this.s = new RectF();
        Float valueOf = Float.valueOf(0.0f);
        this.t = new cpsf<>(valueOf, valueOf);
        this.u = false;
        cppi cppiVar = new cppi(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpnw.a, i, 0);
        cppiVar.a = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.f = cppiVar;
        c();
    }

    public cpph(Context context, cppi cppiVar) {
        super(context);
        this.a = cpwj.a();
        this.d = new Paint();
        this.e = new Paint();
        this.i = new cput();
        this.v = 1;
        this.l = true;
        this.m = cpwm.d();
        this.n = new LinkedHashSet<>();
        this.o = false;
        this.p = new cppd();
        this.q = cpwm.a();
        this.r = new RectF();
        this.s = new RectF();
        Float valueOf = Float.valueOf(0.0f);
        this.t = new cpsf<>(valueOf, valueOf);
        this.u = false;
        this.f = cppiVar;
        this.g = true;
        c();
    }
}
