package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bujw  reason: default package */
/* loaded from: classes4.dex */
public final class bujw implements buju {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bujw(bujv bujvVar) {
        this.b = bujvVar.a;
        this.c = bujvVar.b;
        this.a = bujvVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dvjl dvjlVar, btzi<dvjl, dvjn> btziVar, bvrj bvrjVar) {
        dvjl dvjlVar2 = dvjlVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvjlVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dvjl, dvjn>> c(dvjl dvjlVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvjl dvjlVar, btzi<dvjl, dvjn> btziVar, Executor executor) {
        return this.b.a().a(dvjlVar, this.a, btziVar, executor);
    }
}
