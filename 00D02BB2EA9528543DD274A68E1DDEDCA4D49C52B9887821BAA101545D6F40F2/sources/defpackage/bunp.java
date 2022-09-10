package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bunp  reason: default package */
/* loaded from: classes4.dex */
final class bunp implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bunp(buno bunoVar) {
        this.b = bunoVar.a;
        this.c = bunoVar.b;
        this.a = bunoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhyu dhyuVar = (dhyu) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhyuVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhyu dhyuVar, btzi<dhyu, dhyy> btziVar, Executor executor) {
        return this.b.a().a(dhyuVar, this.a, btziVar, executor);
    }
}
