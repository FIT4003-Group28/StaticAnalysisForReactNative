package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: bryr  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bryr implements cqlc {
    static final cqlc a = new bryr();

    private bryr() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = bryt.a;
        if (cqjv.v(((brzb) cqkpVar).b().a()).booleanValue()) {
            return cqrt.l(R.string.RESTRICTION_FILTER_RESULTS);
        }
        return cqrt.l(R.string.RESTRICTION_MORE_FILTERS);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
