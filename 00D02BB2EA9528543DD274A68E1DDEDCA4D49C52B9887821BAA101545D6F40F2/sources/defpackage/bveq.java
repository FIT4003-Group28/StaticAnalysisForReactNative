package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bveq  reason: default package */
/* loaded from: classes4.dex */
public final class bveq implements bveo {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bveq(bvep bvepVar) {
        this.b = bvepVar.a;
        this.c = bvepVar.b;
        this.a = bvepVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(djbb djbbVar, btzi<djbb, djbf> btziVar, bvrj bvrjVar) {
        djbb djbbVar2 = djbbVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djbbVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<djbb, djbf>> c(djbb djbbVar) {
        return btzj.a(this, djbbVar);
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djbb djbbVar, btzi<djbb, djbf> btziVar, Executor executor) {
        return this.b.a().a(djbbVar, this.a, btziVar, executor);
    }
}
