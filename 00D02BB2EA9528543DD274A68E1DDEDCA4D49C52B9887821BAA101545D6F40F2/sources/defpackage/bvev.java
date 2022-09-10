package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvev  reason: default package */
/* loaded from: classes4.dex */
public final class bvev implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvev(bveu bveuVar) {
        this.b = bveuVar.a;
        this.c = bveuVar.b;
        this.a = bveuVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djbl djblVar = (djbl) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djblVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djbl djblVar, btzi<djbl, djce> btziVar, Executor executor) {
        return this.b.a().a(djblVar, this.a, btziVar, executor);
    }
}
