package defpackage;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brbw  reason: default package */
/* loaded from: classes4.dex */
public final class brbw implements brlm {
    private final Activity a;
    private final akpm b;
    private final dxio<akzh> c;
    private final broq d;
    private final cjqy e;
    private final ckcw f;
    private final brbg g;
    private final braw h;
    private final bwrs<brln> i;
    private final bwrs<brlu> j;
    @dzsi
    private final ixr k;
    private final brbe l;
    @dzsi
    private brln m;

    public brbw(Activity activity, akpm akpmVar, dxio dxioVar, broq broqVar, cjqy cjqyVar, ckcw ckcwVar, brbh brbhVar, braw brawVar, bwrs bwrsVar, bwrs bwrsVar2, ixr ixrVar) {
        brbv brbvVar = new brbv(this);
        this.l = brbvVar;
        this.m = null;
        this.a = activity;
        this.b = akpmVar;
        this.c = dxioVar;
        this.d = broqVar;
        this.e = cjqyVar;
        this.f = ckcwVar;
        this.g = brbhVar.a(brbvVar);
        this.h = brawVar;
        this.i = bwrsVar;
        this.j = bwrsVar2;
        this.k = ixrVar;
    }

    public static boolean l(brln brlnVar, brlu brluVar) {
        return !brlnVar.m() && brluVar.aq() && !brluVar.au();
    }

    private final brlu m() {
        brlu c = this.j.c();
        dbsk.s(c);
        return c;
    }

    @Override // defpackage.brlm
    public final void a(brln brlnVar) {
        if (brlnVar != this.m) {
            return;
        }
        k(false);
        brlu m = m();
        m.ai(false);
        m.ao(null);
        brlu brluVar = brlnVar.e;
        Application application = this.a.getApplication();
        ilo q = m.q();
        synchronized (brluVar) {
            m.j = brluVar.j;
        }
        m.d = brluVar.d;
        m.z();
        m.h = false;
        m.L(brluVar, application, true);
        if (q != null) {
            m.B(q);
        }
        if (q == null && m.g() > 0) {
            m.s(0);
        }
        brlnVar.e = m;
        this.i.d(brlnVar);
        this.j.d(m);
        brbo.a(this.h, m);
        if (m.E() == 0) {
            View findViewById = this.a.findViewById(16908290);
            if (m.d) {
                dafk b = ckos.b(findViewById, R.string.NO_RESULTS_OFFLINE_SNACKBAR_MESSAGE, 0);
                b.t(R.string.NET_FAIL_RETRY_BUTTON, new View.OnClickListener(this) { // from class: brbt
                    private final brbw a;

                    {
                        this.a = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.j();
                    }
                });
                b.c();
            } else {
                ckos.b(findViewById, R.string.NO_RESULTS_TRY_ADJUSTING_YOUR_MAP, 0).c();
            }
        }
        this.m = null;
    }

