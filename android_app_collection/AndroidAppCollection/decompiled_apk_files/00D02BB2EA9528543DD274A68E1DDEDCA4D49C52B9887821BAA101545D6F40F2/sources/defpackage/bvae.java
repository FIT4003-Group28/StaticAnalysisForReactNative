package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvae  reason: default package */
/* loaded from: classes4.dex */
final class bvae implements bvac {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvae(bvad bvadVar) {
        this.b = bvadVar.a;
        this.c = bvadVar.b;
        this.a = bvadVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dwuv dwuvVar, btzi<dwuv, dwuz> btziVar, bvrj bvrjVar) {
        dwuv dwuvVar2 = dwuvVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwuvVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dwuv, dwuz>> c(dwuv dwuvVar) {
        return btzj.a(this, dwuvVar);
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwuv dwuvVar, btzi<dwuv, dwuz> btziVar, Executor executor) {
        return this.b.a().a(dwuvVar, this.a, btziVar, executor);
    }
}
