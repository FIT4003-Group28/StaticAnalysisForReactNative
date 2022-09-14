package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xjw  reason: default package */
/* loaded from: classes7.dex */
public final class xjw implements cqjb<cqkp, CharSequence> {
    final /* synthetic */ cqjb a;

    public xjw(cqjb cqjbVar) {
        this.a = cqjbVar;
    }

    @Override // defpackage.cqjb
    @dzsi
    public final /* bridge */ /* synthetic */ CharSequence a(cqkp cqkpVar, Context context) {
        eapq eapqVar = (eapq) this.a.a(cqkpVar, context);
        if (eapqVar == null) {
            return null;
        }
        xjy xjyVar = xjz.a;
        bvsx bvsxVar = new bvsx(context.getResources());
        int f = (int) eapqVar.h().f();
        xjy f2 = xjz.f(eapqVar);
        if (f2 == null) {
            return null;
        }
        String a = f2.a(context, f);
        String b = f2.b(context, f);
        xjb.a();
        bvsv a2 = bvsxVar.a(b);
        a2.o(f2.c());
        a2.i();
        bvsu b2 = bvsxVar.b(a);
        b2.a(a2);
        return b2.c();
    }
}
