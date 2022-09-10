package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buqd  reason: default package */
/* loaded from: classes4.dex */
public final class buqd implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buqd(buqc buqcVar) {
        this.b = buqcVar.a;
        this.c = buqcVar.b;
        this.a = buqcVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvct dvctVar = (dvct) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvctVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvct dvctVar, btzi<dvct, dvcx> btziVar, Executor executor) {
        return this.b.a().a(dvctVar, this.a, btziVar, executor);
    }
}
