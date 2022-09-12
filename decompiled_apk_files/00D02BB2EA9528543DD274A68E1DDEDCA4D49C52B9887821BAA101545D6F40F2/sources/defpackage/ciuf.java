package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: ciuf  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ciuf implements cqjb {
    static final cqjb a = new ciuf();

    private ciuf() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = ciuq.a;
        chuz chuzVar = chuz.CHECK_BACK_LATER;
        int ordinal = ((ciur) cqkpVar).a().ordinal();
        if (ordinal != 4) {
            if (ordinal == 5) {
                return iup.e(R.raw.ic_dish_tagging_zero_state);
            }
            return iva.e(iup.e(R.raw.checklist), iup.e(R.raw.checklist_dark_mode));
        }
        return iup.e(R.raw.globe);
    }
}
