package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bubc  reason: default package */
/* loaded from: classes4.dex */
final class bubc implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bubc(bubb bubbVar) {
        this.b = bubbVar.a;
        this.c = bubbVar.b;
        this.a = bubbVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        drzi drziVar = (drzi) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(drziVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(drzi drziVar, btzi<drzi, drzk> btziVar, Executor executor) {
        return this.b.a().a(drziVar, this.a, btziVar, executor);
    }
}
