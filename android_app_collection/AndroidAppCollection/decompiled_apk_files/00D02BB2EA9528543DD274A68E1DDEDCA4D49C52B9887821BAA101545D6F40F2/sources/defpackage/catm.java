package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: catm  reason: default package */
/* loaded from: classes4.dex */
final class catm implements cqjb<cagh, Integer> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Integer a(cagh caghVar, Context context) {
        int i = context.getResources().getConfiguration().smallestScreenWidthDp;
        return Integer.valueOf(jmj.a(context, Math.min((i + i) / 3, 250)));
    }
}
