package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: busl  reason: default package */
/* loaded from: classes4.dex */
public final class busl implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public busl(busk buskVar) {
        this.b = buskVar.a;
        this.c = buskVar.b;
        this.a = buskVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djwe djweVar = (djwe) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djweVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djwe djweVar, btzi<djwe, djwg> btziVar, Executor executor) {
        return this.b.a().a(djweVar, this.a, btziVar, executor);
    }
}
