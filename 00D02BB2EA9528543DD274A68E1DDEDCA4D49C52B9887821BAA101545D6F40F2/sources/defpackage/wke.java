package defpackage;
/* compiled from: PG */
/* renamed from: wke  reason: default package */
/* loaded from: classes7.dex */
public final class wke implements degu<dopk> {
    protected final degu<dopk> a;
    final /* synthetic */ wkf b;

    /* JADX INFO: Access modifiers changed from: protected */
    public wke(wkf wkfVar, degu<dopk> deguVar) {
        this.b = wkfVar;
        dbsk.s(deguVar);
        this.a = deguVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        wkf wkfVar = this.b;
        if (wkfVar.a == this) {
            wkfVar.a = null;
        }
        this.a.a(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi dopk dopkVar) {
        dopk dopkVar2 = dopkVar;
        wkf wkfVar = this.b;
        if (wkfVar.a == this) {
            wkfVar.a = null;
        }
        this.a.b(dopkVar2);
    }
}
