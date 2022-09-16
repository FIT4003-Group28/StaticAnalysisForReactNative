package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cdbb  reason: default package */
/* loaded from: classes4.dex */
public class cdbb extends ges implements btzi<dwnd, dwnf> {
    static final dbsg<String> a = dbpy.a;
    private dbsg<String> aA;
    private dbsg<dspd> aB;
    private dwyd aC;
    private int aO;
    @dzsi
    private cqkf<cdei> aP;
    @dzsi
    private cqkf<cdei> aQ;
    public dxio<cafi> ad;
    public bwqv ae;
    public cdem af;
    public cdey ag;
    public cdam ah;
    public anhk ai;
    public axrx aj;
    public axru ak;
    public gfq al;
    public buul am;
    public bvrb an;
    public eeu ao;
    public chhr ap;
    public dxio<ahjq> aq;
    public bbux ar;
    public btvo as;
    public gga at;
    public Executor au;
    public cdft av;
    public ccie aw;
    @dzsi
    cdbf ax;
    @dzsi
    cdei ay;
    private dbsg<String> az;
    public boolean b;
    @dzsi
    public djgl c;
    public boolean d;
    public cqkj e;
    public efg f;
    public cdfx g;

    public cdbb() {
        dbsg<String> dbsgVar = a;
        this.az = dbsgVar;
        this.aA = dbsgVar;
        this.aB = dbpy.a;
        this.aC = dwyd.UNKNOWN_ENTRY_POINT;
        this.b = false;
        this.d = false;
        this.ay = null;
    }

    private final void aJ(boolean z, dbsg<String> dbsgVar) {
        cdei cdeiVar;
        dbsk.s(this.aP);
        dbsk.s(this.af);
        dwnc bZ = dwnd.e.bZ();
        dnwb a2 = this.ai.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwnd dwndVar = (dwnd) bZ.b;
        a2.getClass();
        dwndVar.d = a2;
        dwndVar.a |= 4;
        if (dbsgVar.a()) {
            String b = dbsgVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwnd dwndVar2 = (dwnd) bZ.b;
            b.getClass();
            dwndVar2.a |= 1;
            dwndVar2.b = b;
        }
        if (this.aB.a()) {
            dspd b2 = this.aB.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwnd dwndVar3 = (dwnd) bZ.b;
            b2.getClass();
            dwndVar3.a |= 2;
            dwndVar3.c = b2;
        }
        this.am.b(bZ.bK(), this, this.au);
        if (z || (cdeiVar = this.ay) == null) {
            aS(cdel.b(this.af, this, aT()));
        } else {
            cqkx.p(cdeiVar);
        }
    }

    private final cdew aR() {
        if (this.aA.a()) {
            return cdew.SUCCESS_HAS_MORE_PAGES;
        }
        return cdew.SUCCESS_NO_MORE_PAGES;
    }

    private final void aS(cdei cdeiVar) {
        this.ay = cdeiVar;
        cqkf<cdei> cqkfVar = this.aP;
        if (cqkfVar != null) {
            cqkfVar.e(cdeiVar);
        }
    }

    private final cdai aT() {
        cdei cdeiVar = this.ay;
        dbuh.d(cdeiVar);
        return cdeiVar.s();
    }

