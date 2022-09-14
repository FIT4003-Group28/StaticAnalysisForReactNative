package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bect  reason: default package */
/* loaded from: classes3.dex */
public class bect implements bnif, bega {
    private final Activity a;
    private final dxio<cqg> b;
    private final dkyr c;
    @dzsi
    private bwrs<ilo> d;
    private boolean e;

    public bect(Activity activity, dxio<cqg> dxioVar, btvo btvoVar) {
        this.a = activity;
        this.b = dxioVar;
        this.c = btvoVar.getUgcParameters();
    }

    @Override // defpackage.bnif
    @Deprecated
    public Boolean a() {
        return w();
    }

    @Override // defpackage.jbf
    public cqtd d() {
        return cqrt.g(2131231581, ibm.x());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        String g;
        dnqb dnqbVar;
        ilo iloVar = (ilo) bwrs.b(this.d);
        if (iloVar == null) {
            return cqkl.a;
        }
        doay doayVar = doay.TYPE_ROAD;
        int ordinal = iloVar.ce().ordinal();
        if (ordinal == 3) {
            dopm dopmVar = iloVar.cd().h;
            if (dopmVar == null) {
                dopmVar = dopm.c;
            }
            g = dbrz.f('\n').g(dopmVar.b);
        } else if (ordinal != 4) {
            g = ordinal != 7 ? "" : iloVar.cl();
        } else {
            g = iloVar.cf();
        }
        String str = g;
        if (iloVar.ce() == doay.TYPE_ROAD) {
            dnqbVar = dnqb.STREET_PLACESHEET;
        } else {
            dnqbVar = dnqb.PLACE_CARD;
        }
        cqf cqfVar = new cqf(dnqbVar, "", str, iloVar.aj(), iloVar.ai().o(), iloVar.F());
        if (iloVar.i) {
            dnpy bZ = dnpz.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnpz dnpzVar = (dnpz) bZ.b;
            dnpzVar.a |= 1;
            dnpzVar.b = 5356;
            deaf deafVar = deaf.LONG_PRESS;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnpz dnpzVar2 = (dnpz) bZ.b;
            dnpzVar2.c = deafVar.Q;
            dnpzVar2.a |= 2;
            cqfVar.j = bvrt.b(bZ.bK());
        }
        this.b.a().b(cqfVar, false);
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        ilo iloVar = (ilo) bwrs.b(this.d);
        if (iloVar == null) {
            return cjtd.b;
        }
        cjta c = cjtd.c(iloVar.bZ());
        c.d = dtxj.J;
        return c.a();
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        return "";
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        if (!this.c.j()) {
            return this.a.getString(R.string.ADD_A_MISSING_PLACE);
        }
        return this.a.getString(R.string.ADD_A_PLACE_OR_BUSINESS);
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return;
        }
        this.e = iloVar.aZ();
        this.d = bwrsVar;
    }

    @Override // defpackage.bega
    public void u() {
        this.d = null;
        this.e = false;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(this.e);
    }
}
