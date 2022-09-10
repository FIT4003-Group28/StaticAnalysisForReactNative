package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvfe  reason: default package */
/* loaded from: classes4.dex */
public final class bvfe implements bvfc {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvfe(bvfd bvfdVar) {
        this.b = bvfdVar.a;
        this.c = bvfdVar.b;
        this.a = bvfdVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(djcg djcgVar, btzi<djcg, djci> btziVar, bvrj bvrjVar) {
        djcg djcgVar2 = djcgVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djcgVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<djcg, djci>> c(djcg djcgVar) {
        return btzj.a(this, djcgVar);
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djcg djcgVar, btzi<djcg, djci> btziVar, Executor executor) {
        return this.b.a().a(djcgVar, this.a, btziVar, executor);
    }
}
