package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvax  reason: default package */
/* loaded from: classes4.dex */
public final class bvax implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvax(bvaw bvawVar) {
        this.b = bvawVar.a;
        this.c = bvawVar.b;
        this.a = bvawVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkfh dkfhVar = (dkfh) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkfhVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkfh dkfhVar, btzi<dkfh, dkfj> btziVar, Executor executor) {
        return this.b.a().a(dkfhVar, this.a, btziVar, executor);
    }
}
