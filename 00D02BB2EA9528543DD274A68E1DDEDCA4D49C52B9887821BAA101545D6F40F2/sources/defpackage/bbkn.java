package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: bbkn  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbkn implements cqjb {
    static final cqjb a = new bbkn();

    private bbkn() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i;
        cqjg cqjgVar = bbkw.a;
        bbdt bbdtVar = bbdt.LOW_CONFIDENCE;
        int ordinal = ((bbnh) cqkpVar).n().ordinal();
        if (ordinal == 0) {
            i = R.string.PERSONAL_SCORE_NOT_ENOUGH_DATA_STATE_SUBTITLE;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 7) {
                    i = R.string.PERSONAL_SCORE_ZERO_STATE_SUBTITLE;
                } else if (ordinal != 9) {
                    i = 0;
                }
            }
            i = R.string.PERSONAL_SCORE_UPDATING_STATE_SUBTITLE;
        } else {
            i = R.string.PERSONAL_SCORE_PARTIAL_EXEMPLARS_STATE_SUBTITLE;
        }
        return i != 0 ? context.getString(i) : "";
    }
}
