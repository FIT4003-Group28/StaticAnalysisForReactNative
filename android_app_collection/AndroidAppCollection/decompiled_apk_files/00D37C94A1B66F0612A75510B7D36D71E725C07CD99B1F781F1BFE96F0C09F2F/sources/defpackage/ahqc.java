package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
/* compiled from: PG */
/* renamed from: ahqc  reason: default package */
/* loaded from: classes.dex */
public final class ahqc extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, ScaleGestureDetector.OnScaleGestureListener {
    public ahpy a;
    private View c;
    private final GestureDetector d;
    private final ScaleGestureDetector f;
    private boolean e = false;
    private boolean g = false;
    public boolean b = false;

    public ahqc(Context context) {
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.d = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f = new ScaleGestureDetector(context, this);
    }

    private static final void a(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (this.a != null) {
            a(this.c, true);
            ahpy ahpyVar = this.a;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            this.c.getWidth();
            this.c.getHeight();
            ahjr ahjrVar = ((ahqb) ahpyVar).a.l;
            if (ahjrVar == null) {
                return false;
            }
            ahjrVar.b.g(x, y);
            return false;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        boolean z = true;
        a(this.c, true);
        this.e = false;
        ahpy ahpyVar = this.a;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        ahjr ahjrVar = ((ahqb) ahpyVar).a.l;
        if (ahjrVar != null) {
            ahmk ahmkVar = ahjrVar.b;
            if (!ahmkVar.c) {
                ahmkVar.c();
            }
            float pow = (float) Math.pow(scaleFactor, 1.2000000476837158d);
            float f = ahmkVar.f / pow;
            if (f <= 0.69816f) {
                ahmkVar.f = pow * 0.69815f;
                f = 0.69815f;
            } else if (f >= 2.35617f) {
                ahmkVar.f = pow * 2.35618f;
                f = 2.35618f;
            } else {
                float f2 = ahmkVar.e;
                if ((f2 < 1.74533f && f >= 1.74533f) || (f2 > 1.74533f && f <= 1.74533f)) {
                    ahmkVar.f(ahmkVar.p);
                    ahmkVar.b = true;
                }
            }
            ahmkVar.e = f;
            ahmkVar.r = ahmkVar.r || (ahmkVar.g < f && f < 2.1816635f) || (f > 0.8726665f && f < ahmkVar.h);
            if (!ahmkVar.b || Math.abs(f - 1.74533f) >= 0.2094395f) {
                z = false;
            }
            ahmkVar.b = z;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.g = true;
        ahjr ahjrVar = ((ahqb) this.a).a.l;
        if (ahjrVar != null) {
            ahjrVar.b.c();
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ahjr ahjrVar = ((ahqb) this.a).a.l;
        if (ahjrVar != null) {
            ahmk ahmkVar = ahjrVar.b;
            if (ahmkVar.b && Math.abs(ahmkVar.e - 1.74533f) < 0.2094395f) {
                ahmkVar.e = 1.74533f;
            }
            float f = ahmkVar.e;
            boolean z = true;
            if (f > 0.78541f && f < 2.26892f) {
                z = false;
            }
            ahmkVar.j = z;
            ahmkVar.o = ahmkVar.a.a() + 100000008;
            ahmkVar.c = false;
        }
        this.g = false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ahpy ahpyVar = this.a;
        if (ahpyVar != null) {
            this.e = true;
            int x = (int) motionEvent2.getX();
            int y = (int) motionEvent2.getY();
            int width = this.c.getWidth();
            int height = this.c.getHeight();
            ahjr ahjrVar = ((ahqb) ahpyVar).a.l;
            if (ahjrVar != null) {
                ahmk ahmkVar = ahjrVar.b;
                if (!ahmkVar.k || Math.abs(ahmkVar.l - x) > 100 || Math.abs(ahmkVar.m - y) > 100) {
                    ahmkVar.g(x, y);
                }
                ahmkVar.e(x, y, width, height);
            }
            return true;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.c = view;
        boolean z = true;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.e) {
                this.e = false;
                ahpy ahpyVar = this.a;
                if (ahpyVar != null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    int width = view.getWidth();
                    int height = view.getHeight();
                    ahjr ahjrVar = ((ahqb) ahpyVar).a.l;
                    if (ahjrVar != null) {
                        ahmk ahmkVar = ahjrVar.b;
                        if (Math.abs(ahmkVar.l - x) < 100 && Math.abs(ahmkVar.m - y) < 100) {
                            ahmkVar.e(x, y, width, height);
                        }
                        if (ahmkVar.E > 0) {
                            float f = 0.0f;
                            if (!ahmkVar.d || ahmkVar.n >= 500) {
                                float f2 = 0.0f;
                                for (int i = 0; i < 5; i++) {
                                    f += ahmkVar.C[i];
                                    f2 += ahmkVar.D[i];
                                }
                                float f3 = ahmkVar.E;
                                ahmkVar.y = f / f3;
                                ahmkVar.z = f2 / f3;
                            }
                        }
                        long a = ahmkVar.a.a();
                        ahmkVar.B = a;
                        ahmkVar.A = a;
                        if (ahmkVar.d) {
                            ahmkVar.o = a;
                        }
                        ahmkVar.k = false;
                        ahmkVar.d = false;
                    }
                }
            } else {
                z = false;
            }
            a(this.c, false);
            return z;
        }
        if (this.b) {
            this.f.onTouchEvent(motionEvent);
        }
        if (!this.g) {
            this.d.onTouchEvent(motionEvent);
        }
        return this.g || this.e;
    }
}