    private final boolean w() {
        int a2 = dvlx.a(this.as.getPhotoUploadParameters().f);
        if (a2 == 0) {
            a2 = 2;
        }
        return a2 == 4 || a2 == 3 || a2 == 5;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwnd> btzrVar, btzy btzyVar) {
        gga ggaVar;
        dbsk.s(this.aP);
        cdbf cdbfVar = this.ax;
        if (cdbfVar != null) {
            aS(this.ag.a(cdbfVar, this, cdew.ERROR, this.at, this.b, aT()));
        } else {
            aS(cdel.a(this.af, this, aT()));
        }
        if (!this.aD || !ppw.a(btzyVar.p) || (ggaVar = this.aE) == null) {
            return;
        }
        ppw.b(ggaVar, new DialogInterface.OnClickListener(this) { // from class: cdax
            private final cdbb a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                cdbb cdbbVar = this.a;
                if (i == -1) {
                    cdbbVar.q();
                }
            }
        }, cday.a);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dwnd> btzrVar, dwnf dwnfVar) {
        dwnf dwnfVar2 = dwnfVar;
        dbsk.s(this.aP);
        Bundle bundle = this.o;
        boolean isEmpty = dwnfVar2.d.isEmpty();
        String str = dwnfVar2.c;
        if (isEmpty) {
            if (!str.isEmpty() && !this.az.c("").equals(str)) {
                this.aA = dbsg.i(str);
                i();
                return;
            } else if (bundle.containsKey("rtcie_key") && ((cdfv) bundle.getSerializable("rtcie_key")) == cdfv.REDIRECT_TO_TODOLIST) {
                this.al.c();
                this.ad.a().k(null, null);
                return;
            }
        }
        this.aA = dwnfVar2.c.isEmpty() ? dbpy.a : dbsg.i(dwnfVar2.c);
        cdbf cdbfVar = this.ax;
        if (cdbfVar != null) {
            cdbfVar.m(dwnfVar2.d);
        } else {
            cdbf cdbfVar2 = new cdbf(dwnfVar2, this.aC);
            this.ax = cdbfVar2;
            cdbfVar2.j(this.g.m());
        }
        cdey cdeyVar = this.ag;
        cdbf cdbfVar3 = this.ax;
        dbsk.s(cdbfVar3);
        aS(cdeyVar.a(cdbfVar3, this, aR(), this.at, this.b, aT()));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        super.Qe();
        cqkf<cdei> cqkfVar = this.aQ;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.aQ = null;
        }
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof aeuf) {
            cdei cdeiVar = this.ay;
            if (cdeiVar instanceof cdex) {
                cdex cdexVar = (cdex) cdeiVar;
                dbsk.s(cdexVar);
                cdexVar.v(this.aO, (aeuf) obj);
                return;
            }
        }
        if (obj instanceof cdil) {
            cdei cdeiVar2 = this.ay;
            if (cdeiVar2 instanceof cdex) {
                cdex cdexVar2 = (cdex) cdeiVar2;
                dbsk.s(cdexVar2);
                cdexVar2.u(this.aO, ((cdil) obj).a());
                return;
            }
        }
        if (obj instanceof bbua) {
            bbua bbuaVar = (bbua) obj;
            dcdn<String, Boolean> c = bbuaVar.c();
            if (this.ax != null) {
                for (Map.Entry<String, Boolean> entry : c.entrySet()) {
                    cdbf cdbfVar = this.ax;
                    dbsk.s(cdbfVar);
                    cdbfVar.g(entry.getKey(), entry.getValue().booleanValue());
                }
            }
            cdei cdeiVar3 = this.ay;
            if (cdeiVar3 != null) {
                cqkx.p(cdeiVar3);
            }
            dcdc<dwfl> a2 = bbuaVar.a();
            if (this.ax == null) {
                return;
            }
            for (dwfl dwflVar : a2) {
                String str = dwflVar.d;
                cdbf cdbfVar2 = this.ax;
                dbsk.s(cdbfVar2);
                cdbfVar2.i(str, dwflVar.g);
            }
        }
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<cdei> d = this.e.d(new cdeg(), viewGroup, false);
        this.aQ = d;
        cdei cdeiVar = this.ay;
        dbsk.s(cdeiVar);
        d.e(cdeiVar);
        View c = this.aQ.c();
        this.aP = this.aQ;
        return c;
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (((cdbb) this.at.z(cdbb.class)) != null) {
            this.at.g().e();
        }
        djgl djglVar = this.c;
        if (djglVar != null) {
            this.ap.b(djglVar, dtxy.oZ, dtxy.pa, null);
            this.c = null;
            return true;
        }
        return true;
    }

    public final void g(boolean z, int i, final akqq akqqVar) {
        this.aO = i;
        if (!z) {
            aZ(cdhp.g(akqqVar, dbpy.a));
        } else {
            this.au.execute(new Runnable(this, akqqVar) { // from class: cdaw
                private final cdbb a;
                private final akqq b;

                {
                    this.a = this;
                    this.b = akqqVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.aZ(cdhp.g(this.b, dbpy.a));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        aJ(false, this.aA);
        this.az = this.aA;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e1  */
    @Override // defpackage.ges, defpackage.fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(@defpackage.dzsi android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdbb.l(android.os.Bundle):void");
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxy.oT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        if (this.ax == null) {
            aS(cdel.b(this.af, this, aT()));
        }
        aJ(false, this.az);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        dbsk.s(this.ay);
        this.ar.e(new axrw(this) { // from class: cdav
            private final cdbb a;

            {
                this.a = this;
            }

            @Override // defpackage.axrw
            public final void a(int i) {
                cdbb cdbbVar = this.a;
                cdei cdeiVar = cdbbVar.ay;
                if (cdeiVar != null) {
                    cdeiVar.g(i);
                    cqkx.p(cdbbVar.ay);
                }
                cdbbVar.b = i == -1;
            }
        }, 3);
        if (this.ax == null) {
            aJ(true, a);
        }
        if (w()) {
            cdei cdeiVar = this.ay;
            if (cdeiVar instanceof cdex) {
                cdex cdexVar = (cdex) cdeiVar;
                if (cdexVar.B() && cdexVar.d == cdew.SUCCESS_HAS_MORE_PAGES) {
                    cdexVar.d = cdew.FETCHING;
                    cdexVar.b.i();
                }
            }
        }
        if (this.ao.h()) {
            efg efgVar = this.f;
            egj egjVar = new egj(this);
            egjVar.ag(null);
            egjVar.f(false);
            egjVar.w(this.P);
            efgVar.a(egjVar.a());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        cdbf cdbfVar = this.ax;
        if (cdbfVar != null) {
            this.ae.c(bundle, "model_key", cdbfVar);
        }
        bundle.putInt("place_picker_listener_index_key", this.aO);
        String str = "";
        bundle.putString("current_ct_key", this.az.a() ? this.az.b() : str);
        if (this.aA.a()) {
            str = this.aA.b();
        }
        bundle.putString("next_ct_key", str);
        bundle.putInt("points_earned_key", aT().a().intValue());
        djgl djglVar = this.c;
        if (djglVar != null) {
            bundle.putByteArray("thanks_page_key", djglVar.bS());
        }
    }
}
