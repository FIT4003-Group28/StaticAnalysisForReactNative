package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bump  reason: default package */
/* loaded from: classes4.dex */
public final class bump implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bump(bumo bumoVar) {
        this.b = bumoVar.a;
        this.c = bumoVar.b;
        this.a = bumoVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhvg dhvgVar = (dhvg) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhvgVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhvg dhvgVar, btzi<dhvg, dhvi> btziVar, Executor executor) {
        return this.b.a().a(dhvgVar, this.a, btziVar, executor);
    }
}
