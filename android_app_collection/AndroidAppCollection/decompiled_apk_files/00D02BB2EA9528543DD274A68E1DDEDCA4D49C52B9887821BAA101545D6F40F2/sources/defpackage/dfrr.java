package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
/* compiled from: PG */
/* renamed from: dfrr  reason: default package */
/* loaded from: classes6.dex */
public class dfrr implements dfuf {
    public static final dfrn b = new dfrn();
    protected static final LinearInterpolator c = new LinearInterpolator();
    private final dfuh a;
    public final dhjw d;
    public dhjx e;
    @dzsi
    protected Animator f;
    protected final Context g;
    private final Iterable<dfro> h;

    public dfrr(Context context, dfuh dfuhVar, Iterable<dfro> iterable) {
        dbsk.s(context);
        this.h = iterable;
        this.a = dfuhVar;
        this.g = context;
        dhjw bZ = dhjx.f.bZ();
        this.d = bZ;
        this.e = bZ.bK();
    }

    private final void a(dhjx dhjxVar) {
        for (dfro dfroVar : this.h) {
            dfroVar.a(dhjxVar);
        }
    }

    public void d(int i, int i2) {
        synchronized (this.d) {
            dhjw dhjwVar = this.d;
            dhkd dhkdVar = ((dhjx) dhjwVar.b).d;
            if (dhkdVar == null) {
                dhkdVar = dhkd.d;
            }
            dsqp dsqpVar = (dsqp) dhkdVar.cu(5);
            dsqpVar.bC(dhkdVar);
            dhkc dhkcVar = (dhkc) dsqpVar;
            if (dhkcVar.c) {
                dhkcVar.bF();
                dhkcVar.c = false;
            }
            dhkd dhkdVar2 = (dhkd) dhkcVar.b;
            int i3 = dhkdVar2.a | 1;
            dhkdVar2.a = i3;
            dhkdVar2.b = i;
            dhkdVar2.a = i3 | 2;
            dhkdVar2.c = i2;
            if (dhjwVar.c) {
                dhjwVar.bF();
                dhjwVar.c = false;
            }
            dhjx dhjxVar = (dhjx) dhjwVar.b;
            dhkd bK = dhkcVar.bK();
            bK.getClass();
            dhjxVar.d = bK;
            dhjxVar.a |= 4;
            this.e = this.d.bK();
        }
    }

    public void e(float f, float f2, float f3) {
        dhjx bK;
        dhkb dhkbVar = ((dhjx) this.d.b).c;
        if (dhkbVar == null) {
            dhkbVar = dhkb.e;
        }
        dsqp dsqpVar = (dsqp) dhkbVar.cu(5);
        dsqpVar.bC(dhkbVar);
        dhka dhkaVar = (dhka) dsqpVar;
        float e = dfug.e(f);
        if (dhkaVar.c) {
            dhkaVar.bF();
            dhkaVar.c = false;
        }
        dhkb dhkbVar2 = (dhkb) dhkaVar.b;
        dhkbVar2.a |= 1;
        dhkbVar2.b = e;
        float d = dfug.d(f2, 0.0f, 180.0f);
        if (dhkaVar.c) {
            dhkaVar.bF();
            dhkaVar.c = false;
        }
        dhkb dhkbVar3 = (dhkb) dhkaVar.b;
        dhkbVar3.a |= 2;
        dhkbVar3.c = d;
        float e2 = dfug.e(f3);
        if (dhkaVar.c) {
            dhkaVar.bF();
            dhkaVar.c = false;
        }
        dhkb dhkbVar4 = (dhkb) dhkaVar.b;
        dhkbVar4.a |= 4;
        dhkbVar4.d = e2;
        synchronized (this.d) {
            dhjw dhjwVar = this.d;
            if (dhjwVar.c) {
                dhjwVar.bF();
                dhjwVar.c = false;
            }
            dhjx dhjxVar = (dhjx) dhjwVar.b;
            dhkb bK2 = dhkaVar.bK();
            bK2.getClass();
            dhjxVar.c = bK2;
            dhjxVar.a |= 2;
            bK = this.d.bK();
            this.e = bK;
        }
        a(bK);
        this.a.a();
    }

