package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buyc  reason: default package */
/* loaded from: classes4.dex */
public final class buyc implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buyc(buyb buybVar) {
        this.b = buybVar.a;
        this.c = buybVar.b;
        this.a = buybVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djti djtiVar = (djti) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djtiVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djti djtiVar, btzi<djti, djtk> btziVar, Executor executor) {
        return this.b.a().a(djtiVar, this.a, btziVar, executor);
    }
}
