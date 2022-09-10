package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import com.google.ar.core.Frame;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dwf  reason: default package */
/* loaded from: classes6.dex */
public final class dwf implements dtv {
    @dzsi
    private TextView A;
    @dzsi
    private dtu B;
    @dzsi
    private dub C;
    @dzsi
    private dtu D;
    @dzsi
    private dtu E;
    @dzsi
    private dvg H;
    @dzsi
    private dvo I;
    public final Activity a;
    @dzsi
    public dtj b;
    @dzsi
    public dtu d;
    @dzsi
    public dowa e;
    @dzsi
    public dwl f;
    @dzsi
    public dva g;
    @dzsi
    public dva h;
    @dzsi
    public dva i;
    @dzsi
    public dva j;
    @dzsi
    public dud k;
    public final dvh m;
    private final Executor n;
    private final bvsl o;
    private final dua p;
    private final cze q;
    private final czd r;
    private final czd s;
    private final czd t;
    @dzsi
    private dty v;
    @dzsi
    private dtu w;
    @dzsi
    private dtu x;
    @dzsi
    private dtu y;
    @dzsi
    private dtu z;
    public int l = 1;
    public boolean c = false;
    private dfgu u = dfgu.STOPPED;
    private boolean F = false;
    private float G = Float.MIN_VALUE;

    public dwf(Executor executor, dvh dvhVar, bvsl bvslVar, Activity activity, dua duaVar, cze czeVar, czd czdVar, czd czdVar2, czd czdVar3) {
        this.a = activity;
        this.n = executor;
        this.m = dvhVar;
        this.o = bvslVar;
        this.p = duaVar;
        this.q = czeVar;
        this.r = czdVar;
        this.s = czdVar2;
        this.t = czdVar3;
    }

    private final void b(dtu dtuVar, float f) {
        dtuVar.b(this.t.a(), this.q.a(this.t), new bnvs(f, 1.0f, f));
    }

    public final void a() {
        if (this.d == null) {
            return;
        }
        dva dvaVar = this.g;
        if (dvaVar != null) {
            dvaVar.g();
            dva dvaVar2 = this.g;
            dbsk.s(dvaVar2);
            dvaVar2.d(0);
            this.g = null;
        }
        dva dvaVar3 = this.h;
        if (dvaVar3 != null) {
            dvaVar3.g();
            this.h = null;
        }
        dva dvaVar4 = this.i;
        if (dvaVar4 != null) {
            dvaVar4.g();
            this.i = null;
        }
        this.j = null;
        dtu dtuVar = this.d;
        dbsk.s(dtuVar);
        dtuVar.f();
        this.d = null;
        this.v = null;
        this.H = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.B = null;
        this.f = null;
        this.C = null;
        this.I = null;
        this.D = null;
        this.E = null;
        this.A = null;
        this.F = false;
        this.G = Float.MIN_VALUE;
    }

    @Override // defpackage.dtv
    public final void e(dua duaVar) {
    }

    @Override // defpackage.dtv
    public final void f() {
        a();
        this.k = null;
    }

