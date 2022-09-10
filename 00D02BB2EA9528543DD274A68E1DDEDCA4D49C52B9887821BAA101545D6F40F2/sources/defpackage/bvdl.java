package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvdl  reason: default package */
/* loaded from: classes4.dex */
public final class bvdl implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvdl(bvdk bvdkVar) {
        this.b = bvdkVar.a;
        this.c = bvdkVar.b;
        this.a = bvdkVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhvw dhvwVar = (dhvw) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhvwVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhvw dhvwVar, btzi<dhvw, dhvy> btziVar, Executor executor) {
        return this.b.a().a(dhvwVar, this.a, btziVar, executor);
    }
}
