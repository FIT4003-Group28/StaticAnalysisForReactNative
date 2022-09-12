package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: mjg  reason: default package */
/* loaded from: classes7.dex */
final class mjg implements cqjb<mot, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(mot motVar, Context context) {
        mot motVar2 = motVar;
        boolean z = false;
        if (!motVar2.f(kpg.DELETING).booleanValue() && !motVar2.f(kpg.UPDATING).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
