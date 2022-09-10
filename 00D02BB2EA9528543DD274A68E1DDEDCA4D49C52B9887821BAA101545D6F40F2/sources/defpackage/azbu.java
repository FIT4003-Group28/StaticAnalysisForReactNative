package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: azbu  reason: default package */
/* loaded from: classes3.dex */
public class azbu extends bruj {
    private final Activity e;
    private final dzsj<axwy> f;
    private final axyp g;
    private final jba h;
    @dzsi
    private axyo i;

    public azbu(Activity activity, brsc brscVar, dzsj<axwy> dzsjVar, axyp axypVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = dzsjVar;
        this.g = axypVar;
        this.h = jbaVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        if (this.d != null) {
            bwrs<ilo> bwrsVar = this.d;
            dbsk.s(bwrsVar);
            this.f.a().j(bwrsVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        return this.h.E();
    }

    @Override // defpackage.bruj
    protected final String c() {
        axyo axyoVar = this.i;
        return axyoVar != null ? axyoVar.e().a(this.e).toString() : "";
    }

    @Override // defpackage.brvb
    public Boolean d() {
        ilo r = r();
        boolean z = false;
        if (r != null && r.bM()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        if (e().booleanValue()) {
            axyo axyoVar = this.i;
            if (axyoVar != null) {
                return axyoVar.d();
            }
            return cqrt.f(2131231792);
        }
        axyo axyoVar2 = this.i;
        if (axyoVar2 != null) {
            return axyoVar2.c();
        }
        return cqrt.g(2131231719, ibm.x());
    }

    @Override // defpackage.bruj, defpackage.brvb
    public void i(bwrs<ilo> bwrsVar) {
        super.i(bwrsVar);
        ilo r = r();
        this.i = r != null ? this.g.a(r) : null;
    }
}
