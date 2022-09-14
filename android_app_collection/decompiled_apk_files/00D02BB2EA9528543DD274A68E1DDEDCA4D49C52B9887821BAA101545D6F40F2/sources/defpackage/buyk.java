package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buyk  reason: default package */
/* loaded from: classes4.dex */
public final class buyk implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buyk(buyj buyjVar) {
        this.b = buyjVar.a;
        this.c = buyjVar.b;
        this.a = buyjVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwgr dwgrVar = (dwgr) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwgrVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwgr dwgrVar, btzi<dwgr, dwgt> btziVar, Executor executor) {
        return this.b.a().a(dwgrVar, this.a, btziVar, executor);
    }
}
