package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: boxl  reason: default package */
/* loaded from: classes3.dex */
public class boxl extends bruj {
    private final dxio<boxa> e;
    private final Activity f;

    public boxl(dxio<boxa> dxioVar, Activity activity, brsc brscVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = dxioVar;
        this.f = activity;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        bwrs<ilo> bwrsVar = this.d;
        if (bwrsVar != null) {
            dnps bZ = dnqe.i.bZ();
            dnqb dnqbVar = dnqb.PLACE_CARD_ACTION_BAR;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqe dnqeVar = (dnqe) bZ.b;
            dnqeVar.b = dnqbVar.ah;
            dnqeVar.a |= 1;
            this.e.a().B(bwrsVar, bZ.bK(), null);
        }
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        return null;
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.f.getString(R.string.PLACE_EDIT);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        doay ce;
        ilo r = r();
        boolean z = true;
        if (r == null || !r.aY() || r.bi() || ((ce = r.ce()) != doay.TYPE_COMPOUND_BUILDING && ce != doay.TYPE_GEOCODED_ADDRESS)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqtt.i(cqrt.g(2131232645, ibl.G()), cqrp.d(18.0d), cqrp.d(18.0d));
    }
}
