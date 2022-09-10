package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvdd  reason: default package */
/* loaded from: classes4.dex */
final class bvdd implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvdd(bvdc bvdcVar) {
        this.b = bvdcVar.a;
        this.c = bvdcVar.b;
        this.a = bvdcVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkbo dkboVar = (dkbo) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkboVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkbo dkboVar, btzi<dkbo, dkbs> btziVar, Executor executor) {
        return this.b.a().a(dkboVar, this.a, btziVar, executor);
    }
}
