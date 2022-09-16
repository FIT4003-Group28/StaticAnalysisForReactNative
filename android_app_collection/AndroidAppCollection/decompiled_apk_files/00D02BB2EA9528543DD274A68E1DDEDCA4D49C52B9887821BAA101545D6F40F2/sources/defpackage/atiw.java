package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: atiw  reason: default package */
/* loaded from: classes2.dex */
final class atiw implements cqjb<atnf, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(atnf atnfVar, Context context) {
        atnf atnfVar2 = atnfVar;
        boolean z = false;
        if (!atnfVar2.Y().booleanValue() || !atnfVar2.Q().booleanValue()) {
            if (atnfVar2.b() == null) {
                return atnfVar2.w();
            }
            if (atnfVar2.w().booleanValue() || atnfVar2.b().w().booleanValue()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
