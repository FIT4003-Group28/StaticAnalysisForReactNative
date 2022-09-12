package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* renamed from: ciug  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ciug implements cqjb {
    static final cqjb a = new ciug();

    private ciug() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        int i = ciuq.a;
        Resources resources = context.getResources();
        chuz chuzVar = chuz.CHECK_BACK_LATER;
        int ordinal = ((ciur) cqkpVar).a().ordinal();
        if (ordinal != 4) {
            if (ordinal == 5) {
                return resources.getText(R.string.CZ_ZERO_STATE_HEADER_UPLOAD_PHOTO_BEFORE_TAG_V2);
            }
            return resources.getText(R.string.CZ_ZERO_STATE_HEADER);
        }
        return resources.getText(R.string.CZ_ZERO_STATE_HEADER_PUBLISH_LISTS);
    }
}
