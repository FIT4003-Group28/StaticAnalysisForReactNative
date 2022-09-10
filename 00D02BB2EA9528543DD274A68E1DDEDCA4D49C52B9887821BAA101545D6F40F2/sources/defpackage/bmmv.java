package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bmmv  reason: default package */
/* loaded from: classes3.dex */
public class bmmv extends bruj {
    private final Activity e;
    private final brrx f;
    private final dxio<begg> g;

    public bmmv(Activity activity, dxio<begg> dxioVar, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.g = dxioVar;
        this.f = brrxVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        ilo r = r();
        if (r != null) {
            dxio<begg> dxioVar = this.g;
            begj begjVar = new begj();
            begjVar.b(r);
            begjVar.c = jjn.FULLY_EXPANDED;
            begjVar.e = bege.TICKETS;
            dxioVar.a().o(begjVar, false, null);
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
        return this.e.getString(R.string.ADMISSION_PRICES_ACTION_BUTTON_TITLE);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        ilo r = r();
        boolean z = false;
        if (r != null && bmmj.a(r) && this.f.g() == brrw.COLLAPSED_PLACESHEET) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131232317, ibm.w());
    }
}
