package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bdzy  reason: default package */
/* loaded from: classes3.dex */
public class bdzy extends bruj {
    private final Activity e;
    private final bmom f;
    private final Runnable g;

    public bdzy(Activity activity, bmom bmomVar, brsc brscVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = bmomVar;
        this.g = brrxVar.f().b();
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        this.g.run();
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        return this.e.getString(R.string.MAPS_ACTIVITY_YOU_ARE_HERE);
    }

    @Override // defpackage.bruj
    public String c() {
        return this.e.getString(R.string.MAPS_ACTIVITY_YOU_ARE_HERE);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        ilo r = r();
        boolean z = false;
        if (r != null && bmom.e(r) && this.f.c()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.h(2131232564, irg.u());
    }
}
