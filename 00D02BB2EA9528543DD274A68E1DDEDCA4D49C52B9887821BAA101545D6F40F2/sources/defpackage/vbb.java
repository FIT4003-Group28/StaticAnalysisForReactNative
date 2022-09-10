package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: vbb  reason: default package */
/* loaded from: classes7.dex */
final class vbb implements cqjb<zdg, CharSequence> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ CharSequence a(zdg zdgVar, Context context) {
        zdg zdgVar2 = zdgVar;
        return context.getResources().getQuantityString(R.plurals.DIRECTIONS_COUNT_STOPS, zdgVar2.a().intValue(), zdgVar2.a());
    }
}
