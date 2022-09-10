package defpackage;

import android.view.MotionEvent;
/* compiled from: PG */
/* renamed from: amnb  reason: default package */
/* loaded from: classes.dex */
public final class amnb extends alis implements aliy {
    private static final double g = Math.log(2.0d);
    public final btrm a;
    public alix b;
    public boolean c;
    private final float e;
    private volatile boolean f;
    private final amqw h;
    private final ammx i;
    @dzsi
    private volatile akug j;
    private float k;
    private float l;
    private float m;
    private boolean n;
    private boolean o;
    private boolean p;
    private int q = 1;
    public final aljk d = new aljk();

    public amnb(cqat cqatVar, btrm btrmVar, ammx ammxVar, float f) {
        this.a = btrmVar;
        this.i = ammxVar;
        this.h = new amqw(cqatVar, btrmVar);
        this.e = Math.round(f * 20.0f);
    }

    private final boolean A() {
        if (!this.p) {
            if (!this.c) {
                return false;
            }
            if (!this.o && !this.n) {
                return false;
            }
        }
        return true;
    }

    private final boolean B() {
        return this.c || this.d.k;
    }

    private final boolean C(aljd aljdVar) {
        alix alixVar = this.b;
        if (alixVar == null) {
            return false;
        }
        float f = aljdVar.b;
        float f2 = aljdVar.c;
        float f3 = aljdVar.d;
        int f4 = alixVar.f();
        float g2 = this.b.g() / 2;
        double signum = (f - f3) * Math.signum(f2 - g2);
        Double.isNaN(signum);
        return z((float) ((signum * 3.141592653589793d) / 256.0d), f4 / 2, g2);
    }

    private final boolean x(float f) {
        if (this.d.f) {
            float f2 = -f;
            this.i.s(f2);
            if (f2 > 0.0f) {
                this.h.a(deaf.TWO_FINGER_DRAG, dead.UP);
                return true;
            }
            this.h.a(deaf.TWO_FINGER_DRAG, dead.DOWN);
            return true;
        }
        return false;
    }

    private final boolean y(boolean z, float f, float f2, float f3) {
        float r;
        if (!z || !this.n) {
            alix alixVar = this.b;
            if (alixVar == null) {
                return false;
            }
            alae alaeVar = this.i.b.n;
            alixVar.f();
            alaeVar.b();
            this.b.g();
            alaeVar.c();
            if (z) {
                if (this.d.d) {
                    float w = this.i.w(-1.0f);
                    this.h.b(deaf.PINCH_CLOSED);
                    this.b.h(w, true);
                }
            } else if (this.d.b) {
                float log = (float) (Math.log(f) / g);
                if (this.n && f > 0.999f && f < 1.001001f) {
                    log = 0.0f;
                }
                if (A() || this.d.j) {
                    r = this.i.r(log);
                } else {
                    r = this.i.q(log, f2, f3);
                }
                if (log > 0.0f) {
                    this.h.b(deaf.PINCH_OPEN);
                } else if (log < 0.0f) {
                    this.h.b(deaf.PINCH_CLOSED);
                }
                this.b.h(r, !this.n);
            }
            return true;
        }
        return true;
    }

    private final boolean z(float f, float f2, float f3) {
        if (this.d.g) {
            if (A()) {
                this.i.t(f);
            } else {
                this.i.u(f2, f3, f);
            }
            this.h.b(deaf.ROLL);
            return true;
        }
        return false;
    }

    @Override // defpackage.alis, defpackage.alir
    public final boolean a(MotionEvent motionEvent) {
        alix alixVar = this.b;
        if (alixVar != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            amna amnaVar = (amna) alixVar;
            alja aljaVar = amnaVar.d;
            if (aljaVar != null) {
                akqg.b(amnaVar.i(x, y));
                aljaVar.c(amnaVar.c);
            }
        }
        return false;
    }

