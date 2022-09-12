package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: atiy  reason: default package */
/* loaded from: classes2.dex */
final class atiy implements cqjb<atnf, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(atnf atnfVar, Context context) {
        atnf atnfVar2 = atnfVar;
        boolean z = false;
        if (!atnfVar2.H().booleanValue()) {
            if (atnfVar2.b() == null) {
                return atnfVar2.J();
            }
            if (atnfVar2.J().booleanValue() || atnfVar2.b().J().booleanValue()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
