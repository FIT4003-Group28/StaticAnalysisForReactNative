package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: afua  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class afua implements cqlc {
    static final cqlc a = new afua();

    private afua() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i = afub.a;
        if (((afuc) cqkpVar).a().booleanValue()) {
            return cqrt.l(R.string.ACCESSIBILITY_SATELLITE_VIEW);
        }
        return cqrt.l(R.string.ACCESSIBILITY_MAP_VIEW);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
