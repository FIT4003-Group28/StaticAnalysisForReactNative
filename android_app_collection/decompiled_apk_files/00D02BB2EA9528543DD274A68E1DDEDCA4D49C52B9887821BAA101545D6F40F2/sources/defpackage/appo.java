package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.widget.SeekBar;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: appo  reason: default package */
/* loaded from: classes2.dex */
public class appo extends apob implements appj {
    public final cjqy a;
    @dzsi
    public apnl b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean k;
    @dzsi
    public appn l;
    private final Context m;
    private final cqhn n;
    private final apqe o;
    private final Handler p;
    private final Runnable q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private final SeekBar.OnSeekBarChangeListener w;
    private final apnj x;

    public appo(Activity activity, cqhn cqhnVar, apqe apqeVar, cjqy cjqyVar) {
        super(activity);
        this.p = new Handler();
        this.q = new Runnable(this) { // from class: appk
            private final appo a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.D();
            }
        };
        this.r = false;
        this.s = false;
        this.t = false;
        this.w = new appl(this);
        this.x = new appm(this);
        this.m = activity;
        this.n = cqhnVar;
        this.o = apqeVar;
        this.a = cjqyVar;
    }

    @Override // defpackage.appj
    @dzsi
    public cjtd A() {
        return null;
    }

    @Override // defpackage.appj
    public cjtd B() {
        return cjtd.a(dtxy.cL);
    }

    public void C(@dzsi appn appnVar) {
        this.l = appnVar;
    }

    public final void D() {
        long j;
        apnl apnlVar = this.b;
        cqhn cqhnVar = this.n;
        if (apnlVar == null || cqhnVar == null) {
            return;
        }
        this.f = Math.max(apnlVar.a(), 0L);
        this.i = Math.max(apnlVar.b(), 0L);
        double b = apnlVar.b();
        double d = this.f;
        Double.isNaN(b);
        Double.isNaN(d);
        this.j = (int) Math.round((b / d) * 1000.0d);
        if (!this.c) {
            apqr apqrVar = (apqr) apnlVar;
            clot clotVar = apqrVar.q;
            if (clotVar != null) {
                clotVar.t();
                clmt clmtVar = clotVar.c;
                if (clmtVar.j()) {
                    cloc clocVar = clmtVar.n;
                    j = clocVar.k.equals(clocVar.c) ? cllt.a(clmtVar.n.q) : clmtVar.h();
                } else if (clmtVar.n.b.t()) {
                    j = clmtVar.p;
                } else {
                    cloc clocVar2 = clmtVar.n;
                    if (clocVar2.k.d != clocVar2.c.d) {
                        j = clocVar2.b.u(clmtVar.g(), clmtVar.a).b();
                    } else {
                        long j2 = clocVar2.q;
                        if (clmtVar.n.k.b()) {
                            cloc clocVar3 = clmtVar.n;
                            cloz g = clocVar3.b.g(clocVar3.k.a, clmtVar.f);
                            j2 = g.b(clmtVar.n.k.b);
                            if (j2 == Long.MIN_VALUE) {
                                j2 = g.d;
                            }
                        }
                        j = clmtVar.t(clmtVar.n.k, j2);
                    }
                }
                apqrVar.r = j;
            } else {
                j = apqrVar.r;
            }
            double d2 = j;
            double d3 = this.f;
            Double.isNaN(d2);
            Double.isNaN(d3);
            this.v = (int) Math.round((d2 / d3) * 1000.0d);
        }
        cqkx.p(this);
        if (!this.k) {
            return;
        }
        this.p.removeCallbacks(this.q);
        this.p.postDelayed(this.q, 100L);
    }

    public void E(boolean z) {
        if (this.r == z) {
            return;
        }
        this.r = z;
        apnl apnlVar = this.b;
        if (apnlVar != null) {
            apnlVar.setVideoSound(!z);
        }
        cqkx.p(this);
    }

    public void F(boolean z) {
        this.u = z;
    }

    public void G(boolean z) {
        this.s = true;
    }

    public Boolean H() {
        return Boolean.valueOf(this.d);
    }

    public void I(boolean z) {
        this.t = true;
    }

    public void J() {
        apnl apnlVar = this.b;
        if (apnlVar != null) {
            apnlVar.c(0L);
        }
    }

    public void K(int i) {
        apnl apnlVar = this.b;
        if (apnlVar != null) {
            double d = i;
            Double.isNaN(d);
            double a = apnlVar.a();
            Double.isNaN(a);
            apnlVar.c(Math.round((d / 1000.0d) * a));
        }
    }

    @Override // defpackage.apoa
    public String a() {
        return this.o.a(this.i);
    }

    @Override // defpackage.apoa
    public String b() {
        return this.o.a(this.f);
    }

    @Override // defpackage.apoa
    public cqkl c() {
        apnl apnlVar = this.b;
        if (apnlVar == null || this.c) {
            return cqkl.a;
        }
        if (apnlVar.b() >= apnlVar.a()) {
            apnlVar.c(0L);
        }
        apnlVar.setPlayWhenReady(true);
        appn appnVar = this.l;
        if (appnVar != null) {
            appnVar.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.apoa
    public cqkl d() {
        apnl apnlVar = this.b;
        if (apnlVar == null) {
            return cqkl.a;
        }
        apnlVar.setPlayWhenReady(false);
        appn appnVar = this.l;
        if (appnVar != null) {
            appnVar.e();
        }
        return cqkl.a;
    }

    @Override // defpackage.apoa
    public SeekBar.OnSeekBarChangeListener e() {
        return this.w;
    }

    @Override // defpackage.appj
    public Integer i() {
        return Integer.valueOf(this.v);
    }

    @Override // defpackage.appj
    public Boolean j() {
        return Boolean.valueOf(this.r);
    }

    @Override // defpackage.apnk
    public void p(@dzsi apnl apnlVar) {
        apnl apnlVar2 = this.b;
        if (apnlVar2 != null) {
            apnlVar2.setVideoEventListener(null);
        }
        this.b = apnlVar;
        if (apnlVar != null) {
            apnlVar.setVideoEventListener(this.x);
            D();
        }
    }

    @Override // defpackage.appj
    public Boolean q() {
        return Boolean.valueOf(this.u);
    }

    @Override // defpackage.appj
    public Boolean r() {
        return Boolean.valueOf(this.s);
    }

    @Override // defpackage.appj
    public Boolean s() {
        return Boolean.valueOf(this.t);
    }

    @Override // defpackage.appj
    public cqkl t() {
        appn appnVar = this.l;
        if (appnVar != null) {
            appnVar.b();
        }
        return cqkl.a;
    }

    @Override // defpackage.appj
    public cqkl u() {
        appn appnVar = this.l;
        if (appnVar != null) {
            appnVar.d();
        }
        return cqkl.a;
    }

    @Override // defpackage.appj
    public CharSequence v() {
        if (s().booleanValue()) {
            return this.m.getString(R.string.MINIMIZE_BUTTON_CONTENT_DESCRIPTION);
        }
        return this.m.getString(R.string.MAXIMIZE_BUTTON_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.appj
    public CharSequence w() {
        if (j().booleanValue()) {
            return this.m.getString(R.string.UNMUTE_BUTTON_CONTENT_DESCRIPTION);
        }
        return this.m.getString(R.string.MUTE_BUTTON_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.appj
    public cjtd x() {
        return cjtd.a(dtxy.cN);
    }

    @Override // defpackage.appj
    public cjtd y() {
        return cjtd.a(dtxy.cM);
    }

    @Override // defpackage.appj
    public cjtd z() {
        return cjtd.a(dtxy.cO);
    }
}
