package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: hpo  reason: default package */
/* loaded from: classes.dex */
final class hpo implements cqjb<izs, Integer> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Integer a(izs izsVar, Context context) {
        int e = ibn.x().e(context);
        int ceil = (int) Math.ceil(context.getResources().getDisplayMetrics().density * 9.0f);
        int i = 0;
        int e2 = cqrp.d(Math.max(0, 6)).e(context);
        if (true == izsVar.B().booleanValue()) {
            i = e2;
        }
        return Integer.valueOf((e - ceil) - i);
    }
}
