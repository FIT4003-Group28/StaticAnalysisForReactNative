package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buxb  reason: default package */
/* loaded from: classes4.dex */
public final class buxb implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buxb(buxa buxaVar) {
        this.b = buxaVar.a;
        this.c = buxaVar.b;
        this.a = buxaVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        djpm djpmVar = (djpm) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(djpmVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(djpm djpmVar, btzi<djpm, djpu> btziVar, Executor executor) {
        return this.b.a().a(djpmVar, this.a, btziVar, executor);
    }
}
