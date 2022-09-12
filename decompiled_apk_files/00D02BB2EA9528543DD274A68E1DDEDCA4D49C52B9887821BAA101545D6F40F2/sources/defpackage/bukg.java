package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bukg  reason: default package */
/* loaded from: classes4.dex */
public final class bukg implements buke {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bukg(bukf bukfVar) {
        this.b = bukfVar.a;
        this.c = bukfVar.b;
        this.a = bukfVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(djzm djzmVar, btzi<djzm, djzq> btziVar, bvrj bvrjVar) {
        djzm djzmVar2 = djzmVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djzmVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<djzm, djzq>> c(djzm djzmVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djzm djzmVar, btzi<djzm, djzq> btziVar, Executor executor) {
        return this.b.a().a(djzmVar, this.a, btziVar, executor);
    }
}
