package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: cfvm  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cfvm implements cqjb {
    static final cqjb a = new cfvm();

    private cfvm() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = cfvq.a;
        dwub dwubVar = dwub.UNKNOWN_ACTION;
        int ordinal = ((cfvr) cqkpVar).c().ordinal();
        if (ordinal != 0) {
            return context.getText(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 0 : R.string.SEE_YOUR_EDITS_LINK : R.string.SEE_YOUR_PHOTOS_LINK : R.string.SEE_YOUR_REVIEWS_LINK);
        }
        return "";
    }
}
