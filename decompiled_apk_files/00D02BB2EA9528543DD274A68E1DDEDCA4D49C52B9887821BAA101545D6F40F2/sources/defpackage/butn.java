package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: butn  reason: default package */
/* loaded from: classes4.dex */
public final class butn implements butl {
    final buad a;
    private final dxio<btze> b;
    private final bvrb c;

    public butn(butm butmVar) {
        this.b = butmVar.a;
        this.c = butmVar.b;
        this.a = butmVar.c.a();
    }

    @Override // defpackage.btzp
    @Deprecated
    public final /* bridge */ /* synthetic */ btzc a(dwhl dwhlVar, btzi<dwhl, dwhn> btziVar, bvrj bvrjVar) {
        dwhl dwhlVar2 = dwhlVar;
        dbsk.b(!bvrj.CURRENT.equals(bvrjVar), "Cannot execute RpcCallback on Threads.CURRENT");
        return b(dwhlVar2, btziVar, btziVar == null ? null : bvgr.a(this.c, bvrjVar));
    }

    @Override // defpackage.btzp
    public final dehn<btzx<dwhl, dwhn>> c(dwhl dwhlVar) {
        throw null;
    }

    @Override // defpackage.btzp
    /* renamed from: d */
    public final btzc b(dwhl dwhlVar, btzi<dwhl, dwhn> btziVar, Executor executor) {
        return this.b.a().a(dwhlVar, this.a, btziVar, executor);
    }
}
