package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: bpmj  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class bpmj implements cqlc {
    static final cqlc a = new bpmj();

    private bpmj() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        return Integer.valueOf(true != ((bpvw) cqkpVar).b().booleanValue() ? R.string.ROAD_CLOSED_SCHEDULE_ADD_DATE_TIME : R.string.ROAD_CLOSED_SCHEDULE_END_WHEN);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
