package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buks  reason: default package */
/* loaded from: classes4.dex */
public final class buks implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buks(bukr bukrVar) {
        this.b = bukrVar.a;
        this.c = bukrVar.b;
        this.a = bukrVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhqm dhqmVar = (dhqm) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhqmVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhqm dhqmVar, btzi<dhqm, dhqo> btziVar, Executor executor) {
        return this.b.a().a(dhqmVar, this.a, btziVar, executor);
    }
}
