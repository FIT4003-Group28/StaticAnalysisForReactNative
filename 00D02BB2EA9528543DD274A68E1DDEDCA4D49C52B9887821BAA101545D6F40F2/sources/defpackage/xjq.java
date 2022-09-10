package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xjq  reason: default package */
/* loaded from: classes7.dex */
public final class xjq implements cqjb<cqkp, Integer> {
    final /* synthetic */ cqjb a;

    public xjq(cqjb cqjbVar) {
        this.a = cqjbVar;
    }

    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Integer a(cqkp cqkpVar, Context context) {
        eapq eapqVar = (eapq) this.a.a(cqkpVar, context);
        return Integer.valueOf(eapqVar == null ? 0 : xjz.m(context, eapqVar));
    }
}
