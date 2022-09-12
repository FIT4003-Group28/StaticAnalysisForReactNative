package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bepz  reason: default package */
/* loaded from: classes3.dex */
public class bepz extends beoj implements benw {
    public final dxio<acwo> b;
    public bepe c;
    private final crzp<apsi<dbsg<List<dqob>>>> k;
    private final cqfd l;
    private final bepf m;
    private final bepo n;
    private final beie o;
    private boolean p;

    public bepz(ff ffVar, cqhn cqhnVar, bgyb bgybVar, dxio<acwo> dxioVar, bepf bepfVar, bepo bepoVar, beid beidVar, beie beieVar, bepv bepvVar, Executor executor, bwrs<bvrt<benb>> bwrsVar, bwrs<ilo> bwrsVar2) {
        super(ffVar, cqhnVar, bgybVar, bepvVar, bwrsVar, beidVar, bwrsVar2, executor);
        this.k = new bepx(this);
        this.l = new bepy(this);
        this.b = dxioVar;
        this.m = bepfVar;
        this.n = bepoVar;
        this.o = beieVar;
    }

    @Override // defpackage.beoj, defpackage.beol
    public void a() {
        super.a();
        bepe bepeVar = this.c;
        if (bepeVar != null) {
            bepeVar.j();
        }
        q();
        this.o.a().a(this.k, this.i);
        ilo c = this.h.c();
        if (this.p || c == null) {
            return;
        }
        if (!dgab.TRACKING.equals(this.j) && !dgab.PAUSED.equals(this.j)) {
            return;
        }
        this.o.b(this.g, c);
        this.p = true;
    }

    @Override // defpackage.beoj, defpackage.beol
    public void b() {
        super.b();
        bepe bepeVar = this.c;
        if (bepeVar != null) {
            bepeVar.k();
        }
        this.o.a().c(this.k);
    }

    @Override // defpackage.benp
    public List<cqix<?>> c() {
        dccx<cqix<?>> F = dcdc.F();
        p(F);
        bepe bepeVar = this.c;
        if (bepeVar != null && bepeVar.g().booleanValue()) {
            F.g(cqgr.fT(new beku(), this.c));
        }
        bepe bepeVar2 = this.c;
        boolean z = false;
        if (bepeVar2 != null && bepeVar2.g().booleanValue() && this.a != null) {
            z = true;
        }
        if (Boolean.valueOf(z).booleanValue()) {
            F.g(cqgr.fT(new bejx(), cqkp.T));
        }
        beog beogVar = this.a;
        if (beogVar != null) {
            beogVar.g(F);
        }
        return F.f();
    }

    @Override // defpackage.benp
    public cqfd i() {
        return this.l;
    }

    @Override // defpackage.benw
    @dzsi
    public bgyp k() {
        bepe bepeVar = this.c;
        if (bepeVar == null) {
            return null;
        }
        return bepeVar.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.beoj
    public final void l(RecyclerView recyclerView, int i, int i2) {
        View s;
        super.l(recyclerView, i, i2);
        bepe bepeVar = this.c;
        if (bepeVar == null || !bepeVar.g().booleanValue() || this.c.i() || (s = s()) == null) {
            return;
        }
        s.setY(s.getY() - i2);
    }

    @Override // defpackage.beol
    public void n() {
        super.n();
        dgab dgabVar = this.j;
        if (dgabVar == null) {
            return;
        }
        int ordinal = dgabVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            dbsk.s(this.j);
        } else if (ordinal == 3) {
            this.c = this.m.a(this, this.h);
            this.a = this.n.a(this.g, this, this.h);
        } else if (ordinal != 4) {
        } else {
            this.a = this.n.a(this.g, this, this.h);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.beol
    public final void r(dgab dgabVar) {
        bepe bepeVar;
        super.r(dgabVar);
        if (dgabVar.equals(dgab.TRACKING)) {
            bepe bepeVar2 = this.c;
            if (bepeVar2 == null) {
                bepe a = this.m.a(this, this.h);
                this.c = a;
                a.j();
            } else {
                bepeVar2.l();
            }
            if (this.a == null) {
                this.a = this.n.a(this.g, this, this.h);
                this.a.o();
            }
            cqkx.p(this);
        } else if (!dgabVar.equals(dgab.PAUSED) || (bepeVar = this.c) == null) {
        } else {
            bepeVar.m();
            cqkx.p(this);
        }
    }

    @dzsi
    public final View s() {
        View o = cqkx.o(this);
        if (o == null) {
            return null;
        }
        return cqhu.a(o, belg.a);
    }
}
