package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: adnp  reason: default package */
/* loaded from: classes2.dex */
public class adnp extends aczs implements adnl {
    private static final cqtd c = cqrt.h(2131232228, ibm.t());
    public final dxio<qbt> a;
    public final qbv b;
    private final Activity d;
    private final vtn e;
    @dzsi
    private jic f;
    private boolean g;
    private boolean h;
    @dzsi
    private cqtd k = null;
    private dptu i = dptu.m;
    private dvha j = dvha.h;
    private cqtd l = c;

    public adnp(Activity activity, dxio<qbt> dxioVar, qbv qbvVar, cqhn cqhnVar, vtn vtnVar) {
        this.d = activity;
        this.a = dxioVar;
        this.b = qbvVar;
        this.e = vtnVar;
    }

    @Override // defpackage.adnl
    public CharSequence a() {
        bvsv a;
        bvsx bvsxVar = new bvsx(this.d.getResources());
        String str = !this.i.e.isEmpty() ? this.i.e : this.j.d;
        bvsu c2 = bvsxVar.c(true != dbsj.d(str) ? R.string.TRAFFIC_SUMMARY_LOCALITY : R.string.TRAFFIC_SUMMARY_YOUR_AREA);
        Object[] objArr = new Object[2];
        dptt dpttVar = this.i.i;
        if (dpttVar == null) {
            dpttVar = dptt.d;
        }
        String str2 = dpttVar.c;
        if (dbsj.d(str2)) {
            a = bvsxVar.c(R.string.TRAFFIC_SUMMARY_UNKNOWN);
        } else {
            dptt dpttVar2 = this.i.i;
            if (dpttVar2 == null) {
                dpttVar2 = dptt.d;
            }
            int a2 = dpts.a(dpttVar2.b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            if (i == 1) {
                a = bvsxVar.a(str2);
                a.m(R.color.mod_google_green600);
            } else if (i == 2) {
                a = bvsxVar.a(str2);
                a.m(R.color.mod_google_yellow900);
            } else if (i == 3) {
                a = bvsxVar.a(str2);
                a.m(R.color.mod_google_red600);
            } else {
                a = bvsxVar.c(R.string.TRAFFIC_SUMMARY_UNKNOWN);
            }
        }
        objArr[0] = a;
        objArr[1] = str;
        c2.a(objArr);
        return c2.c();
    }

    @Override // defpackage.adnl
    public CharSequence b() {
        dptp dptpVar = this.i.d;
        if (dptpVar == null) {
            dptpVar = dptp.c;
        }
        return dptpVar.a;
    }

    @Override // defpackage.adnl
    public CharSequence c() {
        dptp dptpVar = this.i.d;
        if (dptpVar == null) {
            dptpVar = dptp.c;
        }
        String str = dptpVar.b;
        return dbsj.d(str) ? "-" : str;
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return cjtd.a(dtxr.ad);
    }

    @Override // defpackage.adnl
    @dzsi
    public jic f() {
        return this.f;
    }

    @Override // defpackage.adnl
    public CharSequence g() {
        dvhm dvhmVar = this.j.f;
        if (dvhmVar == null) {
            dvhmVar = dvhm.d;
        }
        if (dvhmVar.b.isEmpty()) {
            return "-";
        }
        dvhm dvhmVar2 = this.j.f;
        if (dvhmVar2 == null) {
            dvhmVar2 = dvhm.d;
        }
        return dvhmVar2.b;
    }

    @Override // defpackage.adnl
    public CharSequence h() {
        dptt dpttVar = this.i.j;
        if (dpttVar == null) {
            dpttVar = dptt.d;
        }
        String str = dpttVar.c;
        return dbsj.d(str) ? "-" : str;
    }

    @Override // defpackage.adnl
    public CharSequence j() {
        return !this.i.f.isEmpty() ? this.i.f : this.d.getString(R.string.INFORMAL_TRANSIT_GET_DIRECTIONS);
    }

    @Override // defpackage.adnl
    public View.OnClickListener k() {
        return new View.OnClickListener(this) { // from class: adnm
            private final adnp a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                adnp adnpVar = this.a;
                qcw x = qcx.x();
                x.s(dqvj.TRANSIT);
                x.q(Boolean.valueOf(adnpVar.b.b()).booleanValue());
                adnpVar.a.a().m(x.a());
            }
        };
    }

    @Override // defpackage.adnl
    public Boolean l() {
        return Boolean.valueOf(this.g);
    }

    @Override // defpackage.adnl
    public Boolean m() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.adnl
    public Boolean n() {
        return Boolean.valueOf(this.b.c());
    }

    @Override // defpackage.adnl
    public CharSequence o() {
        return this.i.f;
    }

    @Override // defpackage.adnl
    public CharSequence p() {
        return this.i.g;
    }

    @Override // defpackage.adnl
    public CharSequence q() {
        return this.i.h;
    }

    @Override // defpackage.adnl
    @dzsi
    public cqtd r() {
        return this.k;
    }

    @Override // defpackage.adnl
    public cqtd s() {
        return this.l;
    }

    @Override // defpackage.adnl
    public Boolean t() {
        return Boolean.valueOf(!this.b.b());
    }

    public void u(awwb awwbVar) {
        boolean c2 = awwh.c(awwbVar, dcep.C(awvv.H, awvv.G));
        boolean a = awwh.a(awwbVar, dcep.C(awvv.H, awvv.G));
        if (c2) {
            if (!this.h && a) {
                return;
            }
            this.j = (dvha) awwbVar.a(awvv.G).b();
            this.i = (dptu) awwbVar.a(awvv.H).b();
            dvhm dvhmVar = this.j.f;
            if (dvhmVar == null) {
                dvhmVar = dvhm.d;
            }
            this.f = new jic(dvhmVar.a, ckqc.FULLY_QUALIFIED, 0);
            dptu dptuVar = this.i;
            String str = dptuVar.k;
            String str2 = dptuVar.l;
            adnn adnnVar = new adnn(this);
            adno adnoVar = new adno(this);
            w(this.e.f(str, bvlw.a, adnnVar));
            x(this.e.f(str2, bvlw.a, adnoVar));
            this.h = true;
        }
    }

    public void v(boolean z) {
        this.g = z;
    }

    public final void w(@dzsi cqtd cqtdVar) {
        this.k = cqtdVar;
        cqkx.p(this);
    }

    public final void x(@dzsi cqtd cqtdVar) {
        if (cqtdVar != null) {
            this.l = cqtdVar;
        } else {
            this.l = c;
        }
        cqkx.p(this);
    }
}
