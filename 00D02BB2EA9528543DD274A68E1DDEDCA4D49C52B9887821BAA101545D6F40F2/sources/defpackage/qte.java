package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: qte  reason: default package */
/* loaded from: classes7.dex */
public final class qte implements degu<dbsg<Runnable>> {
    final /* synthetic */ qtj a;

    public qte(qtj qtjVar) {
        this.a = qtjVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.q = null;
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dbsg<Runnable> dbsgVar) {
        dbsg<Runnable> dbsgVar2 = dbsgVar;
        this.a.q = null;
        if (dbsgVar2.a()) {
            dbsgVar2.b().run();
        }
    }
}
