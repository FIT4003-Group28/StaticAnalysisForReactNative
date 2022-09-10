package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: bbfy  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbfy implements cqjb {
    static final cqjb a = new bbfy();

    private bbfy() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = bbgc.a;
        bbho bbhoVar = bbho.PLACE;
        int ordinal = ((bbhr) cqkpVar).a().ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? "" : context.getString(R.string.EXEMPLAR_INTERSTITIAL_DESCRIPTION_SUCCESS);
        }
        return context.getString(R.string.EXEMPLAR_INTERSTITIAL_PROGRESS_DESCRIPTION);
    }
}
