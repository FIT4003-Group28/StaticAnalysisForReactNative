package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: znu  reason: default package */
/* loaded from: classes7.dex */
public class znu extends bruj {
    private final gga e;
    private final dbsg<bnhz> f;

    public znu(gga ggaVar, brsc brscVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = ggaVar;
        this.f = brrxVar.f().a();
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        if (this.f.a()) {
            this.f.b().f(cjqmVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.brvb
    public String b() {
        return null;
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.e.getString(R.string.START_NAVIGATION_BUTTON);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        boolean z = false;
        if (this.f.a() && this.f.b().e().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131231708, ibm.x());
    }

    @Override // defpackage.bruj, defpackage.brvb
    public void i(bwrs<ilo> bwrsVar) {
        super.i(bwrsVar);
    }
}
