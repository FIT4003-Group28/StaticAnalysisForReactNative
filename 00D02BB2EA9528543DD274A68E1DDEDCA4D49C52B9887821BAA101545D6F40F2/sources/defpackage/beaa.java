package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: beaa  reason: default package */
/* loaded from: classes3.dex */
public class beaa extends bruj {
    private final brsc e;
    private final jba f;
    private final ctw g;
    private final String h;

    public beaa(Activity activity, ctw ctwVar, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.g = ctwVar;
        this.e = brscVar;
        this.f = jbaVar;
        this.h = activity.getString(R.string.CALL);
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        this.f.B(cjqmVar);
        ilo r = r();
        if (r != null && !this.g.a(r).a()) {
            this.e.c(dtyb.bb, 9);
        }
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        return this.f.A();
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.h;
    }

    @Override // defpackage.brvb
    public Boolean d() {
        return this.f.z();
    }

    @Override // defpackage.bruj, defpackage.brvb
    public Boolean e() {
        boolean z = true;
        if (o() != brrw.TRIP_RESERVATION_ITEM && !q().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131231597, ibm.x());
    }

    @Override // defpackage.bruj, defpackage.brvb
    public void i(bwrs<ilo> bwrsVar) {
        super.i(bwrsVar);
        this.b = this.f.C(this.b);
        cjtd cjtdVar = this.b;
        ilo r = r();
        dnwx T = r == null ? null : r.T(dnwv.CALL_BUSINESS);
        if (T != null) {
            dnxb dnxbVar = T.d;
            if (dnxbVar == null) {
                dnxbVar = dnxb.h;
            }
            String str = dnxbVar.g;
            if (!str.isEmpty()) {
                cjta c = cjtd.c(cjtdVar);
                c.g(str);
                cjtdVar = c.a();
            }
        }
        this.b = cjtdVar;
    }
}
