package defpackage;

import java.nio.ByteBuffer;
import java.util.List;
/* compiled from: PG */
/* renamed from: swa  reason: default package */
/* loaded from: classes4.dex */
public final class swa implements tdw {
    private final tei a;
    private final svy b;
    private final int c;
    private final svz d;
    private final boolean e;

    private swa(tei teiVar, svy svyVar, int i, svz svzVar, boolean z) {
        this.a = teiVar;
        this.b = svyVar;
        this.c = i;
        this.d = svzVar;
        this.e = z;
    }

    public static tdw b(tei teiVar, svy svyVar, int i, svz svzVar) {
        return c(teiVar, svyVar, i, svzVar, false);
    }

    public static tdw c(tei teiVar, svy svyVar, int i, svz svzVar, boolean z) {
        return new swa(teiVar, svyVar, i, svzVar, z);
    }

    @Override // defpackage.tdw
    public final int a() {
        return this.c;
    }

    @Override // defpackage.tdw
    public final aodt d(ByteBuffer byteBuffer) {
        return this.d.a(byteBuffer);
    }

    @Override // defpackage.tdw
    public final boolean e() {
        return this.e;
    }

    @Override // defpackage.tdw
    public final cyr f(cyv cyvVar, tda tdaVar, aodt aodtVar, String str, aodt aodtVar2, List list, tdi tdiVar, boolean z) {
        suc sucVar;
        tda tdaVar2;
        tdh tdhVar;
        ten tenVar;
        if (tfy.i(aodtVar2, 168774585) != null) {
            amuk amukVar = tdaVar.q;
            if (amukVar == null) {
                amukVar = amuk.q();
            }
            sucVar = new suc(amukVar);
        } else {
            sucVar = null;
        }
        boolean z2 = this.c == 168777401;
        awoc c = tdaVar.c();
        tee b = tdaVar.b();
        tdz tdzVar = tdaVar.u;
        svm svmVar = new svm(c, b, z2, (tdzVar == null || (tenVar = tdzVar.g) == null) ? tdaVar.l : tenVar.e);
        if (tdiVar != null) {
            tdh a = tdiVar.a(svmVar);
            tcz e = tdaVar.e();
            e.m = a;
            tdaVar2 = e.a();
            tdhVar = a;
        } else {
            tdaVar2 = tdaVar;
            tdhVar = svmVar;
        }
        svmVar.a = this.b.a(cyvVar, tdaVar2, aodtVar, str, aodtVar2, sucVar, list);
        if (z) {
            this.a.b(svmVar);
        }
        if (!z2) {
            this.a.a(cyvVar, tdaVar2, str, aodtVar2, tdhVar, sucVar);
        }
        axml axmlVar = new axml();
        if (tfy.m(aodtVar2, axmlVar)) {
            syb.d(axmlVar, tdhVar);
        }
        cyr b2 = tdhVar.b(cyvVar);
        svmVar.a = null;
        return b2;
    }
}
