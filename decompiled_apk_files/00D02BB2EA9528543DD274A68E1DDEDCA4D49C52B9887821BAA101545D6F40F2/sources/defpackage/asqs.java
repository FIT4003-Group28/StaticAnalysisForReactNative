package defpackage;

import com.google.android.apps.maps.R;
/* renamed from: asqs  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class asqs implements cqlc {
    static final cqlc a = new asqs();

    private asqs() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        int i;
        asut asutVar = (asut) cqkpVar;
        if (asutVar.c().booleanValue()) {
            i = asutVar.d().booleanValue() ? R.drawable.ic_mic_white_circled_48 : R.drawable.ic_mic_white_circled;
        } else {
            i = 2131232790;
        }
        return Integer.valueOf(i);
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
