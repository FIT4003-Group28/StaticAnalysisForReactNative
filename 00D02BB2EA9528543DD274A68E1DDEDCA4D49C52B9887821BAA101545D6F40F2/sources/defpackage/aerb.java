package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aerb  reason: default package */
/* loaded from: classes2.dex */
public final class aerb extends itb implements aesb {
    public final cjqy a;
    public final btvo b;
    public final dxio<cjnx> c;
    public final dxio<bzmm> d;
    public final cjqq e;
    @dzsi
    public dhiz g;
    public boolean h;
    private final gga k;
    private final btrm o;
    private final bvrb p;
    private final bwqv q;
    private final aese r;
    private final dxio<araj> s;
    private final dxio<begg> t;
    private final bmon u;
    private final anhi v;
    private final dxio<aeuc> w;
    aeui f = aeui.b;
    @dzsi
    private aeub x = null;
    public final List<aerz> i = dchl.a();
    final aerz j = new aeqz(this);

    public aerb(gga ggaVar, btrm btrmVar, cjqy cjqyVar, btvo btvoVar, bvrb bvrbVar, bwqv bwqvVar, aese aeseVar, dxio<cjnx> dxioVar, dxio<araj> dxioVar2, dxio<begg> dxioVar3, dxio<bzmm> dxioVar4, bmon bmonVar, anhi anhiVar, dxio<aeuc> dxioVar5, cjqq cjqqVar) {
        this.k = ggaVar;
        this.o = btrmVar;
        this.a = cjqyVar;
        this.b = btvoVar;
        this.p = bvrbVar;
        this.q = bwqvVar;
        this.r = aeseVar;
        this.c = dxioVar;
        this.s = dxioVar2;
        this.t = dxioVar3;
        this.d = dxioVar4;
        this.u = bmonVar;
        this.v = anhiVar;
        this.w = dxioVar5;
        this.e = cjqqVar;
    }

    @Override // defpackage.aesb
    public final aeui B() {
        bvrj.UI_THREAD.c();
        if (!r()) {
            return aeui.b;
        }
        return this.r.f();
    }

    @Override // defpackage.aesb
    public final void C(aeue aeueVar, jjn jjnVar) {
        if (!r()) {
            return;
        }
        this.k.w();
        bwrs<ilo> f = aeueVar.f();
        if (f == null) {
            return;
        }
        begj begjVar = new begj();
        begjVar.i = f;
        begjVar.c = jjnVar;
        begjVar.F = false;
        this.t.a().o(begjVar, true, null);
    }

