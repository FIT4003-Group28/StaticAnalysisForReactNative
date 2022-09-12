package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atjp  reason: default package */
/* loaded from: classes2.dex */
final class atjp implements cqjb<atnf, CharSequence> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ CharSequence a(atnf atnfVar, Context context) {
        Resources resources = context.getResources();
        CharSequence q = atnfVar.q();
        dbsk.s(q);
        return resources.getString(R.string.NAVIGATION_STEP_LIST_DISTANCE_TO_NEXT_STEP, q);
    }
}
