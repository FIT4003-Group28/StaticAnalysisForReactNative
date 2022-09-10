package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: burl  reason: default package */
/* loaded from: classes4.dex */
public final class burl implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public burl(burk burkVar) {
        this.b = burkVar.a;
        this.c = burkVar.b;
        this.a = burkVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dige digeVar = (dige) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(digeVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dige digeVar, btzi<dige, digi> btziVar, Executor executor) {
        return this.b.a().a(digeVar, this.a, btziVar, executor);
    }
}
