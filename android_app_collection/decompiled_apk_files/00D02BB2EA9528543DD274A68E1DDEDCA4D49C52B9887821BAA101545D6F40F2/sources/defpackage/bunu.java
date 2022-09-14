package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bunu  reason: default package */
/* loaded from: classes4.dex */
public final class bunu implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bunu(bunt buntVar) {
        this.b = buntVar.a;
        this.c = buntVar.b;
        this.a = buntVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwbw dwbwVar = (dwbw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwbwVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwbw dwbwVar, btzi<dwbw, dwby> btziVar, Executor executor) {
        return this.b.a().a(dwbwVar, this.a, btziVar, executor);
    }
}
