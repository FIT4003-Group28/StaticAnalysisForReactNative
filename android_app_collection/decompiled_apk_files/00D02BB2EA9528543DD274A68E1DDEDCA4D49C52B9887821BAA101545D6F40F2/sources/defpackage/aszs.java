package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aszs  reason: default package */
/* loaded from: classes2.dex */
public class aszs implements asmo, aszo {
    public final asxu a;
    public final atoq b;
    public final Context c;
    @dzsi
    public final dzsj<ckrp> d;
    @dzsi
    public final brlz e;
    @dzsi
    public atxz f;
    public final asik g;
    public final akfa h;
    public boolean i;
    public boolean j;
    public aszm k;
    private final cqhn l;
    private final btrm m;
    private final asxw n;
    private final egk o;
    private boolean p;
    @dzsi
    private egc q;
    @dzsi
    private final ashh r;
    @dzsi
    private final ashf s;
    @dzsi
    private astr t;
    @dzsi
    private asub u;
    private final aszr v;
    private final asuk w;
    private final astx x;
    private final asxv y;
    @dzsi
    private final asuc z;

    public aszs(cqhn cqhnVar, asxu asxuVar, asxw asxwVar, akfa akfaVar, Context context, btrm btrmVar, asuk asukVar, atoq atoqVar, @dzsi dzsj<ckrp> dzsjVar, btvo btvoVar, asik asikVar, @dzsi brlz brlzVar, @dzsi ashh ashhVar, @dzsi ashf ashfVar, @dzsi asuc asucVar) {
        egk egkVar = new egk();
        this.o = egkVar;
        this.i = false;
        this.j = false;
        this.k = new aszl().a();
        this.y = new aszp(this);
        this.l = cqhnVar;
        dbsk.t(asxuVar, "host");
        this.a = asxuVar;
        this.n = asxwVar;
        this.c = context;
        this.m = btrmVar;
        dbsk.t(atoqVar, "promptsFactory");
        this.b = atoqVar;
        this.d = dzsjVar;
        this.e = brlzVar;
        this.r = ashhVar;
        this.s = ashfVar;
        this.h = akfaVar;
        this.v = new aszr(this, asxwVar, context.getResources(), btvoVar);
        dbsk.t(asukVar, "triStateMuteViewModel");
        this.w = asukVar;
        dbsk.t(asikVar, "vanagonModeController");
        this.g = asikVar;
        this.j = asikVar.a();
        boolean a = astk.a(context, btvoVar, akfaVar, dzsjVar, brlzVar == null ? null : brlzVar.g, asikVar);
        this.z = asucVar;
        y(a, false);
        astx astxVar = new astx(null, null, null, null, asukVar, null, null, null, btvoVar, cqhnVar, true);
        this.x = astxVar;
        astxVar.o(egkVar, context);
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
        astr astrVar = this.t;
        if (astrVar != null) {
            astrVar.a();
        }
        if (p() != null) {
            p().a();
        }
        this.w.b();
        btrm btrmVar = this.m;
        dceq a = dcet.a();
        a.b(btvr.class, new aszt(0, btvr.class, this, bvrj.UI_THREAD));
        a.b(alid.class, new aszt(1, alid.class, this, bvrj.UI_THREAD));
        a.b(asin.class, new aszt(2, asin.class, this, bvrj.UI_THREAD));
        a.b(crhd.class, new aszt(3, crhd.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.n.F(this.y);
    }

    @Override // defpackage.asmo
    public void c() {
        this.n.G(this.y);
        this.m.a(this);
        astr astrVar = this.t;
        if (astrVar != null) {
            astrVar.b();
        }
        if (p() != null) {
            p().b();
        }
        this.w.c();
    }

    @Override // defpackage.aszo
    public Boolean g() {
        return Boolean.valueOf(this.j);
    }

    @Override // defpackage.aszo
    public cqkl h() {
        this.a.k();
        return cqkl.a;
    }

    @Override // defpackage.aszo
    @dzsi
    public asut i() {
        return this.u;
    }

    @Override // defpackage.asul
    public Boolean j() {
        throw null;
    }

    @Override // defpackage.asul
    public cqkl k() {
        this.a.Qa();
        return cqkl.a;
    }

    @Override // defpackage.asul
    public cqkl l() {
        this.a.PZ();
        return cqkl.a;
    }

    @Override // defpackage.asul
    @dzsi
    public atxz m() {
        return this.f;
    }

    @Override // defpackage.asum
    public asuq n() {
        return this.v;
    }

    @Override // defpackage.aszo
    @dzsi
    public asho p() {
        ashh ashhVar;
        if (!this.p || (ashhVar = this.r) == null) {
            return null;
        }
        return ashhVar.b();
    }

    @Override // defpackage.aszo
    public Boolean q() {
        ashf ashfVar = this.s;
        if (ashfVar == null || ashfVar.b()) {
            return false;
        }
        return Boolean.valueOf(this.p);
    }

    @Override // defpackage.aszo
    public asux s() {
        return this.w;
    }

    @Override // defpackage.aszo
    public Boolean t() {
        return true;
    }

    @dzsi
    public egc u() {
        return this.q;
    }

    @Override // defpackage.aszo
    @dzsi
    /* renamed from: v */
    public astr r() {
        return this.t;
    }

    @Override // defpackage.aszo, defpackage.asum
    /* renamed from: w */
    public astx o() {
        return this.x;
    }

    public egk x() {
        return this.o;
    }

    public final boolean y(boolean z, boolean z2) {
        asuc asucVar;
        if (this.p == z) {
            return false;
        }
        this.p = z;
        this.q = z ? new aszq(this) : null;
        this.u = (!z || (asucVar = this.z) == null) ? null : asucVar.a(this.c);
        if (!z) {
            if (z2) {
                this.t.b();
            }
            this.t = null;
            return true;
        }
        astr astrVar = new astr(this.c, this.l, this.m, this.d, false);
        this.t = astrVar;
        if (!z2) {
            return true;
        }
        astrVar.a();
        return true;
    }

    public final void z() {
        cqkx.p(this);
        cqkx.p(this.v);
    }
}
