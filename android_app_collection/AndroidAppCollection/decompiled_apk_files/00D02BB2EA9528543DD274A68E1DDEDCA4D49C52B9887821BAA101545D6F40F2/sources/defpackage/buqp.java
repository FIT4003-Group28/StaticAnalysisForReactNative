package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buqp  reason: default package */
/* loaded from: classes4.dex */
public final class buqp implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buqp(buqo buqoVar) {
        this.b = buqoVar.a;
        this.c = buqoVar.b;
        this.a = buqoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvzj dvzjVar = (dvzj) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvzjVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvzj dvzjVar, btzi<dvzj, dvzl> btziVar, Executor executor) {
        return this.b.a().a(dvzjVar, this.a, btziVar, executor);
    }
}
