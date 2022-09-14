package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: boaz  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class boaz implements cqlc {
    static final cqlc a = new boaz();

    private boaz() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i;
        boqh boqhVar = (boqh) cqkpVar;
        if (boqhVar.f().booleanValue()) {
            i = boqhVar.g().booleanValue() ? R.string.BUSINESS_HOURS_ADD_OPEN_HOURS : R.string.BUSINESS_HOURS_CHANGE_FROM_CLOSED;
        } else {
            i = R.string.BUSINESS_HOURS_ADD_MORE_HOURS;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
