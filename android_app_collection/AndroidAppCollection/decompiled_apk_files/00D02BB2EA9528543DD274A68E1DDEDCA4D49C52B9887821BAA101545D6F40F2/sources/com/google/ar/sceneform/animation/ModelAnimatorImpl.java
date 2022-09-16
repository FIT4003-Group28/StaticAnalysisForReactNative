package com.google.ar.sceneform.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ModelAnimatorImpl extends dbei implements dbdf {
    public dbdj a;
    private WeakReference<dbef> c;
    private WeakReference<dbgt> d;
    private TimeInterpolator e;
    private long f;
    private long g;
    private long h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private long m;
    private long n;
    private int o;
    private float p;
    private float q;
    private float r;
    private float s;
    private long t;

    public ModelAnimatorImpl(ModelAnimatorImpl modelAnimatorImpl) {
        this.c = new WeakReference<>(null);
        this.d = new WeakReference<>(null);
        this.e = null;
        this.f = 0L;
        this.g = 0L;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.n = -1L;
        this.o = 0;
        this.t = 0L;
        this.a = null;
        this.c = new WeakReference<>(modelAnimatorImpl.c.get());
        this.d = new WeakReference<>(modelAnimatorImpl.d.get());
        this.e = modelAnimatorImpl.e;
        this.f = modelAnimatorImpl.f;
        this.g = modelAnimatorImpl.g;
        this.h = modelAnimatorImpl.h;
        this.o = modelAnimatorImpl.o;
        this.l = false;
        this.k = false;
        this.m = -1L;
        if (dbdg.a) {
            this.t = createAnimatorNative();
            AnimationEngine.a().a.a(this, new dbdl(this.t));
        }
    }

    private final void A(boolean z) {
        if (this.t != 0) {
            ModelSkeletonRig modelSkeletonRig = (ModelSkeletonRig) s();
            ModelAnimationData y = y();
            if (modelSkeletonRig == null || y == null) {
                return;
            }
            setLoopingNative(this.t, y.a, modelSkeletonRig.a, z);
        }
    }

    private final int B() {
        if (this.o == -1) {
            return -1;
        }
        return Math.max((int) this.p, 0);
    }

    private native long createAnimatorNative();

    public static native void destroyAnimatorNative(long j);

    private native void endAnimationNative(long j, long j2, long j3);

    private native void playAnimationNative(long j, long j2, long j3);

    private native void setLoopingNative(long j, long j2, long j3, boolean z);

    private native void setPlaybackRateNative(long j, long j2, float f);

    private final float t(float f) {
        int B = B();
        if (f < 0.0f) {
            return 0.0f;
        }
        return B == -1 ? f : Math.min(f, B + 1);
    }

    private final void u() {
        boolean z = true;
        this.i = true;
        x();
        if (this.t != 0) {
            ModelSkeletonRig modelSkeletonRig = (ModelSkeletonRig) s();
            ModelAnimationData y = y();
            if (modelSkeletonRig == null || y == null) {
                return;
            }
            if (this.o == 0) {
                z = false;
            }
            A(z);
            playAnimationNative(this.t, y.a, modelSkeletonRig.a);
        }
    }

    private final void v() {
        ArrayList<Animator.AnimatorListener> listeners;
        if (this.j && !this.i) {
            x();
        }
        w();
        dbdj dbdjVar = this.a;
        if (dbdjVar == null || (listeners = dbdjVar.getListeners()) == null) {
            return;
        }
        int size = listeners.size();
        for (int i = 0; i < size; i++) {
            Animator.AnimatorListener animatorListener = listeners.get(i);
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(dbdjVar);
            }
        }
    }

    private final void w() {
        AnimationEngine.a().c(c());
        this.j = false;
        this.i = false;
        this.l = false;
        this.k = false;
        this.n = -1L;
    }

    private final void x() {
        ArrayList<Animator.AnimatorListener> listeners;
        dbdj dbdjVar = this.a;
        if (dbdjVar == null || (listeners = dbdjVar.getListeners()) == null) {
            return;
        }
        int size = listeners.size();
        for (int i = 0; i < size; i++) {
            Animator.AnimatorListener animatorListener = listeners.get(i);
            if (animatorListener != null) {
                animatorListener.onAnimationStart(dbdjVar);
            }
        }
    }

    private final ModelAnimationData y() {
        dbef dbefVar = this.c.get();
        if (!dbdg.a) {
            throw new IllegalStateException("Native library called, but native library not found.");
        }
        if (dbefVar == null || (dbefVar instanceof ModelAnimationData)) {
            return (ModelAnimationData) dbefVar;
        }
        String name = dbefVar.getClass().getName();
        String name2 = ModelAnimationData.class.getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 17 + String.valueOf(name2).length());
        sb.append("Cannot cast ");
        sb.append(name);
        sb.append(" to  ");
        sb.append(name2);
        throw new IllegalStateException(sb.toString());
    }

    private final void z(float f) {
        ModelSkeletonRig modelSkeletonRig;
        if (this.t == 0 || (modelSkeletonRig = (ModelSkeletonRig) s()) == null) {
            return;
        }
        setPlaybackRateNative(this.t, modelSkeletonRig.a, f);
    }

    @Override // defpackage.dbdf
    public final void a(long j) {
        long j2 = this.n;
        if (j2 < 0) {
            j2 = this.h + j;
            this.n = j2;
        }
        if (this.l) {
            this.m = j;
            AnimationEngine.a().c(c());
            z(0.0f);
            return;
        }
        if (this.k) {
            this.k = false;
            long j3 = this.m;
            if (j3 > 0) {
                j2 += j - j3;
                this.n = j2;
            }
        }
        if (!this.i) {
            if (j2 > j) {
                return;
            }
            u();
        }
        float max = Math.max((float) (j - this.n), 0.0f);
        long j4 = this.f;
        if (j4 == 0) {
            this.q = max;
            this.s = max;
            z(Float.MAX_VALUE);
            return;
        }
        float max2 = Math.max(max / ((float) j4), this.p);
        this.q = max2;
        if (this.e != null) {
            float floor = (float) Math.floor(max2);
            max2 = Math.max(this.e.getInterpolation(max2 - floor) + floor, 0.0f);
            int B = B();
            if (B != -1) {
                max2 = Math.min(max2, B + 1);
            }
        }
        float max3 = Math.max(max2, this.r);
        this.s = max3;
        z((max3 - this.r) * ((float) this.g));
    }

    @Override // defpackage.dbei
    public final dbgt c() {
        return this.d.get();
    }

    @Override // defpackage.dbei
    public final long d() {
        return this.f;
    }

    @Override // defpackage.dbei
    public final long e() {
        if (this.o == -1) {
            return -1L;
        }
        return this.h + this.f;
    }

    @Override // defpackage.dbei
    public final int f() {
        return this.o;
    }

    @Override // defpackage.dbei
    public final long g() {
        return this.h;
    }

    @Override // defpackage.dbei
    public final boolean h() {
        return this.i;
    }

    @Override // defpackage.dbei
    public final boolean i() {
        return this.j;
    }

    @Override // defpackage.dbei
    public final void j(int i) {
        this.o = i;
        A(i != 0);
    }

    @Override // defpackage.dbei
    public final void l(TimeInterpolator timeInterpolator) {
        this.e = timeInterpolator;
    }

    @Override // defpackage.dbei
    public final void m(long j) {
        this.h = j;
    }

    @Override // defpackage.dbei
    public final void n() {
        if (!this.j) {
            this.j = true;
            this.l = false;
            this.i = false;
            this.n = -1L;
            this.p = 0.0f;
            this.r = 0.0f;
            if (this.h == 0) {
                u();
            }
            AnimationEngine.a().b(c(), this);
            return;
        }
        throw new IllegalStateException("Cannot call start while isStarted() is true.");
    }

    @Override // defpackage.dbei
    public final void o() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.m = -1L;
        this.k = false;
    }

    @Override // defpackage.dbei
    public final void p() {
        if (this.k || !this.l) {
            return;
        }
        this.k = true;
        this.l = false;
        if (this.m <= 0) {
            return;
        }
        AnimationEngine.a().b(c(), this);
    }

    @Override // defpackage.dbei
    public final void q() {
        if (!this.j) {
            return;
        }
        v();
        if (this.t == 0) {
            return;
        }
        ModelSkeletonRig modelSkeletonRig = (ModelSkeletonRig) s();
        ModelAnimationData y = y();
        if (modelSkeletonRig == null || y == null) {
            return;
        }
        endAnimationNative(this.t, y.a, modelSkeletonRig.a);
    }

    @Override // defpackage.dbei
    public final void r() {
        ArrayList<Animator.AnimatorListener> listeners;
        if (!this.j) {
            return;
        }
        w();
        dbdj dbdjVar = this.a;
        if (dbdjVar != null && (listeners = dbdjVar.getListeners()) != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                Animator.AnimatorListener animatorListener = listeners.get(i);
                if (animatorListener != null) {
                    animatorListener.onAnimationCancel(dbdjVar);
                }
            }
        }
        z(0.0f);
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.c.get());
        String valueOf2 = String.valueOf(this.d.get());
        boolean z = this.j;
        boolean z2 = this.i;
        boolean z3 = this.l;
        boolean z4 = this.k;
        long j = this.n;
        long j2 = this.f;
        int length = String.valueOf(obj).length();
        StringBuilder sb = new StringBuilder(length + 168 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append(obj);
        sb.append(", animationData=");
        sb.append(valueOf);
        sb.append(", target=");
        sb.append(valueOf2);
        sb.append(", isStarted=");
        sb.append(z);
        sb.append(", isRunning=");
        sb.append(z2);
        sb.append(", isPaused=");
        sb.append(z3);
        sb.append(", isResumed=");
        sb.append(z4);
        sb.append(", startTimeMs=");
        sb.append(j);
        sb.append(", effectiveDurationMs=");
        sb.append(j2);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    @Override // defpackage.dbdf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r9 = this;
            boolean r0 = r9.i
            if (r0 == 0) goto L6b
            boolean r0 = r9.l
            if (r0 == 0) goto L9
            goto L6b
        L9:
            float r0 = r9.q
            int r0 = (int) r0
            float r1 = r9.p
            int r1 = (int) r1
            int r2 = r9.B()
            float r3 = r9.s
            float r3 = r9.t(r3)
            r9.r = r3
            float r3 = r9.q
            float r3 = r9.t(r3)
            r9.p = r3
            float r4 = (float) r2
            r5 = -1
            r6 = 1
            r7 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L30
            if (r2 == r5) goto L2f
            r4 = 1
            goto L31
        L2f:
            r2 = -1
        L30:
            r4 = 0
        L31:
            int r8 = r2 + 1
            float r8 = (float) r8
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L3b
            if (r2 == r5) goto L3b
            goto L3c
        L3b:
            r6 = 0
        L3c:
            if (r0 <= r1) goto L66
            if (r6 != 0) goto L68
            dbdj r0 = r9.a
            if (r0 != 0) goto L45
            goto L60
        L45:
            java.util.ArrayList r1 = r0.getListeners()
            if (r1 == 0) goto L60
            int r2 = r1.size()
            r3 = 0
        L50:
            if (r3 >= r2) goto L60
            java.lang.Object r5 = r1.get(r3)
            android.animation.Animator$AnimatorListener r5 = (android.animation.Animator.AnimatorListener) r5
            if (r5 == 0) goto L5d
            r5.onAnimationRepeat(r0)
        L5d:
            int r3 = r3 + 1
            goto L50
        L60:
            if (r4 == 0) goto L6b
            r9.A(r7)
            return
        L66:
            if (r6 == 0) goto L6b
        L68:
            r9.v()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.sceneform.animation.ModelAnimatorImpl.b():void");
    }

    @Override // defpackage.dbei
    public final void k(long j) {
        if (!this.j) {
            if (j >= 0) {
                this.f = j;
                return;
            }
            throw new IllegalArgumentException("setDuration() may not be negative");
        }
        throw new IllegalStateException("setDuration() is not allowed on started ModelAnimator");
    }

    public ModelAnimatorImpl(dbef dbefVar, dbgt dbgtVar) {
        this.c = new WeakReference<>(null);
        this.d = new WeakReference<>(null);
        this.e = null;
        this.f = 0L;
        this.g = 0L;
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.n = -1L;
        this.o = 0;
        this.t = 0L;
        this.c = new WeakReference<>(dbefVar);
        this.d = new WeakReference<>(dbgtVar);
        long b = dbefVar.b();
        this.f = b;
        this.g = b;
        if (dbdg.a) {
            this.t = createAnimatorNative();
            AnimationEngine.a().a.a(this, new dbdl(this.t));
        }
    }
}
