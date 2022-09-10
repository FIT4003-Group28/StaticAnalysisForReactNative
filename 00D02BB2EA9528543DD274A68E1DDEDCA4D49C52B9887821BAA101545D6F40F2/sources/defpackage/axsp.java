package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: axsp  reason: default package */
/* loaded from: classes3.dex */
public final class axsp implements btzi<dvvi, dvvm> {
    final /* synthetic */ baaq a;
    final /* synthetic */ axtp b;

    public axsp(axtp axtpVar, baaq baaqVar) {
        this.b = axtpVar;
        this.a = baaqVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dvvi> btzrVar, btzy btzyVar) {
        this.a.o(btzyVar.p);
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dvvi> btzrVar, dvvm dvvmVar) {
        bttq f = this.a.f(dvvmVar);
        if (f == bttq.INVALID_GAIA_AUTH_TOKEN) {
            this.b.o.a().A(btzrVar.c, btzrVar.b);
        }
        this.a.o(f);
    }
}
