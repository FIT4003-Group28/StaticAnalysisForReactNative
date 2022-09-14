package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buub  reason: default package */
/* loaded from: classes4.dex */
public final class buub implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buub(buua buuaVar) {
        this.b = buuaVar.a;
        this.c = buuaVar.b;
        this.a = buuaVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dijv dijvVar = (dijv) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dijvVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dijv dijvVar, btzi<dijv, dijx> btziVar, Executor executor) {
        return this.b.a().a(dijvVar, this.a, btziVar, executor);
    }
}
