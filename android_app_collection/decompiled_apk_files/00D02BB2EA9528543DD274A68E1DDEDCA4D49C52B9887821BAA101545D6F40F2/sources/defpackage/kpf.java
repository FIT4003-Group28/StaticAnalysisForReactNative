package defpackage;
/* compiled from: PG */
/* renamed from: kpf  reason: default package */
/* loaded from: classes7.dex */
final class kpf implements btzi<dvvi, dvvm> {
    final /* synthetic */ baaq a;
    final /* synthetic */ kpj b;

    public kpf(kpj kpjVar, baaq baaqVar) {
        this.b = kpjVar;
        this.a = baaqVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvvi> btzrVar, btzy btzyVar) {
        bvrj.UI_THREAD.c();
        this.a.o(btzyVar.p);
        bttq bttqVar = btzyVar.p;
        kpj kpjVar = this.b;
        kpjVar.g.k(kpjVar.a.getResources().getString(jvn.CAR_ERROR_HOME_WORK_UPDATE_FAILED), 1);
        this.b.e.b(kpg.SET);
        kpj kpjVar2 = this.b;
        kpj.f(kpjVar2.b, kpjVar2.c.a(), this.b.f);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvvi> btzrVar, dvvm dvvmVar) {
        bvrj.UI_THREAD.c();
        this.a.o(this.a.f(dvvmVar));
        this.b.e.b(kpg.SET);
    }
}
