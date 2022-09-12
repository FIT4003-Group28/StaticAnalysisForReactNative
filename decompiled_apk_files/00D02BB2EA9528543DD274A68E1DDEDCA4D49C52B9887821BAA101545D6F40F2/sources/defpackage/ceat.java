package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ceat  reason: default package */
/* loaded from: classes4.dex */
public final class ceat implements akeo {
    final /* synthetic */ ceaw a;

    public ceat(ceaw ceawVar) {
        this.a = ceawVar;
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        ceam h = this.a.c.h();
        if (h != null) {
            if (h.e) {
                ceaw ceawVar = this.a;
                cear cearVar = new cear(h, this, btluVar);
                ceawVar.d.g(ceap.PUBLISHING);
                ceawVar.j.b((dkck) h.h.a(), new ceav(ceawVar, cearVar), ceawVar.h);
                return;
            }
            ceaw ceawVar2 = this.a;
            ceas ceasVar = new ceas(h, this, btluVar);
            ceawVar2.d.g(ceap.PUBLISHING);
            ceawVar2.i.b((dhsg) h.g.a(), new ceau(ceawVar2, ceasVar), ceawVar2.h);
        }
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
    }
}
