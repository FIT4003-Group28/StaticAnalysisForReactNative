package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buwc  reason: default package */
/* loaded from: classes4.dex */
final class buwc implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buwc(buwb buwbVar) {
        this.b = buwbVar.a;
        this.c = buwbVar.b;
        this.a = buwbVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dmxd dmxdVar = (dmxd) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dmxdVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dmxd dmxdVar, btzi<dmxd, dmxf> btziVar, Executor executor) {
        return this.b.a().a(dmxdVar, this.a, btziVar, executor);
    }
}
