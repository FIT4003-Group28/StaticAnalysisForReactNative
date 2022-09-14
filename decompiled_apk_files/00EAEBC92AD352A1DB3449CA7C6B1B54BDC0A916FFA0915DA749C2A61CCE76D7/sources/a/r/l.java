package a.r;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class l extends ViewGroup implements i {

    /* renamed from: b  reason: collision with root package name */
    ViewGroup f654b;

    /* renamed from: c  reason: collision with root package name */
    View f655c;

    /* renamed from: d  reason: collision with root package name */
    final View f656d;

    /* renamed from: e  reason: collision with root package name */
    int f657e;

    /* renamed from: f  reason: collision with root package name */
    private Matrix f658f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f659g;

    /* loaded from: classes.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            a.g.m.v.M(l.this);
            l lVar = l.this;
            ViewGroup viewGroup = lVar.f654b;
            if (viewGroup == null || (view = lVar.f655c) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            a.g.m.v.M(l.this.f654b);
            l lVar2 = l.this;
            lVar2.f654b = null;
            lVar2.f655c = null;
            return true;
        }
    }

    l(View view) {
        super(view.getContext());
        this.f659g = new a();
        this.f656d = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    static l a(View view) {
        return (l) view.getTag(s.ghost_view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l a(View view, ViewGroup viewGroup, Matrix matrix) {
        j jVar;
        if (view.getParent() instanceof ViewGroup) {
            j a2 = j.a(viewGroup);
            l a3 = a(view);
            int i = 0;
            if (a3 != null && (jVar = (j) a3.getParent()) != a2) {
                i = a3.f657e;
                jVar.removeView(a3);
                a3 = null;
            }
            if (a3 == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    b(view, viewGroup, matrix);
                }
                a3 = new l(view);
                a3.a(matrix);
                if (a2 == null) {
                    a2 = new j(viewGroup);
                } else {
                    a2.a();
                }
                a((View) viewGroup, (View) a2);
                a((View) viewGroup, (View) a3);
                a2.a(a3);
                a3.f657e = i;
            } else if (matrix != null) {
                a3.a(matrix);
            }
            a3.f657e++;
            return a3;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    static void a(View view, l lVar) {
        view.setTag(s.ghost_view, lVar);
    }

    static void a(View view, View view2) {
        o0.a(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view) {
        l a2 = a(view);
        if (a2 != null) {
            a2.f657e--;
            if (a2.f657e > 0) {
                return;
            }
            ((j) a2.getParent()).removeView(a2);
        }
    }

    static void b(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        o0.b(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        o0.c(viewGroup, matrix);
    }

    void a(Matrix matrix) {
        this.f658f = matrix;
    }

    @Override // a.r.i
    public void a(ViewGroup viewGroup, View view) {
        this.f654b = viewGroup;
        this.f655c = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.f656d, this);
        this.f656d.getViewTreeObserver().addOnPreDrawListener(this.f659g);
        o0.a(this.f656d, 4);
        if (this.f656d.getParent() != null) {
            ((View) this.f656d.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f656d.getViewTreeObserver().removeOnPreDrawListener(this.f659g);
        o0.a(this.f656d, 0);
        a(this.f656d, (l) null);
        if (this.f656d.getParent() != null) {
            ((View) this.f656d.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        c.a(canvas, true);
        canvas.setMatrix(this.f658f);
        o0.a(this.f656d, 0);
        this.f656d.invalidate();
        o0.a(this.f656d, 4);
        drawChild(canvas, this.f656d, getDrawingTime());
        c.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, a.r.i
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (a(this.f656d) == this) {
            o0.a(this.f656d, i == 0 ? 4 : 0);
        }
    }
}
