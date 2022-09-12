package defpackage;

import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: rof  reason: default package */
/* loaded from: classes7.dex */
public final class rof extends rmi<sax> implements bxeq {
    private static final afwn[] ai = {afwn.e(afwm.TRANSIT, true)};
    public bwqv ad;
    public gfq ae;
    public sfy af;
    public boolean ag;
    public int ah;
    private ztt aj;
    public sfz g;

    @Override // defpackage.bxeq
    public final void Pf(dwjb dwjbVar, dnqh dnqhVar) {
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

    @Override // defpackage.rmi, defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        super.ag(layoutInflater, viewGroup, bundle);
        ztt zttVar = new ztt(H(), 60.0f);
        this.aj = zttVar;
        zttVar.setContent(this.f);
        this.aj.setShouldUseRoundedCornersShadow(false);
        this.aj.Y(H().getResources().getConfiguration());
        return null;
    }

    @Override // defpackage.rmi
    protected final cqiw<sax> g() {
        return new rzf();
    }

    @Override // defpackage.bxeq
    public final void h(bxmh bxmhVar, @dzsi bxmh bxmhVar2, dnqh dnqhVar, @dzsi bxkv bxkvVar, cjqm cjqmVar) {
        this.af.u(bxmhVar);
    }

    @Override // defpackage.bxeq
    public final void i(String str, dnqh dnqhVar) {
    }

    @Override // defpackage.rmi
    protected final /* bridge */ /* synthetic */ sax q() {
        akqq akqqVar;
        dopk dopkVar;
        Bundle bundle = this.o;
        this.ag = true;
        this.ah = -1;
        dopk dopkVar2 = null;
        if (bundle != null) {
            akqq akqqVar2 = (!bundle.containsKey("searchLocation.lat") || !bundle.containsKey("searchLocation.lng")) ? null : new akqq(bundle.getDouble("searchLocation.lat"), bundle.getDouble("searchLocation.lng"));
            if (bundle.containsKey("preselectedStation")) {
                dopkVar2 = (dopk) bvrs.f(bundle, "preselectedStation", (dssr) dopk.x.cu(7));
            }
            this.ag = bundle.getBoolean("isStartStation", true);
            this.ah = bundle.getInt("legIndex", -1);
            dopkVar = dopkVar2;
            akqqVar = akqqVar2;
        } else {
            akqqVar = null;
            dopkVar = null;
        }
        rod rodVar = new rod(this);
        sfz sfzVar = this.g;
        String Rp = Rp(true != this.ag ? R.string.COMMUTE_SETUP_STATION_PICKER_DESTINATION_STATION_TITLE : R.string.COMMUTE_SETUP_STATION_PICKER_START_STATION_TITLE);
        Application a = sfzVar.a.a();
        sfz.a(a, 1);
        sff a2 = sfzVar.b.a();
        sfz.a(a2, 2);
        cqhn a3 = sfzVar.c.a();
        sfz.a(a3, 3);
        vtn a4 = sfzVar.d.a();
        sfz.a(a4, 4);
        gll a5 = sfzVar.e.a();
        sfz.a(a5, 5);
        akox a6 = sfzVar.f.a();
        sfz.a(a6, 6);
        hwe a7 = sfzVar.g.a();
        sfz.a(a7, 7);
        qed a8 = sfzVar.h.a();
        sfz.a(a8, 8);
        vyd a9 = sfzVar.i.a();
        sfz.a(a9, 9);
        cqhu a10 = sfzVar.j.a();
        sfz.a(a10, 10);
        qds a11 = sfzVar.k.a();
        sfz.a(a11, 11);
        btrm a12 = sfzVar.l.a();
        sfz.a(a12, 12);
        dehq a13 = sfzVar.m.a();
        sfz.a(a13, 13);
        rzz a14 = sfzVar.n.a();
        sfz.a(a14, 14);
        rzs a15 = sfzVar.o.a();
        sfz.a(a15, 15);
        ckcw a16 = sfzVar.p.a();
        sfz.a(a16, 16);
        btvo a17 = sfzVar.q.a();
        sfz.a(a17, 17);
        gga a18 = sfzVar.r.a();
        sfz.a(a18, 18);
        sfz.a(Rp, 21);
        sfz.a(rodVar, 22);
        sfz.a(this, 23);
        sfy sfyVar = new sfy(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, akqqVar, dopkVar, Rp, rodVar, this);
        this.af = sfyVar;
        return sfyVar;
    }

    @Override // defpackage.rmi
    protected final egu w(egj egjVar) {
        egjVar.s(this.aj);
        egjVar.Y(true);
        egf a = egf.a();
        a.l = ai;
        a.l(false);
        egjVar.A(a);
        egjVar.J(new egq(this) { // from class: roc
            private final rof a;

            {
                this.a = this;
            }

            @Override // defpackage.egq
            public final void Qs(egu eguVar) {
                this.a.af.v();
            }
        });
        return egjVar.a();
    }
}
