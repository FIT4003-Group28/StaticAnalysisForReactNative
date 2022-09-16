package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: busu  reason: default package */
/* loaded from: classes4.dex */
public final class busu implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public busu(bust bustVar) {
        this.b = bustVar.a;
        this.c = bustVar.b;
        this.a = bustVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dija dijaVar = (dija) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dijaVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dija dijaVar, btzi<dija, dijg> btziVar, Executor executor) {
        return this.b.a().a(dijaVar, this.a, btziVar, executor);
    }
}
