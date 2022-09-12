package defpackage;
/* compiled from: PG */
/* renamed from: dyvv  reason: default package */
/* loaded from: classes6.dex */
final class dyvv extends dyvx {
    final /* synthetic */ dyvy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyvv(dyvy dyvyVar) {
        super(dyvyVar);
        this.a = dyvyVar;
        int i = dyzn.a;
    }

    @Override // defpackage.dyvx
    public final void a() {
        int i = dyzn.a;
        eaiz eaizVar = new eaiz();
        synchronized (this.a.a) {
            eaiz eaizVar2 = this.a.b;
            eaizVar.a(eaizVar2, eaizVar2.b);
            this.a.e = false;
        }
        this.a.f.a(eaizVar, eaizVar.b);
        this.a.f.flush();
    }
}
