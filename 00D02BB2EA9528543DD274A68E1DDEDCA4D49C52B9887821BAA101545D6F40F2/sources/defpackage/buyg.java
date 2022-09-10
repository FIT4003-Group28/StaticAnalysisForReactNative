package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buyg  reason: default package */
/* loaded from: classes4.dex */
public final class buyg implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buyg(buyf buyfVar) {
        this.b = buyfVar.a;
        this.c = buyfVar.b;
        this.a = buyfVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dxco dxcoVar = (dxco) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dxcoVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dxco dxcoVar, btzi<dxco, dxcq> btziVar, Executor executor) {
        return this.b.a().a(dxcoVar, this.a, btziVar, executor);
    }
}
