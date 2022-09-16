package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwih  reason: default package */
/* loaded from: classes4.dex */
public class bwih extends bruj {
    private final Activity e;
    private final bmel f;
    private final jba g;

    public bwih(Activity activity, bmel bmelVar, brsc brscVar, jba jbaVar, brrx brrxVar) {
        super(brscVar, brrxVar);
        this.e = activity;
        this.f = bmelVar;
        this.g = jbaVar;
    }

    @Override // defpackage.brvb
    public cqkl a(cjqm cjqmVar) {
        this.f.a(this.d);
        return cqkl.a;
    }

    @Override // defpackage.brvb
    public String b() {
        String g = this.g.g();
        if (dbsj.d(g)) {
            return this.e.getString(R.string.SHARE_PLACE_LABEL);
        }
        return this.e.getString(R.string.ACCESSIBILITY_SHARE_PLACE, new Object[]{g});
    }

    @Override // defpackage.bruj
    protected final String c() {
        return this.e.getString(R.string.SHARE);
    }

    @Override // defpackage.brvb
    public Boolean d() {
        return true;
    }

    @Override // defpackage.brvb
    public cqtd f() {
        return cqrt.g(2131231745, ibm.x());
    }
}
