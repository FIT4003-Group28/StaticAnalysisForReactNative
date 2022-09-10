package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buqw  reason: default package */
/* loaded from: classes4.dex */
public final class buqw implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buqw(buqv buqvVar) {
        this.b = buqvVar.a;
        this.c = buqvVar.b;
        this.a = buqvVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diet dietVar = (diet) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dietVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diet dietVar, btzi<diet, diev> btziVar, Executor executor) {
        return this.b.a().a(dietVar, this.a, btziVar, executor);
    }
}
