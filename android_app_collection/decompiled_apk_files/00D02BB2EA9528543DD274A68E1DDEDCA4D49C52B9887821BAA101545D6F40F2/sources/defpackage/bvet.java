package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvet  reason: default package */
/* loaded from: classes4.dex */
public final class bvet implements bver {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvet(bves bvesVar) {
        this.b = bvesVar.a;
        this.c = bvesVar.b;
        this.a = bvesVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(didg didgVar, btzi<didg, didi> btziVar, bvrj bvrjVar) {
        didg didgVar2 = didgVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(didgVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<didg, didi>> c(didg didgVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(didg didgVar, btzi<didg, didi> btziVar, Executor executor) {
        return this.b.a().a(didgVar, this.a, btziVar, executor);
    }
}
