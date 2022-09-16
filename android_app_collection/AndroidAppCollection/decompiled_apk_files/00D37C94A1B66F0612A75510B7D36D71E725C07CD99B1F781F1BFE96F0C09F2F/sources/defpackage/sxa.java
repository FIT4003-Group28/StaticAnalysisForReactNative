package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: sxa  reason: default package */
/* loaded from: classes4.dex */
public final class sxa extends cyr {
    @dfs(a = 13)
    Boolean a;
    @dfs(a = 13)
    tcu b;
    @dfs(a = 13)
    tda c;
    @dfs(a = 13)
    tdg d;
    @dfs(a = 3)
    boolean e;
    @dfs(a = 3)
    boolean f;
    @dfs(a = 3)
    boolean g;
    @dfs(a = 13)
    teb v;
    @dfs(a = 13)
    Map w;
    @dfs(a = 13)
    axnk x;
    @dfs(a = 13)
    tfj y;
    @dfs(a = 14)
    private final swz z;

    private sxa() {
        super("TextComponent");
        this.z = new swz();
    }

    public static swy a(cyv cyvVar) {
        swy swyVar = new swy();
        swy.d(swyVar, cyvVar, new sxa());
        return swyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dcz dczVar2 = new dcz();
        dcz dczVar3 = new dcz();
        dcz dczVar4 = new dcz();
        sxf.e(cyvVar, this.x, this.b, this.y, this.c, this.v, this.w, this.d, this.f, this.g, dczVar, dczVar2, dczVar3, dczVar4);
        swz swzVar = this.z;
        swzVar.c = (AtomicReference) dczVar.a;
        swzVar.d = (AtomicReference) dczVar2.a;
        swzVar.a = (AtomicReference) dczVar3.a;
        swzVar.b = (AtomicReference) dczVar4.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        swz swzVar = (swz) ddlVar;
        swz swzVar2 = (swz) ddlVar2;
        swzVar2.a = swzVar.a;
        swzVar2.b = swzVar.b;
        swzVar2.c = swzVar.c;
        swzVar2.d = swzVar.d;
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
    public final void aq() {
        tdg tdgVar = this.d;
        swz swzVar = this.z;
        sxf.b(tdgVar, swzVar.c, swzVar.d, swzVar.a, swzVar.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final cyr b(cyv cyvVar) {
        axnk axnkVar = this.x;
        tcu tcuVar = this.b;
        tfj tfjVar = this.y;
        teb tebVar = this.v;
        tda tdaVar = this.c;
        Map map = this.w;
        tdg tdgVar = this.d;
        boolean z = this.f;
        boolean z2 = this.g;
        Boolean bool = this.a;
        swz swzVar = this.z;
        return sxf.f(cyvVar, axnkVar, tcuVar, tfjVar, tebVar, tdaVar, map, tdgVar, z, z2, bool, swzVar.c, swzVar.d, swzVar.a, swzVar.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.z;
    }
}
