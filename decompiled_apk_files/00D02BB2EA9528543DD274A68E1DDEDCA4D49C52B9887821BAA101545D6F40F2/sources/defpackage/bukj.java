package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bukj  reason: default package */
/* loaded from: classes4.dex */
public final class bukj implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bukj(buki bukiVar) {
        this.b = bukiVar.a;
        this.c = bukiVar.b;
        this.a = bukiVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhqq dhqqVar = (dhqq) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhqqVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhqq dhqqVar, btzi<dhqq, dhqs> btziVar, Executor executor) {
        return this.b.a().a(dhqqVar, this.a, btziVar, executor);
    }
}
