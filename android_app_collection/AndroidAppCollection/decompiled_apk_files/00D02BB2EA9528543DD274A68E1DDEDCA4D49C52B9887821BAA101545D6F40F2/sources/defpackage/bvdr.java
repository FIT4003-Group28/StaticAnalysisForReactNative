package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvdr  reason: default package */
/* loaded from: classes4.dex */
public final class bvdr implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvdr(bvdq bvdqVar) {
        this.b = bvdqVar.a;
        this.c = bvdqVar.b;
        this.a = bvdqVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhum dhumVar = (dhum) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhumVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhum dhumVar, btzi<dhum, dhuq> btziVar, Executor executor) {
        return this.b.a().a(dhumVar, this.a, btziVar, executor);
    }
}
