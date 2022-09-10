package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buyy  reason: default package */
/* loaded from: classes4.dex */
public final class buyy implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buyy(buyx buyxVar) {
        this.b = buyxVar.a;
        this.c = buyxVar.b;
        this.a = buyxVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dirf dirfVar = (dirf) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dirfVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dirf dirfVar, btzi<dirf, dirj> btziVar, Executor executor) {
        return this.b.a().a(dirfVar, this.a, btziVar, executor);
    }
}
