package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bvdj  reason: default package */
/* loaded from: classes4.dex */
public final class bvdj implements bvdh {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public bvdj(bvdi bvdiVar) {
        this.b = bvdiVar.a;
        this.c = bvdiVar.b;
        this.a = bvdiVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dhmv dhmvVar, btzi<dhmv, dhmx> btziVar, bvrj bvrjVar) {
        dhmv dhmvVar2 = dhmvVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dhmvVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dhmv, dhmx>> c(dhmv dhmvVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dhmv dhmvVar, btzi<dhmv, dhmx> btziVar, Executor executor) {
        return this.b.a().a(dhmvVar, this.a, btziVar, executor);
    }
}
