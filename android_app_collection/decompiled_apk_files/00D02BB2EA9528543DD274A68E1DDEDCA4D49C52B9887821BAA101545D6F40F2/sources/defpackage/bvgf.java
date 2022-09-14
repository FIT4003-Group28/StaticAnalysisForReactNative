package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bvgf  reason: default package */
/* loaded from: classes4.dex */
public final class bvgf implements bvgd {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvgf(bvge bvgeVar) {
        this.b = bvgeVar.a;
        this.c = bvgeVar.b;
        this.a = bvgeVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dmao dmaoVar, btzi<dmao, dmaq> btziVar, bvrj bvrjVar) {
        dmao dmaoVar2 = dmaoVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dmaoVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dmao, dmaq>> c(dmao dmaoVar) {
        return btzj.a(this, dmaoVar);
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dmao dmaoVar, btzi<dmao, dmaq> btziVar, Executor executor) {
        return this.b.a().a(dmaoVar, this.a, btziVar, executor);
    }
}
