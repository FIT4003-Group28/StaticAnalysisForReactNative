package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvbt  reason: default package */
/* loaded from: classes4.dex */
public final class bvbt implements bvbr {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvbt(bvbs bvbsVar) {
        this.b = bvbsVar.a;
        this.c = bvbsVar.b;
        this.a = bvbsVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dhzo dhzoVar, btzi<dhzo, dhzq> btziVar, bvrj bvrjVar) {
        dhzo dhzoVar2 = dhzoVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhzoVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dhzo, dhzq>> c(dhzo dhzoVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhzo dhzoVar, btzi<dhzo, dhzq> btziVar, Executor executor) {
        return this.b.a().a(dhzoVar, this.a, btziVar, executor);
    }
}
