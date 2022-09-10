package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bupa  reason: default package */
/* loaded from: classes4.dex */
public final class bupa implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bupa(buoz buozVar) {
        this.b = buozVar.a;
        this.c = buozVar.b;
        this.a = buozVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dibs dibsVar = (dibs) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dibsVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dibs dibsVar, btzi<dibs, dibu> btziVar, Executor executor) {
        return this.b.a().a(dibsVar, this.a, btziVar, executor);
    }
}
