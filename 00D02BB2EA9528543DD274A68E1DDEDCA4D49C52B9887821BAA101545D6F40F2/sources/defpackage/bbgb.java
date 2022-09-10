package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: bbgb  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbgb implements cqjb {
    static final cqjb a = new bbgb();

    private bbgb() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = bbgc.a;
        bbho bbhoVar = bbho.PLACE;
        int ordinal = ((bbhr) cqkpVar).a().ordinal();
        int i2 = ordinal != 1 ? ordinal != 2 ? 0 : R.raw.exemplars_end : R.raw.exemplars_interstitial;
        if (i2 != 0) {
            return iut.a(iup.e(i2));
        }
        return null;
    }
}
