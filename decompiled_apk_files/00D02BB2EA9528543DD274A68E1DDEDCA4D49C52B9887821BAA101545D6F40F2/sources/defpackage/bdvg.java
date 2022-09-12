package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bdvg  reason: default package */
/* loaded from: classes3.dex */
public final class bdvg extends aljc {
    private final bdve b;
    private final Callable<ImageView> c;
    private final Callable<Boolean> d;
    private final int e;
    private final int f;
    private ObjectAnimator h;
    private float j;
    private float k;
    private final bdvf g = new bdvf();
    private ImageView i = null;
    private Float l = null;
    private boolean m = false;
    private final RectF n = new RectF();
    private final RectF o = new RectF();
    private final RectF p = new RectF();
    public boolean a = false;
    private boolean q = false;

    public bdvg(Callable<ImageView> callable, int i, int i2, Callable<Boolean> callable2, bdve bdveVar) {
        this.b = bdveVar;
        this.c = callable;
        this.e = i;
        this.f = i2;
        this.d = callable2;
    }

    private final void A() {
        if (this.i == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.set(this.i.getImageMatrix());
        this.i.getImageMatrix().mapRect(this.p, this.o);
        if (this.p.width() >= this.n.width() || this.p.height() >= this.n.height()) {
            if (this.p.left > this.n.left) {
                matrix.postTranslate(this.n.left - this.p.left, 0.0f);
            }
            if (this.p.right < this.n.right) {
                matrix.postTranslate(this.n.right - this.p.right, 0.0f);
            }
            if (this.p.height() < this.n.height()) {
                matrix.postTranslate(0.0f, ((this.n.top + this.n.bottom) / 2.0f) - ((this.p.top + this.p.bottom) / 2.0f));
            }
            if (this.p.height() > this.n.height()) {
                if (this.p.top > this.n.top) {
                    matrix.postTranslate(0.0f, this.n.top - this.p.top);
                }
                if (this.p.bottom < this.n.bottom) {
                    matrix.postTranslate(0.0f, this.n.bottom - this.p.bottom);
                }
            }
        } else {
            matrix.setRectToRect(this.o, this.n, Matrix.ScaleToFit.CENTER);
        }
        ImageView imageView = this.i;
        ObjectAnimator ofObject = ObjectAnimator.ofObject(imageView, "imageMatrix", this.g, imageView.getImageMatrix(), matrix);
        this.h = ofObject;
        ofObject.setDuration(this.f);
        this.h.setInterpolator(irf.a);
        this.h.start();
        this.i = null;
    }

    private final boolean x() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.h.cancel();
        }
        try {
            this.i = this.c.call();
        } catch (Exception unused) {
            this.i = null;
        }
        ImageView imageView = this.i;
        if (imageView != null && imageView.isShown()) {
            Drawable drawable = this.i.getDrawable();
            if (drawable == null) {
                return false;
            }
            Rect bounds = drawable.getBounds();
            if (bounds.width() <= 0 || bounds.height() <= 0) {
                return false;
            }
            this.n.set(0.0f, 0.0f, this.i.getWidth(), this.i.getHeight());
            this.o.set(0.0f, 0.0f, bounds.width(), bounds.height());
        }
        return this.i != null;
    }

    private final void y(float f, float f2, float f3) {
        this.i.setImageMatrix(z(f, f2, f3));
    }

    private final Matrix z(float f, float f2, float f3) {
        float f4;
        float width;
        float width2;
        Matrix matrix = new Matrix();
        matrix.set(this.i.getImageMatrix());
        matrix.postScale(f, f, f2, f3);
        matrix.mapRect(this.p, this.o);
        if (this.p.width() <= this.n.width() * 0.75f) {
            width = this.n.width() * 0.75f;
            width2 = this.p.width();
        } else if (this.p.width() >= this.o.width() * 5.0f) {
            width = this.o.width() * 5.0f;
            width2 = this.p.width();
        } else {
            f4 = 1.0f;
            matrix.postScale(f4, f4, f2, f3);
            return matrix;
        }
        f4 = width / width2;
        matrix.postScale(f4, f4, f2, f3);
        return matrix;
    }

    @Override // defpackage.alis, defpackage.alir
    public final void j() {
        if (this.a || !this.q) {
            return;
        }
        this.q = false;
        this.b.d();
        A();
    }

    @Override // defpackage.aljc, defpackage.aliy
    public final boolean k(aljd aljdVar, boolean z) {
        if (this.i != null) {
            float a = aljdVar.a();
            float f = aljdVar.b;
            this.j = f;
            float f2 = aljdVar.c;
            this.k = f2;
            y(a, f, f2);
            return true;
        }
        return true;
    }

    @Override // defpackage.aljc, defpackage.aliy
    public final boolean l(aljd aljdVar, boolean z) {
        if (x()) {
            this.a = true;
            this.i.setScaleType(ImageView.ScaleType.MATRIX);
            return true;
        }
        return false;
    }

    @Override // defpackage.aljc, defpackage.aliy
    public final void m(aljd aljdVar, boolean z) {
        A();
        this.a = false;
    }

    @Override // defpackage.alis, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (x()) {
            this.m = true;
            this.j = motionEvent.getX();
            this.k = motionEvent.getY();
            this.i.setScaleType(ImageView.ScaleType.MATRIX);
            return true;
        }
        return false;
    }

    @Override // defpackage.alis, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (!this.m || this.i == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 2) {
            if (this.l == null) {
                if (Math.round(Math.abs(this.k - motionEvent.getY())) > this.e) {
                    this.l = Float.valueOf(motionEvent.getY());
                }
            } else {
                y((((motionEvent.getY() - this.l.floatValue()) / this.i.getHeight()) * 4.0f) + 1.0f, this.j, this.k);
                this.l = Float.valueOf(motionEvent.getY());
            }
        } else if (action == 1) {
            if (this.l == null) {
                float f = this.j;
                float f2 = this.k;
                if (this.i != null) {
                    Matrix matrix = new Matrix();
                    matrix.set(this.i.getImageMatrix());
                    this.i.getImageMatrix().mapRect(this.p, this.o);
                    if (this.p.width() < this.n.width() + this.e) {
                        matrix = z(5.0f, f, f2);
                    } else {
                        matrix.setRectToRect(this.o, this.n, Matrix.ScaleToFit.CENTER);
                    }
                    ImageView imageView = this.i;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(imageView, "imageMatrix", this.g, imageView.getImageMatrix(), matrix);
                    this.h = ofObject;
                    ofObject.setDuration(this.f);
                    this.h.setInterpolator(irf.a);
                    this.h.start();
                }
            } else {
                A();
            }
            this.l = null;
            this.m = false;
        }
        return true;
    }

    @Override // defpackage.alis, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        try {
            return this.d.call().booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    @Override // defpackage.alis, defpackage.alir
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(float r8, float r9) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdvg.g(float, float):void");
    }
}
