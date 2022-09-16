package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: itp  reason: default package */
/* loaded from: classes6.dex */
public final class itp implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener, ViewTreeObserver.OnPreDrawListener, ViewTreeObserver.OnScrollChangedListener {
    public static final /* synthetic */ int b = 0;
    public final View a;
    private final dzss c = dzst.a(new ito(this));
    private final dzss d = dzst.a(new itn(this));
    private boolean e;
    private boolean f;
    private final cjqq g;

    public itp(cjqq cjqqVar, View view) {
        this.g = cjqqVar;
        this.a = view;
        view.setTag(R.id.impression_logger, this);
        view.addOnAttachStateChangeListener(this);
        if (od.ak(view)) {
            onViewAttachedToWindow(view);
        }
    }

    private final itk d() {
        return (itk) this.c.a();
    }

    private final void e() {
        itk d = d();
        d.b.getLocationOnScreen(d.a);
        Rect rect = d.c;
        int[] iArr = d.a;
        int i = iArr[0];
        rect.set(i, iArr[1], d.b.getWidth() + i, d.a[1] + d.b.getHeight());
        cjtd k = cjqg.k(this.a);
        if (k != null && !dzvx.d(k, cjtd.c)) {
            ddhj f = k.f();
            if (f != null && f.ordinal() == 0) {
                itk d2 = d();
                if (d2.b.getVisibility() != 0 || d2.c.isEmpty()) {
                    return;
                }
            }
            itk d3 = d();
            itu ituVar = (itu) this.d.a();
            dzvx.c(ituVar, "area");
            synchronized (ituVar.a) {
                if (ituVar.a.isEmpty()) {
                    ituVar.b.getWindowVisibleDisplayFrame(ituVar.a);
                }
            }
            if (!Rect.intersects(ituVar.a, d3.c)) {
                return;
            }
            c(this.g.f(this.a).e(this.a));
        }
    }

    public final void c(cjql cjqlVar) {
        cjqg.d(this.a, cjqlVar);
        if (cjqlVar != null) {
            b(false);
            a(false);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        dzvx.c(view, "view");
        e();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        e();
        return true;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        dzvx.c(view, "view");
        b(true);
        a(true);
        e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        dzvx.c(view, "view");
        b(false);
        a(false);
        c(null);
    }

    public final void a(boolean z) {
        if (z && !this.e) {
            this.a.getViewTreeObserver().addOnScrollChangedListener(this);
        } else if (!z && this.e) {
            this.a.getViewTreeObserver().removeOnScrollChangedListener(this);
        }
        this.e = z;
    }

    public final void b(boolean z) {
        if (z && !this.f) {
            this.a.addOnLayoutChangeListener(this);
        } else if (!z && this.f) {
            this.a.removeOnLayoutChangeListener(this);
        }
        this.f = z;
    }
}
