package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: srg  reason: default package */
/* loaded from: classes4.dex */
public final class srg extends cyr {
    @dfs(a = 13)
    aypf a;
    @dfs(a = 13)
    tdi b;
    @dfs(a = 10)
    cyr c;
    @dfs(a = 13)
    tdr d;
    @dfs(a = 13)
    tfd e;

    public srg() {
        super("ElementsRootFlat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final aflw at(cyv cyvVar, aflw aflwVar) {
        aflw h = aflw.h(aflwVar);
        h.g(tdr.class, this.d);
        h.g(tdi.class, this.b);
        h.g(aypf.class, this.a);
        h.g(tfd.class, this.e);
        return h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        return this.c;
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        srg srgVar = (srg) super.j();
        cyr cyrVar = srgVar.c;
        srgVar.c = cyrVar != null ? cyrVar.j() : null;
        return srgVar;
    }
}
