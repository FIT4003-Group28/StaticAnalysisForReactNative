package defpackage;

import android.animation.AnimatorSet;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: hpi  reason: default package */
/* loaded from: classes3.dex */
public final class hpi implements View.OnTouchListener, zph, hpx {
    public final hwq a;
    public final ajxz b;
    public final hoi c;
    public final htj d;
    public final hvy e;
    public View f;
    public ImageView g;
    public View h;
    public View i;
    public dp j;
    public AnimatorSet k;
    public hpg l;
    public zqw m;
    public zmy n;
    public hph o;
    public acti q;
    private final Handler r;
    private final htu s;
    private Runnable u;
    public boolean p = false;
    private boolean t = false;

    public hpi(hwq hwqVar, ajxz ajxzVar, Handler handler, htj htjVar, hvy hvyVar, htu htuVar, hoi hoiVar) {
        this.a = hwqVar;
        this.b = ajxzVar;
        this.r = handler;
        this.d = htjVar;
        this.e = hvyVar;
        this.s = htuVar;
        this.c = hoiVar;
    }

    @Override // defpackage.hpx
    public final View a() {
        return this.f;
    }

    @Override // defpackage.hpx
    public final void b() {
    }

    @Override // defpackage.hpx
    public final void c() {
    }

    @Override // defpackage.zph
    public final void d(final axaj axajVar) {
        final hvm hvmVar;
        awzs awzsVar;
        this.s.a();
        final htj htjVar = this.d;
        axbk i = axajVar.c().i();
        int i2 = i.c;
        if (i2 == 1) {
            if (!htjVar.i) {
                return;
            }
            hvmVar = htjVar.b;
            awzsVar = ((axca) i.d).g;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        } else if (i2 == 3) {
            hvmVar = htjVar.c;
            awzsVar = ((axba) i.d).c;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        } else if (i2 == 6) {
            hvmVar = htjVar.e;
            awzsVar = ((awzu) i.d).c;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        } else if (i2 == 7) {
            hvmVar = htjVar.d;
            awzsVar = ((axcg) i.d).c;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        } else if (i2 == 2) {
            hvmVar = htjVar.f;
            awzsVar = null;
        } else if (i2 == 4) {
            hvmVar = htjVar.g;
            awzsVar = ((awzy) i.d).c;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        } else if (i2 != 12) {
            return;
        } else {
            hvmVar = htjVar.h;
            awzsVar = ((axac) i.d).c;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        }
        htjVar.a.post(new Runnable() { // from class: htg
            @Override // java.lang.Runnable
            public final void run() {
                htj htjVar2 = htj.this;
                hvm hvmVar2 = hvmVar;
                axaj axajVar2 = axajVar;
                if (!hqs.i(htjVar2.j)) {
                    return;
                }
                hvmVar2.a(axajVar2);
            }
        });
        if (awzsVar != null) {
            String str = "";
            if ((awzsVar.b == 1 ? (String) awzsVar.c : str).isEmpty()) {
                return;
            }
            if (awzsVar.b == 1) {
                str = (String) awzsVar.c;
            }
            htjVar.b(str);
        }
    }

    @Override // defpackage.zph
    public final void e(axbd axbdVar) {
    }

    @Override // defpackage.zph
    public final void f(final axbm axbmVar) {
        final hvm hvmVar;
        awzs awzsVar;
        this.s.a();
        final htj htjVar = this.d;
        axbk i = axbmVar.i();
        int i2 = i.c;
        if (i2 == 1) {
            if (!htjVar.i) {
                return;
            }
            hvmVar = htjVar.b;
            awzsVar = ((axca) i.d).g;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        } else if (i2 == 3) {
            hvmVar = htjVar.c;
            awzsVar = ((axba) i.d).c;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        } else if (i2 == 6) {
            hvmVar = htjVar.e;
            awzsVar = ((awzu) i.d).c;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        } else if (i2 == 7) {
            hvmVar = htjVar.d;
            awzsVar = ((axcg) i.d).c;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        } else if (i2 == 2) {
            hvmVar = htjVar.f;
            awzsVar = null;
        } else if (i2 == 4) {
            hvmVar = htjVar.g;
            awzsVar = ((awzy) i.d).c;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        } else if (i2 != 12) {
            return;
        } else {
            hvmVar = htjVar.h;
            awzsVar = ((axac) i.d).c;
            if (awzsVar == null) {
                awzsVar = awzs.a;
            }
        }
        htjVar.a.post(new Runnable() { // from class: hth
            @Override // java.lang.Runnable
            public final void run() {
                htj htjVar2 = htj.this;
                hvm hvmVar2 = hvmVar;
                axbm axbmVar2 = axbmVar;
                if (!hqs.i(htjVar2.j)) {
                    return;
                }
                hvmVar2.mt(axbmVar2);
            }
        });
        if (awzsVar != null) {
            String str = "";
            if ((awzsVar.b == 1 ? (String) awzsVar.c : str).isEmpty()) {
                return;
            }
            if (awzsVar.b == 1) {
                str = (String) awzsVar.c;
            }
            htjVar.b(str);
        }
    }

    @Override // defpackage.zph
    public final void g(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        this.g.post(new hpe(this, z, 1));
    }

    @Override // defpackage.zph
    public final void h(final boolean z, final boolean z2) {
        if (z) {
            this.s.a();
            this.o.a = true;
        }
        this.g.post(new Runnable() { // from class: hpf
            @Override // java.lang.Runnable
            public final void run() {
                hpi hpiVar = hpi.this;
                boolean z3 = z;
                boolean z4 = z2;
                if (!hqs.i(hpiVar.j)) {
                    return;
                }
                hpg hpgVar = hpiVar.l;
                if (z3) {
                    ((hnu) hpgVar).aY();
                } else {
                    ((hnu) hpgVar).be();
                }
                if (hpiVar.p == z4) {
                    return;
                }
                hpiVar.p = z4;
                hpiVar.k = hqb.b(hpiVar, z4, hpiVar.k);
            }
        });
    }

    @Override // defpackage.zph
    public final void m(boolean z) {
        Runnable runnable = this.u;
        if (runnable != null) {
            this.r.removeCallbacks(runnable);
        }
        hpe hpeVar = new hpe(this, z);
        this.u = hpeVar;
        this.r.postDelayed(hpeVar, 300L);
    }

    @Override // defpackage.zph
    public final void n(boolean z) {
        this.r.post(new hpe(this, z, 2));
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        avyk avykVar = this.a.a.a().s;
        if (avykVar == null) {
            avykVar = avyk.a;
        }
        if (avykVar.f) {
            this.n.onTouch(view, motionEvent);
        }
        zqv q = this.m.q();
        if (q == null || !this.l.bo()) {
            return view.onTouchEvent(motionEvent);
        }
        q.a.a(view, motionEvent, this.f, false);
        return true;
    }
}
