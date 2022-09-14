package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xjv  reason: default package */
/* loaded from: classes7.dex */
public final class xjv implements cqjb<cqkp, CharSequence> {
    final /* synthetic */ cqjb a;

    public xjv(cqjb cqjbVar) {
        this.a = cqjbVar;
    }

    @Override // defpackage.cqjb
    @dzsi
    public final /* bridge */ /* synthetic */ CharSequence a(cqkp cqkpVar, Context context) {
        eapr eaprVar = (eapr) this.a.a(cqkpVar, context);
        if (eaprVar == null) {
            return null;
        }
        return xjz.s(context, eaprVar, true);
    }
}
