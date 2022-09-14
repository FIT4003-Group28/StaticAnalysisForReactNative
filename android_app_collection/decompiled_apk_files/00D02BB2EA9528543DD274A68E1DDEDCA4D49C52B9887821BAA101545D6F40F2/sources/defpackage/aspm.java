package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aspm  reason: default package */
/* loaded from: classes2.dex */
final class aspm implements cqjb<asuq, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(asuq asuqVar, Context context) {
        asuq asuqVar2 = asuqVar;
        boolean z = false;
        if (asuqVar2.w().e().booleanValue() && asuqVar2.w().g().booleanValue() && context.getResources().getConfiguration().smallestScreenWidthDp <= 360 && context.getResources().getConfiguration().fontScale > 1.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
