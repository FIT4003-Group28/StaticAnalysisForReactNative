package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buyn  reason: default package */
/* loaded from: classes4.dex */
public final class buyn implements buyl {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buyn(buym buymVar) {
        this.b = buymVar.a;
        this.c = buymVar.b;
        this.a = buymVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(djvf djvfVar, btzi<djvf, djvh> btziVar, bvrj bvrjVar) {
        djvf djvfVar2 = djvfVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djvfVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<djvf, djvh>> c(djvf djvfVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djvf djvfVar, btzi<djvf, djvh> btziVar, Executor executor) {
        return this.b.a().a(djvfVar, this.a, btziVar, executor);
    }
}
