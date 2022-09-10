package defpackage;

import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: brvj  reason: default package */
/* loaded from: classes4.dex */
public class brvj implements bruw {
    private final gga a;
    private final brvi b;
    private final ilo c;

    public brvj(gga ggaVar, brvi brviVar, ilo iloVar) {
        this.a = ggaVar;
        this.b = brviVar;
        this.c = iloVar;
    }

    @Override // defpackage.bruw
    public String a() {
        return this.a.getString(R.string.MENU_PHOTOS_LABEL);
    }

    @Override // defpackage.bruw
    public cqkl b() {
        ilo c;
        brbn brbnVar = ((brwj) this.b).a;
        bwrs<ilo> bwrsVar = brbnVar.e;
        if (bwrsVar != null && (c = bwrsVar.c()) != null) {
            List<dwfl> aF = c.aF(dweb.MENU);
            if (!aF.isEmpty()) {
                dcdc r = dcdc.r(aF);
                if (brbnVar.e != null && r != null) {
                    brbm brbmVar = new brbm(r, brbnVar.d.c.getLensParameters().g);
                    bbut a = brbnVar.a.a();
                    bbtv v = bbty.v();
                    v.k(true);
                    v.o(true);
                    v.t(true);
                    v.p(afyb.i(brbnVar.c, afyc.RESTAURANT_NEAR_ME));
                    bbty a2 = v.a();
                    bwrs<ilo> bwrsVar2 = brbnVar.e;
                    dbsk.s(bwrsVar2);
                    a.p(brbmVar, 0, a2, bwrsVar2, null);
                    brbmVar.h(brbnVar.b.a());
                }
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.bruw
    public cjtd c() {
        cjta b = cjtd.b();
        ddes bZ = ddet.D.bZ();
        ddeo bZ2 = ddep.f.bZ();
        dtbk g = this.c.ai().g();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddep ddepVar = (ddep) bZ2.b;
        g.getClass();
        ddepVar.b = g;
        ddepVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddep bK = bZ2.bK();
        bK.getClass();
        ddetVar.c = bK;
        ddetVar.a |= 1;
        b.s(bZ.bK());
        b.d = dtyb.bo;
        return b.a();
    }

    @Override // defpackage.bruw
    public Boolean d() {
        return true;
    }

    @Override // defpackage.bruw
    public CharSequence e() {
        return this.a.getString(R.string.MENU_PHOTOS_ACCESSIBILITY_TEXT, new Object[]{this.c.n()});
    }
}
