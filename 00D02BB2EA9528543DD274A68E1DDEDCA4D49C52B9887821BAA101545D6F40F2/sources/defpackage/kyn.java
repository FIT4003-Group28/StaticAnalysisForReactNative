package defpackage;

import android.view.View;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: kyn  reason: default package */
/* loaded from: classes7.dex */
public final class kyn implements noq {
    public final akox a;
    public final kcy b;
    public final kyi c;
    public final kyq d;
    public boolean e;
    private final bvnx f;
    private final kxu g;
    private final kcv h;
    private final aktm i;
    private final not j;
    private final asmp k;
    private final dbty<astc> l;
    private final lde m;
    private final cqkf<lcw> n;
    private final jty p;
    private final kdh o = new kyl(this);
    private final kym q = new kym(this);

    public kyn(bvnx bvnxVar, bvjj bvjjVar, bnwn bnwnVar, btrm btrmVar, cqkj cqkjVar, akox akoxVar, kxu kxuVar, kcv kcvVar, kcy kcyVar, jty jtyVar, jzp jzpVar, not notVar, kdg kdgVar, asmp asmpVar, dbty dbtyVar, kyx kyxVar, kyy kyyVar) {
        this.f = bvnxVar;
        this.a = akoxVar;
        this.g = kxuVar;
        this.h = kcvVar;
        this.b = kcyVar;
        this.p = jtyVar;
        this.j = notVar;
        this.k = asmpVar;
        this.l = dbtyVar;
        this.m = new lde(true, jzpVar.d());
        this.c = new kyi(akoxVar, btrmVar, kyxVar, kyyVar, kdgVar);
        this.i = new kyc(bvjjVar, bnwnVar, kyxVar, kyyVar, true);
        this.d = new kyq(akoxVar.k(), bvnxVar);
        this.n = cqkjVar.d(new lbq(), ((npb) notVar).b, false);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.non
    public final void a() {
    }

    @Override // defpackage.non
    public final noq b() {
        this.e = this.l.a().c.a == asld.FOLLOWING;
        this.k.y();
        this.b.a(true);
        this.b.c(this.q);
        this.n.e(this.m);
        final View findViewById = this.n.c().findViewById(lbn.r);
        dbsk.s(findViewById);
        findViewById.animate().setStartDelay(4000L).alpha(0.0f).setInterpolator(irf.c).withEndAction(new Runnable(findViewById) { // from class: kyk
            private final View a;

            {
                this.a = findViewById;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.setVisibility(4);
            }
        });
        this.p.setKeyInterceptor(this.o);
        kyi kyiVar = this.c;
        btrm btrmVar = kyiVar.b;
        kyh kyhVar = kyiVar.f;
        dceq a = dcet.a();
        a.b(alho.class, new kyj(alho.class, kyhVar, bvrj.UI_THREAD));
        btrmVar.g(kyhVar, a.a());
        alhv.a().b(kyiVar.g);
        this.a.aj().aF().g(this.i);
        akzm akzmVar = new akzm(this.f);
        alad n = this.a.n();
        alaa a2 = alad.a();
        a2.d(n.j);
        a2.c = n.k;
        akzmVar.a(n, a2.a());
        this.a.r(akzmVar);
        this.g.j(kxo.k().j());
        this.h.i(this);
        return this;
    }

    @Override // defpackage.noq
    public final View d() {
        throw null;
    }

    @Override // defpackage.non
    public final void e() {
        this.h.h(this);
        this.d.a();
        this.a.aj().aF().g(kyc.a);
        kyi kyiVar = this.c;
        kyiVar.b.a(kyiVar.f);
        alhv.a().c(kyiVar.g);
        this.p.a();
        this.b.c(null);
        this.b.a(false);
        if (this.e) {
            this.k.E();
        }
    }

    @Override // defpackage.non
    public final void f() {
    }

    @Override // defpackage.non
    public final String g() {
        return "MapInteractionOverlay";
    }

    @Override // defpackage.non
    public final boolean h() {
        return false;
    }

    @Override // defpackage.non
    public final int i() {
        return nom.a(this);
    }

    @Override // defpackage.noq
    public final void j(noe noeVar) {
        this.j.b(noeVar, this.n.c());
    }
}
