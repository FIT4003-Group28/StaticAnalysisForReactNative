package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zgd  reason: default package */
/* loaded from: classes7.dex */
public class zgd extends bruj {
    private final Activity e;
    private final jba f;

    public zgd(Activity activity, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = jbaVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        this.f.G();
        return cqkl.a;
    }

    @Override // defpackage.brvb
    public String b() {
        String g = this.f.g();
        if (dbsj.d(g)) {
            return this.e.getString(R.string.ACCESSIBILITY_ADD_PARKING);
        }
        return this.e.getString(R.string.ACCESSIBILITY_ADD_PARKING_LONG, new Object[]{g});
    }

    @Override // defpackage.bruj
    public String c() {
        return this.e.getString(R.string.ADD_PARKING);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        return this.f.S();
    }

    @Override // defpackage.bruj, defpackage.brvb
    public Boolean e() {
        return q();
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(R.drawable.ic_add_parking, ibm.x());
    }
}
