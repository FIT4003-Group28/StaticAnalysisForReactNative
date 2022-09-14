package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: liq  reason: default package */
/* loaded from: classes7.dex */
public class liq implements asmo, lig {
    public final lik a;
    @dzsi
    aszm b;
    public boolean c;
    public boolean d;
    private final Context e;
    private final asxw f;
    private final Executor g;
    private final akfa h;
    private final boolean i;
    private final lio j;
    private final aufc k;
    private final npz l;
    private final lil m;
    private final bvjj n;
    private final kcv o;
    @dzsi
    private btlu p;
    private lif q = lif.SIGNED_OUT;
    private final crzp<btlu> r = new lin(this);
    private final lip s = new lip(this);

    public liq(Context context, asxu asxuVar, asxw asxwVar, Executor executor, akfa akfaVar, Resources resources, bvsl bvslVar, boolean z, lio lioVar, aufc aufcVar, npz npzVar, bvjj bvjjVar, kcv kcvVar, lil lilVar) {
        dbsk.s(context);
        this.e = context;
        dbsk.s(asxwVar);
        this.f = asxwVar;
        this.g = executor;
        this.h = akfaVar;
        this.i = z;
        dbsk.s(lioVar);
        this.j = lioVar;
        dbsk.s(aufcVar);
        this.k = aufcVar;
        this.l = npzVar;
        this.n = bvjjVar;
        this.o = kcvVar;
        this.m = lilVar;
        this.a = new lik(context, asxuVar, resources, bvslVar, z);
        z(akfaVar.j());
    }

    @Override // defpackage.asmo
    public void NZ(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public void Qp() {
    }

    @Override // defpackage.asmo
    public void Qr(Bundle bundle) {
    }

    @Override // defpackage.asmo
    public void b() {
        if (nky.a(this.n)) {
            return;
        }
        this.f.F(this.s);
        this.h.C().d(this.r, this.g);
    }

    @Override // defpackage.asmo
    public void c() {
        if (nky.a(this.n)) {
            return;
        }
        this.h.C().c(this.r);
        this.f.G(this.s);
    }

    @Override // defpackage.lig
    public Boolean g() {
        boolean z = true;
        if (!this.m.a() && !this.m.b()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.lig
    public Boolean h() {
        return Boolean.valueOf(this.i);
    }

    @Override // defpackage.lig
    public Boolean i() {
        return Boolean.valueOf(this.m.a());
    }

    @Override // defpackage.lig
    public Boolean j() {
        return Boolean.valueOf(this.m.b());
    }

    @Override // defpackage.lig
    public cqkl k() {
        ((lfg) this.j).a.h.a.d(dbpy.a);
        return cqkl.a;
    }

    @Override // defpackage.lig
    public cqkl l() {
        lfg lfgVar = (lfg) this.j;
        lfgVar.a.e.e();
        lfk lfkVar = lfgVar.a;
        if (lfkVar.f) {
            lfkVar.l(true);
            lfgVar.a.m(true);
            lfgVar.a.k();
        }
        cqkx.p(lfgVar.a.b);
        return cqkl.a;
    }

    @Override // defpackage.lig
    public dcdc<? extends lie> m() {
        return this.a.f;
    }

    @Override // defpackage.lig
    public CharSequence n() {
        return this.e.getResources().getString(R.string.MAPS_APP_NAME);
    }

    @Override // defpackage.lig
    public cqtd o() {
        return nqu.t(false);
    }

    @Override // defpackage.lig
    public Double p() {
        boolean b = this.k.b();
        boolean booleanValue = this.l.a().booleanValue();
        double d = 1.0d;
        if (b && !booleanValue) {
            d = 0.54d;
        }
        return Double.valueOf(d);
    }

    @Override // defpackage.lig
    public Integer q() {
        return 2;
    }

    @Override // defpackage.lig
    public Boolean r(lif lifVar) {
        return Boolean.valueOf(this.q == lifVar);
    }

    @Override // defpackage.lig
    public Boolean s() {
        boolean z = false;
        if (this.o.p() && this.m.b()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.lig
    public cqkl t() {
        this.o.o();
        return cqkl.a;
    }

    public cqkl u() {
        if (this.m.b()) {
            this.m.f();
            cqkx.p(this);
        }
        return cqkl.a;
    }

    public void v() {
        this.m.c();
    }

    public void w() {
        this.b = null;
    }

    public void x(List<nlw> list) {
        if (this.c) {
            return;
        }
        lik likVar = this.a;
        dccx F = dcdc.F();
        for (int i = 0; i < list.size(); i++) {
            nlw nlwVar = list.get(i);
            if (i < likVar.f.size()) {
                lij lijVar = likVar.f.get(i);
                lijVar.n(nlwVar, i);
                lijVar.o(false);
                F.g(lijVar);
            } else {
                F.g(lij.l(likVar.a, likVar.b, likVar.c, likVar.d, likVar.e, list.get(i), i));
            }
        }
        likVar.f = F.f();
        if (!likVar.f.isEmpty()) {
            likVar.f.get(Math.min(likVar.f.size(), 2) - 1).o(true);
        }
        y();
    }

    public final void y() {
        lif lifVar;
        if (this.d) {
            if (m().isEmpty()) {
                lifVar = lif.NO_SUGGESTIONS;
            } else {
                lifVar = lif.SIGNED_IN;
            }
            this.q = lifVar;
        }
        this.m.d(!this.a.f.isEmpty());
        cqkx.p(this);
    }

    public final void z(@dzsi btlu btluVar) {
        lif lifVar;
        boolean z = true;
        boolean z2 = !Objects.equals(this.p, btluVar);
        this.p = btluVar;
        UserManager userManager = (UserManager) this.e.getSystemService("user");
        dbsk.s(userManager);
        if (userManager.hasUserRestriction("no_modify_accounts")) {
            this.d = false;
            this.q = lif.GUEST;
        } else if (this.h.d()) {
            this.d = false;
            this.q = lif.INCOGNITO;
        } else if (!z2) {
        } else {
            btlu btluVar2 = this.p;
            if (btluVar2 == null || !btluVar2.l()) {
                z = false;
            }
            this.d = z;
            if (z) {
                if (m().isEmpty()) {
                    lifVar = lif.NO_SUGGESTIONS;
                } else {
                    lifVar = lif.SIGNED_IN;
                }
                this.q = lifVar;
                return;
            }
            this.q = lif.SIGNED_OUT;
        }
    }
}
