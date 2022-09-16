package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: tgd  reason: default package */
/* loaded from: classes4.dex */
public final class tgd extends cyr {
    @dfs(a = 13)
    tfm a;
    @dfs(a = 13)
    tda b;
    @dfs(a = 14)
    private final tgc c;

    private tgd() {
        super("LazilyConvertedElement");
        this.b = tge.a;
        this.c = new tgc();
    }

    public static tgb a(cyv cyvVar) {
        tgb tgbVar = new tgb();
        tgb.d(tgbVar, cyvVar, new tgd());
        return tgbVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        tge.b(dczVar, dczVar2);
        tgc tgcVar = this.c;
        tgcVar.b = (AtomicReference) dczVar.a;
        tgcVar.a = (AtomicReference) dczVar2.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        tgc tgcVar = (tgc) ddlVar;
        tgc tgcVar2 = (tgc) ddlVar2;
        tgcVar2.a = tgcVar.a;
        tgcVar2.b = tgcVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        tfm tfmVar = this.a;
        tda tdaVar = this.b;
        tgc tgcVar = this.c;
        return tge.a(cyvVar, tfmVar, tdaVar, tgcVar.b, tgcVar.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.c;
    }
}
