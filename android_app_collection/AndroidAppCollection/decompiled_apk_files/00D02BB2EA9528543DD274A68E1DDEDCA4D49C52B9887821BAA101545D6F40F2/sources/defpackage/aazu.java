package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aazu  reason: default package */
/* loaded from: classes2.dex */
public class aazu implements aazn {
    public final aaxl a;
    @dzsi
    dafk b;
    private final Runnable c;
    private final Activity d;
    private final aahf e;
    private final aaht f;
    private final aahu g;
    private final aahc h;
    private final akla i;
    private cjtd j;
    private cjtd k;
    @dzsi
    private cqix<? extends aklb> l;
    @dzsi
    private aaja m;

    public aazu(Runnable runnable, Activity activity, cqhn cqhnVar, aahf aahfVar, aaht aahtVar, aahu aahuVar, aahc aahcVar, aaxl aaxlVar, akla aklaVar) {
        cjta b = cjtd.b();
        b.d = dtxo.bN;
        this.j = b.a();
        cjta b2 = cjtd.b();
        b2.d = dtxo.bQ;
        this.k = b2.a();
        this.c = runnable;
        this.d = activity;
        this.e = aahfVar;
        this.f = aahtVar;
        this.g = aahuVar;
        this.h = aahcVar;
        this.a = aaxlVar;
        this.i = aklaVar;
        this.m = null;
    }

