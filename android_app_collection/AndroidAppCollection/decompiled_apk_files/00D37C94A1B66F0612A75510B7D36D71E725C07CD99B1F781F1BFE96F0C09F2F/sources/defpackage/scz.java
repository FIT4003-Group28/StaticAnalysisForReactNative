package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
/* compiled from: PG */
/* renamed from: scz  reason: default package */
/* loaded from: classes4.dex */
public abstract class scz extends View implements sbn {
    public sep a;
    public sdl b;
    public sdj c;
    public sdg d;
    public int e;
    private boolean f;
    private int g;
    private int h;
    private scy i;
    private final List j;
    private final Rect k;
    private final Rect l;
    private final sek m;
    private final sbz n;
    private final sek o;

    public scz(Context context, ser serVar) {
        super(context);
        this.e = 3;
        this.f = true;
        this.g = 0;
        this.h = 0;
        this.j = sbv.d();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new sek(0, 0);
        this.n = new sbz();
        this.o = new sek(0, 0);
        sdg sdgVar = new sdg(context);
        sdgVar.d(serVar);
        this.d = sdgVar;
        k(new sds());
    }

    protected abstract sek a();

    final List b() {
        List b = this.b.b(this.j, a(), this.e, this.n, this.c, this.i, this.a, h());
        sho.e(b, "%s returned null ticks.", this.b.getClass().getName());
        return b;
    }

    public final void c(Object obj) {
        this.j.add(obj);
        this.a.i(obj);
    }

    protected void d(List list) {
    }

    public final void e() {
        this.j.clear();
        this.a.k();
        this.a.m(this.d.a);
        this.a.n(this.d.b);
    }

    public final void f() {
        List b = b();
        d(b);
        this.k.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.l.set(0, 0, getWidth(), getHeight());
        this.i.d(this.e, this.a, b, this.k, this.l);
    }

    protected final boolean g() {
        int i = this.e;
        return i == 4 || i == 2;
    }

    protected boolean h() {
        return false;
    }

    public final void i(int i) {
        this.g = i;
        this.h = i;
    }

    public final void j() {
        this.f = false;
    }

    public final void k(scy scyVar) {
        sdg a = scyVar.a();
        if (a != null) {
            a.d(this.d.a);
            sev sevVar = this.d.b;
            sho.g(sevVar, "stepSizeConfig");
            a.b = sevVar;
            this.d = a;
        }
        scyVar.c(this.d);
        this.i = scyVar;
    }

    public final void l(sep sepVar) {
        sep sepVar2;
        if (sepVar.f() == null && (sepVar2 = this.a) != null && sepVar2.f() != null) {
            sepVar.l(this.a.f());
        }
        sepVar.m(this.d.a);
        sepVar.n(this.d.b);
        this.a = sepVar;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.i.b(canvas, this.f);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int width;
        if (g()) {
            paddingLeft = (getHeight() - getPaddingBottom()) - this.g;
            width = getPaddingTop() + this.h;
        } else {
            paddingLeft = getPaddingLeft() + this.g;
            width = (getWidth() - getPaddingRight()) - this.h;
        }
        sep sepVar = this.a;
        sek sekVar = this.o;
        sekVar.b(Integer.valueOf(paddingLeft), Integer.valueOf(width));
        sepVar.l(sekVar);
        this.n.a((getWidth() - getPaddingRight()) - getPaddingLeft(), (getHeight() - getPaddingBottom()) - getPaddingTop());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size;
        int size2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        this.n.a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (g()) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        int i3 = size - (this.h + this.g);
        if (g()) {
            size2 = View.MeasureSpec.getSize(i);
        } else {
            size2 = View.MeasureSpec.getSize(i2);
        }
        sek f = this.a.f();
        sep sepVar = this.a;
        sek sekVar = this.m;
        sekVar.b(0, Integer.valueOf(i3));
        sepVar.l(sekVar);
        List<sdi> b = b();
        int i4 = g() ? marginLayoutParams.width : marginLayoutParams.height;
        if (i4 != -1) {
            if (i4 == -2) {
                size2 = 0;
                for (sdi sdiVar : b) {
                    size2 = Math.max(size2, g() ? sdiVar.c.a : sdiVar.c.b);
                }
            } else {
                size2 = i4;
            }
        }
        if (f != null) {
            this.a.l(f);
        }
        int size3 = g() ? View.MeasureSpec.getSize(i2) : size2;
        if (!g()) {
            size2 = View.MeasureSpec.getSize(i);
        }
        this.n.a(size2, size3);
        setMeasuredDimension(size2, size3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [scy, sbn] */
    @Override // defpackage.sbn
    public final void setAnimationPercent(float f) {
        ?? r0 = this.i;
        if (r0 instanceof sbn) {
            r0.setAnimationPercent(f);
        }
        invalidate();
    }
}
