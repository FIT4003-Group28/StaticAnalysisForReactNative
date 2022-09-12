package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: busw  reason: default package */
/* loaded from: classes4.dex */
public final class busw implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public busw(busv busvVar) {
        this.b = busvVar.a;
        this.c = busvVar.b;
        this.a = busvVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dijz dijzVar = (dijz) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dijzVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dijz dijzVar, btzi<dijz, dikb> btziVar, Executor executor) {
        return this.b.a().a(dijzVar, this.a, btziVar, executor);
    }
}
