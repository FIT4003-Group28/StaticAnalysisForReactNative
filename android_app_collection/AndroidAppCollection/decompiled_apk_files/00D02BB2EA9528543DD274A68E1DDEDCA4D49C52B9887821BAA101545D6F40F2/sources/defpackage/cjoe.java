package defpackage;
/* compiled from: PG */
/* renamed from: cjoe  reason: default package */
/* loaded from: classes4.dex */
final class cjoe implements hzz {
    final /* synthetic */ cjoo a;

    public cjoe(cjoo cjooVar) {
        this.a = cjooVar;
    }

    @Override // defpackage.hzz
    public final void a(dagb dagbVar) {
        ahin ahinVar;
        if (this.a.aU.p(dagbVar.d) != cjpp.FOR_YOU || (ahinVar = this.a.aR) == null) {
            return;
        }
        ahinVar.M();
    }

    @Override // defpackage.hzz
    public final void b(dagb dagbVar) {
    }

    @Override // defpackage.hzz
    public final void c(dagb dagbVar) {
        aurp aurpVar;
        ahin ahinVar;
        if (this.a.aU.p(dagbVar.d) == cjpp.MESSAGES) {
            this.a.w();
        }
        if (this.a.aU.p(dagbVar.d) == cjpp.FOR_YOU && (ahinVar = this.a.aR) != null) {
            ahinVar.L();
        }
        cjoo cjooVar = this.a;
        if (!cjooVar.b.b || cjooVar.aU.p(dagbVar.d) != cjpp.INBOX || (aurpVar = this.a.aS) == null) {
            return;
        }
        aurpVar.o();
    }
}
