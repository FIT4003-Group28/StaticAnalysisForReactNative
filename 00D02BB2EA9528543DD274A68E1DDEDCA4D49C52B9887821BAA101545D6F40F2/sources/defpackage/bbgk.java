package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: bbgk  reason: default package */
/* loaded from: classes3.dex */
final /* synthetic */ class bbgk implements cqjb {
    static final cqjb a = new bbgk();

    private bbgk() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = bbhg.a;
        dkzc dkzcVar = dkzc.UNKNOWN_FEEDBACK_TYPE;
        if (((bbht) cqkpVar).q().ordinal() == 2) {
            return context.getString(R.string.EXEMPLAR_ALREADY_BEEN);
        }
        return context.getString(R.string.EXEMPLAR_NOT_A_FAN);
    }
}
