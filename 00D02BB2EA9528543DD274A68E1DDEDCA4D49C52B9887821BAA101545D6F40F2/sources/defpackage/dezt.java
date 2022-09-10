package defpackage;
/* compiled from: PG */
/* renamed from: dezt  reason: default package */
/* loaded from: classes6.dex */
final class dezt extends dyga {
    final /* synthetic */ dezu a;
    private dyhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dezt(dezu dezuVar, dyew dyewVar) {
        super(dyewVar);
        this.a = dezuVar;
    }

    @Override // defpackage.dyir, defpackage.dyew
    public final void a(dyhw dyhwVar) {
        this.b = dyhwVar;
    }

    @Override // defpackage.dyir, defpackage.dyew
    public final void b(dyjb dyjbVar, dyhw dyhwVar) {
        dyiy dyiyVar = dyjbVar.p;
        if (dyiyVar.equals(dyiy.UNAUTHENTICATED) || dyiyVar.equals(dyiy.PERMISSION_DENIED)) {
            dezu dezuVar = this.a;
            synchronized (dezuVar.a) {
                dezuVar.c = dezuVar.d.a(dezuVar.e, dezuVar.f.d(dexc.a, true));
                for (Runnable runnable : dezuVar.b) {
                    runnable.run();
                }
            }
            return;
        }
        dyhw dyhwVar2 = this.b;
        if (dyhwVar2 != null) {
            this.j.a(dyhwVar2);
            this.b = null;
        }
        this.j.b(dyjbVar, dyhwVar);
    }

    @Override // defpackage.dygb, defpackage.dyew
    public final void c(Object obj) {
        dyhw dyhwVar = this.b;
        if (dyhwVar != null) {
            this.j.a(dyhwVar);
            this.b = null;
        }
        this.j.c(obj);
    }
}
