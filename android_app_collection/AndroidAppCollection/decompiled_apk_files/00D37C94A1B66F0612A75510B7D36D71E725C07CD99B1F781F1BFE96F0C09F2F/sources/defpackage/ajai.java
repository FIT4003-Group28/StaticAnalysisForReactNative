package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ajai  reason: default package */
/* loaded from: classes.dex */
public final class ajai {
    public final yni a;
    public final Set b;
    private final bame c;
    private final bame d;
    private final bame e;
    private final bame f;

    public ajai(yni yniVar, Set set, bame bameVar, bame bameVar2, bame bameVar3, bame bameVar4) {
        yniVar.getClass();
        this.a = yniVar;
        set.getClass();
        this.b = set;
        bameVar.getClass();
        this.c = bameVar;
        bameVar2.getClass();
        this.d = bameVar2;
        bameVar3.getClass();
        this.e = bameVar3;
        bameVar4.getClass();
        this.f = bameVar4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void w(ahgq ahgqVar, ajff ajffVar) {
        ajffVar.aa().c(ahgqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void x(ahgv ahgvVar, ajff ajffVar) {
        ajffVar.aq().c(ahgvVar);
    }

    public static final void y(PlayerResponseModel playerResponseModel, ajff ajffVar) {
        ajffVar.as().c(new ahhg(playerResponseModel, ajffVar.Z()));
    }

    public static final void z(ahgz ahgzVar, ajff ajffVar) {
        ajffVar.at().c(ahgzVar);
    }

    public final void a() {
        this.f.c(ahic.a);
        this.e.c(ahic.a);
    }

    public final void b(ajff ajffVar) {
        this.e.c(new ahic(ajffVar));
    }

    public final void c(afkn afknVar, ajff ajffVar) {
        for (ajfb ajfbVar : this.b) {
            ajfbVar.n(afknVar, ajffVar.Z());
        }
        ajffVar.ag().c(afknVar);
    }

    public final void d(ahge ahgeVar, ajff ajffVar) {
        ajffVar.ai().c(ahgeVar);
        for (ajfb ajfbVar : this.b) {
            if (ahgeVar.c()) {
                ajfbVar.g(ahgeVar.b(), ajffVar.Z());
            } else {
                ajfbVar.k(ahgeVar.b(), ajffVar.Z());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(String str) {
        for (ajfb ajfbVar : this.b) {
            ajfbVar.q(str);
        }
    }

    public final void f(ajff ajffVar) {
        this.f.c(new ahic(ajffVar));
    }

    public final void g(aiik aiikVar, ajff ajffVar) {
        for (ajfb ajfbVar : this.b) {
        }
        ajffVar.aw().c(aiikVar);
    }

    public final void h(ajff ajffVar) {
        for (ajfb ajfbVar : this.b) {
            ajfbVar.o(ajffVar.Z(), ajffVar.g());
        }
        this.a.g(ajffVar.i());
        this.c.c(new ahid(ajffVar));
    }

    public final void i(ajff ajffVar) {
        for (ajfb ajfbVar : this.b) {
            ajfbVar.p(ajffVar.Z());
        }
        ajffVar.as().sm();
        ajffVar.aE().sm();
        ajffVar.ad().sm();
        ajffVar.aD().sm();
        ajffVar.av().sm();
        ajffVar.ac().sm();
        ajffVar.aa().sm();
        ajffVar.ag().sm();
        ajffVar.ai().sm();
        ajffVar.al().sm();
        ajffVar.aq().sm();
        ajffVar.aj().sm();
        ajffVar.at().sm();
        ajffVar.aw().sm();
        ajffVar.az().sm();
        ajffVar.aC().sm();
        ajffVar.aF().sm();
        ajffVar.af().sm();
        ajffVar.ap().sm();
        ajffVar.ar().sm();
        ajffVar.ao().sm();
        ajffVar.Y().sh(new ahgg());
        this.d.c(new ahie(ajffVar));
    }

    public final void j() {
        for (ajfb ajfbVar : this.b) {
            ajfbVar.b();
        }
    }

    public final void k(ahhw ahhwVar, ajff ajffVar) {
        for (ajfb ajfbVar : this.b) {
            ajfbVar.R(ahhwVar);
        }
        if (ajffVar != null) {
            ajffVar.aD().c(ahhwVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(ahgl ahglVar, ajff ajffVar) {
        for (ajfb ajfbVar : this.b) {
            ajfbVar.c(ajffVar.Z());
        }
        ajffVar.ar().c(ahglVar);
    }

    public final void m(ahia ahiaVar, ajff ajffVar) {
        v(ahiaVar, 4, ajffVar);
    }

    public final void n(aesr aesrVar, String str) {
        for (ajfb ajfbVar : this.b) {
            ajfbVar.h(aesrVar, str);
        }
        this.a.d(aesrVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(ahhx ahhxVar) {
        for (ajfb ajfbVar : this.b) {
            if (ajfbVar.G()) {
                ajfbVar.e(ahhxVar);
            }
        }
    }

    public final void p(ahhw ahhwVar) {
        for (ajfb ajfbVar : this.b) {
            ajfbVar.R(ahhwVar);
        }
        this.a.d(ahhwVar);
    }

    public final void q(ahhx ahhxVar) {
        for (ajfb ajfbVar : this.b) {
            if (!ajfbVar.G()) {
                ajfbVar.e(ahhxVar);
            }
        }
        this.a.d(ahhxVar);
    }

    public final void r(ahia ahiaVar) {
        for (ajfb ajfbVar : this.b) {
            ajfbVar.v(ahiaVar);
        }
        this.a.d(ahiaVar);
    }

    public final void s(ajff ajffVar, ahhx ahhxVar, int i) {
        for (ajfb ajfbVar : this.b) {
            if (ajfbVar.G()) {
                ajfbVar.e(ahhxVar);
            }
        }
        if (i == 4) {
            ajffVar.ae().c(ahhxVar);
        }
    }

    public final void t(aikd aikdVar, ajff ajffVar, int i) {
        if (i == 4) {
            for (ajfb ajfbVar : this.b) {
                ajfbVar.r(aikdVar);
            }
        }
        ajffVar.ap().c(aikdVar);
    }

    public final void u(ajff ajffVar, ahhx ahhxVar, int i) {
        for (ajfb ajfbVar : this.b) {
            if (!ajfbVar.G()) {
                ajfbVar.e(ahhxVar);
            }
        }
        if (i == 4) {
            ajffVar.aE().c(ahhxVar);
        }
    }

    public final void v(ahia ahiaVar, int i, ajff ajffVar) {
        if (i == 2 || i == 4) {
            for (ajfb ajfbVar : this.b) {
                ajfbVar.v(ahiaVar);
            }
        }
        if (i == 3 || i == 4) {
            if (ajffVar != null) {
                ajffVar.aF().c(ahiaVar);
            } else {
                this.a.d(ahiaVar);
            }
        }
    }
}
