package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvfh  reason: default package */
/* loaded from: classes4.dex */
final class bvfh implements bvff {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvfh(bvfg bvfgVar) {
        this.b = bvfgVar.a;
        this.c = bvfgVar.b;
        this.a = bvfgVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(djaa djaaVar, btzi<djaa, djae> btziVar, bvrj bvrjVar) {
        djaa djaaVar2 = djaaVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djaaVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<djaa, djae>> c(djaa djaaVar) {
        return btzj.a(this, djaaVar);
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djaa djaaVar, btzi<djaa, djae> btziVar, Executor executor) {
        return this.b.a().a(djaaVar, this.a, btziVar, executor);
    }
}
