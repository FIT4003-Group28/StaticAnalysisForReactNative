package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.cpsk;
import java.util.List;
/* compiled from: PG */
/* renamed from: cprf  reason: default package */
/* loaded from: classes5.dex */
public abstract class cprf<D, S extends cpsk<D>> extends View implements cppl {
    public S a;
    public boolean b;
    public int c;
    public int d;
    public cprx<D> e;
    public cpru<D> f;
    public cprr g;
    public int h;
    private cpre<D> i;
    private final List<D> j;
    private final Rect k;
    private final Rect l;
    private final cpsf<Integer> m;
    private final cppz n;
    private final cpsf<Integer> o;

    public cprf(Context context, cpsm cpsmVar) {
        super(context);
        this.h = 3;
        this.b = true;
        this.c = 0;
        this.d = 0;
        this.j = cpwi.a();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new cpsf<>(0, 0);
        this.n = new cppz();
        this.o = new cpsf<>(0, 0);
        this.g = cprr.a(context, cpsmVar);
        i(new cpsb());
    }

    public final void a(D d) {
        this.j.add(d);
        this.a.n(d);
    }

    public final void b() {
        this.j.clear();
        this.a.j();
        this.a.c(this.g.a);
        this.a.d(this.g.b);
    }

    protected abstract cpsf<D> c();

    final List<cprt<D>> d() {
        List<cprt<D>> b = this.e.b(this.j, c(), this.h, this.n, this.f, this.i, this.a, e());
        cpwl.f(b, "%s returned null ticks.", this.e.getClass().getName());
        return b;
    }

    protected boolean e() {
        return false;
    }

    protected final boolean f() {
        int i = this.h;
        return i == 4 || i == 2;
    }

    public final void g() {
        List<cprt<D>> d = d();
        h(d);
        this.k.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.l.set(0, 0, getWidth(), getHeight());
        this.i.c(this.h, this.a, d, this.k, this.l, 0);
    }

    protected void h(List<cprt<D>> list) {
    }

    public final void i(cpre<D> cpreVar) {
        cprr g = cpreVar.g();
        if (g != null) {
            g.b(this.g.a);
            cpsq cpsqVar = this.g.b;
            cpwl.h(cpsqVar, "stepSizeConfig");
            g.b = cpsqVar;
            this.g = g;
        }
        cpreVar.f(this.g);
        this.i = cpreVar;
    }

    public final void j(S s) {
        S s2;
        if (s.f() == null && (s2 = this.a) != null && s2.f() != null) {
            s.e(this.a.f());
        }
        s.c(this.g.a);
        s.d(this.g.b);
        this.a = s;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.i.b(canvas, this.b);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int width;
        if (f()) {
            paddingLeft = (getHeight() - getPaddingBottom()) - this.c;
            width = getPaddingTop() + this.d;
        } else {
            paddingLeft = getPaddingLeft() + this.c;
            width = (getWidth() - getPaddingRight()) - this.d;
        }
        S s = this.a;
        cpsf<Integer> cpsfVar = this.o;
        cpsfVar.b(Integer.valueOf(paddingLeft), Integer.valueOf(width));
        s.e(cpsfVar);
        this.n.a((getWidth() - getPaddingRight()) - getPaddingLeft(), (getHeight() - getPaddingBottom()) - getPaddingTop());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size;
        int size2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        this.n.a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (f()) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        int i3 = size - (this.d + this.c);
        if (f()) {
            size2 = View.MeasureSpec.getSize(i);
        } else {
            size2 = View.MeasureSpec.getSize(i2);
        }
        cpsf<Integer> f = this.a.f();
        S s = this.a;
        cpsf<Integer> cpsfVar = this.m;
        cpsfVar.b(0, Integer.valueOf(i3));
        s.e(cpsfVar);
        List<cprt<D>> d = d();
        int i4 = f() ? marginLayoutParams.width : marginLayoutParams.height;
        if (i4 != -1) {
            if (i4 == -2) {
                size2 = 0;
                for (cprt<D> cprtVar : d) {
                    size2 = Math.max(size2, f() ? cprtVar.c.a : cprtVar.c.b);
                }
            } else {
                size2 = i4;
            }
        }
        if (f != null) {
            this.a.e(f);
        }
        int size3 = f() ? View.MeasureSpec.getSize(i2) : size2;
        if (!f()) {
            size2 = View.MeasureSpec.getSize(i);
        }
        this.n.a(size2, size3);
        setMeasuredDimension(size2, size3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cpre<D>, cppl] */
    @Override // defpackage.cppl
    public void setAnimationPercent(float f) {
        cpre<D> cpreVar = this.i;
        if (cpreVar instanceof cppl) {
            cpreVar.setAnimationPercent(f);
        }
        invalidate();
    }

    public void setRange(cpsf<Integer> cpsfVar) {
        this.a.e(cpsfVar);
    }

    public void setViewportConfig(float f, float f2) {
        this.a.i(f, f2);
    }
}
