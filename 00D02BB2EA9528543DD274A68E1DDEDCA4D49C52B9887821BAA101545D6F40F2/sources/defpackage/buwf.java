package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buwf  reason: default package */
/* loaded from: classes4.dex */
final class buwf implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buwf(buwe buweVar) {
        this.b = buweVar.a;
        this.c = buweVar.b;
        this.a = buweVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dmxh dmxhVar = (dmxh) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dmxhVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dmxh dmxhVar, btzi<dmxh, dmxv> btziVar, Executor executor) {
        return this.b.a().a(dmxhVar, this.a, btziVar, executor);
    }
}
