package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajuz  reason: default package */
/* loaded from: classes2.dex */
final class ajuz implements cqjb<ajvb, CharSequence> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ CharSequence a(ajvb ajvbVar, Context context) {
        ajvb ajvbVar2 = ajvbVar;
        if (ajvbVar2.j().booleanValue()) {
            Integer k = ajvbVar2.k();
            dbsk.s(k);
            int intValue = k.intValue();
            if (intValue > 0) {
                Resources resources = context.getResources();
                alp a = alp.a();
                Boolean m = ajvbVar2.m();
                dbsk.s(m);
                return ajsb.a(resources, a, true != m.booleanValue() ? R.string.BATTERY_LEVEL_KNOWN_AND_NOT_CHARGING_ACCESSIBILITY_TEXT_V2 : R.string.BATTERY_LEVEL_KNOWN_AND_CHARGING_ACCESSIBILITY_TEXT_V2, ajvbVar2.l(), Integer.valueOf(intValue));
            }
        }
        return ajsb.a(context.getResources(), alp.a(), R.string.BATTERY_LEVEL_UNKNOWN_ACCESSIBILITY_TEXT, ajvbVar2.l());
    }
}