    @Override // defpackage.dtv
    public final void g(Frame frame, @dzsi dad dadVar, dfgv dfgvVar, float f) {
        dtj dtjVar;
        int i;
        dtu dtuVar;
        dva dvaVar;
        dva dvaVar2;
        float c;
        dfgu b = dfgu.b(dfgvVar.b);
        if (b == null) {
            b = dfgu.NONE;
        }
        this.u = b;
        dtj dtjVar2 = this.b;
        if (dtjVar2 == null || this.l == 1 || !this.c || b != dfgu.LOCALIZED) {
            a();
            return;
        }
        if (this.d == null) {
            dua duaVar = this.p;
            dtj dtjVar3 = this.b;
            dbsk.s(duaVar);
            dbsk.s(dtjVar3);
            dbsk.l(this.d == null);
            dbsk.l(this.v == null);
            dbsk.l(this.H == null);
            dbsk.l(this.w == null);
            dbsk.l(this.x == null);
            dbsk.l(this.y == null);
            dbsk.l(this.z == null);
            dbsk.l(this.A == null);
            dbsk.l(this.B == null);
            dbsk.l(this.f == null);
            dbsk.l(this.C == null);
            dbsk.l(this.I == null);
            dbsk.l(this.D == null);
            dbsk.l(this.E == null);
            dbsk.l(this.h == null);
            dbsk.l(this.i == null);
            dbsk.l(this.j == null);
            dvh dvhVar = this.m;
            duhe duheVar = dtjVar3.b;
            if (duheVar == null) {
                duheVar = duhe.c;
            }
            dty a = dvhVar.a(new akqq(duheVar));
            this.v = a;
            dbsk.s(a);
            dtu B = duaVar.B(a);
            this.d = B;
            dgau b2 = dgau.b(dtjVar3.f);
            if (b2 == null) {
                b2 = dgau.MANEUVER_UNKNOWN;
            }
            if (b2 != dgau.DESTINATION) {
                dtu B2 = B.B(dvh.j());
                this.C = dvh.d();
                this.I = dvh.i(0.0f, 1.0f, 0.0f);
                this.H = dvh.b();
                dtu B3 = B2.B(dvh.h(dtjVar3.e)).B(dvh.k(0.0f, 5.3553395f, 0.0f));
                dvg dvgVar = this.H;
                dbsk.s(dvgVar);
                dtu B4 = B3.B(dvgVar);
                dvo dvoVar = this.I;
                dbsk.s(dvoVar);
                dtu B5 = B4.B(dvoVar);
                dub dubVar = this.C;
                dbsk.s(dubVar);
                dtu B6 = B5.B(dubVar);
                B6.m(true);
                dehn<dtu> b3 = B6.b(this.r.a(), this.q.a(this.r), new bnvs(1.6990291f, 1.6990291f, 1.6990291f));
                B6.u();
                this.E = B6;
                B6.g(false);
                deha.q(b3, new dwe(this, B, dtjVar3, B6), this.n);
                dtu B7 = B2.B(dvh.k(0.0f, 0.0f, 0.0f));
                this.D = B7;
                B7.u();
                this.D.x();
                this.D.g(false);
                b(this.D, 32.0f);
                B2.g(false);
                this.B = B2;
            } else {
                dtu B8 = B.B(dvh.k(0.0f, 0.0f, 0.0f));
                dtu B9 = B8.B(dvh.c()).B(dvh.k(0.0f, 0.0f, 0.0f));
                B9.m(true);
                dehn<dtu> b4 = B9.b(this.s.a(), this.q.a(this.s), new bnvs(1.875f, 1.875f, 1.875f));
                B9.u();
                this.x = B9;
                deha.q(b4, new dwd(this, B, B), this.n);
                dtu B10 = B8.B(dvh.k(0.0f, 0.0f, 0.0f));
                B10.x();
                b(B10, 15.0f);
                this.w = B8;
                String str = dtjVar3.c;
                if (str.isEmpty()) {
                    str = this.a.getString(R.string.AR_STEP_CONTINUE);
                }
                View inflate = this.a.getLayoutInflater().inflate(R.layout.far_destination_indicator, (ViewGroup) null);
                ((TextView) inflate.findViewById(R.id.step_text_view)).setText(str);
                this.A = (TextView) inflate.findViewById(R.id.distance_text_view);
                dtu B11 = B.B(dvh.j());
                dtu B12 = B11.B(dvh.c());
                B12.v(inflate);
                this.z = B12;
                this.y = B11;
            }
        }
        dtu dtuVar2 = this.d;
        dbsk.s(dtuVar2);
        dtu dtuVar3 = this.B;
        dtu dtuVar4 = this.D;
        dub dubVar2 = this.C;
        dvo dvoVar2 = this.I;
        dtu dtuVar5 = this.w;
        dtu dtuVar6 = this.y;
        TextView textView = this.A;
        if (dadVar == null) {
            return;
        }
        akqq f2 = dadVar.f();
        duhe duheVar2 = dtjVar2.b;
        if (duheVar2 == null) {
            duheVar2 = duhe.c;
        }
        float e = (float) akqo.e(f2, new akqq(duheVar2));
        if (this.H != null) {
            akqq f3 = dadVar.f();
            duhe duheVar3 = dtjVar2.b;
            if (duheVar3 == null) {
                duheVar3 = duhe.c;
            }
            float h = akqo.h(f3, new akqq(duheVar3));
            float f4 = dtjVar2.e;
            dvg dvgVar2 = this.H;
            if (dvgVar2 != null) {
                if (Math.abs(bvop.c(h - f4)) > 90.0f) {
                    f4 = bvop.b(f4 + 180.0f);
                }
                float f5 = dvgVar2.b;
                float f6 = h - f4;
                if (Math.abs(bvop.c(f6)) < 5.0f) {
                    c = bvop.c(f6 + f5) > 0.0f ? Math.max(0.0f, bvop.c((f4 - h) + 10.0f)) : Math.min(0.0f, bvop.c((f4 - h) - 10.0f));
                } else {
                    c = Math.abs(bvop.c(f6)) < 10.0f ? bvop.c(f6) > 0.0f ? bvop.c((f4 + 10.0f) - h) : bvop.c(((-10.0f) - h) + f4) : 0.0f;
                }
                if (dvgVar2.c) {
                    dvgVar2.b = c;
                    dvgVar2.a.d(0.0f, 1.0f, (float) Math.toRadians(c));
                }
            }
        }
        if (!(this.f == null && textView == null) && Math.abs(e - this.G) > 1.0f) {
            String c2 = this.o.c(Math.round(e), this.e, false, true);
            dwl dwlVar = this.f;
            if (dwlVar != null) {
                dtjVar = dtjVar2;
                i = R.string.AR_STEP_NODE_DISTANCE;
                dwlVar.a = this.a.getString(R.string.AR_STEP_NODE_DISTANCE, new Object[]{c2});
                dwlVar.a();
            } else {
                dtjVar = dtjVar2;
                i = R.string.AR_STEP_NODE_DISTANCE;
            }
            if (textView != null) {
                textView.setText(this.a.getString(i, new Object[]{c2}));
            }
            this.G = e;
        } else {
            dtjVar = dtjVar2;
        }
        float max = Math.max(0.0f, Math.min(1.0f, ((-5.5f) + e) / 2.0f));
        float max2 = Math.max(0.0f, Math.min(1.0f, ((-4.0f) + e) / 2.0f));
        if (dtuVar3 != null) {
            dtuVar3.j(max);
            dtuVar3.g(max > 0.0f);
        }
        if (dtuVar5 != null) {
            dtuVar5.j(max2);
            dtuVar5.g(max2 > 0.0f);
        }
        boolean z = e <= 40.0f;
        boolean z2 = e > 40.0f;
        if (dtuVar6 != null && dtuVar5 != null) {
            dtuVar6.g(z2);
            dtuVar5.g(z);
        }
        if (dtuVar3 != null && this.h != null && this.i != null && (dvaVar = this.j) != null && dubVar2 != null && dvoVar2 != null && dtuVar4 != null && this.H != null) {
            if (z2) {
                if (this.F) {
                    if (dvaVar.a.isRunning()) {
                        dvaVar.c();
                    }
                    if (!dvaVar.f()) {
                        dvaVar.a();
                        dvaVar.b();
                    }
                    this.F = false;
                    dvg dvgVar3 = this.H;
                    dbsk.s(dvgVar3);
                    dvgVar3.j(false);
                    dubVar2.j(true);
                    dtuVar4.g(false);
                }
            } else if (!this.F) {
                if (dvaVar.f()) {
                    dvaVar.c();
                }
                ahrn ahrnVar = new ahrn();
                ahrnVar.d(0.0f, 1.0f, (float) Math.toRadians(dadVar.c()));
                ahrn ahrnVar2 = new ahrn(-1.0f, 0.0f, 0.0f, 0.0f);
                ahrnVar2.k(ahrnVar2, ahrnVar);
                ahrn ahrnVar3 = new ahrn();
                dtj dtjVar4 = this.b;
                dbsk.s(dtjVar4);
                ahrnVar3.d(0.0f, 1.0f, (float) Math.toRadians(dtjVar4.e));
                ahrn ahrnVar4 = new ahrn(0.0f, 0.0f, -1.0f, 0.0f);
                ahrnVar4.k(ahrnVar4, ahrnVar3);
                if (ahrnVar2.b(ahrnVar4) < 0.0f) {
                    dvaVar2 = this.h;
                    dbsk.s(dvaVar2);
                    dvoVar2.j(0.0f);
                } else {
                    dvaVar2 = this.i;
                    dbsk.s(dvaVar2);
                    dvoVar2.j(180.0f);
                }
                this.j = dvaVar2;
                if (dvaVar2.f()) {
                    dvaVar2.a.resume();
                } else {
                    dvaVar2.a();
                }
                this.F = true;
                dvg dvgVar4 = this.H;
                dbsk.s(dvgVar4);
                dvgVar4.j(true);
                dubVar2.j(false);
                dtuVar4.g(true);
            }
        }
        int i2 = this.l;
        if (i2 == 2) {
            dtuVar2.g(e < 40.0f);
        } else {
            if (i2 == 4) {
                dtj dtjVar5 = dtjVar;
                if ((dtjVar5.a & 32) != 0) {
                    duhe duheVar4 = dtjVar5.g;
                    if (duheVar4 == null) {
                        duheVar4 = duhe.c;
                    }
                    dtuVar2.g(((float) akqo.e(dadVar.f(), new akqq(duheVar4))) < 40.0f);
                }
            }
            dtuVar2.g(true);
        }
        dva dvaVar3 = this.g;
        if (dvaVar3 != null) {
            if (e <= 20.0f || dvaVar3.e() != -1) {
                if (e <= 20.0f && dvaVar3.e() == 0) {
                    dvaVar3.d(-1);
                    if (!dvaVar3.f()) {
                        dvaVar3.a();
                    }
                }
            } else {
                dvaVar3.d(0);
            }
        }
        dud dudVar = this.k;
        if (dudVar == null || this.l != 3) {
            return;
        }
        dtu dtuVar7 = this.w;
        if (dtuVar7 == null || !dtuVar7.h()) {
            dtu dtuVar8 = this.y;
            dtuVar = (dtuVar8 == null || !dtuVar8.h()) ? this.E : this.z;
        } else {
            dtuVar = this.x;
        }
        dudVar.a = dtuVar;
    }

    @Override // defpackage.dtv
    public final void h(float f) {
    }
}
