package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vjm  reason: default package */
/* loaded from: classes7.dex */
final class vjm implements cqjb<zdg, CharSequence> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ CharSequence a(zdg zdgVar, Context context) {
        zdg zdgVar2 = zdgVar;
        if (zdgVar2.w().booleanValue()) {
            return context.getResources().getString(R.string.WAYPOINT_EDIT_MODE_PARKING_LETTER);
        }
        int min = Math.min(zdgVar2.b().intValue(), 25) - 1;
        return (min < 0 || zdgVar2.e().booleanValue()) ? "" : Character.toString((char) (min + 65));
    }
}
