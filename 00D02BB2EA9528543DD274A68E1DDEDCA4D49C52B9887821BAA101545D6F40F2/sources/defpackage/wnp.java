package defpackage;

import android.content.Context;
/* renamed from: wnp  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class wnp implements cqjb {
    static final cqjb a = new wnp();

    private wnp() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        wpu wpuVar = (wpu) cqkpVar;
        if (!wpuVar.h().booleanValue() || ((wpuVar.o().booleanValue() && !wpuVar.f().booleanValue()) || !wpuVar.m().booleanValue() || (!wpuVar.g().booleanValue() && dcft.w(wpuVar.r())))) {
            return -1;
        }
        int a2 = dcft.a(wpuVar.s());
        return Integer.valueOf(a2 > 0 ? a2 + 1 : 0);
    }
}
