package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahgr  reason: default package */
/* loaded from: classes2.dex */
public class ahgr extends ahhv {
    public final agwu a;
    private final ahar b;
    private final List<agxa<?>> c;
    private final cjta d;
    private final dlcx e;
    private final ahgm f;

    public ahgr(ahas ahasVar, ahgn ahgnVar, ahht ahhtVar, ahfo ahfoVar, final dxio<agaw> dxioVar, agxf agxfVar, dlcv dlcvVar, int i, agyh agyhVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        dlci dlciVar;
        boolean z;
        boolean z2;
        this.c = new ArrayList();
        if (dlcvVar.b == 12) {
            dlciVar = (dlci) dlcvVar.c;
        } else {
            dlciVar = dlci.d;
        }
        dlcx dlcxVar = dlciVar.c;
        dlcxVar = dlcxVar == null ? dlcx.e : dlcxVar;
        this.e = dlcxVar;
        ddyt bZ = ddyu.i.bZ();
        boolean z3 = agyhVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyu ddyuVar = (ddyu) bZ.b;
        int i2 = ddyuVar.a | 4;
        ddyuVar.a = i2;
        ddyuVar.c = z3;
        dspd dspdVar = dlcvVar.d;
        dspdVar.getClass();
        int i3 = i2 | 512;
        ddyuVar.a = i3;
        ddyuVar.h = dspdVar;
        int i4 = i3 | 8;
        ddyuVar.a = i4;
        ddyuVar.d = i;
        ddyuVar.a = i4 | 16;
        ddyuVar.e = 47036;
        dvyw dvywVar = dlcxVar.c;
        dqbi dqbiVar = (dvywVar == null ? dvyw.bv : dvywVar).bg;
        float f = (dqbiVar == null ? dqbi.g : dqbiVar).b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddyu ddyuVar2 = (ddyu) bZ.b;
        ddyuVar2.a |= 64;
        ddyuVar2.f = f;
        dvyw dvywVar2 = dlcxVar.c;
        dqbi dqbiVar2 = (dvywVar2 == null ? dvyw.bv : dvywVar2).bg;
        for (dqbq dqbqVar : (dqbiVar2 == null ? dqbi.g : dqbiVar2).c) {
            int i5 = dqbqVar.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddyu ddyuVar3 = (ddyu) bZ.b;
            dsrf dsrfVar = ddyuVar3.g;
            if (!dsrfVar.a()) {
                ddyuVar3.g = dsqw.cg(dsrfVar);
            }
            ddyuVar3.g.h(i5);
        }
        ddzf bZ2 = ddzg.t.bZ();
        ddyu bK = bZ.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ2.b;
        bK.getClass();
        ddzgVar.k = bK;
        ddzgVar.b |= 1;
        ddzg bK2 = bZ2.bK();
        cjta z4 = z(dlciVar.a, i, bK2, agyhVar);
        this.d = z4;
        ahfn a = ahfoVar.a(this.e, 0, bK2, null, false);
        this.a = a;
        agyg agygVar = agyhVar.f;
        if (((agygVar == null ? agyg.c : agygVar).a & 1) != 0) {
            agyg agygVar2 = agyhVar.f;
            z = (agygVar2 == null ? agyg.c : agygVar2).b;
        } else {
            dlcx dlcxVar2 = dlciVar.c;
            dvyw dvywVar3 = (dlcxVar2 == null ? dlcx.e : dlcxVar2).c;
            dnwf dnwfVar = (dvywVar3 == null ? dvyw.bv : dvywVar3).Y;
            if (((dnwfVar == null ? dnwf.r : dnwfVar).a & 16) == 0) {
                dlcx dlcxVar3 = dlciVar.c;
                dvyw dvywVar4 = (dlcxVar3 == null ? dlcx.e : dlcxVar3).c;
                dnwf dnwfVar2 = (dvywVar4 == null ? dvyw.bv : dvywVar4).Y;
                if ((dnwfVar2 == null ? dnwf.r : dnwfVar2).n.isEmpty()) {
                    z = false;
                }
            }
            z = true;
        }
        dvyw dvywVar5 = this.e.c;
        dqbi dqbiVar3 = (dvywVar5 == null ? dvyw.bv : dvywVar5).bg;
        dqbiVar3 = dqbiVar3 == null ? dqbi.g : dqbiVar3;
        btvo a2 = ahgnVar.a.a();
        ahgn.a(a2, 1);
        cqhn a3 = ahgnVar.b.a();
        ahgn.a(a3, 2);
        gga a4 = ahgnVar.c.a();
        ahgn.a(a4, 3);
        dxio a5 = ((dxjh) ahgnVar.d).a();
        ahgn.a(a5, 4);
        afzs a6 = ahgnVar.e.a();
        ahgn.a(a6, 5);
        akfa a7 = ahgnVar.f.a();
        ahgn.a(a7, 6);
        dzsj<bbdv> dzsjVar = ahgnVar.g;
        agag a8 = ahgnVar.h.a();
        ahgn.a(a8, 8);
        agbq a9 = ahgnVar.i.a();
        ahgn.a(a9, 9);
        dlci dlciVar2 = dlciVar;
        ahgn.a(agxfVar, 10);
        ahgn.a(a, 11);
        ahgn.a(dlcvVar, 12);
        ahgn.a(dqbiVar3, 13);
        ahgn.a(z4, 14);
        ahgm ahgmVar = new ahgm(a2, a3, a4, a5, a6, a7, dzsjVar, a8, a9, agxfVar, a, dlcvVar, dqbiVar3, z4, z);
        this.f = ahgmVar;
        this.b = ahasVar.a(dlciVar2.b, null, new jic((String) null, ckqc.FULLY_QUALIFIED, iup.e(R.raw.personal_score_circle), 0), new ahaq(this) { // from class: ahgo
            private final ahgr a;

            {
                this.a = this;
            }

            @Override // defpackage.ahaq
            public final void a() {
                this.a.a.o();
            }
        }, a.p(dtxu.by), dlciVar2.b, null, this);
        List<agxa<?>> list = this.c;
        agvc c = agvd.c();
        c.b(12);
        list.add(agxa.a(new agve(c.a()), new ahip(new ahiq(a.c(), a.k(), new cqkn(this) { // from class: ahgp
            private final ahgr a;

            {
                this.a = this;
            }

            @Override // defpackage.cqkn
            public final void a(cqkp cqkpVar, View view) {
                ahae ahaeVar = (ahae) cqkpVar;
                this.a.a.o();
            }
        }, a.p(dtxu.by)))));
        this.c.add(agxa.a(new agpt(), ahgmVar));
        jic d = a.d();
        if (d != null) {
            z2 = true;
            this.c.add(agxa.a(new agrb(), new ahhd(ahdh.b(d), new cqkn(this, dxioVar) { // from class: ahgq
                private final ahgr a;
                private final dxio b;

                {
                    this.a = this;
                    this.b = dxioVar;
                }

                @Override // defpackage.cqkn
                public final void a(cqkp cqkpVar, View view) {
                    agzz agzzVar = (agzz) cqkpVar;
                    ((agaw) this.b.a()).a(this.a.a.b(), bege.PHOTOS, jjn.FULLY_EXPANDED);
                }
            }, this.k.getString(R.string.LOCALSTREAM_ACCESSIBILITY_SEE_PHOTOS, new Object[]{a.b().n()}), a.p(dtxu.cm))));
        } else {
            z2 = true;
        }
        List<agxa<?>> list2 = this.c;
        agoa h = agob.h();
        h.e(z2);
        list2.add(agxa.a(new agdj(h.a()), new ahfl(a)));
    }

    @Override // defpackage.ahhv
    public agbm Pg() {
        return this.f;
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.c;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.d.b(ddhoVar);
    }

    @Override // defpackage.agxe
    public cqix<agyq> c() {
        return cqgr.fT(new agdv(), this.b);
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return dcdc.f(this.a);
    }

    @Override // defpackage.ahhv
    public agwu o() {
        return this.f.m();
    }
}
