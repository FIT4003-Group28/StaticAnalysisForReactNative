package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: asge  reason: default package */
/* loaded from: classes2.dex */
final class asge implements cqjb<asha, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(asha ashaVar, Context context) {
        asha ashaVar2 = ashaVar;
        boolean z = false;
        if (ashaVar2.B().booleanValue() && !ashaVar2.n().booleanValue() && !ashaVar2.I().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
