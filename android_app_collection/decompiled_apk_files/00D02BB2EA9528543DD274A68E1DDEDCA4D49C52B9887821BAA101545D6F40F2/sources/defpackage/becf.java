package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: becf  reason: default package */
/* loaded from: classes3.dex */
public class becf extends bruj {
    private final Activity e;
    private final dxio<brba> f;
    private final jba g;

    public becf(Activity activity, dxio<brba> dxioVar, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = dxioVar;
        this.g = jbaVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        ilo r = r();
        if (r != null) {
            this.f.a().I(r);
        }
        return cqkl.a;
    }

    @Override // defpackage.brvb
    public String b() {
        return this.e.getString(R.string.ACCESSIBILITY_SEE_PLACE_ON_MAP, new Object[]{this.g.g()});
    }

    @Override // defpackage.bruj
    public String c() {
        return "";
    }

    @Override // defpackage.brvb
    public Boolean d() {
        return Boolean.valueOf(r() != null);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131232390, ibm.x());
    }
}
