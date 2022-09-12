package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zjz  reason: default package */
/* loaded from: classes7.dex */
public class zjz implements zbz {
    public static final dcqe a = dcqe.c("zjz");
    @dzsi
    public qjf b;
    @dzsi
    public zev c;
    private final List<zca> d;
    private final amsy e;
    private final Boolean f;
    private final Boolean g;
    private final dqvj h;
    @dzsi
    private final zbr i;
    @dzsi
    private final jam j;
    @dzsi
    private final xgv k;
    private final zce l;
    private final dbty<dqvj> m;
    @dzsi
    private final qbv n;

    public zjz(dqvj dqvjVar, @dzsi zbr zbrVar, @dzsi jam jamVar, List<zca> list, boolean z, boolean z2, @dzsi qjf qjfVar, zaz zazVar, zpj zpjVar, zce zceVar, btvo btvoVar, gga ggaVar, cqhn cqhnVar, bvjj bvjjVar, dxio<afha> dxioVar, @dzsi amsy amsyVar, xfc xfcVar, xfd xfdVar, Executor executor, @dzsi qbv qbvVar, xhk xhkVar, ckcw ckcwVar) {
        btlu j;
        String z3;
        this.i = zbrVar;
        this.j = jamVar;
        this.d = list;
        this.e = amsyVar;
        this.f = Boolean.valueOf(z);
        this.g = Boolean.valueOf(z2);
        this.h = dqvjVar;
        this.m = dbud.b(dqvjVar);
        this.l = zceVar;
        this.n = qbvVar;
        ggaVar.getResources();
        xhj xhjVar = null;
        if (zazVar.a.getDirectionsPageParameters() == null || !zazVar.a.getDirectionsPageParameters().G || (j = zazVar.b.a().j()) == null || !j.u() || !zazVar.c.a() || amsyVar == null || amsyVar.c() == null || ((z3 = zazVar.d.z(bvjk.km, null)) != null && z3.equals(amsyVar.c()))) {
            this.c = null;
            this.b = qjfVar;
        } else {
            zjo zjoVar = new zjo(this);
            String c = amsyVar.c();
            Resources a2 = zpjVar.a.a();
            zpj.a(a2, 1);
            cqhn a3 = zpjVar.b.a();
            zpj.a(a3, 2);
            cjbx a4 = zpjVar.c.a();
            zpj.a(a4, 3);
            cezv a5 = zpjVar.d.a();
            zpj.a(a5, 4);
            zaz a6 = zpjVar.e.a();
            zpj.a(a6, 5);
            zpj.a(zjoVar, 6);
            zpj.a(c, 7);
            this.c = new zpi(a2, a3, a4, a5, a6, zjoVar, c);
            this.b = null;
        }
        if (btvoVar.getDirectionsPageParameters().o && ((amsyVar == null || zhe.b(amsyVar).isEmpty()) && amsyVar != null)) {
            xgu xguVar = new xgu(this) { // from class: zjp
                private final zjz a;

                {
                    this.a = this;
                }

                @Override // defpackage.xgu
                public final void a() {
                    cqkx.p(this.a);
                }
            };
            dxio a7 = ((dxjh) xhkVar.a).a();
            xhk.a(a7, 1);
            xhk.a(ggaVar, 2);
            xhk.a(cqhnVar, 3);
            xhk.a(bvjjVar, 4);
            xhk.a(dxioVar, 5);
            xhk.a(amsyVar, 6);
            xhk.a(xfcVar, 7);
            xhk.a(xfdVar, 8);
            xhk.a(btvoVar, 9);
            xhk.a(ckcwVar, 10);
            xhk.a(xguVar, 11);
            xhk.a(executor, 12);
            xhjVar = new xhj(a7, ggaVar, cqhnVar, bvjjVar, dxioVar, amsyVar, xfcVar, xfdVar, btvoVar, ckcwVar, xguVar, executor);
        }
        this.k = xhjVar;
    }

    @Override // defpackage.zbz
    public List<zca> a() {
        return this.d;
    }

    @Override // defpackage.zbz
    public Boolean b() {
        amsy amsyVar = this.e;
        boolean z = false;
        if (amsyVar == null || !amsyVar.u().isEmpty()) {
            return false;
        }
        if (c().booleanValue() || d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbz
    public Boolean c() {
        amsy amsyVar = this.e;
        boolean z = false;
        if (amsyVar != null && amsyVar.v()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbz
    public Boolean d() {
        amsy amsyVar = this.e;
        boolean z = false;
        if (amsyVar != null && amsyVar.w()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbz
    public Boolean e() {
        return this.f;
    }

    @Override // defpackage.zbz
    @dzsi
    public zbr f() {
        return this.i;
    }

    @Override // defpackage.zbz
    @dzsi
    public jam g() {
        return this.j;
    }

    @Override // defpackage.zbz
    public Boolean h() {
        return this.g;
    }

    @Override // defpackage.zbz
    @dzsi
    public qjf i() {
        return this.b;
    }

    @Override // defpackage.zbz
    public zce j() {
        return this.l;
    }

    @Override // defpackage.zbz
    public dbty<dqvj> k() {
        return this.m;
    }

    @Override // defpackage.zbz
    @dzsi
    public xgv l() {
        return this.k;
    }

    @Override // defpackage.zbz
    public Boolean m() {
        qbv qbvVar;
        boolean z = false;
        if (this.h == dqvj.TRANSIT && (qbvVar = this.n) != null && qbvVar.a()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbz
    public Boolean n() {
        qbv qbvVar = this.n;
        boolean z = false;
        if (qbvVar != null && qbvVar.d()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.zbz
    @dzsi
    public zev o() {
        return this.c;
    }

    public Boolean p() {
        return Boolean.valueOf(this.h == dqvj.TAXI);
    }

    public boolean q() {
        for (zca zcaVar : this.d) {
            if (zcaVar.l()) {
                return true;
            }
        }
        return false;
    }

    public void r(Context context) {
        for (zca zcaVar : this.d) {
            zcaVar.m(context);
        }
        qjf qjfVar = this.b;
        if (qjfVar != null) {
            qjfVar.c();
        }
    }
}
