package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buao  reason: default package */
/* loaded from: classes4.dex */
final class buao implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buao(buan buanVar) {
        this.b = buanVar.a;
        this.c = buanVar.b;
        this.a = buanVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dryj dryjVar = (dryj) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dryjVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dryj dryjVar, btzi<dryj, dryl> btziVar, Executor executor) {
        return this.b.a().a(dryjVar, this.a, btziVar, executor);
    }
}