    @Override // defpackage.brlm
    public final void b(brln brlnVar, bttq bttqVar) {
        if (brlnVar != this.m) {
            return;
        }
        k(false);
        brlu m = m();
        m.ai(false);
        m.ab();
        this.j.d(m);
        dafk b = ckos.b(this.a.findViewById(16908290), R.string.NET_FAIL_TITLE, 0);
        b.t(R.string.NET_FAIL_RETRY_BUTTON, new View.OnClickListener(this) { // from class: brbu
            private final brbw a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.j();
            }
        });
        b.c();
        this.g.d(false);
        this.m = null;
    }

    @Override // defpackage.brlm
    public final void c(brln brlnVar) {
        if (brlnVar != this.m) {
            return;
        }
        k(false);
        brlu m = m();
        m.ai(false);
        m.ab();
        this.j.d(m);
        this.m = null;
    }

    public final View d() {
        return this.g.a();
    }

    public final void e() {
        if (h()) {
            return;
        }
        this.g.b();
    }

    public final void f() {
        if (!h()) {
            return;
        }
        g();
        this.g.c();
    }

    public final void g() {
        if (!h()) {
            return;
        }
        this.g.e();
        brln brlnVar = this.m;
        if (brlnVar == null) {
            return;
        }
        this.d.b(brlnVar);
        this.m = null;
        k(false);
    }

    public final boolean h() {
        return this.g.d;
    }

    public final void i() {
        this.g.d(false);
    }

    public final void j() {
        int i;
        brln brlnVar;
        ((ckhe) this.f.a(ckjw.C)).a();
        brln brlnVar2 = this.m;
        if (brlnVar2 != null) {
            this.d.b(brlnVar2);
            this.m = null;
        }
        brlu m = m();
        m.aa();
        m.ai(true);
        this.j.d(m);
        brln c = this.i.c();
        dbsk.s(c);
        dnqg bZ = dnqh.p.bZ();
        if (c.c()) {
            i = ddda.cm.b;
        } else {
            i = ddda.eX.b;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 64;
        dnqhVar.g = i;
        cjqm j = this.e.j(cjql.a, cjtd.a(dtyb.bz));
        if (j.a().a()) {
            String b = j.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b;
        }
        dwir b2 = c.b();
        dsqp dsqpVar = (dsqp) b2.cu(5);
        dsqpVar.bC(b2);
        dwim dwimVar = (dwim) dsqpVar;
        dhjx aa = this.b.aa();
        if (dwimVar.c) {
            dwimVar.bF();
            dwimVar.c = false;
        }
        dwir dwirVar = (dwir) dwimVar.b;
        dwir dwirVar2 = dwir.R;
        aa.getClass();
        dwirVar.d = aa;
        dwirVar.a |= 2;
        dnqh bK = bZ.bK();
        if (dwimVar.c) {
            dwimVar.bF();
            dwimVar.c = false;
        }
        dwir dwirVar3 = (dwir) dwimVar.b;
        bK.getClass();
        dwirVar3.s = bK;
        int i2 = dwirVar3.a | 33554432;
        dwirVar3.a = i2;
        dwirVar3.a = i2 | 8;
        dwirVar3.f = 0;
        int i3 = dwirVar3.b | 32;
        dwirVar3.b = i3;
        dwirVar3.C = true;
        dwirVar3.b = i3 | 4;
        dwirVar3.A = true;
        String str = m.a;
        if (!dbsj.d(str)) {
            if (dwimVar.c) {
                dwimVar.bF();
                dwimVar.c = false;
            }
            dwir dwirVar4 = (dwir) dwimVar.b;
            str.getClass();
            dwirVar4.a |= 1;
            dwirVar4.c = str;
        }
        int aF = m.aF();
        if (aF != 0) {
            if (dwimVar.c) {
                dwimVar.bF();
                dwimVar.c = false;
            }
            dwir dwirVar5 = (dwir) dwimVar.b;
            dwirVar5.I = aF - 1;
            dwirVar5.b |= 32768;
        }
        dspd as = m.as();
        if (as != null) {
            if (dwimVar.c) {
                dwimVar.bF();
                dwimVar.c = false;
            }
            dwir dwirVar6 = (dwir) dwimVar.b;
            as.getClass();
            dwirVar6.b |= 16777216;
            dwirVar6.P = as;
        }
        if (dwimVar.c) {
            dwimVar.bF();
            dwimVar.c = false;
        }
        dwir dwirVar7 = (dwir) dwimVar.b;
        dwirVar7.e = null;
        int i4 = dwirVar7.a & (-5);
        dwirVar7.a = i4;
        if ((134217728 & i4) != 0) {
            dwirVar7.u = null;
            dwirVar7.a = (-134217729) & i4;
        }
        iqy iqyVar = c.a;
        if (c.c()) {
            dwir dwirVar8 = (dwir) dwimVar.b;
            if ((dwirVar8.a & Integer.MIN_VALUE) != 0) {
                dodt dodtVar = dwirVar8.y;
                if (dodtVar == null) {
                    dodtVar = dodt.h;
                }
                dsqp dsqpVar2 = (dsqp) dodtVar.cu(5);
                dsqpVar2.bC(dodtVar);
                dodn dodnVar = (dodn) dsqpVar2;
                if (dodnVar.c) {
                    dodnVar.bF();
                    dodnVar.c = false;
                }
                dodt dodtVar2 = (dodt) dodnVar.b;
                dodtVar2.a |= 4;
                dodtVar2.d = true;
                if (dwimVar.c) {
                    dwimVar.bF();
                    dwimVar.c = false;
                }
                dwir dwirVar9 = (dwir) dwimVar.b;
                dodt bK2 = dodnVar.bK();
                bK2.getClass();
                dwirVar9.y = bK2;
                dwirVar9.a |= Integer.MIN_VALUE;
            }
            dwir dwirVar10 = (dwir) dwimVar.b;
            if ((dwirVar10.b & 262144) != 0) {
                diyl diylVar = dwirVar10.L;
                if (diylVar == null) {
                    diylVar = diyl.e;
                }
                dsqp dsqpVar3 = (dsqp) diylVar.cu(5);
                dsqpVar3.bC(diylVar);
                diyk diykVar = (diyk) dsqpVar3;
                if (diykVar.c) {
                    diykVar.bF();
                    diykVar.c = false;
                }
                diyl diylVar2 = (diyl) diykVar.b;
                diylVar2.a &= -3;
                diylVar2.c = diyl.e.c;
                dpum h = this.c.a().g().S().h();
                if (diykVar.c) {
                    diykVar.bF();
                    diykVar.c = false;
                }
                diyl diylVar3 = (diyl) diykVar.b;
                h.getClass();
                diylVar3.b = h;
                diylVar3.a |= 1;
                if (dwimVar.c) {
                    dwimVar.bF();
                    dwimVar.c = false;
                }
                dwir dwirVar11 = (dwir) dwimVar.b;
                diyl bK3 = diykVar.bK();
                bK3.getClass();
                dwirVar11.L = bK3;
                dwirVar11.b |= 262144;
            }
            brlnVar = new brln(dwimVar.bK(), iqyVar, c.c, c.d);
        } else {
            brlnVar = new brln(dwimVar.bK(), iqyVar);
        }
        brlnVar.f = this;
        k(true);
        this.d.a(brlnVar);
        this.m = brlnVar;
    }

    final void k(boolean z) {
        ixr ixrVar = this.k;
        if (ixrVar != null) {
            ixrVar.ag(z);
        }
    }
}