    @Override // defpackage.alis, defpackage.alir
    public final boolean b(MotionEvent motionEvent) {
        alix alixVar = this.b;
        if (alixVar != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            amna amnaVar = (amna) alixVar;
            alja aljaVar = amnaVar.d;
            if (aljaVar != null) {
                akqg.b(amnaVar.i(x, y));
                aljaVar.g(amnaVar.c);
            }
        }
        return false;
    }

    @Override // defpackage.alis, defpackage.alir
    public final void c(MotionEvent motionEvent) {
        alix alixVar;
        if (this.q != 1 || !this.d.h || (alixVar = this.b) == null) {
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        amna amnaVar = (amna) alixVar;
        alja aljaVar = amnaVar.d;
        if (aljaVar == null) {
            return;
        }
        aljaVar.b(amnaVar.e, akqg.b(amnaVar.i(x, y)), amnaVar.c);
    }

    @Override // defpackage.alis, defpackage.alir
    public final void d() {
        amna amnaVar;
        alja aljaVar;
        alix alixVar = this.b;
        if (alixVar == null || (aljaVar = (amnaVar = (amna) alixVar).d) == null) {
            return;
        }
        aljaVar.e(alje.LAST_FINGER_UP, amnaVar.c);
    }

    @Override // defpackage.alis, defpackage.alir
    public final void e() {
        amna amnaVar;
        alja aljaVar;
        this.i.o();
        alix alixVar = this.b;
        if (alixVar == null || (aljaVar = (amnaVar = (amna) alixVar).d) == null) {
            return;
        }
        aljaVar.e(alje.FIRST_FINGER_DOWN, amnaVar.c);
    }

    @Override // defpackage.alis, defpackage.alir
    public final void g(float f, float f2) {
        amna amnaVar;
        alja aljaVar;
        if (!A() && this.d.a) {
            this.i.g(f, f2);
            this.h.b(deaf.DRAG);
            alix alixVar = this.b;
            if (alixVar == null || (aljaVar = (amnaVar = (amna) alixVar).d) == null) {
                return;
            }
            amnaVar.a.getParent().requestDisallowInterceptTouchEvent(true);
            aljaVar.d(amnaVar.c);
        }
    }

    @Override // defpackage.alis, defpackage.alir
    public final void i() {
    }

    @Override // defpackage.alis, defpackage.alir
    public final void j() {
        amna amnaVar;
        alja aljaVar;
        alix alixVar = this.b;
        if (alixVar == null || (aljaVar = (amnaVar = (amna) alixVar).d) == null) {
            return;
        }
        aljaVar.e(alje.LAST_FINGER_UP, amnaVar.c);
    }

    @Override // defpackage.aliy
    public final boolean k(aljd aljdVar, boolean z) {
        return y(z, aljdVar.a(), aljdVar.b, aljdVar.c);
    }

    @Override // defpackage.aliy
    public final boolean l(aljd aljdVar, boolean z) {
        this.n = true;
        return y(z, aljdVar.a(), aljdVar.b, aljdVar.c);
    }

    @Override // defpackage.aliy
    public final void m(aljd aljdVar, boolean z) {
        this.n = false;
        y(z, aljdVar.a(), aljdVar.b, aljdVar.c);
    }

    @Override // defpackage.aliy
    public final boolean n(aljd aljdVar) {
        return x(aljdVar.b());
    }

    @Override // defpackage.aliy
    public final boolean o(aljd aljdVar) {
        if (this.d.f) {
            this.p = true;
        }
        return x(aljdVar.b());
    }

    @Override // defpackage.alis, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.q = 2;
        this.k = motionEvent.getX();
        this.l = motionEvent.getY();
        return false;
    }

