package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bujp  reason: default package */
/* loaded from: classes4.dex */
final class bujp implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bujp(bujo bujoVar) {
        this.b = bujoVar.a;
        this.c = bujoVar.b;
        this.a = bujoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhkt dhktVar = (dhkt) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhktVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhkt dhktVar, btzi<dhkt, dhkx> btziVar, Executor executor) {
        return this.b.a().a(dhktVar, this.a, btziVar, executor);
    }
}
