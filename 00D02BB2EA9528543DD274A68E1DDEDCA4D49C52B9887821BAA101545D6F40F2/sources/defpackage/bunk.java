package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bunk  reason: default package */
/* loaded from: classes4.dex */
public final class bunk implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bunk(bunj bunjVar) {
        this.b = bunjVar.a;
        this.c = bunjVar.b;
        this.a = bunjVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwyz dwyzVar = (dwyz) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwyzVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwyz dwyzVar, btzi<dwyz, dwzd> btziVar, Executor executor) {
        return this.b.a().a(dwyzVar, this.a, btziVar, executor);
    }
}
