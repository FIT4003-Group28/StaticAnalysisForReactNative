package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: nae  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class nae implements cqlc {
    static final cqlc a = new nae();

    private nae() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        return Integer.valueOf(true != ((nap) cqkpVar).f().booleanValue() ? R.string.NO_TRAFFIC_DATA : R.string.OFFLINE_ROUTE);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
