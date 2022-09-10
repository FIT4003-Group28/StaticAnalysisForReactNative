package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvdp  reason: default package */
/* loaded from: classes4.dex */
public final class bvdp implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvdp(bvdo bvdoVar) {
        this.b = bvdoVar.a;
        this.c = bvdoVar.b;
        this.a = bvdoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhra dhraVar = (dhra) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhraVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhra dhraVar, btzi<dhra, dhrc> btziVar, Executor executor) {
        return this.b.a().a(dhraVar, this.a, btziVar, executor);
    }
}