    private static void k(final aahd aahdVar, cqtd cqtdVar, String str, boolean z, @dzsi String str2, ddho ddhoVar, dccx<aajb> dccxVar) {
        if (aahdVar.a().booleanValue()) {
            cjta b = cjtd.b();
            b.d = ddhoVar;
            b.g(str2);
            dccxVar.g(new aajc(cqtdVar, str, str, z, b.a(), new Runnable(aahdVar) { // from class: aazt
                private final aahd a;

                {
                    this.a = aahdVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            }, aahdVar.c()));
        }
    }

    @Override // defpackage.aazn
    public aawq a() {
        return this.a;
    }

    @Override // defpackage.aazn
    public Boolean b() {
        return Boolean.valueOf(this.l != null);
    }

    @Override // defpackage.aazn
    @dzsi
    public cqix<? extends aklb> c() {
        return this.l;
    }

    @Override // defpackage.aazn
    public Boolean d() {
        cqix<? extends aklb> cqixVar = this.l;
        boolean z = false;
        if (cqixVar != null && cqixVar.a().getClass().equals(akku.class)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aazn
    public cqkl e() {
        this.c.run();
        return cqkl.a;
    }

    @Override // defpackage.aazn
    @dzsi
    public aaja f() {
        return this.m;
    }

    @Override // defpackage.aazn
    public cjtd g() {
        return this.j;
    }

    @Override // defpackage.aazn
    public cjtd h() {
        return this.k;
    }

    public void i(diwb diwbVar) {
        dbsg<dgfy> dbsgVar;
        this.a.e(diwbVar);
        dafk dafkVar = this.b;
        if (dafkVar != null) {
            dafkVar.d();
            this.b = null;
        }
        if ((diwbVar.b & 64) == 0) {
            this.l = null;
            cqkx.p(this);
            return;
        }
        dhxz dhxzVar = diwbVar.J;
        if (dhxzVar == null) {
            dhxzVar = dhxz.c;
        }
        dsqp dsqpVar = (dsqp) dhxzVar.cu(5);
        dsqpVar.bC(dhxzVar);
        dhxz dhxzVar2 = (dhxz) ((dhxx) dsqpVar).b;
        djsd djsdVar = dhxzVar2.a == 1 ? (djsd) dhxzVar2.b : djsd.f;
        dsqp dsqpVar2 = (dsqp) djsdVar.cu(5);
        dsqpVar2.bC(djsdVar);
        djsa djsaVar = (djsa) dsqpVar2;
        dhxu dhxuVar = ((djsd) djsaVar.b).b;
        if (dhxuVar == null) {
            dhxuVar = dhxu.s;
        }
        dsqp dsqpVar3 = (dsqp) dhxuVar.cu(5);
        dsqpVar3.bC(dhxuVar);
        dhxt dhxtVar = (dhxt) dsqpVar3;
        if (dhxtVar.c) {
            dhxtVar.bF();
            dhxtVar.c = false;
        }
        dhxu dhxuVar2 = (dhxu) dhxtVar.b;
        dhxuVar2.a &= -3;
        dhxuVar2.c = dhxu.s.c;
        if (dhxtVar.c) {
            dhxtVar.bF();
            dhxtVar.c = false;
        }
        dhxu dhxuVar3 = (dhxu) dhxtVar.b;
        dhxuVar3.e = null;
        dhxuVar3.a &= -9;
        if (djsaVar.c) {
            djsaVar.bF();
            djsaVar.c = false;
        }
        djsd djsdVar2 = (djsd) djsaVar.b;
        dhxu bK = dhxtVar.bK();
        bK.getClass();
        djsdVar2.b = bK;
        djsdVar2.a |= 1;
        akla aklaVar = this.i;
        dhxv bZ = dhxw.d.bZ();
        dpwr dpwrVar = dpwr.EXPERIENCE_ON_MAP_CARD;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhxw dhxwVar = (dhxw) bZ.b;
        dhxwVar.b = dpwrVar.r;
        dhxwVar.a |= 1;
        dhxx bZ2 = dhxz.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dhxz dhxzVar3 = (dhxz) bZ2.b;
        djsd bK2 = djsaVar.bK();
        bK2.getClass();
        dhxzVar3.b = bK2;
        dhxzVar3.a = 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhxw dhxwVar2 = (dhxw) bZ.b;
        dhxz bK3 = bZ2.bK();
        bK3.getClass();
        dhxwVar2.b();
        dhxwVar2.c.add(bK3);
        List<cqix<? extends aklb>> a = aklaVar.a(bZ.bK());
        if (a.isEmpty()) {
            this.l = null;
        } else {
            this.l = a.get(0);
        }
        ditt dittVar = diwbVar.e;
        if (dittVar == null) {
            dittVar = ditt.n;
        }
        String str = dittVar.b;
        cjta c = cjtd.c(this.j);
        c.g(str);
        this.j = c.a();
        cjta c2 = cjtd.c(this.k);
        c2.g(str);
        this.k = c2.a();
        this.e.d(diwbVar);
        aahc aahcVar = this.h;
        if ((diwbVar.a & 32768) != 0) {
            dgfy dgfyVar = diwbVar.q;
            if (dgfyVar == null) {
                dgfyVar = dgfy.f;
            }
            dbsgVar = dbsg.i(dgfyVar);
        } else {
            dbsgVar = dbpy.a;
        }
        aahcVar.a = dbsgVar;
        this.f.d(diwbVar);
        this.g.d(diwbVar);
        dccx F = dcdc.F();
        k(this.e, iup.c(R.raw.ic_mod_directions, irg.a()), this.d.getString(R.string.NAVIGATION), true, str, dtxo.bP, F);
        k(this.h, cqrt.g(2131232333, irg.r()), this.d.getString(R.string.CALL), false, str, dtxo.bO, F);
        ddho ddhoVar = dtxo.bR;
        aaht aahtVar = this.f;
        aahtVar.a = ddhoVar;
        k(aahtVar, cqrt.g(2131231745, irg.r()), this.d.getString(R.string.SHARE), false, str, ddhoVar, F);
        k(this.g, cqrt.g(2131232871, irg.r()), this.d.getString(R.string.SHARE_LOCATION_BUTTON), false, str, dtxo.bS, F);
        this.m = aaiy.a(F.f());
        cqkx.p(this);
    }

    public void j() {
        this.a.f();
        if (this.b == null) {
            View o = cqkx.o(this);
            if (o == null) {
                return;
            }
            dafk b = ckos.b(o, R.string.NET_FAIL_TITLE, -2);
            b.t(R.string.NET_FAIL_RETRY_BUTTON, new View.OnClickListener(this) { // from class: aazs
                private final aazu a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.a.d();
                }
            });
            this.b = b;
        }
        this.b.c();
        this.m = null;
        cqkx.p(this);
    }
}
