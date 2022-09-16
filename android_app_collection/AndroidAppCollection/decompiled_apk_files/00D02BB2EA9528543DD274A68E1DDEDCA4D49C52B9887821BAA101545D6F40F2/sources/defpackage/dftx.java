package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
/* compiled from: PG */
/* renamed from: dftx  reason: default package */
/* loaded from: classes6.dex */
public final class dftx extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    @dzsi
    public dftw a;
    private final dfrr b;
    private final dfqu c;
    private float d;
    private long e;
    private MotionEvent f;
    private float g;
    private int h = 1;

    public dftx(dfrr dfrrVar, dfqu dfquVar) {
        this.b = dfrrVar;
        this.c = dfquVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.h = 2;
        this.f = motionEvent;
        this.g = motionEvent.getY();
        dftw dftwVar = this.a;
        if (dftwVar != null) {
            dftwVar.b();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r5 == 3) goto L20;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDoubleTapEvent(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            android.view.MotionEvent r1 = r0.f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            int r1 = r17.getActionMasked()
            if (r1 != r3) goto L3c
            int r1 = r0.h
            if (r1 != r2) goto L37
            dfqu r1 = r0.c
            if (r1 == 0) goto L37
            dfra r15 = new dfra
            java.util.concurrent.Executor r5 = r1.h
            java.util.concurrent.Executor r6 = r1.i
            dfua r7 = r1.j
            dfuk r8 = r1.a
            dfuh r9 = r1.b
            dfrr r10 = r1.d
            dfrh r11 = r1.c
            dfum r12 = r1.e
            java.util.List<dfqz> r13 = r1.f
            dfqt r14 = r1.g
            r4 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 6
            r4 = r17
            r15.f(r4, r1)
            goto L39
        L37:
            r4 = r17
        L39:
            r0.h = r3
            goto L3e
        L3c:
            r4 = r17
        L3e:
            android.view.MotionEvent r1 = r0.f
            if (r1 == 0) goto L99
            int r1 = r17.getActionMasked()
            if (r1 != r2) goto L99
            float r1 = r17.getY()
            float r5 = r0.g
            float r1 = r1 - r5
            int r5 = r0.h
            r6 = 3
            if (r5 != r2) goto L72
            android.view.MotionEvent r2 = r0.f
            float r2 = r2.getY()
            float r5 = r17.getY()
            float r2 = r2 - r5
            float r2 = java.lang.Math.abs(r2)
            int r2 = java.lang.Math.round(r2)
            float r2 = (float) r2
            r5 = 1101004800(0x41a00000, float:20.0)
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L71
            r0.h = r6
            goto L74
        L71:
            return r3
        L72:
            if (r5 != r6) goto L93
        L74:
            dfrr r2 = r0.b
            dhjx r2 = r2.e
            dhkd r5 = r2.d
            if (r5 != 0) goto L7e
            dhkd r5 = defpackage.dhkd.d
        L7e:
            int r5 = r5.c
            dfrr r6 = r0.b
            float r2 = r2.e
            int r5 = -r5
            float r5 = (float) r5
            float r1 = r1 / r5
            r5 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r5
            float r2 = r2 * r1
            r6.f(r2)
        L93:
            float r1 = r17.getY()
            r0.g = r1
        L99:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dftx.onDoubleTapEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.b.j();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.b.k()) {
            this.b.g(f, f2);
            dftw dftwVar = this.a;
            if (dftwVar == null) {
                return true;
            }
            dftwVar.e();
            return true;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.d = scaleGestureDetector.getScaleFactor();
        this.e = scaleGestureDetector.getTimeDelta();
        dhjx dhjxVar = this.b.e;
        float f = dhjxVar.e / this.d;
        if (f > 15.0f && f < 90.0f) {
            float focusX = scaleGestureDetector.getFocusX();
            dhkd dhkdVar = dhjxVar.d;
            if (dhkdVar == null) {
                dhkdVar = dhkd.d;
            }
            float f2 = dhkdVar.b / dhkdVar.c;
            float a = dfug.a(dhjxVar.e, f2);
            float a2 = dfug.a(f, f2);
            float f3 = focusX - (dhkdVar.b / 2.0f);
            dhkb dhkbVar = dhjxVar.c;
            if (dhkbVar == null) {
                dhkbVar = dhkb.e;
            }
            float f4 = dhkbVar.b;
            float f5 = f3 / dhkdVar.b;
            float f6 = (f4 + (a * f5)) - (f5 * a2);
            float focusY = scaleGestureDetector.getFocusY();
            dhkd dhkdVar2 = dhjxVar.d;
            if (dhkdVar2 == null) {
                dhkdVar2 = dhkd.d;
            }
            float f7 = focusY - (dhkdVar2.c / 2.0f);
            dhkb dhkbVar2 = dhjxVar.c;
            if (dhkbVar2 == null) {
                dhkbVar2 = dhkb.e;
            }
            float f8 = dhkbVar2.c;
            float f9 = f7 / dhkdVar2.c;
            float f10 = (f8 - (dhjxVar.e * f9)) + (f9 * f);
            dfrr dfrrVar = this.b;
            dhkb dhkbVar3 = dhjxVar.c;
            if (dhkbVar3 == null) {
                dhkbVar3 = dhkb.e;
            }
            dfrrVar.e(f6, f10, dhkbVar3.d);
        }
        this.b.f(f);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return !this.b.k();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.b.h((1.0f - this.d) / (((float) this.e) / 1000.0f));
        dftw dftwVar = this.a;
        if (dftwVar != null) {
            dftwVar.d();
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        dfrr dfrrVar = this.b;
        dhjx dhjxVar = dfrrVar.e;
        if (dfrrVar.k() || (dhjxVar.a & 4) == 0) {
            return true;
        }
        float f3 = dhjxVar.e;
        dhkd dhkdVar = dhjxVar.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        float f4 = f3 / dhkdVar.c;
        float f5 = (-f) * f4;
        float f6 = (-f2) * f4;
        dfrr dfrrVar2 = this.b;
        dhkb dhkbVar = dhjxVar.c;
        if (dhkbVar == null) {
            dhkbVar = dhkb.e;
        }
        float f7 = dhkbVar.b - f5;
        dhkb dhkbVar2 = dhjxVar.c;
        if (dhkbVar2 == null) {
            dhkbVar2 = dhkb.e;
        }
        float f8 = dhkbVar2.c + f6;
        dhkb dhkbVar3 = dhjxVar.c;
        if (dhkbVar3 == null) {
            dhkbVar3 = dhkb.e;
        }
        dfrrVar2.e(f7, f8, dhkbVar3.d);
        dftw dftwVar = this.a;
        if (dftwVar == null) {
            return true;
        }
        dftwVar.c();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        dfqu dfquVar = this.c;
        if (dfquVar != null) {
            boolean f = new dfra(dfquVar.h, dfquVar.i, dfquVar.j, dfquVar.a, dfquVar.b, dfquVar.d, dfquVar.c, dfquVar.e, dfquVar.f, dfquVar.g).f(motionEvent, true != dfquVar.k ? 1 : 7);
            dftw dftwVar = this.a;
            if (dftwVar != null) {
                dftwVar.a(f, motionEvent);
            }
        }
        return true;
    }
}
