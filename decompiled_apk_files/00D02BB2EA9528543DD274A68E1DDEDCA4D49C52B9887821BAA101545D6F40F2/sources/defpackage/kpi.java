package defpackage;

import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: kpi  reason: default package */
/* loaded from: classes7.dex */
final class kpi implements degu<Boolean> {
    final dndr a;
    final WeakReference<axwq> b;
    final WeakReference<crzo<ldm>> c;

    public kpi(dndr dndrVar, axwq axwqVar, crzo<ldm> crzoVar) {
        this.a = dndrVar;
        this.b = new WeakReference<>(axwqVar);
        this.c = new WeakReference<>(crzoVar);
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        bvrj.BACKGROUND_THREADPOOL.c();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Boolean bool) {
        Boolean bool2 = bool;
        bvrj.BACKGROUND_THREADPOOL.c();
        axwq axwqVar = this.b.get();
        crzo<ldm> crzoVar = this.c.get();
        if (axwqVar == null || crzoVar == null || !bool2.booleanValue()) {
            return;
        }
        kpj.f(this.a, axwqVar, crzoVar);
    }
}
