package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bveb  reason: default package */
/* loaded from: classes4.dex */
public final class bveb implements bvdz {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bveb(bvea bveaVar) {
        this.b = bveaVar.a;
        this.c = bveaVar.b;
        this.a = bveaVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(djtr djtrVar, btzi<djtr, djub> btziVar, bvrj bvrjVar) {
        djtr djtrVar2 = djtrVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djtrVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<djtr, djub>> c(djtr djtrVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djtr djtrVar, btzi<djtr, djub> btziVar, Executor executor) {
        return this.b.a().a(djtrVar, this.a, btziVar, executor);
    }
}