    @Override // defpackage.alis, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        float x;
        float y;
        float v;
        boolean z = false;
        if (this.q == 1) {
            return false;
        }
        this.i.p();
        int action = motionEvent.getAction();
        if (action == 1) {
            if (this.q != 3) {
                if (this.d.c && this.b != null) {
                    if (B()) {
                        alae alaeVar = this.i.b.n;
                        x = this.b.f() * alaeVar.b();
                        y = this.b.g() * alaeVar.c();
                    } else {
                        x = motionEvent.getX();
                        y = motionEvent.getY();
                    }
                    if (B()) {
                        v = this.i.w(1.0f);
                    } else {
                        v = this.i.v(x, y);
                    }
                    this.h.b(deaf.DOUBLE_TAP);
                    alix alixVar = this.b;
                    if (alixVar != null) {
                        alixVar.h(v, true);
                    }
                    z = true;
                }
                action = 1;
                if (action != 1 || action == 3) {
                    this.q = 1;
                }
                return z;
            }
            action = 1;
        }
        int action2 = motionEvent.getAction();
        if (this.b != null) {
            if (this.q == 2 && Math.round(Math.abs(this.l - motionEvent.getY())) > this.e) {
                this.q = 3;
                this.m = motionEvent.getY();
            }
            if (this.q == 3) {
                if (action2 != 2) {
                    if (action2 == 1) {
                        action2 = 1;
                    }
                }
                if (this.d.e) {
                    float y2 = motionEvent.getY() - this.m;
                    float r = this.i.r(-((y2 / (-this.b.g())) * 4.0f));
                    if (action2 == 1) {
                        z = true;
                    }
                    if (z) {
                        r += this.i.n();
                    }
                    if (y2 > 0.0f) {
                        this.h.b(deaf.PINCH_OPEN);
                    } else if (y2 < 0.0f) {
                        this.h.b(deaf.PINCH_CLOSED);
                    }
                    this.b.h(r, z);
                    this.m = motionEvent.getY();
                    z = true;
                }
            }
        }
        if (action != 1) {
        }
        this.q = 1;
        return z;
    }

    @Override // defpackage.alis, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        alix alixVar;
        if (!this.d.i || (alixVar = this.b) == null) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        amna amnaVar = (amna) alixVar;
        alja aljaVar = amnaVar.d;
        if (aljaVar == null) {
            return true;
        }
        aljaVar.a(amnaVar.e, akqg.b(amnaVar.i(x, y)), amnaVar.c);
        return true;
    }

    @Override // defpackage.aliy
    public final void p(aljd aljdVar) {
        x(aljdVar.b());
        this.p = false;
    }

    @Override // defpackage.aliy
    public final boolean q(aljd aljdVar) {
        return z(aljdVar.c(), aljdVar.b, aljdVar.c);
    }

    @Override // defpackage.aliy
    public final boolean r(aljd aljdVar) {
        if (this.d.g) {
            this.o = true;
        }
        return z(aljdVar.c(), aljdVar.b, aljdVar.c);
    }

    @Override // defpackage.aliy
    public final void s(aljd aljdVar) {
        z(aljdVar.c(), aljdVar.b, aljdVar.c);
        this.o = false;
    }

    @Override // defpackage.aliy
    public final boolean t(aljd aljdVar) {
        return C(aljdVar);
    }

    @Override // defpackage.aliy
    public final void u(aljd aljdVar) {
        C(aljdVar);
    }

    @Override // defpackage.aliy
    public final boolean v(aljd aljdVar) {
        return C(aljdVar);
    }

    @Override // defpackage.aliy
    public final void w(aljg aljgVar) {
        if (this.b == null) {
            return;
        }
        akse akseVar = aljgVar.a;
        float[] fArr = {akseVar.b, akseVar.c, aljgVar.b, aljgVar.c};
        int i = this.q;
        if (i == 3) {
            float f = fArr[1];
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = (f / this.b.g()) * 4.0f;
        } else {
            fArr[0] = -fArr[0];
            fArr[1] = -fArr[1];
        }
        if (A()) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        } else if (!this.d.a && (fArr[0] != 0.0f || fArr[1] != 0.0f)) {
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
        if (fArr[2] != 0.0f) {
            if (i == 3) {
                if (!this.d.e) {
                    fArr[2] = 0.0f;
                }
            } else if (!this.d.b) {
                fArr[2] = 0.0f;
            }
        }
        if (!this.d.g && fArr[3] != 0.0f) {
            fArr[3] = 0.0f;
        }
        this.i.m(fArr);
    }
}
