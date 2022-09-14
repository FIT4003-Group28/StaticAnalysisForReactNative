package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: bbko  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbko implements cqjb {
    static final cqjb a = new bbko();

    private bbko() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i;
        cqjg cqjgVar = bbkw.a;
        bbdt bbdtVar = bbdt.LOW_CONFIDENCE;
        int ordinal = ((bbnh) cqkpVar).n().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i = R.raw.personal_score_missing_data;
        } else {
            if (ordinal != 2) {
                if (ordinal == 7) {
                    i = R.raw.personal_score_zero_state;
                } else if (ordinal != 9) {
                    i = 0;
                }
            }
            i = R.raw.personal_score_updating;
        }
        if (i != 0) {
            return iut.a(iup.e(i));
        }
        return null;
    }
}