    @Override // defpackage.aesb
    public final void D(@dzsi ilo iloVar, int i, @dzsi ddho ddhoVar) {
        if (!r()) {
            return;
        }
        this.p.b(new aera(this, iloVar, i, ddhoVar), bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        btrm btrmVar = this.o;
        dceq a = dcet.a();
        a.b(AndroidLocationEvent.class, new aerc(0, AndroidLocationEvent.class, this, bvrj.UI_THREAD));
        a.b(alhj.class, new aerc(1, alhj.class, this, bvrj.UI_THREAD));
        a.b(alia.class, new aerc(2, alia.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.r.c(aesd.GMM_ACTIVITY, this.j);
        aeuc a2 = this.w.a();
        boolean z = this.b.getLocationParameters().n;
        boolean z2 = this.b.getLocationParameters().o;
        gga a3 = a2.a.a();
        aeuc.a(a3, 1);
        dxio a4 = ((dxjh) a2.b).a();
        aeuc.a(a4, 2);
        dxio a5 = ((dxjh) a2.c).a();
        aeuc.a(a5, 3);
        dxio a6 = ((dxjh) a2.d).a();
        aeuc.a(a6, 4);
        dxio a7 = ((dxjh) a2.e).a();
        aeuc.a(a7, 5);
        dxio a8 = ((dxjh) a2.f).a();
        aeuc.a(a8, 6);
        dxio a9 = ((dxjh) a2.g).a();
        aeuc.a(a9, 7);
        cjqq a10 = a2.h.a();
        aeuc.a(a10, 8);
        aeub aeubVar = new aeub(a3, a4, a5, a6, a7, a8, a9, a10, z, true, true, 2, z2);
        this.x = aeubVar;
        if (!aeubVar.h) {
            return;
        }
        bvrj.UI_THREAD.c();
        aety aetyVar = aeubVar.f;
        dceq a11 = dcet.a();
        a11.b(ardp.class, new aeud(0, ardp.class, aetyVar, bvrj.UI_THREAD));
        a11.b(ahjy.class, new aeud(1, ahjy.class, aetyVar, bvrj.UI_THREAD));
        aeubVar.d.a().g(aetyVar, a11.a());
        aeubVar.b.a().m().f().p(aeubVar.g);
    }

    @Override // defpackage.itb
    public final void Po() {
        this.r.d(aesd.GMM_ACTIVITY);
        this.o.a(this);
        aeub aeubVar = this.x;
        if (aeubVar != null && aeubVar.h && aeubVar.j) {
            bvrj.UI_THREAD.c();
            aeubVar.d.a().a(aeubVar.f);
            aeubVar.b.a().m().f().q(aeubVar.g);
            aeubVar.b();
        }
        super.Po();
    }

    public final ddho e() {
        arcs m = this.s.a().m().f().m();
        return m != null ? m.d() : dtxv.ef;
    }

    public final cjtd f(ddho ddhoVar) {
        aeue i = this.f.i();
        cjta c = cjtd.c(i == null ? null : i.e());
        c.d = ddhoVar;
        return c.a();
    }

    @Override // defpackage.aesb
    public final void i(@dzsi dhiz dhizVar) {
        if (!r()) {
            return;
        }
        this.g = dhizVar;
    }

    @Override // defpackage.aesb
    public final void j(@dzsi aeue aeueVar) {
        bwrs<ilo> f;
        ilo c;
        if (!r() || aeueVar == null || (f = aeueVar.f()) == null || (c = f.c()) == null) {
            return;
        }
        this.a.u(cjtx.c(5, c, false));
    }

    @Override // defpackage.aesb
    public final void k() {
        l(aesa.OPEN_PLACESHEET, null);
    }

    @Override // defpackage.aesb
    public final void l(aesa aesaVar, @dzsi dnqh dnqhVar) {
        gga ggaVar = this.k;
        bwqv bwqvVar = this.q;
        aeui B = B();
        bvrt a = bvrt.a(dnqhVar);
        aeti aetiVar = new aeti();
        Bundle bundle = new Bundle();
        bwqvVar.c(bundle, "iah_state", B);
        bundle.putBoolean("animate_on_create", true);
        bundle.putSerializable("placemark_action", aesaVar);
        bundle.putSerializable("placemark_action_logging", a);
        aetiVar.B(bundle);
        ggaVar.D(aetiVar);
    }

    @Override // defpackage.aesb
    public final void m(boolean z, boolean z2, @dzsi gfw gfwVar) {
        this.a.i(f(dtxy.fz));
        bxko bxkoVar = new bxko();
        if (z2) {
            bxkoVar.c(bxla.PLACE_PICKER);
            bxkoVar.g(this.k.getString(R.string.IAMHERE_WHERE_ARE_YOU));
        } else {
            bxkoVar.c(bxla.PLACE_PICKER_NON_CURRENT_LOCATION);
            bxkoVar.g(this.k.getString(R.string.IAMHERE_SELECT_PLACE));
        }
        bxkoVar.j = z;
        bxkoVar.z(301989889);
        bxkoVar.W();
        bxkoVar.f = true;
        bwqv bwqvVar = this.q;
        aerx aerxVar = new aerx();
        aerxVar.bu(bwqvVar, bxkoVar, null);
        if (gfwVar != null) {
            gfwVar.aZ(aerxVar);
        } else {
            this.k.D(aerxVar);
        }
    }

    public final synchronized void n(aeui aeuiVar) {
        this.f = aeuiVar;
        btrm btrmVar = this.o;
        aeuh aeuhVar = aeuh.NEUTRAL;
        int ordinal = aeuiVar.f.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 7 || ordinal == 8) {
            aeuh aeuhVar2 = aeuiVar.f;
            aeuh aeuhVar3 = aeuh.CONFIRMED;
            aeue b = aeuhVar2 == aeuhVar3 ? aeuiVar.h : aeuiVar.b(0);
            ahmv g = b == null ? null : b.g();
            if (g != null && aeuhVar2 == aeuhVar3) {
                dtap dtapVar = g.a;
                if (dtapVar.c) {
                    dtapVar.bF();
                    dtapVar.c = false;
                }
                dtaq dtaqVar = (dtaq) dtapVar.b;
                dtaq dtaqVar2 = dtaq.m;
                dtaqVar.a |= 256;
                dtaqVar.h = 100;
                dtap dtapVar2 = g.a;
                if (dtapVar2.c) {
                    dtapVar2.bF();
                    dtapVar2.c = false;
                }
                dtaq dtaqVar3 = (dtaq) dtapVar2.b;
                dtaqVar3.c = 48;
                dtaqVar3.a |= 2;
            }
            btrmVar.b(new ahmw(g));
        }
    }

    @Override // defpackage.aesb
    public final synchronized void o(aerz aerzVar) {
        this.i.add(aerzVar);
    }

    @Override // defpackage.aesb
    public final synchronized void p(aerz aerzVar) {
        this.i.remove(aerzVar);
    }

    @Override // defpackage.aesb
    public final void q() {
        if (this.k.K() instanceof aeuv) {
            return;
        }
        t(10);
        if (s()) {
            anfv anfvVar = (anfv) this.v;
            anfvVar.a();
            anfvVar.b.n("Ongoing checkin provider");
            dcdc<aogb> d = anfvVar.d();
            int size = d.size();
            for (int i = 0; i < size; i++) {
                anfvVar.a.d(d.get(i));
            }
        }
        this.k.D(new aeuv());
    }

    public final boolean r() {
        if (!v()) {
            return false;
        }
        return this.b.getEnableFeatureParameters().w;
    }

    @Override // defpackage.aesb
    public final boolean s() {
        return this.u.b();
    }

    @Override // defpackage.aesb
    public final void t(int i) {
        if (!r()) {
            return;
        }
        this.r.g(i);
    }
}
