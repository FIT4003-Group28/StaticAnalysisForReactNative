package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvau  reason: default package */
/* loaded from: classes4.dex */
public final class bvau implements bvas {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvau(bvat bvatVar) {
        this.b = bvatVar.a;
        this.c = bvatVar.b;
        this.a = bvatVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dkeq dkeqVar, btzi<dkeq, dkes> btziVar, bvrj bvrjVar) {
        dkeq dkeqVar2 = dkeqVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkeqVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dkeq, dkes>> c(dkeq dkeqVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkeq dkeqVar, btzi<dkeq, dkes> btziVar, Executor executor) {
        return this.b.a().a(dkeqVar, this.a, btziVar, executor);
    }
}
