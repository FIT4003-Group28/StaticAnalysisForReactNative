package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buqu  reason: default package */
/* loaded from: classes4.dex */
public final class buqu implements buqs {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buqu(buqt buqtVar) {
        this.b = buqtVar.a;
        this.c = buqtVar.b;
        this.a = buqtVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(djhq djhqVar, btzi<djhq, djhs> btziVar, bvrj bvrjVar) {
        djhq djhqVar2 = djhqVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djhqVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<djhq, djhs>> c(djhq djhqVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djhq djhqVar, btzi<djhq, djhs> btziVar, Executor executor) {
        return this.b.a().a(djhqVar, this.a, btziVar, executor);
    }
}
