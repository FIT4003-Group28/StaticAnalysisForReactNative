package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buwo  reason: default package */
/* loaded from: classes4.dex */
final class buwo implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buwo(buwn buwnVar) {
        this.b = buwnVar.a;
        this.c = buwnVar.b;
        this.a = buwnVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djok djokVar = (djok) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djokVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djok djokVar, btzi<djok, djom> btziVar, Executor executor) {
        return this.b.a().a(djokVar, this.a, btziVar, executor);
    }
}
