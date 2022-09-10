package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buom  reason: default package */
/* loaded from: classes4.dex */
public final class buom implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buom(buol buolVar) {
        this.b = buolVar.a;
        this.c = buolVar.b;
        this.a = buolVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvjp dvjpVar = (dvjp) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvjpVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvjp dvjpVar, btzi<dvjp, dvjr> btziVar, Executor executor) {
        return this.b.a().a(dvjpVar, this.a, btziVar, executor);
    }
}
