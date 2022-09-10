package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: burz  reason: default package */
/* loaded from: classes4.dex */
public final class burz implements btzp {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public burz(bury buryVar) {
        this.b = buryVar.a;
        this.c = buryVar.b;
        this.a = buryVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(Object obj, btzi btziVar, bvrj bvrjVar) {
        digt digtVar = (digt) obj;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(digtVar, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn c(Object obj) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(digt digtVar, btzi<digt, digv> btziVar, Executor executor) {
        return this.b.a().a(digtVar, this.a, btziVar, executor);
    }
}
