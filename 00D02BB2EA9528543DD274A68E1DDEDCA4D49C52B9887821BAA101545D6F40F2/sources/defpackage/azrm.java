package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: azrm  reason: default package */
/* loaded from: classes3.dex */
public final class azrm extends bxel implements bxeq {
    private static final dcqe ae = dcqe.c("azrm");
    public gcg a;
    public axwi ad;
    @dzsi
    private bwrs<baad> ag;
    public bwqv b;
    public gfq c;
    public cztz d;
    public bvrb e;
    public axwy f;
    public befw g;
    private boolean af = false;
    private boolean ah = false;
    private boolean ai = false;

    public static azrm aR(bwqv bwqvVar, boolean z, String str) {
        azrm bp = bp(bwqvVar, str, true);
        Bundle bundle = bp.o;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("for-starred-places", true);
        bundle.putBoolean("save-on-select", z);
        bp.B(bundle);
        return bp;
    }

    public static azrm aS(bwqv bwqvVar, bwrs<baad> bwrsVar, boolean z, String str, boolean z2) {
        dbsk.s(bwrsVar.c());
        azrm bp = bp(bwqvVar, str, z2);
        Bundle bundle = bp.o;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bwqvVar.c(bundle, "local-list", bwrsVar);
        bundle.putBoolean("for-starred-places", false);
        bundle.putBoolean("save-on-select", z);
        bp.B(bundle);
        return bp;
    }

