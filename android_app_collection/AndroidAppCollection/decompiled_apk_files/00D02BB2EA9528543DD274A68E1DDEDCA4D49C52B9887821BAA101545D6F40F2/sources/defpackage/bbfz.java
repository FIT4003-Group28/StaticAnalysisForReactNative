package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: bbfz  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbfz implements cqjb {
    static final cqjb a = new bbfz();

    private bbfz() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = bbgc.a;
        bbho bbhoVar = bbho.PLACE;
        int ordinal = ((bbhr) cqkpVar).a().ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? "" : context.getString(R.string.EXEMPLAR_INTERSTITIAL_DONE_BUTTON);
        }
        return context.getString(R.string.EXEMPLAR_INTERSTITIAL_CONTINUE_BUTTON);
    }
}
