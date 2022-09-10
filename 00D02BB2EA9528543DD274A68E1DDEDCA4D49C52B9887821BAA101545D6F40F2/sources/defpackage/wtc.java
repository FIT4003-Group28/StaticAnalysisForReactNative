package defpackage;

import android.os.Bundle;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: wtc  reason: default package */
/* loaded from: classes7.dex */
public final class wtc extends bxdu implements nxd {
    public int a;
    private int ad;
    @dzsi
    private List<nxe> ae;
    @dzsi
    public gfq b;
    public dxio<bwjz> c;
    public bnph d;
    public cklq e;
    public final wte f = new wta(this);
    final bxeq g = new wtb(this);

    public static wtc g(bwqv bwqvVar, int i, ddho ddhoVar, String str, bxko bxkoVar, bwnj bwnjVar) {
        wtc wtcVar = new wtc();
        wtcVar.aU(bwqvVar, bxkoVar, bwnjVar, null);
        Bundle bundle = wtcVar.o;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("waypoint-index", i);
        bundle.putInt("waypoint-ve-type", ((dtxi) ddhoVar).a);
        bundle.putString("map-point-picker-title", str);
        wtcVar.B(bundle);
        return wtcVar;
    }

    @Override // defpackage.bxdu
    @dzsi
    protected final nxd PC() {
        return this;
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (J() == null) {
            return;
        }
        if (obj instanceof aneh) {
            amvg amvgVar = new amvg();
            amvgVar.j = Rp(R.string.DIRECTIONS_PIN_LOCATION);
            amvgVar.k = false;
            amvgVar.d = ((aneh) obj).a();
            this.f.a(wtf.j(dbsg.i(Integer.valueOf(this.a)), amvgVar.a(), null, w()));
        } else if (obj instanceof bnpg) {
            bnpg bnpgVar = (bnpg) obj;
            this.f.a(wtf.k(dbsg.i(Integer.valueOf(this.a)), bnpgVar.c(), bnpgVar.b(), true, null, w()));
        } else if (!(obj instanceof ilo)) {
        } else {
            ilo iloVar = (ilo) obj;
            amvg amvgVar2 = new amvg();
            amvgVar2.d = iloVar.aj();
            if (iloVar.i) {
                amvgVar2.j = Rp(R.string.DIRECTIONS_PIN_LOCATION);
                amvgVar2.k = false;
            } else {
                amvgVar2.j = iloVar.q();
                amvgVar2.k = true;
            }
            this.f.a(wtf.j(dbsg.i(Integer.valueOf(this.a)), amvgVar2.a(), null, w()));
        }
    }

    @Override // defpackage.bxel
    @dzsi
    protected final bxeq aJ() {
        return this.g;
    }

    @Override // defpackage.nxd
    @dzsi
    public final nxe d(dthb dthbVar) {
        List<nxe> list = this.ae;
        dbsk.s(list);
        for (nxe nxeVar : list) {
            if (nxeVar.a(dthbVar)) {
                return nxeVar;
            }
        }
        return null;
    }

    @Override // defpackage.bxel, defpackage.ges, defpackage.gfo
    public final boolean e() {
        Nz(null);
        return super.e();
    }

    @Override // defpackage.bxdu, defpackage.bxel, defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        String string = this.o.getString("map-point-picker-title");
        this.a = this.o.getInt("waypoint-index");
        this.ad = this.o.getInt("waypoint-ve-type");
        this.ae = dcdc.i(new wsy(this.f, dbsg.i(Integer.valueOf(this.a))), new wsw(this, string, this.am), new wsz(this.f, dbsg.i(Integer.valueOf(this.a)), J()), new nvu(this.c));
    }

    @Override // defpackage.bxel
    protected final boolean q() {
        return false;
    }

    public final dnqh w() {
        dnqg bZ = dnqh.p.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar = (dnqh) bZ.b;
        dnqhVar.a |= 2048;
        dnqhVar.j = false;
        ddxw bZ2 = ddxx.j.bZ();
        int i = this.ad;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddxx ddxxVar = (ddxx) bZ2.b;
        ddxxVar.a |= 8;
        ddxxVar.d = i;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnqh dnqhVar2 = (dnqh) bZ.b;
        ddxx bK = bZ2.bK();
        bK.getClass();
        dnqhVar2.f = bK;
        dnqhVar2.a |= 16;
        return bZ.bK();
    }
}
