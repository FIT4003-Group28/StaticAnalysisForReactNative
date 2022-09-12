package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: bbkp  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbkp implements cqjb {
    static final cqjb a = new bbkp();

    private bbkp() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i;
        cqjg cqjgVar = bbkw.a;
        bbdt bbdtVar = bbdt.LOW_CONFIDENCE;
        int ordinal = ((bbnh) cqkpVar).n().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 7) {
                    i = R.string.PERSONAL_SCORE_ZERO_STATE_BUTTON;
                } else if (ordinal != 9) {
                    i = 0;
                }
            }
            i = R.string.PERSONAL_SCORE_UPDATING_STATE_BUTTON;
        } else {
            i = R.string.PERSONAL_SCORE_PARTIAL_EXEMPLARS_STATE_BUTTON;
        }
        return i != 0 ? context.getString(i) : "";
    }
}
