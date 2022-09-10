package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: burt  reason: default package */
/* loaded from: classes4.dex */
public final class burt implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public burt(burs bursVar) {
        this.b = bursVar.a;
        this.c = bursVar.b;
        this.a = bursVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dvbj dvbjVar = (dvbj) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dvbjVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dvbj dvbjVar, btzi<dvbj, dvbp> btziVar, Executor executor) {
        return this.b.a().a(dvbjVar, this.a, btziVar, executor);
    }
}
