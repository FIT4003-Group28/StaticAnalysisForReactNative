package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: brwm  reason: default package */
/* loaded from: classes4.dex */
public class brwm extends bruj {
    private final Activity e;
    private final jba f;

    public brwm(Activity activity, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = jbaVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        this.f.I();
        return cqkl.a;
    }

    @Override // defpackage.brvb
    @dzsi
    public String b() {
        String g = this.f.g();
        if (dbsj.d(g)) {
            return this.e.getString(R.string.ACCESSIBILITY_MORE_INFO_BUTTON);
        }
        return this.e.getString(R.string.ACCESSIBILITY_MORE_INFO_BUTTON_LONG, new Object[]{g});
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.e.getString(R.string.PLACE_MORE_INFO);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        return true;
    }

    @Override // defpackage.bruj, defpackage.brvb
    public Boolean e() {
        return false;
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.i(vyt.j, ibm.x());
    }
}
