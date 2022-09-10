package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bupw  reason: default package */
/* loaded from: classes4.dex */
public final class bupw implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bupw(bupv bupvVar) {
        this.b = bupvVar.a;
        this.c = bupvVar.b;
        this.a = bupvVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dirb dirbVar = (dirb) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dirbVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dirb dirbVar, btzi<dirb, dird> btziVar, Executor executor) {
        return this.b.a().a(dirbVar, this.a, btziVar, executor);
    }
}
