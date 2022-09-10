package defpackage;
/* compiled from: PG */
/* renamed from: bljy  reason: default package */
/* loaded from: classes3.dex */
public final class bljy implements btzi<difj, difn> {
    final /* synthetic */ dqgr a;
    final /* synthetic */ bljz b;

    public bljy(bljz bljzVar, dqgr dqgrVar) {
        this.b = bljzVar;
        this.a = dqgrVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<difj> btzrVar, btzy btzyVar) {
        this.b.c.b();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<difj> btzrVar, difn difnVar) {
        difn difnVar2 = difnVar;
        bljz bljzVar = this.b;
        dqgr dqgrVar = this.a;
        if (difnVar2.a.size() != 1) {
            bljzVar.c.b();
            return;
        }
        docg docgVar = difnVar2.a.get(0).a;
        if (docgVar == null) {
            docgVar = docg.M;
        }
        bljzVar.c.a(cdrr.q(docgVar, dqgrVar));
    }
}
