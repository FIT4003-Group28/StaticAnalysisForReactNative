package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: becd  reason: default package */
/* loaded from: classes3.dex */
public class becd extends bruj {
    private final Activity e;
    private final dxio<begg> f;
    private final jba g;
    private final brsc h;

    public becd(Activity activity, dxio<begg> dxioVar, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = dxioVar;
        this.g = jbaVar;
        this.h = brscVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        this.h.d(bege.REVIEWS);
        return cqkl.a;
    }

    @Override // defpackage.brvb
    public String b() {
        String g = this.g.g();
        if (dbsj.d(g)) {
            return this.e.getString(R.string.TAB_TITLE_REVIEWS);
        }
        return this.e.getString(R.string.REVIEWS_ABOUT_PLACE, new Object[]{g});
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.e.getString(R.string.TAB_TITLE_REVIEWS);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        ilo r = r();
        boolean z = false;
        if (r != null && this.f.a().i(bege.REVIEWS) && r.X() > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131232405, ibm.w());
    }
}
