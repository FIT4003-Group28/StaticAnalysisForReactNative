package defpackage;

import android.view.View;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: stv  reason: default package */
/* loaded from: classes4.dex */
public final class stv extends cyr {
    @dfs(a = 13)
    szk A;
    @dfs(a = 13)
    aypf B;
    @dfs(a = 13)
    tdi C;
    @dfs(a = 13)
    tdr D;
    @dfs(a = 13)
    suc E;
    @dfs(a = 14)
    private final stu F;
    @dfs(a = 6)
    List a;
    @dfs(a = 13)
    axmr b;
    @dfs(a = 13)
    tcu c;
    @dfs(a = 13)
    tda d;
    @dfs(a = 13)
    String e;
    @dfs(a = 13)
    axna f;
    @dfs(a = 3)
    boolean g;
    @dfs(a = 13)
    tfw v;
    @dfs(a = 13)
    tfw w;
    @dfs(a = 13)
    tfw x;
    @dfs(a = 13)
    AtomicReference y;
    @dfs(a = 13)
    azqb z;

    public stv() {
        super("Collection");
        this.F = new stu();
    }

    @Override // defpackage.czb, defpackage.dap
    public final Object K(daq daqVar, Object obj) {
        int i = daqVar.b;
        if (i == -1048037474) {
            N((cyv) daqVar.c[0], (dao) obj);
            return null;
        } else if (i != 1803022739) {
            return null;
        } else {
            dbb dbbVar = daqVar.a;
            cyv cyvVar = (cyv) daqVar.c[0];
            View view = ((dev) obj).a;
            stv stvVar = (stv) dbbVar;
            axmr axmrVar = stvVar.b;
            AtomicReference atomicReference = stvVar.y;
            stu stuVar = stvVar.F;
            sub.f(axmrVar, atomicReference, stuVar.e, stuVar.d);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        dcz dczVar5 = new dcz();
        sub.d(cyvVar, this.z, this.b, dczVar, dczVar2, dczVar3, dczVar4, dczVar5);
        stu stuVar = this.F;
        stuVar.e = (dle) dczVar.a;
        stuVar.c = (tes) dczVar2.a;
        stuVar.d = (AtomicBoolean) dczVar3.a;
        stuVar.b = (AtomicBoolean) dczVar4.a;
        stuVar.a = (tcr) dczVar5.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        stu stuVar = (stu) ddlVar;
        stu stuVar2 = (stu) ddlVar2;
        stuVar2.a = stuVar.a;
        stuVar2.e = stuVar.e;
        stuVar2.b = stuVar.b;
        stuVar2.c = stuVar.c;
        stuVar2.d = stuVar.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean aa() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.czb
    public final void ap() {
        String str = this.e;
        suc sucVar = this.E;
        stu stuVar = this.F;
        sub.c(str, sucVar, stuVar.a, stuVar.e, stuVar.b);
    }

    @Override // defpackage.czb
    public final void aq() {
        String str = this.e;
        suc sucVar = this.E;
        stu stuVar = this.F;
        sub.e(str, sucVar, stuVar.a, stuVar.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void au(aflw aflwVar) {
        if (aflwVar == null) {
            return;
        }
        this.B = (aypf) aflwVar.f(aypf.class);
        this.C = (tdi) aflwVar.f(tdi.class);
        this.D = (tdr) aflwVar.f(tdr.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        tdr tdrVar = this.D;
        tdi tdiVar = this.C;
        aypf aypfVar = this.B;
        tda tdaVar = this.d;
        axmr axmrVar = this.b;
        List list = this.a;
        tcu tcuVar = this.c;
        stu stuVar = this.F;
        return sub.b(cyvVar, tdrVar, tdiVar, aypfVar, tdaVar, axmrVar, list, tcuVar, stuVar.e, stuVar.b, stuVar.c, this.g, this.y, this.w, this.v, this.x, this.f, stuVar.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.F;
    }
}
