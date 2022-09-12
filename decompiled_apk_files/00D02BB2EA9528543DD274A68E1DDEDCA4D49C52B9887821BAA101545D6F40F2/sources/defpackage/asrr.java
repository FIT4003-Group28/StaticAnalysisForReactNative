package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: asrr  reason: default package */
/* loaded from: classes2.dex */
final class asrr implements cqjb<asuq, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(asuq asuqVar, Context context) {
        boolean z = false;
        if (context.getResources().getConfiguration().smallestScreenWidthDp <= 360 && context.getResources().getConfiguration().fontScale > 1.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
