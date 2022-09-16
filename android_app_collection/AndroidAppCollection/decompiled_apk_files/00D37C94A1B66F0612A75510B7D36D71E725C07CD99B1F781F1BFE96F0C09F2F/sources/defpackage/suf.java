package defpackage;
/* compiled from: PG */
/* renamed from: suf  reason: default package */
/* loaded from: classes4.dex */
public final class suf extends cyr {
    public static final /* synthetic */ int A = 0;
    @dfs(a = 14)
    private sue B;
    @dfs(a = 13)
    tda a;
    @dfs(a = 3)
    boolean b;
    @dfs(a = 13)
    azqb c;
    @dfs(a = 13)
    azqb d;
    @dfs(a = 3)
    boolean e;
    @dfs(a = 13)
    ayoi f;
    @dfs(a = 13)
    teb g;
    @dfs(a = 13)
    tff v;
    @dfs(a = 13)
    suv w;
    @dfs(a = 13)
    aypf x;
    @dfs(a = 13)
    tdi y;
    @dfs(a = 13)
    tdr z;

    public suf() {
        super("ComponentType");
        this.B = new sue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        suw.a(cyvVar, dczVar, this.z, this.x, this.y, this.w, this.f, this.a, this.g, this.b, this.e);
        this.B.b = (svx) dczVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        sue sueVar = (sue) ddlVar;
        sue sueVar2 = (sue) ddlVar2;
        sueVar2.a = sueVar.a;
        sueVar2.b = sueVar.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void ar() {
        suw.d(this.a, this.w, this.c, this.d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void au(aflw aflwVar) {
        if (aflwVar == null) {
            return;
        }
        this.x = (aypf) aflwVar.f(aypf.class);
        this.y = (tdi) aflwVar.f(tdi.class);
        this.z = (tdr) aflwVar.f(tdr.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        sue sueVar = this.B;
        svx svxVar = sueVar.b;
        int i = sueVar.a;
        return suw.c(cyvVar, svxVar, this.x, this.w, this.f, this.a, this.g, this.v, this.b, this.e);
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        suf sufVar = (suf) super.j();
        sufVar.B = new sue();
        return sufVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.B;
    }
}
