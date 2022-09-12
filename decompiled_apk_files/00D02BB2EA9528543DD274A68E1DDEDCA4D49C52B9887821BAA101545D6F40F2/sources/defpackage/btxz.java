package defpackage;

import java.util.EnumSet;
/* compiled from: PG */
/* renamed from: btxz  reason: default package */
/* loaded from: classes4.dex */
public final class btxz {
    private static final dcqe b = dcqe.c("btxz");
    private static final EnumSet<bttq> c = EnumSet.of(bttq.NO_CONNECTIVITY, bttq.REQUEST_TIMEOUT);
    @dzsi
    public final ckcw a;
    private final dunt d;

    public btxz(@dzsi ckcw ckcwVar, dunt duntVar) {
        this.a = ckcwVar;
        this.d = duntVar;
    }

    public static final boolean e(bttq bttqVar) {
        return c.contains(bttqVar);
    }

    public final void a(bttq bttqVar) {
        if (e(bttqVar)) {
            b();
        }
    }

    public final void b() {
        ckcw ckcwVar = this.a;
        if (ckcwVar != null) {
            ((ckco) ckcwVar.a(ckjg.a)).a(this.d.hp);
        }
    }

    public final void c(btxy btxyVar, long j) {
        if (this.d == dunt.TACTILE_SUGGEST_REQUEST && this.a != null) {
            btxy btxyVar2 = btxy.ONLINE;
            int ordinal = btxyVar.ordinal();
            if (ordinal == 0) {
                ((ckcp) this.a.a(ckjw.S)).a(j);
            } else if (ordinal == 1) {
                ((ckcp) this.a.a(ckjw.R)).a(j);
            } else if (ordinal == 3) {
                ((ckcp) this.a.a(ckjw.U)).a(j);
            } else if (ordinal == 4) {
                ((ckcp) this.a.a(ckjw.T)).a(j);
            } else if (ordinal == 5) {
                ((ckcp) this.a.a(ckjw.V)).a(j);
            } else {
                bvoo.h("Unexpected responseType: %s", btxyVar);
            }
        }
        if (this.d == dunt.TACTILE_PLACE_DETAILS_REQUEST && this.a != null) {
            btxy btxyVar3 = btxy.ONLINE;
            int ordinal2 = btxyVar.ordinal();
            if (ordinal2 == 0) {
                ((ckcp) this.a.a(ckjw.X)).a(j);
            } else if (ordinal2 == 1) {
                ((ckcp) this.a.a(ckjw.W)).a(j);
            } else {
                bvoo.h("Unexpected responseType: %s", btxyVar);
            }
        }
        if (this.d != dunt.TACTILE_SEARCH_REQUEST || this.a == null) {
            return;
        }
        btxy btxyVar4 = btxy.ONLINE;
        int ordinal3 = btxyVar.ordinal();
        if (ordinal3 == 0) {
            ((ckcp) this.a.a(ckjw.aa)).a(j);
        } else if (ordinal3 == 1) {
            ((ckcp) this.a.a(ckjw.Y)).a(j);
        } else if (ordinal3 != 2) {
            switch (ordinal3) {
                case 6:
                    ((ckcp) this.a.a(ckjw.ae)).a(j);
                    return;
                case 7:
                    ((ckcp) this.a.a(ckjw.af)).a(j);
                    return;
                case 8:
                    ((ckcp) this.a.a(ckjw.e)).a(j);
                    return;
                case 9:
                    ((ckcp) this.a.a(ckjw.f)).a(j);
                    return;
                case 10:
                    ((ckcp) this.a.a(ckjw.g)).a(j);
                    return;
                case 11:
                    ((ckcp) this.a.a(ckjw.ad)).a(j);
                    return;
                case 12:
                    ((ckcp) this.a.a(ckjw.ab)).a(j);
                    return;
                case 13:
                    ((ckcp) this.a.a(ckjw.ac)).a(j);
                    return;
                default:
                    bvoo.h("Unexpected responseType: %s", btxyVar);
                    return;
            }
        } else {
            ((ckcp) this.a.a(ckjw.Z)).a(j);
        }
    }

    public final void d(ckha ckhaVar, long j) {
        ckcw ckcwVar = this.a;
        if (ckcwVar != null) {
            ((ckcp) ckcwVar.a(ckhaVar)).a(j);
        }
    }

    public final void f(int i) {
        ckcw ckcwVar = this.a;
        if (ckcwVar != null) {
            ((ckco) ckcwVar.a(ckjw.o)).a(ckjt.a(i));
        }
    }

    public final void g(int i) {
        ckcw ckcwVar = this.a;
        if (ckcwVar != null) {
            ((ckco) ckcwVar.a(ckjw.p)).a(ckjt.a(i));
        }
    }
}
