package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: cfvp  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cfvp implements cqjb {
    static final cqjb a = new cfvp();

    private cfvp() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = cfvq.a;
        dwub dwubVar = dwub.UNKNOWN_ACTION;
        int ordinal = ((cfvr) cqkpVar).c().ordinal();
        if (ordinal != 0) {
            return iut.a(iup.e(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 0 : R.raw.ic_location_ugc_tab : R.raw.ic_photos_ugc_tab : R.raw.ic_review_ugc_tab));
        }
        return null;
    }
}
