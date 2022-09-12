package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* renamed from: ccqb  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ccqb implements cqjb {
    static final cqjb a = new ccqb();

    private ccqb() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        cqjg cqjgVar = ccql.a;
        dgfb dgfbVar = dgfb.UNKNOWN_OFFERING_TYPE;
        return context.getString(((ccxl) cqkpVar).m().ordinal() != 1 ? R.string.OFFERING_SUGGESTION_WHAT_IS_IT : R.string.OFFERING_SUGGESTION_DISH_TITLE);
    }
}
