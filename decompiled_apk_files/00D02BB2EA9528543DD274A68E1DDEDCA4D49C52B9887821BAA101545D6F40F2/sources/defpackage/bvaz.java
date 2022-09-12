package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvaz  reason: default package */
/* loaded from: classes.dex */
public final class bvaz implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvaz(bvay bvayVar) {
        this.b = bvayVar.a;
        this.c = bvayVar.b;
        this.a = bvayVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvjt dvjtVar = (dvjt) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvjtVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvjt dvjtVar, btzi<dvjt, dvjv> btziVar, Executor executor) {
        return this.b.a().a(dvjtVar, this.a, btziVar, executor);
    }
}
