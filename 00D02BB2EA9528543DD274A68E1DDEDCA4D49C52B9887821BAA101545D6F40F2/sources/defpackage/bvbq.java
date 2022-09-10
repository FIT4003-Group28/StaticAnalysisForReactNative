package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvbq  reason: default package */
/* loaded from: classes4.dex */
public final class bvbq implements bvbo {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvbq(bvbp bvbpVar) {
        this.b = bvbpVar.a;
        this.c = bvbpVar.b;
        this.a = bvbpVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dhws dhwsVar, btzi<dhws, dhwu> btziVar, bvrj bvrjVar) {
        dhws dhwsVar2 = dhwsVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhwsVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dhws, dhwu>> c(dhws dhwsVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhws dhwsVar, btzi<dhws, dhwu> btziVar, Executor executor) {
        return this.b.a().a(dhwsVar, this.a, btziVar, executor);
    }
}
