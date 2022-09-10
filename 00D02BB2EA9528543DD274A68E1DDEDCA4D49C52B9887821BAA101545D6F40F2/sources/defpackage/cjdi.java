package defpackage;

import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: cjdi  reason: default package */
/* loaded from: classes4.dex */
public class cjdi extends hxf {
    public dxio<bqji> ad;
    public dxio<cdjj> ae;
    public cjcy af;
    public cjdz ag;
    private cjdt ah;
    private cqkf<cjdt> ai;
    private dlif aj;
    public cqkj b;
    public efg c;
    public cjds d;
    public dxio<aesb> e;
    public dxio<anhg> f;
    public dxio<chnm> g;

    public static cjdi aR(dlif dlifVar, cjdz cjdzVar) {
        cjdi cjdiVar = new cjdi();
        Bundle bundle = new Bundle();
        bvrs.l(bundle, dlifVar);
        bvrs.l(bundle, cjdzVar);
        cjdiVar.B(bundle);
        return cjdiVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        this.ai.e(null);
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(Object obj) {
        if (obj instanceof aeuf) {
            ilo c = ((aeuf) obj).f().c();
            dbsk.s(c);
            aS(cjcz.b(c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void aS(cjcz cjczVar) {
        cjcx cjcxVar = (cjcx) cjczVar;
        ilo iloVar = cjcxVar.a;
        cjcy cjcyVar = this.af;
        dlif dlifVar = this.aj;
        akqi ai = iloVar.ai();
        String n = iloVar.n();
        cjdx b = cjdx.b(this.ag.c);
        if (b == null) {
            b = cjdx.UNKNOWN;
        }
        dvya bZ = dvyw.bv.bZ();
        String o = ai.o();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvyw dvywVar = (dvyw) bZ.b;
        o.getClass();
        dvywVar.a |= 4;
        dvywVar.g = o;
        cjcyVar.a.r(dbpy.a, aogf.c(new eaph(dlifVar.a), new eaph(dlifVar.b)).e(), bZ.bK(), 1, dbpy.a, dnqm.c, dbsg.i(cjcyVar.b.a(dlifVar, 0, n, b)), false);
        ((cjdh) new au(this).a(cjdh.class)).a.g(cjcxVar.a);
        aT();
        cjdx b2 = cjdx.b(this.ag.c);
        if (b2 == null) {
            b2 = cjdx.UNKNOWN;
        }
        int ordinal = b2.ordinal();
        if (ordinal == 1) {
            bqjf r = bqjh.r();
            r.f(bzwi.c(blpk.REVIEW_AT_A_PLACE_NOTIFICATION));
            r.d(true);
            ((bqir) r).d = dpyv.REVIEW_AT_A_PLACE;
            r.i(this.aj);
            this.ad.a().b(bwrs.a(iloVar), r.o());
        } else if (ordinal == 2) {
            cdje e = cdjf.e();
            dnqg bZ2 = dnqh.p.bZ();
            dnmu dnmuVar = dnmu.PROPERTY_GMM;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ2.b;
            dnqhVar.l = dnmuVar.ap;
            dnqhVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            e.b(bZ2.bK());
            this.ae.a().c(bwrs.a(iloVar), e.a());
        } else {
            Nw(cjczVar);
        }
    }

    public final void aT() {
        J().g().f();
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz a = jhz.a();
        a.a = Rp(R.string.UPDATE_VISIT_PAGE_TITLE);
        a.b = this.aj == null ? "" : DateUtils.formatDateTime(H(), this.aj.b, 18);
        a.i = cqrt.f(2131232205);
        a.o = cjtd.a(dtyd.bi);
        a.f(new View.OnClickListener(this) { // from class: cjdg
            private final cjdi a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cjdi cjdiVar = this.a;
                cjdiVar.aT();
                cjdx b = cjdx.b(cjdiVar.ag.c);
                if (b == null) {
                    b = cjdx.UNKNOWN;
                }
                if (b.equals(cjdx.OPEN_REVIEW_EDITOR)) {
                    cjdiVar.g.a().f();
                }
            }
        });
        return a.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, Bundle bundle) {
        cqkf<cjdt> e = this.b.e(new cjdp());
        this.ai = e;
        e.e(this.ah);
        return this.ai.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        dlif dlifVar = (dlif) bvrs.e(this.o, dlif.class, (dssr) dlif.d.cu(7));
        dbsk.s(dlifVar);
        this.aj = dlifVar;
        cjdz cjdzVar = (cjdz) bvrs.e(this.o, cjdz.class, (dssr) cjdz.d.cu(7));
        dbsk.s(cjdzVar);
        this.ag = cjdzVar;
        q(g());
        cjdz cjdzVar2 = this.ag;
        if (cjdzVar2.b) {
            cjcy cjcyVar = this.af;
            dlif dlifVar2 = this.aj;
            cjdx b = cjdx.b(cjdzVar2.c);
            if (b == null) {
                b = cjdx.UNKNOWN;
            }
            long j = dlifVar2.a;
            long j2 = dlifVar2.b;
            dval bZ = dvay.u.bZ();
            dvax dvaxVar = dvax.STOP;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvay dvayVar = (dvay) bZ.b;
            dvayVar.m = dvaxVar.f;
            dvayVar.a |= 64;
            dwyn a = cjcy.a(j);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvay dvayVar2 = (dvay) bZ.b;
            a.getClass();
            dvayVar2.f = a;
            dvayVar2.a |= 4;
            dwyn a2 = cjcy.a(j2);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvay dvayVar3 = (dvay) bZ.b;
            a2.getClass();
            dvayVar3.g = a2;
            dvayVar3.a |= 8;
            dvaq bZ2 = dvat.g.bZ();
            dvar bZ3 = dvas.g.bZ();
            dvya bZ4 = dvyw.bv.bZ();
            dgrh dgrhVar = dlifVar2.c.get(0).a;
            if (dgrhVar == null) {
                dgrhVar = dgrh.d;
            }
            String o = akqi.k(dgrhVar).o();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dvyw dvywVar = (dvyw) bZ4.b;
            o.getClass();
            dvywVar.a |= 4;
            dvywVar.g = o;
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dvas dvasVar = (dvas) bZ3.b;
            dvyw bK = bZ4.bK();
            bK.getClass();
            dvasVar.b = bK;
            dvasVar.a |= 1;
            bZ2.a(bZ3);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvay dvayVar4 = (dvay) bZ.b;
            dvat bK2 = bZ2.bK();
            bK2.getClass();
            dvayVar4.c = bK2;
            dvayVar4.b = 7;
            dvay bK3 = bZ.bK();
            dpoo bZ5 = dpop.d.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dpop dpopVar = (dpop) bZ5.b;
            int i = dpopVar.a | 1;
            dpopVar.a = i;
            dpopVar.b = j;
            dpopVar.a = i | 2;
            dpopVar.c = j2;
            cjcyVar.a.q(bK3, 1, bZ5.bK(), dbsg.i(cjcyVar.b.a(dlifVar2, 1, dlifVar2.c.get(0).b, b)), false);
        }
        this.ah = new cjdv(this, this.aj, this.d, this.e, this.f);
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtyd.bg;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        this.c.a(egjVar.a());
    }
}
