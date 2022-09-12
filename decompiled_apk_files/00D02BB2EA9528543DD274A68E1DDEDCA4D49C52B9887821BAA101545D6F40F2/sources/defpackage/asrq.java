package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: asrq  reason: default package */
/* loaded from: classes2.dex */
final class asrq implements cqjb<asuq, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(asuq asuqVar, Context context) {
        boolean z = false;
        if (asuqVar.w().e().booleanValue() && context.getResources().getConfiguration().smallestScreenWidthDp <= 360 && context.getResources().getConfiguration().fontScale > 1.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
