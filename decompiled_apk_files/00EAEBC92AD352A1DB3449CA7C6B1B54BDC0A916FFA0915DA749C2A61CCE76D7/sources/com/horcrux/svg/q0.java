package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class q0 extends l {

    /* renamed from: d  reason: collision with root package name */
    SVGLength f9685d;

    /* renamed from: e  reason: collision with root package name */
    SVGLength f9686e;

    /* renamed from: f  reason: collision with root package name */
    private String f9687f;

    /* renamed from: g  reason: collision with root package name */
    l0 f9688g;

    /* renamed from: h  reason: collision with root package name */
    private f0 f9689h;
    private ArrayList<SVGLength> i;
    private ArrayList<SVGLength> j;
    private ArrayList<SVGLength> k;
    private ArrayList<SVGLength> l;
    private ArrayList<SVGLength> m;
    double n;

    public q0(ReactContext reactContext) {
        super(reactContext);
        this.f9685d = null;
        this.f9686e = null;
        this.f9687f = null;
        this.f9688g = l0.spacing;
        this.n = Double.NaN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public double a(Paint paint) {
        if (!Double.isNaN(this.n)) {
            return this.n;
        }
        double d2 = 0.0d;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof q0) {
                d2 += ((q0) childAt).a(paint);
            }
        }
        this.n = d2;
        return d2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path a(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        d();
        ((VirtualView) this).mPath = super.getPath(canvas, paint);
        c();
        return ((VirtualView) this).mPath;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l
    public Path a(Canvas canvas, Paint paint, Region.Op op) {
        return getPath(canvas, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.VirtualView
    public void clearCache() {
        this.n = Double.NaN;
        super.clearCache();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l
    public void d() {
        b().a(!(this instanceof e0) && !(this instanceof d0), this, this.f9639b, this.i, this.j, this.l, this.m, this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f2) {
        a(canvas);
        clip(canvas, paint);
        a(canvas, paint);
        d();
        a(canvas, paint, f2);
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0 e() {
        f0 f0Var;
        if (this.f9689h == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof q0) && (f0Var = ((q0) parent).f9689h) != null) {
                    this.f9689h = f0Var;
                    return f0Var;
                }
            }
        }
        if (this.f9689h == null) {
            this.f9689h = f0.baseline;
        }
        return this.f9689h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String f() {
        String str;
        if (this.f9687f == null) {
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof q0) && (str = ((q0) parent).f9687f) != null) {
                    this.f9687f = str;
                    return str;
                }
            }
        }
        return this.f9687f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0 g() {
        ArrayList<h> arrayList = b().f9617a;
        ViewParent parent = getParent();
        ViewParent viewParent = parent;
        q0 q0Var = this;
        for (int size = arrayList.size() - 1; size >= 0 && (viewParent instanceof q0) && arrayList.get(size).j != j0.start && q0Var.i == null; size--) {
            q0Var = (q0) viewParent;
            viewParent = q0Var.getParent();
        }
        return q0Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = ((VirtualView) this).mPath;
        if (path != null) {
            return path;
        }
        a(canvas);
        return a(canvas, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0 h() {
        ViewParent parent = getParent();
        q0 q0Var = this;
        while (parent instanceof q0) {
            q0Var = (q0) parent;
            parent = q0Var.getParent();
        }
        return q0Var;
    }

    @Override // com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        if (((VirtualView) this).mPath == null) {
            return;
        }
        super.invalidate();
        h().clearChildCache();
    }

    @com.facebook.react.uimanager.e1.a(name = "baselineShift")
    public void setBaselineShift(Dynamic dynamic) {
        this.f9687f = SVGLength.c(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "dx")
    public void setDeltaX(Dynamic dynamic) {
        this.l = SVGLength.a(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "dy")
    public void setDeltaY(Dynamic dynamic) {
        this.m = SVGLength.a(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "inlineSize")
    public void setInlineSize(Dynamic dynamic) {
        this.f9685d = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "lengthAdjust")
    public void setLengthAdjust(String str) {
        this.f9688g = l0.valueOf(str);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "alignmentBaseline")
    public void setMethod(String str) {
        this.f9689h = f0.a(str);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "x")
    public void setPositionX(Dynamic dynamic) {
        this.i = SVGLength.a(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "y")
    public void setPositionY(Dynamic dynamic) {
        this.j = SVGLength.a(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "rotate")
    public void setRotate(Dynamic dynamic) {
        this.k = SVGLength.a(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "textLength")
    public void setTextLength(Dynamic dynamic) {
        this.f9686e = SVGLength.b(dynamic);
        invalidate();
    }

    @com.facebook.react.uimanager.e1.a(name = "verticalAlign")
    public void setVerticalAlign(String str) {
        if (str != null) {
            String trim = str.trim();
            int lastIndexOf = trim.lastIndexOf(32);
            try {
                this.f9689h = f0.a(trim.substring(lastIndexOf));
            } catch (IllegalArgumentException unused) {
                this.f9689h = f0.baseline;
            }
            try {
                this.f9687f = trim.substring(0, lastIndexOf);
            } catch (IndexOutOfBoundsException unused2) {
            }
            invalidate();
        }
        this.f9689h = f0.baseline;
        this.f9687f = null;
        invalidate();
    }
}