    public void f(float f) {
        dhjx bK;
        float d = dfug.d(f, 15.0f, 90.0f);
        synchronized (this.d) {
            dhjw dhjwVar = this.d;
            if (dhjwVar.c) {
                dhjwVar.bF();
                dhjwVar.c = false;
            }
            dhjx dhjxVar = (dhjx) dhjwVar.b;
            dhjx dhjxVar2 = dhjx.f;
            dhjxVar.a |= 8;
            dhjxVar.e = d;
            bK = this.d.bK();
            this.e = bK;
        }
        a(bK);
        this.a.a();
    }

    public final synchronized void g(float f, float f2) {
        dfrp dfrpVar = new dfrp(this, this.e, dfug.d(f, -3500.0f, 3500.0f), dfug.d(f2, -3500.0f, 3500.0f));
        ValueAnimator ofObject = ValueAnimator.ofObject(dfrpVar, Float.valueOf(0.0f), Float.valueOf(1.0f));
        this.f = ofObject;
        ofObject.setDuration(dfrpVar.a.getDuration());
        this.f.setInterpolator(c);
        this.f.start();
    }

    public final synchronized void h(float f) {
        float f2 = ((dhjx) this.d.b).e;
        if (f2 > 15.0f && f2 < 90.0f) {
            dfrq dfrqVar = new dfrq(this, this.e, f);
            ValueAnimator ofObject = ValueAnimator.ofObject(dfrqVar, Float.valueOf(0.0f), Float.valueOf(1.0f));
            this.f = ofObject;
            ofObject.setDuration(dfrqVar.a.getDuration());
            this.f.setInterpolator(c);
            this.f.start();
        }
    }

    public final void i(float f, float f2) {
        e(f, f2, 0.0f);
    }

    public final void j() {
        Animator animator = this.f;
        if (animator != null) {
            animator.cancel();
            this.f = null;
        }
    }

    public final boolean k() {
        Animator animator = this.f;
        return animator != null && animator.isRunning();
    }

    public void setCamera(@dzsi dhjx dhjxVar) {
        if (dhjxVar == null) {
            return;
        }
        synchronized (this.d) {
            if ((dhjxVar.a & 1) != 0) {
                dhjw dhjwVar = this.d;
                dhjz dhjzVar = dhjxVar.b;
                if (dhjzVar == null) {
                    dhjzVar = dhjz.e;
                }
                if (dhjwVar.c) {
                    dhjwVar.bF();
                    dhjwVar.c = false;
                }
                dhjx dhjxVar2 = (dhjx) dhjwVar.b;
                dhjzVar.getClass();
                dhjxVar2.b = dhjzVar;
                dhjxVar2.a |= 1;
            }
            if ((dhjxVar.a & 2) != 0) {
                dhjw dhjwVar2 = this.d;
                dhkb dhkbVar = dhjxVar.c;
                if (dhkbVar == null) {
                    dhkbVar = dhkb.e;
                }
                if (dhjwVar2.c) {
                    dhjwVar2.bF();
                    dhjwVar2.c = false;
                }
                dhjx dhjxVar3 = (dhjx) dhjwVar2.b;
                dhkbVar.getClass();
                dhjxVar3.c = dhkbVar;
                dhjxVar3.a |= 2;
            }
            if ((dhjxVar.a & 8) != 0) {
                dhjw dhjwVar3 = this.d;
                float f = dhjxVar.e;
                if (dhjwVar3.c) {
                    dhjwVar3.bF();
                    dhjwVar3.c = false;
                }
                dhjx dhjxVar4 = (dhjx) dhjwVar3.b;
                dhjxVar4.a |= 8;
                dhjxVar4.e = f;
            }
            this.e = this.d.bK();
        }
        this.a.a();
    }
}
