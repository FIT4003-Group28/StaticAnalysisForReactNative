package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: bdti  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bdti implements cqlc {
    static final cqlc a = new bdti();

    private bdti() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        bdtm bdtmVar = bdtm.PUBLISH;
        int ordinal = ((bdtk) cqkpVar).g().ordinal();
        return Integer.valueOf(ordinal != 0 ? ordinal != 1 ? 0 : R.string.DONE : R.string.TODO_PHOTO_POST);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
