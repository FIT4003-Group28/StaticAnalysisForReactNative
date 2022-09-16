package defpackage;
/* compiled from: PG */
/* renamed from: tie  reason: default package */
/* loaded from: classes4.dex */
public final class tie extends cyr {
    @dfs(a = 13)
    tif a;
    @dfs(a = 14)
    private final tid b;

    public tie() {
        super("ElementDeferredLayout");
        this.b = new tid();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        tif tifVar = this.a;
        try {
            tda a = tda.a().a();
            tig tigVar = tifVar.a;
            swq swqVar = tigVar.a;
            dhk dhkVar = tigVar.d;
            tcz e = a.e();
            e.f(tigVar.c);
            e.l = tigVar.i;
            dczVar.a = swqVar.b(dhkVar, e.a(), tigVar.j, tigVar.b, tigVar.e);
            this.b.a = (cyr) dczVar.a;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        ((tid) ddlVar2).a = ((tid) ddlVar).a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        cyr cyrVar = this.b.a;
        if (cyrVar != null) {
            return cyrVar.j();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.b;
    }
}
