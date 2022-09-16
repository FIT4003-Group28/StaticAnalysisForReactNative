package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: swc  reason: default package */
/* loaded from: classes4.dex */
public final class swc implements tdv {
    private final tei a;
    private final swb b;
    private final aooq c;

    private swc(tei teiVar, swb swbVar, aooq aooqVar) {
        this.a = teiVar;
        this.b = swbVar;
        this.c = aooqVar;
    }

    public static tdv a(tei teiVar, swb swbVar, aooq aooqVar) {
        return new swc(teiVar, swbVar, aooqVar);
    }

    @Override // defpackage.tdv
    public final aooq b() {
        return this.c;
    }

    @Override // defpackage.tdv
    public final cyr c(cyv cyvVar, tda tdaVar, aoqu aoquVar, String str, aodt aodtVar, List list, tdi tdiVar, boolean z) {
        tda tdaVar2;
        suc sucVar;
        tda tdaVar3;
        tdh tdhVar;
        if (tfy.i(aodtVar, 168774585) != null) {
            tdaVar2 = tdaVar;
            amuk amukVar = tdaVar2.q;
            if (amukVar == null) {
                amukVar = amuk.q();
            }
            sucVar = new suc(amukVar);
        } else {
            tdaVar2 = tdaVar;
            sucVar = null;
        }
        svm svmVar = new svm(tdaVar.c(), tdaVar.b(), false, false);
        if (tdiVar != null) {
            tdh a = tdiVar.a(svmVar);
            tcz e = tdaVar.e();
            e.m = a;
            tdhVar = a;
            tdaVar3 = e.a();
        } else {
            tdaVar3 = tdaVar2;
            tdhVar = svmVar;
        }
        svmVar.a = this.b.a(cyvVar, tdaVar3, aoquVar, aodtVar, list);
        if (z) {
            this.a.b(svmVar);
        }
        this.a.a(cyvVar, tdaVar3, str, aodtVar, tdhVar, sucVar);
        axml axmlVar = new axml();
        if (tfy.m(aodtVar, axmlVar)) {
            syb.d(axmlVar, tdhVar);
        }
        cyr b = tdhVar.b(cyvVar);
        svmVar.a = null;
        return b;
    }
}
