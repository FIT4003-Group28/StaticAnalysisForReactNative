package defpackage;
/* compiled from: PG */
/* renamed from: bbod  reason: default package */
/* loaded from: classes3.dex */
final class bbod implements degu<djzy> {
    final /* synthetic */ bboh a;

    public bbod(bboh bbohVar) {
        this.a = bbohVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.e();
        bbdy bbdyVar = this.a.h;
        if (bbdyVar != null) {
            bbdyVar.aJ(2);
        }
        bwrs<ilo> bwrsVar = this.a.f;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        ily g = c.g();
        g.e = true;
        bwrsVar.d(g.d());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(djzy djzyVar) {
        bbdy bbdyVar = this.a.h;
        if (bbdyVar != null) {
            bbdyVar.aJ(1);
        }
        this.a.c.a().J(this.a.f);
    }
}
