package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buoi  reason: default package */
/* loaded from: classes4.dex */
public final class buoi implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public buoi(buoh buohVar) {
        this.b = buohVar.a;
        this.c = buohVar.b;
        this.a = buohVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        dhoz dhozVar = (dhoz) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhozVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhoz dhozVar, btzi<dhoz, dhpd> btziVar, Executor executor) {
        return this.b.a().a(dhozVar, this.a, btziVar, executor);
    }
}
