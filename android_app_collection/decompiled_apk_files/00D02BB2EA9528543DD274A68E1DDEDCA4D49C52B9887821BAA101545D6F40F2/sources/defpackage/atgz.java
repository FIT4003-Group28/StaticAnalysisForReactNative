package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: atgz  reason: default package */
/* loaded from: classes2.dex */
final class atgz implements cqjb<atna, Boolean> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Boolean a(atna atnaVar, Context context) {
        atna atnaVar2 = atnaVar;
        atnj w = atnaVar2.w();
        boolean z = false;
        if (atnaVar2.ap().k().booleanValue() && w != null && w.d().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
