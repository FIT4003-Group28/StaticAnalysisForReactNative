package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: hpn  reason: default package */
/* loaded from: classes.dex */
final class hpn implements cqjb<izs, Integer> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Integer a(izs izsVar, Context context) {
        return Integer.valueOf(ibn.w().e(context) - ((int) Math.ceil(context.getResources().getDisplayMetrics().density * 9.0f)));
    }
}
