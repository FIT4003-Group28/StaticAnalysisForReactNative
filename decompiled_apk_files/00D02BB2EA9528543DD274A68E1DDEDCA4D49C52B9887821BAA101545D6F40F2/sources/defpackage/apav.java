package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.BitSet;
import java.util.HashSet;
/* compiled from: PG */
/* renamed from: apav  reason: default package */
/* loaded from: classes2.dex */
public final class apav extends ges implements apaw {
    private static final dcqe an = dcqe.c("apav");
    public bwqv a;
    public axwo ad;
    public gfq ae;
    public gga af;
    public angp ag;
    public aoxv ah;
    cqkf<apbs> ai;
    cqkf<jam> aj;
    public bwrs<aoyg> ak;
    public bwrs<HashSet<akqi>> al;
    public BitSet am;
    private final bwrr<aoyg> ao = new bwrr(this) { // from class: apao
        private final apav a;

        {
            this.a = this;
        }

        @Override // defpackage.bwrr
        public final void PV(Object obj) {
            apav apavVar = this.a;
            aoyg aoygVar = (aoyg) obj;
            aoyg c = apavVar.ak.c();
            dbsk.s(c);
            if (c.b() == aoyf.ERROR) {
                apavVar.g.b(apavVar.ak, apavVar.af);
                return;
            }
            apavVar.g.a(apavVar.ak);
            apavVar.q();
        }
    };
    private final bwrr<HashSet<akqi>> ap = new bwrr(this) { // from class: apap
        private final apav a;

        {
            this.a = this;
        }

        @Override // defpackage.bwrr
        public final void PV(Object obj) {
            HashSet hashSet = (HashSet) obj;
            this.a.q();
        }
    };
    private cqkf<apbt> aq;
    private aoxr ar;
    private apbs as;
    private apbt at;
    public dxio<efg> b;
    public cqkj c;
    public apbx d;
    public cqhu e;
    public apcb f;
    public apcl g;

    private final void aT(boolean z) {
        egj egjVar = new egj(this);
        egjVar.ai(jjn.FULLY_EXPANDED);
        egjVar.ak(jkc.q, jkc.q);
        egjVar.G(this.aq.c(), 6);
        egjVar.w(null);
        egjVar.C(aozr.l(this.aq, this.e));
        if (z) {
            egjVar.ag(this.aj.c());
        } else {
            egjVar.ag(this.ai.c());
        }
        this.b.a().a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj instanceof baad) {
            gfq.l(this);
            baad baadVar = (baad) obj;
            baadVar.T(baadVar.k());
            this.ad.i(baadVar);
        }
    }

    public final void aJ() {
        HashSet<akqi> c = this.al.c();
        dbsk.s(c);
        aoyg c2 = this.ak.c();
        dbsk.s(c2);
        apau apauVar = new apau(this, (BitSet) this.am.clone(), c2, c);
        angp angpVar = this.ag;
        dccx dccxVar = new dccx();
        aoyg c3 = this.ak.c();
        dbsk.s(c3);
        dcdc<aoxt> c4 = c3.c();
        for (int i = 0; i < c4.size(); i++) {
            if (this.am.get(i)) {
                dccxVar.g(c4.get(i).a().h());
            }
        }
        angpVar.h(dccxVar.f(), dnqh.p, dbsg.i(apauVar));
        dcen dcenVar = new dcen();
        aoyg c5 = this.ak.c();
        dbsk.s(c5);
        dcdc<aoxt> c6 = c5.c();
        for (int i2 = 0; i2 < c6.size(); i2++) {
            if (this.am.get(i2)) {
                dcenVar.b(c6.get(i2).a().ai());
            }
        }
        c.addAll(dcenVar.f());
        g();
        this.ah.f();
        q();
    }

    public final int aR() {
        aoyg c = this.ak.c();
        dbsk.s(c);
        dcdc<aoxt> c2 = c.c();
        int size = c2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            HashSet<akqi> c3 = this.al.c();
            dbsk.s(c3);
            if (!c3.contains(c2.get(i2).a().ai())) {
                i++;
            }
        }
        return i;
    }

    public final void aS() {
        ckos.a(this.af.findViewById(16908290), this.af.getResources().getString(R.string.MAPS_ACTIVITY_BULK_SELECT_LIMIT_WARNING, 200), 0).c();
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        this.ai = this.c.c(new apay(), viewGroup);
        this.aq = this.c.c(new apbj(), viewGroup);
        this.aj = this.c.c(new aozn(), viewGroup);
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        bwqv.t(this.ak, this.ao);
        bwqv.t(this.al, this.ap);
        super.am();
    }

    @Override // defpackage.apaw
    public final void g() {
        BitSet bitSet = this.am;
        bitSet.clear(0, bitSet.length());
        w();
    }

    @Override // defpackage.apaw
    public final int i() {
        return this.am.cardinality();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        if (bundle == null) {
            bvoo.h("No state available in onCreate", new Object[0]);
        }
        this.ak = this.g.g(bundle);
        aoxr aoxrVar = (aoxr) bundle.getSerializable("currently_sorted_by");
        if (aoxrVar == null) {
            aoxrVar = aoxr.LAST_VISIT_TIME;
        }
        this.ar = aoxrVar;
        aoyg c = this.ak.c();
        dbsk.s(c);
        int size = c.c().size();
        BitSet bitSet = (BitSet) bundle.getSerializable("selected");
        if (bitSet == null) {
            bitSet = new BitSet(size);
        }
        this.am = bitSet;
        this.al = this.g.f(bundle);
        this.a.f(this.ak, this.ao, false);
        this.a.f(this.al, this.ap, false);
    }

    public final void q() {
        String string;
        if (!this.aD) {
            return;
        }
        if (aR() == 0) {
            aoyg c = this.ak.c();
            dbsk.s(c);
            if (c.a().b().a()) {
                string = this.af.getString(R.string.NO_PLACE_VISITS_OF_THIS_TYPE);
            } else {
                string = this.af.getString(R.string.NO_PLACE_VISITS);
            }
            this.aj.e(aphf.a(aowm.NO_VISITED_PLACES, this.af, string, null, null));
            aT(true);
            return;
        }
        apbx apbxVar = this.d;
        bwrs<aoyg> bwrsVar = this.ak;
        aoxr aoxrVar = this.ar;
        apcd a = apbxVar.a.a();
        apbx.a(a, 1);
        apcf a2 = apbxVar.b.a();
        apbx.a(a2, 2);
        apbx.a(this, 3);
        apbx.a(bwrsVar, 4);
        apbx.a(aoxrVar, 5);
        this.as = new apbw(a, a2, this, bwrsVar, aoxrVar);
        apcb apcbVar = this.f;
        bwrs<aoyg> bwrsVar2 = this.ak;
        bwrs<HashSet<akqi>> bwrsVar3 = this.al;
        gga a3 = apcbVar.a.a();
        apcb.a(a3, 1);
        aphj a4 = apcbVar.b.a();
        apcb.a(a4, 2);
        apcb.a(this, 3);
        apcb.a(bwrsVar2, 4);
        apcb.a(bwrsVar3, 5);
        this.at = new apca(a3, a4, this, bwrsVar2, bwrsVar3);
        this.ai.e(this.as);
        this.aq.e(this.at);
        aT(false);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        q();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.a.c(bundle, "current_visited_places_list_ref", this.ak);
        this.a.c(bundle, "removed_places_set_ref", this.al);
        bundle.putSerializable("currently_sorted_by", this.ar);
        bundle.putSerializable("selected", this.am);
    }

    public final void w() {
        cqkx.p(this.as);
        cqkx.p(this.at);
    }
}
