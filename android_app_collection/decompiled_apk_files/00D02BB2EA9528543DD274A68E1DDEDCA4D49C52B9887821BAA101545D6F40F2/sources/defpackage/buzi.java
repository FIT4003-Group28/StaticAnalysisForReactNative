package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buzi  reason: default package */
/* loaded from: classes4.dex */
public final class buzi implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buzi(buzh buzhVar) {
        this.b = buzhVar.a;
        this.c = buzhVar.b;
        this.a = buzhVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dkau dkauVar = (dkau) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dkauVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dkau dkauVar, btzi<dkau, dkaw> btziVar, Executor executor) {
        return this.b.a().a(dkauVar, this.a, btziVar, executor);
    }
}
