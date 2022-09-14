package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvbd  reason: default package */
/* loaded from: classes4.dex */
final class bvbd implements bvbb {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvbd(bvbc bvbcVar) {
        this.b = bvbcVar.a;
        this.c = bvbcVar.b;
        this.a = bvbcVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dvqj dvqjVar, btzi<dvqj, dvqr> btziVar, bvrj bvrjVar) {
        dvqj dvqjVar2 = dvqjVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvqjVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dvqj, dvqr>> c(dvqj dvqjVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvqj dvqjVar, btzi<dvqj, dvqr> btziVar, Executor executor) {
        return this.b.a().a(dvqjVar, this.a, btziVar, executor);
    }
}
