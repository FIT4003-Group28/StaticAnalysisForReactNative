package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xjr  reason: default package */
/* loaded from: classes7.dex */
final class xjr implements xjy {
    @Override // defpackage.xjy
    public final String a(Context context, int i) {
        return context.getResources().getQuantityString(R.plurals.TRANSIT_PAST_DEPARTURE_MINUTES_STACK, -i, "{0}");
    }

    @Override // defpackage.xjy
    public final String b(Context context, int i) {
        return Integer.toString(-i);
    }

    @Override // defpackage.xjy
    public final float c() {
        return 1.8333334f;
    }
}
