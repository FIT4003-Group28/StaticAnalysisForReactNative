package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cjks  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class cjks implements cqjb {
    static final cqjb a = new cjks();

    private cjks() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        Integer valueOf;
        int e = ((jmj.e(context, ((cjme) cqkpVar).a().e(context)) + 28) / 56) * 56;
        if (context.getResources().getConfiguration().orientation == 1) {
            valueOf = Integer.valueOf(Math.min(jmj.e(context, cqsg.g(cqsz.c(), cqrp.d(16.0d)).e(context)), 560));
        } else {
            valueOf = Integer.valueOf(jmj.e(context, cqsg.f(cqsz.c(), Float.valueOf(0.65f)).e(context)));
        }
        return Integer.valueOf(cqrp.d(Math.max(Math.min(e, ((valueOf.intValue() - 28) / 56) * 56), 280)).e(context));
    }
}
