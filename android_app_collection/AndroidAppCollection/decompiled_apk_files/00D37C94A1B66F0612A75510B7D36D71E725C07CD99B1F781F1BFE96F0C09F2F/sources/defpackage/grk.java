package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: grk  reason: default package */
/* loaded from: classes3.dex */
public final class grk extends ne implements grd {
    private static final SimpleDateFormat G = new SimpleDateFormat("m:ss.S", Locale.getDefault());
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    public final int A;
    public final Runnable B;
    public ajbv F;
    private final gri H;
    private final azqb I;
    public final azqb e;
    public final azqb f;
    public final azqb g;
    public final Executor h;
    public final Handler i;
    public String j;
    public String k;
    public grw o;
    public TextView p;
    public grv q;
    public gre r;
    public grl s;
    public int w;
    public int x;
    public long b = 5000;
    public long c = 60000;
    public long d = 30000;
    public String l = "";
    public String m = "";
    public String n = "";
    public float t = 0.0f;
    public float u = 1.0f;
    public String v = null;
    public boolean y = false;
    public boolean z = false;
    public boolean D = false;
    public boolean E = true;

    /* renamed from: J  reason: collision with root package name */
    private boolean f207J = false;
    public final LinearInterpolator C = new LinearInterpolator();

    public grk(Context context, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, Executor executor, Handler handler) {
        this.x = 0;
        this.e = azqbVar;
        this.f = azqbVar2;
        this.g = azqbVar3;
        this.I = azqbVar4;
        this.h = executor;
        this.i = handler;
        int i = zew.i(context.getResources().getDisplayMetrics(), 120);
        this.A = i;
        this.x = i;
        this.H = new gri(this);
        this.B = new grf(this, 1);
    }