    private static azrm bp(bwqv bwqvVar, String str, boolean z) {
        bxko bxkoVar = new bxko();
        bxkoVar.c(bxla.PLACE_PICKER_NON_CURRENT_LOCATION);
        bxkoVar.q(true);
        bxkoVar.g = z;
        bxkoVar.z(301989894);
        bxkoVar.g(str);
        bxkoVar.V();
        bxkoVar.F(false);
        azrm azrmVar = new azrm();
        azrmVar.bu(bwqvVar, bxkoVar, null);
        return azrmVar;
    }

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof aneh) {
            ily ilyVar = new ily();
            ilyVar.q(((aneh) obj).a());
            ilyVar.F(J().getString(R.string.DROPPED_PIN));
            bn(ilyVar.d());
        } else if (!(obj instanceof ilo)) {
            bvoo.h("Invalid result type in onFragmentResult %s", new IllegalArgumentException());
        } else {
            befu p = befv.p();
            p.j(bwrs.a((ilo) obj));
            p.l(true);
            ((bdvy) this.g).f(new azrl(this), p.m());
        }
    }

    @Override // defpackage.bxel
    protected final bxeq aJ() {
        return this;
    }

    @Override // defpackage.bxeq
    public final void aK() {
    }

    @Override // defpackage.bxeq
    public final void aL(String str) {
    }

    @Override // defpackage.bxeq
    public final void aM(bxmh bxmhVar, List list) {
    }

    @Override // defpackage.bxeq
    public final boolean aN() {
        return false;
    }

    @Override // defpackage.bxel
    @dzsi
    public final bxnw aT() {
        gga ggaVar;
        if (!this.aQ.getEnableFeatureParameters().ab || !this.bb.g || (ggaVar = this.aE) == null) {
            return null;
        }
        String string = ggaVar.getString(R.string.CHOOSE_ON_MAP_HOME_WORK_CARD_TEXT);
        String string2 = ggaVar.getString(R.string.CHOOSE_ON_MAP_HOME_WORK_TITLE);
        String string3 = ggaVar.getString(R.string.CHOOSE_ON_MAP_HOME_WORK_SUBTITLE);
        ddho ddhoVar = dtxl.F;
        ddho ddhoVar2 = dtxl.H;
        cjtd a = cjtd.a(dtxl.G);
        final boolean a2 = this.a.a();
        return this.aZ.a(string, string2, string3, false, this, null, null, null, ddhoVar, ddhoVar2, a, false, true, new bxov(this, a2) { // from class: azri
            private final azrm a;
            private final boolean b;

            {
                this.a = this;
                this.b = a2;
            }

            @Override // defpackage.bxov
            public final ancv a(aneb anebVar) {
                dbsg<cjmu> dbsgVar;
                dbsg<aned> dbsgVar2;
                azrm azrmVar = this.a;
                boolean z = this.b;
                if (azrmVar.az.c()) {
                    dbsgVar = dbsg.i(cjmu.TRANSPARENT_BG_DARK_ICONS_DM_AWARE);
                } else {
                    dbsgVar = dbpy.a;
                }
                andx andxVar = (andx) anebVar;
                andxVar.i = dbsgVar;
                if (z) {
                    dbsgVar2 = dbsg.i(aned.MOD_TOOLBAR);
                } else {
                    dbsgVar2 = dbpy.a;
                }
                andxVar.h = dbsgVar2;
                return ancv.w(anebVar.a());
            }
        });
    }

    public final void aU() {
        gfq.l(this);
    }

    public final void aV(izr izrVar) {
        bxqh bxqhVar = this.be;
        if (bxqhVar != null) {
            bxqhVar.QF(izrVar);
            cqkx.p(this.be);
        }
    }

    public final void aX() {
        cztq a = cztt.a(this.d);
        a.c = J().getString(R.string.FAIL_TO_ADD_PLACE_PROMPT);
        a.d(cztr.LONG);
        a.c();
        aV(izr.EDIT);
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        akqq akqqVar;
        if (!this.aD || this.ai) {
            return;
        }
        aV(izr.LOADING);
        dwjj dwjjVar = bxmhVar.b;
        if (dwjjVar == null) {
            dwjjVar = dwjj.k;
        }
        dvzj dvzjVar = dwjjVar.g;
        if (dvzjVar == null) {
            dvzjVar = dvzj.y;
        }
        dxbp dxbpVar = dwjjVar.b;
        if (dxbpVar == null) {
            dxbpVar = dxbp.x;
        }
        if ((dvzjVar.a & 4) == 0) {
            if ((dxbpVar.a & 4096) == 0) {
                Iterator<dxbr> it = dxbpVar.k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        akqqVar = null;
                        break;
                    }
                    dxbr next = it.next();
                    if (next.f && (next.a & 512) != 0) {
                        dwzj dwzjVar = next.g;
                        if (dwzjVar == null) {
                            dwzjVar = dwzj.d;
                        }
                        akqqVar = akqq.q(dwzjVar);
                    }
                }
            } else {
                dwzj dwzjVar2 = dxbpVar.j;
                if (dwzjVar2 == null) {
                    dwzjVar2 = dwzj.d;
                }
                akqqVar = akqq.q(dwzjVar2);
            }
        } else {
            dhjz dhjzVar = dvzjVar.d;
            if (dhjzVar == null) {
                dhjzVar = dhjz.e;
            }
            akqqVar = akqq.j(dhjzVar);
        }
        if (akqqVar == null) {
            aX();
            return;
        }
        dwjj dwjjVar2 = bxmhVar.b;
        if (dwjjVar2 == null) {
            dwjjVar2 = dwjj.k;
        }
        dvzj dvzjVar2 = dwjjVar2.g;
        if (dvzjVar2 == null) {
            dvzjVar2 = dvzj.y;
        }
        if ((dvzjVar2.a & 1) == 0) {
            aX();
            return;
        }
        befu p = befv.p();
        ily ilyVar = new ily();
        ilyVar.k(dvzjVar2.b);
        ilyVar.u = dvzjVar2.c;
        ilyVar.q(akqqVar);
        p.j(bwrs.a(ilyVar.d()));
        p.l(true);
        befv m = p.m();
        ((bdvy) this.g).f(new azrl(this), m);
        this.ai = true;
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        this.af = bundle2.getBoolean("for-starred-places");
        this.ah = bundle2.getBoolean("save-on-select");
        if (!this.af) {
            try {
                this.ag = this.b.e(baad.class, bundle2, "local-list");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.g.a();
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.b.c(bundle, "local-list", this.ag);
        bundle.putBoolean("for-starred-places", this.af);
        bundle.putBoolean("save-on-select", this.ah);
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.fd
    public final void u() {
        this.g.b();
        super.u();
    }

    public final void bn(ilo iloVar) {
        if (!this.af) {
            bwrs<baad> bwrsVar = this.ag;
            dbsk.s(bwrsVar);
            baad c = bwrsVar.c();
            dbsk.s(c);
            baal d = this.ad.d(c, iloVar);
            if (!c.b(d) || !this.ah) {
                aU();
                return;
            } else {
                deha.q(this.ad.j(c), new azrj(this, d, iloVar), this.e.h());
                return;
            }
        }
        if (!iloVar.bN() && this.ah) {
            this.f.f(bwrs.a(iloVar));
        }
        if (!this.ah) {
            Nw(new azrn(iloVar, null));
        }
        aU();
    }
}
