package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: airp  reason: default package */
/* loaded from: classes2.dex */
final class airp implements degu<Boolean> {
    final /* synthetic */ airr a;

    public airp(airr airrVar) {
        this.a = airrVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        if (bool.booleanValue()) {
            gga ggaVar = this.a.aE;
            dbsk.s(ggaVar);
            this.a.aq.a().f(ggaVar, new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 2);
        }
    }
}
