package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvdg  reason: default package */
/* loaded from: classes4.dex */
public final class bvdg implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvdg(bvdf bvdfVar) {
        this.b = bvdfVar.a;
        this.c = bvdfVar.b;
        this.a = bvdfVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        ditm ditmVar = (ditm) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(ditmVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(ditm ditmVar, btzi<ditm, dito> btziVar, Executor executor) {
        return this.b.a().a(ditmVar, this.a, btziVar, executor);
    }
}
