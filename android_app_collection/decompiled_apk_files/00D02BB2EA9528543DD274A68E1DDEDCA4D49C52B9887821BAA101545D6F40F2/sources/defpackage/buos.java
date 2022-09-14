package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buos  reason: default package */
/* loaded from: classes4.dex */
public final class buos implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buos(buor buorVar) {
        this.b = buorVar.a;
        this.c = buorVar.b;
        this.a = buorVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        diai diaiVar = (diai) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(diaiVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(diai diaiVar, btzi<diai, diak> btziVar, Executor executor) {
        return this.b.a().a(diaiVar, this.a, btziVar, executor);
    }
}
