package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jof  reason: default package */
/* loaded from: classes7.dex */
public final class jof extends ges implements degu<joj> {
    public jrt a;
    private cqkf<jrc> ad;
    @dzsi
    private joj ae;
    @dzsi
    private dkdo af;
    @dzsi
    private jry ag;
    @dzsi
    private String ah;
    @dzsi
    private djwd ai;
    private boolean aj;
    public efg b;
    public cqkj c;
    public jok d;
    public bvrb e;
    public bvjj f;
    public auhi g;

    private final void g() {
        String string;
        String string2;
        if (!this.a.h().booleanValue()) {
            return;
        }
        joj jojVar = this.ae;
        dbsk.s(jojVar);
        dkdo dkdoVar = jojVar.a;
        if (dkdoVar == null) {
            dkdoVar = this.af;
        } else {
            dkdo dkdoVar2 = this.af;
            if (dkdoVar2 != null) {
                dkdoVar2.a.size();
                final HashSet hashSet = new HashSet();
                for (dhmz dhmzVar : dkdoVar2.b) {
                    hashSet.add(dhmzVar.b);
                }
                final dccg O = dccg.O();
                for (dhnd dhndVar : dkdoVar2.c) {
                    O.n(dhndVar.b, dhndVar.c);
                }
                dkdn bZ = dkdo.d.bZ();
                bZ.a(dkdoVar2.a);
                bZ.a(dkdoVar.a);
                bZ.b(dkdoVar2.b);
                bZ.b(dcft.i(dkdoVar.b, new dbsl(hashSet) { // from class: jod
                    private final Set a;

                    {
                        this.a = hashSet;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        return !this.a.contains(((dhmz) obj).b);
                    }
                }));
                bZ.c(dkdoVar2.c);
                bZ.c(dcft.i(dkdoVar.c, new dbsl(O) { // from class: joe
                    private final dcka a;

                    {
                        this.a = O;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        dhnd dhndVar2 = (dhnd) obj;
                        return !this.a.F(dhndVar2.b, dhndVar2.c);
                    }
                }));
                dkdoVar = bZ.bK();
            }
        }
        jrt jrtVar = this.a;
        if (dkdoVar == null) {
            dkdoVar = dkdo.d;
        }
        joj jojVar2 = this.ae;
        dbsk.s(jojVar2);
        Context H = H();
        if (jojVar2.a != null) {
            string = H.getString(R.string.EMPTY_RECOMMENDATION_NO_CONTENT_TITLE);
        } else if (bttq.NO_CONNECTIVITY.equals(jojVar2.b) || bttq.REQUEST_TIMEOUT.equals(jojVar2.b)) {
            string = H.getString(R.string.EMPTY_RECOMMENDATION_NO_CONNECTION_TITLE);
        } else {
            string = H.getString(R.string.EMPTY_RECOMMENDATION_GENERIC_ERROR_TITLE);
        }
        joj jojVar3 = this.ae;
        dbsk.s(jojVar3);
        Context H2 = H();
        if (jojVar3.a != null) {
            string2 = H2.getString(R.string.EMPTY_RECOMMENDATION_NO_CONTENT_DESCRIPTION);
        } else if (bttq.NO_CONNECTIVITY.equals(jojVar3.b) || bttq.REQUEST_TIMEOUT.equals(jojVar3.b)) {
            string2 = H2.getString(R.string.EMPTY_RECOMMENDATION_NO_CONNECTION_DESCRIPTION);
        } else {
            string2 = H2.getString(R.string.EMPTY_RECOMMENDATION_GENERIC_ERROR_DESCRIPTION);
        }
        jry jryVar = this.ag;
        dbsk.s(jryVar);
        jrtVar.i(dkdoVar, string, string2, jryVar);
        cqkx.p(this.a);
    }

    private final void i() {
        if (!this.aD) {
            return;
        }
        g();
        if (!this.aj) {
            return;
        }
        gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        avac.bp(ggaVar, Integer.valueOf(dpyv.MADDEN_GROWTH.dm), this.f, this.e, this.g);
    }

    @Override // defpackage.ges
    protected final void Nv() {
        ((jog) btsx.b(jog.class, this)).bI(this);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.ae = joj.a(null);
        i();
    }

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<jrc> c = this.c.c(new jpf(), null);
        this.ad = c;
        return c.c();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(joj jojVar) {
        this.ae = jojVar;
        i();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        joj jojVar;
        super.l(bundle);
        if (bundle == null) {
            bundle = this.o;
        }
        String str = null;
        if (bundle == null || (!bundle.containsKey("fetchingErrorCode") && !bundle.containsKey("fetchedUserStream"))) {
            jojVar = null;
        } else {
            jojVar = new joj(bundle.containsKey("fetchedUserStream") ? (dkdo) bvrs.b(bundle.getByteArray("fetchedUserStream"), (dssr) dkdo.d.cu(7)) : null, bundle.containsKey("fetchingErrorCode") ? bttq.values()[bundle.getInt("fetchingErrorCode")] : null);
        }
        this.ae = jojVar;
        this.af = (dkdo) bvrs.b(bundle.getByteArray("prioritizedUserStream"), (dssr) dkdo.d.cu(7));
        if (bundle != null) {
            str = bundle.getString("initVertical");
        }
        this.ah = str;
        this.ag = str == null ? jry.a : jry.f(str);
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("fromNotification", false);
        }
        this.aj = z;
        this.ai = (djwd) bvrs.b(bundle.getByteArray("notificationContext"), (dssr) djwd.a.cu(7));
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        if (this.ae == null || bttq.CANCELED.equals(this.ae.b)) {
            deha.q(this.d.a(this.ai, 60), this, this.e.h());
        } else {
            g();
        }
        this.ad.e(this.a);
        efg efgVar = this.b;
        egj egjVar = new egj(this);
        egjVar.ag(null);
        egjVar.w(this.P);
        egjVar.x(egr.a);
        efgVar.a(egjVar.a());
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putString("initVertical", this.ah);
        joj jojVar = this.ae;
        if (jojVar != null) {
            dkdo dkdoVar = jojVar.a;
            if (dkdoVar != null) {
                bundle.putByteArray("fetchedUserStream", dkdoVar.bS());
            }
            bttq bttqVar = jojVar.b;
            if (bttqVar != null) {
                bundle.putInt("fetchingErrorCode", bttqVar.ordinal());
            }
        }
        dkdo dkdoVar2 = this.af;
        if (dkdoVar2 != null) {
            bundle.putByteArray("prioritizedUserStream", dkdoVar2.bS());
        }
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        super.u();
        btzc btzcVar = this.d.a;
        if (btzcVar != null) {
            btzcVar.a();
        }
    }
}
