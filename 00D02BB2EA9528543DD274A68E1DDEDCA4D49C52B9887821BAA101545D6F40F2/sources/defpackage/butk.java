package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: butk  reason: default package */
/* loaded from: classes4.dex */
public final class butk implements buti {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public butk(butj butjVar) {
        this.b = butjVar.a;
        this.c = butjVar.b;
        this.a = butjVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dwge dwgeVar, btzi<dwge, dwgl> btziVar, bvrj bvrjVar) {
        dwge dwgeVar2 = dwgeVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwgeVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dwge, dwgl>> c(dwge dwgeVar) {
        return btzj.a(this, dwgeVar);
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwge dwgeVar, btzi<dwge, dwgl> btziVar, Executor executor) {
        return this.b.a().a(dwgeVar, this.a, btziVar, executor);
    }
}
