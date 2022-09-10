package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aadi  reason: default package */
/* loaded from: classes2.dex */
class aadi implements izg {
    private static final cqss b = cqta.d(-12828605);
    public boolean a;
    private final aadh c;
    private final cqtd d;
    private final String e;
    private final cqtd f;
    private final String g;

    public aadi(Activity activity, aadh aadhVar) {
        cqss cqssVar = b;
        this.d = cqrt.g(2131231642, cqssVar);
        this.f = cqrt.g(2131231678, cqssVar);
        this.c = aadhVar;
        this.e = activity.getString(R.string.SEARCH_RESULTS_LIST_VIEW_TOGGLE);
        this.g = activity.getString(R.string.SEARCH_RESULTS_MAP_VIEW_TOGGLE);
    }

    @Override // defpackage.izg
    public cqkl g() {
        if (this.a) {
            this.c.c();
        } else {
            this.c.d();
        }
        return cqkl.a;
    }

    @Override // defpackage.izg
    public CharSequence h() {
        return this.a ? this.g : this.e;
    }

    @Override // defpackage.izg
    public Boolean l() {
        return true;
    }

    @Override // defpackage.izg
    public cqtd r() {
        return this.a ? this.f : this.d;
    }

    @Override // defpackage.izg
    public cjtd z() {
        if (this.a) {
            return cjtd.a(dtxo.by);
        }
        return cjtd.b;
    }
}
