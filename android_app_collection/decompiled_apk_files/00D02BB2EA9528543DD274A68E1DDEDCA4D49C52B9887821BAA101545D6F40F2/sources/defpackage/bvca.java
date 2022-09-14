package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvca  reason: default package */
/* loaded from: classes4.dex */
public final class bvca implements bvby {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvca(bvbz bvbzVar) {
        this.b = bvbzVar.a;
        this.c = bvbzVar.b;
        this.a = bvbzVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dhwa dhwaVar, btzi<dhwa, dhwc> btziVar, bvrj bvrjVar) {
        dhwa dhwaVar2 = dhwaVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhwaVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dhwa, dhwc>> c(dhwa dhwaVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhwa dhwaVar, btzi<dhwa, dhwc> btziVar, Executor executor) {
        return this.b.a().a(dhwaVar, this.a, btziVar, executor);
    }
}
