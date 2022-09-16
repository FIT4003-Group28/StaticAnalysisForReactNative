package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayel  reason: default package */
/* loaded from: classes3.dex */
public final class ayel implements jkh {
    final /* synthetic */ ayen a;

    public ayel(ayen ayenVar) {
        this.a = ayenVar;
    }

    @Override // defpackage.jkh
    public final void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        ayen ayenVar = this.a;
        if (!ayenVar.aD) {
            return;
        }
        ayenVar.aB = jjnVar2;
        if (jjnVar2 == jjn.HIDDEN || jjnVar == jjn.HIDDEN) {
            this.a.aS();
        }
        ayen ayenVar2 = this.a;
        jjn jjnVar3 = ayenVar2.aB;
        dbsk.s(jjnVar3);
        ayenVar2.i(jjnVar3);
        this.a.w();
        this.a.aC.b(jjnVar2);
        gga ggaVar = this.a.aE;
        dbsk.s(ggaVar);
        ggaVar.r().a();
        ayex ayexVar = this.a.aR;
        if (ayexVar != null) {
            ayexVar.L(jkjVar, jjnVar, jjnVar2, jkgVar);
        }
        ayno aynoVar = this.a.aA;
        if (aynoVar == null) {
            return;
        }
        cqkx.p(aynoVar);
    }

    @Override // defpackage.jkh
    public final void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public final void O() {
    }

    @Override // defpackage.jkh
    public final void P(jkj jkjVar, jjn jjnVar, float f) {
        ayez ayezVar = this.a.aS;
        if (ayezVar != null) {
            ayezVar.P(jkjVar, jjnVar, f);
        }
        ayex ayexVar = this.a.aR;
        if (ayexVar != null) {
            ayexVar.P(jkjVar, jjnVar, f);
        }
        ayno aynoVar = this.a.aA;
        if (aynoVar != null) {
            cqkx.p(aynoVar);
        }
    }
}
