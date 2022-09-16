package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: alsr  reason: default package */
/* loaded from: classes.dex */
public final class alsr extends also {
    final /* synthetic */ also a;
    final /* synthetic */ alsy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alsr(alsy alsyVar, alvg alvgVar, also alsoVar) {
        super(alvgVar);
        this.b = alsyVar;
        this.a = alsoVar;
    }

    @Override // defpackage.also
    public final void a() {
        alsy alsyVar = this.b;
        also alsoVar = this.a;
        if (alsyVar.l != null || alsyVar.f) {
            if (alsyVar.f) {
                alsyVar.c.add(alsoVar);
                return;
            } else {
                alsoVar.run();
                return;
            }
        }
        alsyVar.c.add(alsoVar);
        alsyVar.k = new alsx(alsyVar);
        alsyVar.f = true;
        if (alsyVar.a.bindService(alsyVar.g, alsyVar.k, 1)) {
            return;
        }
        alsyVar.f = false;
        for (also alsoVar2 : alsyVar.c) {
            alsoVar2.b(new alsz());
        }
        alsyVar.c.clear();
    }
}
