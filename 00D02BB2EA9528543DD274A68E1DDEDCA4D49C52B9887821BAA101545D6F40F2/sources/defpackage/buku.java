package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buku  reason: default package */
/* loaded from: classes4.dex */
public final class buku implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buku(bukt buktVar) {
        this.b = buktVar.a;
        this.c = buktVar.b;
        this.a = buktVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhsk dhskVar = (dhsk) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhskVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhsk dhskVar, btzi<dhsk, dhsm> btziVar, Executor executor) {
        return this.b.a().a(dhskVar, this.a, btziVar, executor);
    }
}
