package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buys  reason: default package */
/* loaded from: classes4.dex */
final class buys implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buys(buyr buyrVar) {
        this.b = buyrVar.a;
        this.c = buyrVar.b;
        this.a = buyrVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djzs djzsVar = (djzs) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djzsVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djzs djzsVar, btzi<djzs, djzu> btziVar, Executor executor) {
        return this.b.a().a(djzsVar, this.a, btziVar, executor);
    }
}
