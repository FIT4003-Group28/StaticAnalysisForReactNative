package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvgl  reason: default package */
/* loaded from: classes4.dex */
public final class bvgl implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvgl(bvgk bvgkVar) {
        this.b = bvgkVar.a;
        this.c = bvgkVar.b;
        this.a = bvgkVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dwnn dwnnVar = (dwnn) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwnnVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwnn dwnnVar, btzi<dwnn, dwnp> btziVar, Executor executor) {
        return this.b.a().a(dwnnVar, this.a, btziVar, executor);
    }
}
