package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buzc  reason: default package */
/* loaded from: classes4.dex */
public final class buzc implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buzc(buzb buzbVar) {
        this.b = buzbVar.a;
        this.c = buzbVar.b;
        this.a = buzbVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkae dkaeVar = (dkae) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkaeVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkae dkaeVar, btzi<dkae, dkag> btziVar, Executor executor) {
        return this.b.a().a(dkaeVar, this.a, btziVar, executor);
    }
}
