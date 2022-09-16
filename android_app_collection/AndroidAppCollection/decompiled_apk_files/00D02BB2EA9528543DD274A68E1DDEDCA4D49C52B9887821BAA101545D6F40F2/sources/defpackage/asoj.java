package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: asoj  reason: default package */
/* loaded from: classes2.dex */
final class asoj implements cqjb<asuu, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(asuu asuuVar, Context context) {
        asuu asuuVar2 = asuuVar;
        boolean z = false;
        if (asuuVar2.e().booleanValue() && asuuVar2.g().booleanValue() && context.getResources().getConfiguration().smallestScreenWidthDp <= 360 && context.getResources().getConfiguration().fontScale > 1.0f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
