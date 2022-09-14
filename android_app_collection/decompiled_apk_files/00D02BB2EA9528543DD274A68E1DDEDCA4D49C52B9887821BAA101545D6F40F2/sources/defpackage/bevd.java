package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: bevd  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bevd implements cqlc {
    static final cqlc a = new bevd();

    private bevd() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        return Integer.valueOf(true != ((bevj) cqkpVar).m().booleanValue() ? R.string.EV_INFO_AVAILABILITY_UNKNOWN : R.string.EV_INFO_AVAILABILITY_KNOWN);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
