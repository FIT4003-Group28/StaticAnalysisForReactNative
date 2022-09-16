package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.opengl.GLES20;
import android.view.WindowManager;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: amyd  reason: default package */
/* loaded from: classes.dex */
public final class amyd extends bnur implements bnst, btph {
    public static final /* synthetic */ int n = 0;
    private static final dcqe r = dcqe.c("amyd");
    private static final float[] w = {0.93f, 0.93f, 0.93f, 1.0f};
    private boolean A;
    private final Runnable B;
    private final dbty<Boolean> C;
    public final bntd a;
    public amyc b;
    public final bvnx c;
    public bnss d;
    public final amqu e;
    public volatile boolean f;
    public final btrm g;
    public alur h;
    public final bntf i;
    public final int j;
    public final ckcw k;
    public final dbty<Boolean> l;
    public final amya m;
    private final List<amyb> s;
    private final cqat t;
    private final alyx u;
    private long v;
    private final cjvm x;
    private final Executor y;
    private boolean z;

    public amyd(Resources resources, Context context, cqat cqatVar, bvnx bvnxVar, bntd bntdVar, alyx alyxVar, cjvm cjvmVar, amqu amquVar, Executor executor, btrm btrmVar, ckcw ckcwVar, final dxio<dwwr> dxioVar) {
        super(resources.getDisplayMetrics().widthPixels, resources.getDisplayMetrics().heightPixels);
        float refreshRate;
        this.s = dchl.a();
        this.z = false;
        this.f = false;
        this.A = true;
        this.m = new amya(this);
        this.C = dbud.a(new dbty(dxioVar) { // from class: amxt
            private final dxio a;

            {
                this.a = dxioVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dxio dxioVar2 = this.a;
                int i = amyd.n;
                return Boolean.valueOf(((dwwr) dxioVar2.a()).z);
            }
        });
        this.l = dbud.a(new dbty(dxioVar) { // from class: amxu
            private final dxio a;

            {
                this.a = dxioVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                dxio dxioVar2 = this.a;
                int i = amyd.n;
                return Boolean.valueOf(((dwwr) dxioVar2.a()).A);
            }
        });
        this.t = cqatVar;
        this.c = bvnxVar;
        this.a = bntdVar;
        Runnable runnable = new Runnable(this) { // from class: amxv
            private final amyd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                amyd amydVar = this.a;
                if (amydVar.l()) {
                    bnss bnssVar = amydVar.d;
                    if (bnssVar == null) {
                        return;
                    }
                    bnssVar.b();
                    return;
                }
                alur alurVar = amydVar.h;
                if (alurVar == null) {
                    return;
                }
                alurVar.a();
            }
        };
        this.B = runnable;
        if (bntdVar != null) {
            bntdVar.p(runnable);
        }
        this.u = alyxVar;
        this.x = cjvmVar;
        this.e = amquVar;
        this.y = executor;
        this.g = btrmVar;
        if (context instanceof Activity) {
            refreshRate = ((Activity) context).getWindowManager().getDefaultDisplay().getRefreshRate();
        } else {
            refreshRate = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
        }
        this.j = (int) refreshRate;
        this.k = ckcwVar;
        this.i = new bntf(new Runnable(this) { // from class: amxw
            private final amyd a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                amyd amydVar = this.a;
                if (amydVar.l()) {
                    bnss bnssVar = amydVar.d;
                    if (bnssVar == null) {
                        return;
                    }
                    bnssVar.b();
                    return;
                }
                alur alurVar = amydVar.h;
                if (alurVar == null) {
                    return;
                }
                alurVar.b();
            }
        });
        float[] fArr = w;
        m(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    private static void p(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            bvoo.h("GL error set on entry to %s, error=%d", str, Integer.valueOf(glGetError));
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void a(amyb amybVar) {
        synchronized (this.s) {
            if (this.s.contains(amybVar)) {
                return;
            }
            this.s.add(amybVar);
        }
    }

    public final void b(amyb amybVar) {
        synchronized (this.s) {
            this.s.remove(amybVar);
        }
    }

    @Override // defpackage.bnst
    public final void d() {
        p("onSurfaceCreated");
        if (this.z) {
            amyc amycVar = this.b;
            if (amycVar != null) {
                amycVar.Pw();
            }
            synchronized (this.s) {
                for (amyb amybVar : this.s) {
                    amybVar.Pw();
                }
            }
        }
        this.z = true;
        this.a.m();
    }

    @Override // defpackage.bnst
    public final void e(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        p("onSurfaceChanged");
        this.o = bnuw.c(i, i2);
        this.a.n();
    }

    @Override // defpackage.bnst
    public final boolean f() {
        if (!this.f) {
            this.f = true;
        }
        dbsk.s(this.h);
        cjvm cjvmVar = this.x;
        boolean i = this.h.i();
        long k = this.h.k();
        if (cjvmVar.t == 1) {
            if (i) {
                if (k == 30) {
                    cjvmVar.l.b();
                } else if (k == 60) {
                    cjvmVar.m.b();
                }
            }
            cjvmVar.l.a();
            cjvmVar.m.a();
        }
        cjvmVar.f = cjvmVar.b.e();
        cjvmVar.k.a();
        for (cjvl cjvlVar : cjvmVar.o) {
            cjvlVar.a();
        }
        this.h.g();
        if (!this.u.c()) {
            alyx alyxVar = this.u;
            amxz amxzVar = new amxz(this);
            synchronized (alyxVar.a) {
                if (alyxVar.b) {
                    amxzVar.a();
                } else {
                    alyxVar.a.add(amxzVar);
                }
            }
            amyc amycVar = this.b;
            if (amycVar != null) {
                amycVar.A();
            }
            this.a.o().J(this.p, n(), o());
            this.a.o().b();
            return true;
        }
        amyc amycVar2 = this.b;
        if (amycVar2 != null) {
            amycVar2.z();
        }
        try {
            this.a.b();
        } catch (bnvm e) {
            long e2 = this.t.e();
            long j = this.v;
            if (j == 0 || e2 >= 10000 + j) {
                this.v = e2;
                bvoo.k(e);
                bnss bnssVar = this.d;
                if (bnssVar != null) {
                    bnssVar.f();
                }
            } else {
                StringBuilder sb = new StringBuilder(57);
                sb.append("GL context is unusable again after ");
                sb.append(e2 - j);
                sb.append("ms");
                throw new bnvm(sb.toString(), e);
            }
        }
        this.i.c(n(), o());
        return true;
    }

    @Override // defpackage.bnst
    public final void g() {
    }

    @Override // defpackage.bnst
    public final void h() {
        cjvm cjvmVar = this.x;
        cjvmVar.g = cjvmVar.b.e() - cjvmVar.f;
        cjvmVar.a[cjvmVar.e] = cjvmVar.g;
        int i = cjvmVar.e + 1;
        if (i >= 100) {
            cjvmVar.e = 0;
            cjvmVar.d = true;
        } else {
            cjvmVar.e = i;
        }
        cjvmVar.k.b();
        long j = cjvmVar.g;
        if (j <= 16) {
            cjvmVar.r++;
        }
        if (j <= 33) {
            cjvmVar.q++;
        }
        if (j > 50) {
            cjvmVar.s++;
        }
        cjvmVar.p++;
        int min = Math.min(99, (int) j);
        if (min >= 0 && min < 100) {
            int[] iArr = cjvmVar.c;
            iArr[min] = iArr[min] + 1;
            cjvmVar.j++;
        }
        cjvmVar.h += cjvmVar.g;
        cjvmVar.i++;
        final amqu amquVar = this.e;
        int identityHashCode = System.identityHashCode(this);
        Map<Integer, amqs> map = amquVar.f;
        Integer valueOf = Integer.valueOf(identityHashCode);
        amqs amqsVar = map.get(valueOf);
        if (amqsVar != null) {
            amqq amqqVar = amquVar.i.get(valueOf);
            if (amqqVar != null) {
                long e = amquVar.b.e();
                long j2 = amqsVar.g;
                float k = amqsVar.a.k();
                akra akraVar = amqsVar.c;
                boolean z = (akraVar == null || akraVar.compareTo(amqsVar.a.g()) == 0) ? false : true;
                boolean z2 = (amqsVar.c == null || amqsVar.d == amqsVar.a.k()) ? false : true;
                boolean z3 = (amqsVar.c == null || amqsVar.e == amqsVar.a.p().m) ? false : true;
                boolean z4 = (amqsVar.c == null || amqsVar.f == amqsVar.a.p().l) ? false : true;
                int i2 = (int) (e - j2);
                if (amqqVar.d != 0) {
                    amqqVar.i = Math.max(amqqVar.i, i2);
                }
                amqqVar.d++;
                if (i2 <= amqqVar.b) {
                    amqqVar.e++;
                }
                if (i2 <= amqqVar.c) {
                    amqqVar.f++;
                }
                amqqVar.j += k;
                amqqVar.k |= z;
                amqqVar.l |= z2;
                amqqVar.m |= z3;
                amqqVar.n = z4 | amqqVar.n;
            }
            long e2 = amquVar.b.e();
            amqsVar.c = amqsVar.a.g();
            amqsVar.d = amqsVar.a.k();
            amqsVar.e = amqsVar.a.p().m;
            amqsVar.f = amqsVar.a.p().l;
            amqsVar.g = e2;
        }
        amqs amqsVar2 = amquVar.f.get(valueOf);
        if (amqsVar2 != null) {
            int i3 = amqsVar2.a.a & 4;
            int i4 = amqsVar2.h;
            if (i4 != 2 && i3 != 0) {
                amqsVar2.h = 2;
                if (amquVar.i.containsKey(valueOf)) {
                    bvoo.h("Basemap performance measurement has already been started for rendererId %d - it should be stopped first.", valueOf);
                }
                amqs amqsVar3 = amquVar.f.get(valueOf);
                if (amqsVar3 != null) {
                    amquVar.i.put(valueOf, new amqq(amquVar.b.e(), amqsVar3.b));
                }
            } else if (i4 == 2 && i3 == 0) {
                amqsVar2.h = 3;
                final amqq remove = amquVar.i.remove(valueOf);
                if (remove != null) {
                    remove.h = amquVar.b.e();
                    if (remove.d() != 1) {
                        amquVar.e.b(new Runnable(amquVar, remove) { // from class: amqr
                            private final amqu a;
                            private final amqq b;

                            {
                                this.a = amquVar;
                                this.b = remove;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                ckfo ckfoVar;
                                ckfp ckfpVar;
                                amqu amquVar2 = this.a;
                                amqq amqqVar2 = this.b;
                                gfq gfqVar = amquVar2.g;
                                if (gfqVar == null) {
                                    ckfoVar = ckfo.UNTRACKED_FRAGMENT;
                                } else {
                                    fd d = gfqVar.d();
                                    if (d == null) {
                                        ckfoVar = ckfo.HOME_FRAGMENT_NAME;
                                    } else if (!(d instanceof ges) || ((ges) d).p() != dtyb.aM) {
                                        ckfoVar = ckfo.UNTRACKED_FRAGMENT;
                                    } else {
                                        ckfoVar = ckfo.SEARCH_LIST_FRAGMENT;
                                    }
                                }
                                int d2 = amqqVar2.d() - 1;
                                if (d2 == 1) {
                                    ckfpVar = ckfoVar.d;
                                } else if (d2 != 2) {
                                    ckfpVar = d2 != 3 ? null : ckfoVar.f;
                                } else {
                                    ckfpVar = ckfoVar.e;
                                }
                                if (ckfpVar == null) {
                                    return;
                                }
                                ((ckco) amquVar2.c.a(ckfpVar.a)).a(amqqVar2.b());
                                ((ckco) amquVar2.c.a(ckfpVar.b)).a(amqqVar2.c());
                                ((ckco) amquVar2.c.a(ckfpVar.c)).a((Math.min(Math.round((amqqVar2.e * 1000.0f) / amqqVar2.a()), amqqVar2.a) * 100) / amqqVar2.a);
                                ((ckco) amquVar2.c.a(ckfpVar.d)).a((Math.min(Math.round((amqqVar2.f * 1000.0f) / amqqVar2.a()), amqqVar2.a) * 100) / amqqVar2.a);
                                ((ckco) amquVar2.c.a(ckfpVar.e)).a(amqqVar2.i);
                                ((ckco) amquVar2.c.a(ckfpVar.f)).a(ckfq.a(amqqVar2.c(), Math.round(amqqVar2.j / amqqVar2.d)));
                            }
                        }, bvrj.UI_THREAD);
                    }
                }
            }
        }
        alur alurVar = this.h;
        dbsk.s(alurVar);
        alurVar.h();
        if (this.A) {
            this.A = false;
            this.y.execute(new Runnable(this) { // from class: amxx
                private final amyd a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bnss bnssVar = this.a.d;
                    dbsk.s(bnssVar);
                    bnssVar.setTransparent(false);
                }
            });
        }
    }

    public final void i(int i) {
        m(Color.red(i) / 255.0f, Color.green(i) / 255.0f, Color.blue(i) / 255.0f, Color.alpha(i) / 255.0f);
    }

    public final void j(boolean z) {
        this.q = z;
        this.i.a(z);
    }

    public final void k(boolean z) {
        dbsk.s(this.h);
        if (z) {
            if (l()) {
                bnss bnssVar = this.d;
                dbsk.s(bnssVar);
                bnssVar.d();
                j(true);
                return;
            }
            this.h.e();
        } else if (l()) {
            bnss bnssVar2 = this.d;
            dbsk.s(bnssVar2);
            bnssVar2.c();
            j(false);
        } else {
            this.h.d();
        }
    }

    public final boolean l() {
        return this.C.a().booleanValue();
    }
}