    public static String e(long j) {
        return String.format(Locale.getDefault(), "%1$d.%2$d", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j)), Long.valueOf((j % 1000) / 100));
    }

    private final void v() {
        ((airr) this.f.get()).b();
        ((ahyp) this.I.get()).l(ControlsOverlayStyle.a);
    }

    private final void w() {
        final grv grvVar = this.q;
        if (grvVar != null) {
            long f = this.F.f() - this.F.h();
            final long g = (this.F.g() - this.F.h()) + (this.d / 2);
            long h = this.f207J ? this.F.h() : 0L;
            grvVar.aG(grvVar.af);
            grvVar.ab = new Runnable() { // from class: gro
                @Override // java.lang.Runnable
                public final void run() {
                    float min;
                    grv grvVar2 = grv.this;
                    long j = g;
                    grt grtVar = (grt) grvVar2.m;
                    if (grtVar.w() <= grvVar2.getMeasuredWidth()) {
                        grvVar2.aK();
                        return;
                    }
                    float max = Math.max(grvVar2.ad ? grtVar.j : 0.0f, ((((float) j) / ((float) grtVar.f)) * grtVar.w()) - (grvVar2.getMeasuredWidth() / 2));
                    if (grvVar2.ad) {
                        min = Math.min(max, (grtVar.w() - grvVar2.getMeasuredWidth()) - grtVar.j);
                    } else {
                        min = Math.min(max, grtVar.w() - grvVar2.getMeasuredWidth());
                    }
                    int computeHorizontalScrollOffset = (int) (min - grvVar2.computeHorizontalScrollOffset());
                    if (computeHorizontalScrollOffset != 0) {
                        grvVar2.aE(grvVar2.ah);
                        grvVar2.scrollBy(computeHorizontalScrollOffset, 0);
                        return;
                    }
                    grvVar2.aK();
                }
            };
            grt grtVar = (grt) grvVar.m;
            long j = grvVar.aa;
            grtVar.g = h;
            grtVar.f = f;
            grtVar.e = grv.a(f, j);
            grtVar.d.h(grtVar);
            grtVar.d.b(grtVar);
            grtVar.mr();
        }
    }

    @Override // defpackage.grd
    public final void a() {
        this.z = false;
        v();
        d().f();
        this.i.removeCallbacks(this.B);
        this.q.ap();
    }

    @Override // defpackage.grd
    public final void b(float f, float f2) {
        this.t = f;
        this.u = f2;
        gri d = d();
        d.e();
        d.g(true);
        d.d();
        this.z = true;
        o();
    }

    public final long c(float f) {
        long aI = this.q.aI();
        long aJ = this.q.aJ();
        ajbv ajbvVar = this.F;
        return (f * ((float) (aJ - aI))) + ((float) aI) + (ajbvVar != null ? ajbvVar.h() : 0L);
    }

    public final gri d() {
        gri griVar = this.H;
        griVar.a.clear();
        griVar.b.clear();
        return this.H;
    }

    public final void f(float f) {
        this.t = f;
        gri d = d();
        d.e();
        d.g(true);
        d.d();
    }

    @Override // defpackage.ne
    public final void i(final RecyclerView recyclerView, int i) {
        if (i == 0) {
            if (this.q != recyclerView) {
                return;
            }
            v();
            d().f();
            this.i.removeCallbacks(this.B);
            this.D = false;
        } else if (i == 1) {
            if (this.q != recyclerView) {
                return;
            }
            this.D = true;
            q();
        } else if (i == 2) {
            if (this.q != recyclerView) {
                return;
            }
            this.D = true;
        } else if (i != 100) {
            if (i != 101 || this.q != recyclerView) {
                return;
            }
            this.D = false;
            this.h.execute(new Runnable() { // from class: grg
                @Override // java.lang.Runnable
                public final void run() {
                    int measuredWidth;
                    grk grkVar = grk.this;
                    RecyclerView recyclerView2 = recyclerView;
                    grv grvVar = grkVar.q;
                    int i2 = 0;
                    if (grvVar.ad) {
                        grt grtVar = (grt) grvVar.m;
                        if (grtVar != null) {
                            i2 = grtVar.j;
                        }
                        measuredWidth = grvVar.getMeasuredWidth() - i2;
                    } else {
                        measuredWidth = grvVar.getMeasuredWidth();
                    }
                    long aH = grvVar.aH(i2, measuredWidth);
                    float f = (float) aH;
                    float f2 = ((float) grkVar.b) / f;
                    float min = ((float) Math.min(grkVar.c, aH)) / f;
                    float aI = (float) grkVar.q.aI();
                    long g = grkVar.F.g() - grkVar.F.h();
                    float max = Math.max((((float) g) - aI) / f, 0.0f);
                    float min2 = Math.min(1.0f, (((float) (g + grkVar.d)) - aI) / f);
                    gre greVar = grkVar.r;
                    greVar.l = 500.0f / f;
                    try {
                        StringBuilder sb = new StringBuilder(29);
                        sb.append("minPercent is ");
                        sb.append(f2);
                        gre.f(f2, sb.toString());
                        StringBuilder sb2 = new StringBuilder(29);
                        sb2.append("maxPercent is ");
                        sb2.append(min);
                        gre.f(min, sb2.toString());
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("startPercent is ");
                        sb3.append(max);
                        gre.f(max, sb3.toString());
                        StringBuilder sb4 = new StringBuilder(29);
                        sb4.append("endPercent is ");
                        sb4.append(min2);
                        gre.f(min2, sb4.toString());
                    } catch (IllegalArgumentException e) {
                        zep.f("ClipCreationScrubberViewController", "problem setting starting clip creation bounds", e);
                    }
                    if (min2 >= max) {
                        float f3 = min2 - max;
                        if (f3 < f2) {
                            throw new IllegalArgumentException("The difference between endPercent and startPercent must not be less than minPercent");
                        }
                        if (f3 <= min) {
                            greVar.k = f2;
                            greVar.j = min;
                            greVar.e(Math.max(max, 0.0f), Math.min(min2, 1.0f));
                            grd grdVar = greVar.p;
                            if (grdVar != null) {
                                float f4 = greVar.q;
                                float f5 = greVar.r;
                                ((grk) grdVar).t = f4;
                                ((grk) grdVar).u = f5;
                                gri d = ((grk) grdVar).d();
                                d.e();
                                d.g(true);
                                d.f();
                                d.d();
                            }
                            greVar.postInvalidate();
                            recyclerView2.aG(grkVar);
                            recyclerView2.aE(grkVar);
                            return;
                        }
                        throw new IllegalArgumentException("The difference between endPercent and startPercent must not be greater than maxPercent");
                    }
                    throw new IllegalArgumentException("endPercent must not be smaller than startPercent");
                }
            });
        } else {
            grv grvVar = this.q;
            if (grvVar == recyclerView) {
                return;
            }
            this.D = false;
            if (grvVar != null) {
                grvVar.aG(grvVar.af);
                grvVar.aG(grvVar.ah);
                grvVar.ab = null;
            }
            grv grvVar2 = (grv) recyclerView;
            this.q = grvVar2;
            grvVar2.aL(this.f207J);
            w();
        }
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        f(this.t);
    }

    public final void o() {
        grv grvVar;
        if (!this.z || !this.y || (grvVar = this.q) == null || grvVar.F != 0) {
            return;
        }
        this.i.removeCallbacks(this.B);
        this.B.run();
    }

    public final void p(String str, int i) {
        this.v = str;
        this.w = i;
    }

    public final void q() {
        ((airr) this.f.get()).a();
        ((ahyp) this.I.get()).l(ControlsOverlayStyle.m);
    }

    public final void r(boolean z) {
        this.y = z;
        grw grwVar = this.o;
        if (grwVar != null) {
            grwVar.f = z;
        }
        gre greVar = this.r;
        if (greVar != null) {
            greVar.v = z;
        }
        grl grlVar = this.s;
        if (grlVar != null) {
            grlVar.g = z;
        }
        grv grvVar = this.q;
        if (grvVar != null) {
            grvVar.ad = z;
            grt grtVar = (grt) grvVar.m;
            if (grtVar == null) {
                return;
            }
            grtVar.m = z;
        }
    }

    public final void s(boolean z) {
        this.f207J = z;
        grv grvVar = this.q;
        if (grvVar != null) {
            grvVar.aL(z);
        }
    }

    public final void t(ajbv ajbvVar) {
        this.F = ajbvVar;
        w();
    }

    public final void u(long j) {
        ajbv ajbvVar;
        float f;
        int width;
        if (this.q == null || this.s == null || (ajbvVar = this.F) == null) {
            return;
        }
        long h = j - ajbvVar.h();
        long aI = this.q.aI();
        long aJ = this.q.aJ() - aI;
        if (aJ <= 0) {
            return;
        }
        float f2 = ((float) (h - aI)) / ((float) aJ);
        grl grlVar = this.s;
        if (grlVar != null) {
            grlVar.e = f2;
            grlVar.postInvalidate();
        }
        grw grwVar = this.o;
        if (grwVar == null) {
            return;
        }
        grwVar.b = f2;
        int measuredWidth = grwVar.getMeasuredWidth();
        if (grwVar.f) {
            float f3 = grwVar.b;
            int i = grwVar.e;
            f = (f3 * (measuredWidth - (i + i))) + i;
            width = grwVar.d.width();
        } else {
            f = grwVar.b * measuredWidth;
            width = grwVar.d.width();
        }
        float f4 = f - (width / 2.0f);
        grwVar.c = f4;
        float max = Math.max(0.0f, f4);
        grwVar.c = max;
        grwVar.c = Math.min(max, measuredWidth - grwVar.d.width());
        grwVar.postInvalidate();
        if (h >= 0) {
            this.o.a(G.format(Long.valueOf(h)));
        } else {
            this.o.a("");
        }
    }
}
